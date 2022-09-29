package Spil;

import java.util.*;
import java.util.stream.IntStream;
import java.util.ArrayList;


class mainGame {
    private static final int diceAmount = 2;

    private static Diceholder holder = new Diceholder(diceAmount);
    private static int[] rolls = new int[diceAmount];

    public static void main(String[] args) {
        String uITrue = "";
        Scanner uI = new Scanner(System.in);
        boolean exit = true, turn = true, winner = false;
        int prevSum = 0;
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        while (exit) {
            if (!winner) {
                if (turn){
                    showOptions(player1.getIdentifier());
                    uITrue = uI.nextLine();
                    if (uITrue.toLowerCase().equals("roll") || (uITrue.equals("1"))) {
                        //rolldice append to p1P

                        player1.setPoints(Rolls(player1.getPoints()));
                        winner = isOver(player1);
                        //If the player rolls two equal dice, they will get another turn
                        if(!holder.isEqual()){
                            turn = false;
                            prevSum = 0;
                        }else{
                            System.out.println("Since you rolled a double you'll get another turn");
                            winner = sixes(holder.sum(), prevSum, player1);
                            prevSum = holder.sum();
                        }
                    } else if (uITrue.toLowerCase().equals("show points") || (uITrue.equals("2"))) {
                        //show points
                        System.out.println("Player 1 points: " + player1.getPoints());
                    }
                } else{
                    showOptions(player2.getIdentifier());
                    uITrue = uI.nextLine();
                    if (uITrue.toLowerCase().equals("roll") || (uITrue.equals("1"))) {
                        //rolldice append to p1P

                        player2.setPoints(Rolls(player2.getPoints()));
                        winner = isOver(player2);
                        if(!holder.isEqual()){
                            turn = true;
                            prevSum = 0;
                        }else{
                            System.out.println("Since you rolled a double you'll get another turn");
                            winner = sixes(holder.sum(), prevSum, player2);
                            prevSum = holder.sum();
                        }

                    } else if (uITrue.toLowerCase().equals("show points") || (uITrue.equals("2"))) {
                        //show points
                        System.out.println("Player 2 points: " + player2.getPoints());
                    }
                }
            } else {
                System.out.println((turn ? player1.getIdentifier() : player2.getIdentifier()) + " won");
                System.out.println("Please choose one of the following actions: ");
                System.out.println("1. Play again");
                System.out.println("2. Exit");
                uITrue = uI.nextLine();
                if (uITrue.toLowerCase().equals("play again") || (uITrue.equals("1"))) {
                    winner = false;
                    player1.setPoints(0);
                    player2.setPoints(0);
                } else{
                    exit = false;

                }
            }
        }
    }

    private  static boolean isOver(Player player){
        return player.getPoints() >= 40;
    }

    private static void showOptions(String name){
        System.out.println(name);
        System.out.println("Please select one of the following actions:");
        System.out.println("1. Roll dice");
        System.out.println("2. Show points");
    }

    private static int Rolls(int oldPoints){
        rolls = holder.roll();
        System.out.println(rolls[0] + ", " +rolls[1]);
        if(holder.sum() == 2){
            return 0;
        }else{
            return oldPoints + holder.sum();
        }
    }

    private static boolean sixes(int sum, int prevSum, Player player){
        if (sum == 12 && prevSum == 12){
            player.setPoints(40);
            return isOver(player);
        }
        return isOver(player);
    }

}



