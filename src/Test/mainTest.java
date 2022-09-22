package Test;

import Spil.DiceHolder;

public class mainTest {
    private static void main(String[] args) {
        //0=same, rest are the combined value of the two dice
        int[] results = new int[12];
        DiceHolder DH = new DiceHolder();

        for (int i = 0; i < 1000; i++) {
            DH.roll();
            if (DH.isSame()){
                results[0]++;
            }
            results[DH.getSum()-1]++;
        }

        System.out.println("Dice same: " + results[0] + "\n" +
                            "Dice sum 2: " + results[1] + "\n" +
                            "Dice sum 3: " + results[2] + "\n" +
                            "Dice sum 4: " + results[3] + "\n" +
                            "Dice sum 5: " + results[4] + "\n" +
                            "Dice sum 6: " + results[5] + "\n" +
                            "Dice sum 7: " + results[6] + "\n" +
                            "Dice sum 8: " + results[7] + "\n" +
                            "Dice sum 9: " + results[8] + "\n" +
                            "Dice sum 10: " + results[9] + "\n" +
                            "Dice sum 11 " + results[10] + "\n" +
                            "Dice sum 12 " + results[11]);
    }
}
