package Test;

import Spil.Diceholder;

public class mainTest {
    public static void main(String[] args) {
        //0 = same dice, rest are the combined value of the two dice
        int[] results = new int[12];
        int iterations = 10000;
        Diceholder DH = new Diceholder();

        for (int i = 0; i < iterations; i++) {
            DH.roll();
            /*if (DH.isSame()){
                results[0]++;
            }*/
            results[DH.sum()-1]++;
        }

        System.out.println("Dice same: " + results[0]);
        for (int i = 1; i < 12; i++) {
            System.out.println("Dice sum "+ (i+1) +": " + results[i] + ", Percentage: " + ((double)results[i]*100/iterations));
        }
    }
}
