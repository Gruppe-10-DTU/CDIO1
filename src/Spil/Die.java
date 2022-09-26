package Spil;

public class Die {
    //Type of die
    private int sides = 6;
    public int roll() {
        int diceRoll = (int)Math.floor(Math.random() * sides + 1);
        return diceRoll;

    }
}
