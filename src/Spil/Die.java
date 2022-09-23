package Spil;

public class Die {

    /*public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int roll = new Die().roll();  // 1 to 6
            System.out.println(roll);
        }
    }*/

    public int roll() {
        int diceRoll = (int)Math.floor(Math.random() * 6 + 1);
        return diceRoll;

    }
}
