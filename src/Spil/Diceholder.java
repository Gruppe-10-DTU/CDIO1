package Spil;

import java.util.Arrays;

public class Diceholder{
    //Private values of class. Not allowed to change values during game outside of this class
    private Die[] dice;
    private int[] rolls;

    //Default constructor for the game. Takes 2 dice
    public Diceholder(){
        //Assign values of array
        dice = new Die[]{new Die(), new Die()};
        rolls = new int[2];
    }

    //Constructor with n amount of dice, in case customer wants to change the game
    public Diceholder(int diceAmt){
        //Instanciate dice
        dice = new Die[diceAmt];
        for (int i = 0; i < diceAmt; i++) {
            dice[i] = new Die();
        }
        rolls = new int[diceAmt];
    }

    //Iterate over each die, roll it, and assign the rolls to an array for stats checking.
    public int[] roll(){
        rollDie();
        return rolls;
    }

    //private method for rolling the dice
    private void rollDie(){
        for (int i = 0; i < dice.length; i++) {
            rolls[i] = dice[i].roll();
        }
    }

    //Get total value of last roll
    public int sum(){
        int totalValue = 0;
        for (int roll : rolls) {
            totalValue += roll;
        }
        return totalValue;
    }
    //See if the n die are equal
    public boolean isEqual(){
        if(Arrays.stream(rolls).distinct().count() == 1){
            return true;
        }
        return false;
    }
}