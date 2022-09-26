import Spil.Diceholder;

import java.util.*;
import java.util.stream.IntStream;
import java.util.ArrayList;


class mainGame {
    public static void main(String[] args) {
//        List p1P = null, p2P = null;
        int p1P = 40, p2P = 40, sP1 = IntStream.of(p1P).sum(), sP2 = IntStream.of(p2P).sum(), v1 = 0, winner = 0, wP1 = 0, wP2 = 0, tT = 0;
        String uITrue = "";
        /*
        System.out.println("Player 1 points: " + sP1); //display sum of value in list
        System.out.println("Player 2 points: " + sP2);
        System.out.println("Please select one of the following actions:");
        System.out.println("1. Roll dice");
        System.out.println("2. Show points");
        System.out.println("3. Show rules");

         */
        Scanner uI = new Scanner(System.in);
        boolean exit = true, turn = true;
        while (exit) {
//            if (tT == 0) {
//                p1P.setPoints(0);
//                p2P.setPoint(0);
//            }
            if ((sP1 < 40) && (sP2 < 40) && (winner == 0)) {
                if (turn){
                    System.out.println("Please select one of the following actions:");
                    System.out.println("1. Roll dice");
                    System.out.println("2. Show points");
                    System.out.println("3. Show rules");
                    uITrue = uI.nextLine();
                    if (uITrue.toLowerCase().equals("roll") || (uITrue.equals("1"))) {
                        //rolldice append to p1P
                        System.out.println("yoyo");

                        Diceholder holder = new Diceholder();
                        int[] rolls = holder.roll();

                        System.out.println(rolls[0] + ", " +rolls[1]);

                        if (rolls[0] == rolls[1]) {
                            int[] rolls2 = holder.roll();
                            System.out.println(rolls2[0] + ", " +rolls2[1]);
                        }

                        v1 = v1 + 1;
                        tT = tT + 1;
                        p1P = p1P + 1;
                        sP1 = IntStream.of(p1P).sum();
                        turn = false;
                    } else if (uITrue.toLowerCase().equals("show points") || (uITrue.equals("2"))) {
                        //show points
                        System.out.println("Player 1 points: " + sP1);
                    } else if (uITrue.toLowerCase().equals("show rules") || (uITrue.equals("3"))) {
                        //show rules
                        System.out.println("We rulez");
                    }
                } else if (turn == false) {
                    System.out.println("Please select one of the following actions:");
                    System.out.println("1. Roll dice");
                    System.out.println("2. Show points");
                    System.out.println("3. Show rules");
                    uITrue = uI.nextLine();
                    if (uITrue.toLowerCase().equals("roll") || (uITrue.equals("1"))) {
                        //rolldice append to p2P

                        Diceholder holder = new Diceholder();
                        int[] rolls = holder.roll();

                        System.out.println(rolls[0] + ", " +rolls[1]);

                        if (rolls[0] == rolls[1]) {
                            int[] rolls2 = holder.roll();
                            System.out.println(rolls2[0] + ", " +rolls2[1]);
                        }

                        v1 = v1 - 1;
                        System.out.println("BRRRRRRA");
                        turn = true;
                        p2P = p2P + 1;
                        sP2 = IntStream.of(p2P).sum();
                    } else if (uITrue.toLowerCase().equals("show points") || (uITrue.equals("2"))) {
                        //show points
                        System.out.println("Player 2 points: " + sP2);
                    } else if (uITrue.toLowerCase().equals("show rules") || (uITrue.equals("3"))) {
                        //show rules
                        System.out.println("We nutz rulez");
                    }
                }
            } else if ((sP1 >= 40 && winner <= 0) || (sP2 >= 40 && winner <= 0)) {
                if (sP1 > 40) {

                    System.out.println("Please select one of the following actions:");
                    System.out.println("1. Roll dice");
                    System.out.println("2. Show points");
                    System.out.println("3. Show rules");
                    uITrue = uI.nextLine();
                    if (uITrue.toLowerCase().equals("roll") || (uITrue.equals("1"))) {

                        Diceholder holder = new Diceholder();
                        int[] rolls = holder.roll();

                        System.out.println(rolls[0] + ", " +rolls[1]);

                        if (rolls[0] == rolls[1]) {
                            System.out.println("Player 1 wins!");
                            winner = winner + 1;
                            wP1 = wP1 + 1;
                        }
                    } else if (uITrue.toLowerCase().equals("show points") || (uITrue.equals("2"))) {
                        //show points
                        System.out.println("Player 1 points: " + sP1);
                    } else if (uITrue.toLowerCase().equals("show rules") || (uITrue.equals("3"))) {
                        //show rules
                        System.out.println("We rulez");
                    }

                } else {
                    System.out.println("Please select one of the following actions:");
                    System.out.println("1. Roll dice");
                    System.out.println("2. Show points");
                    System.out.println("3. Show rules");
                    uITrue = uI.nextLine();
                    if (uITrue.toLowerCase().equals("roll") || (uITrue.equals("1"))) {

                        Diceholder holder = new Diceholder();
                        int[] rolls = holder.roll();

                        System.out.println(rolls[0] + ", " +rolls[1]);

                        if (rolls[0] == rolls[1]) {
                            System.out.println("Player 2 wins!");
                            winner = winner + 1;
                            wP2 = wP2 + 1;
                        }
                    } else if (uITrue.toLowerCase().equals("show points") || (uITrue.equals("2"))) {
                        //show points
                        System.out.println("Player 1 points: " + sP1);
                    } else if (uITrue.toLowerCase().equals("show rules") || (uITrue.equals("3"))) {
                        //show rules
                        System.out.println("We rulez");
                    }

                }
            } else if (winner > 0) {
                System.out.println("Please choose one of the following actions: ");
                System.out.println("1. Play again");
                System.out.println("2. Show winner statistics");
                System.out.println("3. Exit");
                uITrue = uI.nextLine();
                if (uITrue.toLowerCase().equals("play again") || (uITrue.equals("1"))) {
                    winner = 0;
                    /*
                    p1P.setpoints(0);
                    p2P.setpoints(0);
                     */
                } else if (uITrue.toLowerCase().equals("show winner statistics") || (uITrue.equals("2"))) {
                    System.out.println("Player 1 has won " + wP1 + " time(s)");
                    System.out.println("Player 2 has won " + wP2 + " time(s)");
                } else if (uITrue.toLowerCase().equals("exit") || (uITrue.equals("3"))) {
                    exit = false;

                }
            }
        }
    }
}



