package Spil;
import Spil.Diceholder;

import java.util.*;
import java.util.stream.IntStream;
import java.util.ArrayList;


class mainGame {
    private static int diceAmount = 2;

    private static Diceholder holder = new Diceholder(diceAmount);
    private static int[] rolls = new int[diceAmount];

    public static void main(String[] args) {
//        List p1P = null, p2P = null;
        int wP1 = 0, wP2 = 0;
        String uITrue = "";
        /*
        System.out.println("Player 1 points: " + player1.getPoints()); //display sum of value in list
        System.out.println("Player 2 points: " + sP2);
        System.out.println("Please select one of the following actions:");
        System.out.println("1. Roll dice");
        System.out.println("2. Show points");
        System.out.println("3. Show rules");

         */
        Scanner uI = new Scanner(System.in);
        boolean exit = true, turn = true, winner = false;
        Player player1 = new Player();
        Player player2 = new Player();
        while (exit) {
            if (!winner) {
                if (turn){
                    showOptions("Spiller 1");
                    uITrue = uI.nextLine();
                    if (uITrue.toLowerCase().equals("roll") || (uITrue.equals("1"))) {
                        //rolldice append to p1P

                        player1 = Rolls(player1);
                        turn = false;
                    } else if (uITrue.toLowerCase().equals("show points") || (uITrue.equals("2"))) {
                        //show points
                        System.out.println("Player 1 points: " + player1.getPoints());
                    } else if (uITrue.toLowerCase().equals("show rules") || (uITrue.equals("3"))) {
                        //show rules
                        System.out.println("We rulez");
                    }
                } else{
                    showOptions("Spiller 2");
                    uITrue = uI.nextLine();
                    if (uITrue.toLowerCase().equals("roll") || (uITrue.equals("1"))) {
                        //rolldice append to p1P

                        player2 = Rolls(player2);
                        turn = true;
                    } else if (uITrue.toLowerCase().equals("show points") || (uITrue.equals("2"))) {
                        //show points
                        System.out.println("Player 2 points: " + player2.getPoints());
                    } else if (uITrue.toLowerCase().equals("show rules") || (uITrue.equals("3"))) {
                        //show rules
                        System.out.println("We rulez");
                    }
                }
            } else {
                System.out.println("Please choose one of the following actions: ");
                System.out.println("1. Play again");
                System.out.println("2. Show winner statistics");
                System.out.println("3. Exit");
                uITrue = uI.nextLine();
                if (uITrue.toLowerCase().equals("play again") || (uITrue.equals("1"))) {
                    winner = false;
                    player1.setPoints(0);
                    player2.setPoints(0);
                } else if (uITrue.toLowerCase().equals("show winner statistics") || (uITrue.equals("2"))) {
                    System.out.println("Player 1 has won " + wP1 + " time(s)");
                    System.out.println("Player 2 has won " + wP2 + " time(s)");
                } else{
                    exit = false;

                }
            }
        }
    }

    private boolean isOver(Player player, boolean doubleDie){
        if((player.getPoints() >= 40 && doubleDie)){
            return true;
        } return false;
    }

    private static void showOptions(String name){
        System.out.println(name);
        System.out.println("Please select one of the following actions:");
        System.out.println("1. Roll dice");
        System.out.println("2. Show points");
        System.out.println("3. Show rules");
    }

    private static Player Rolls(Player player){
        rolls = holder.roll();
        System.out.println(rolls[0] + ", " +rolls[1]);
        /*
        if (rolls[0] == rolls[1]) {
            int[] rolls2 = holder.roll();
            System.out.println(rolls2[0] + ", " +rolls2[1]);
        }
         */
        player.setPoints(player.getPoints() + holder.sum());
        System.out.println(holder.sum());
        return player;
    }

}



