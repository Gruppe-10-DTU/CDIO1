package Test;

import Spil.DiceHolder;

public class mainTest {
    private static void main(String[] args) {
        //0 = same dice, rest are the combined value of the two dice
        int[] results = new int[12];
        int iterations = 1000;
        DiceHolder DH = new DiceHolder();

        for (int i = 0; i < iterations; i++) {
            DH.roll();
            if (DH.isSame()){
                results[0]++;
            }
            results[DH.getSum()-1]++;
        }

        System.out.println("Dice same: " + results[0]);
        for (int i = 1; i < 12; i++) {
            System.out.println("Dice sum 2: " + results[i] + " Percentage: " + (results[i]/iterations));
        }
    }
}
