package Spil;
import java.util.*;
import java.util.stream.IntStream;


class mainSpil {
    public static void main(String[] args) {
        int p1P = 5, p2P = 39, sP1 = IntStream.of(p1P).sum(), sP2 = IntStream.of(p2P).sum(), v1 = 0, exit = 0, winner = 0, wP1 = 0, wP2 = 0;
        String uITrue;
        System.out.println("Player 1 points: " + sP1); //display sum of value in list
        System.out.println("Player 2 points: " + sP2);
        Scanner uI = new Scanner(System.in);
        uITrue = uI.nextLine();
        while (exit == 0) {
            while (true) {
                if ((sP1 < 40) && (sP2 < 40)) {
                    System.out.println(v1);
                        if (v1 == 0) {
                            System.out.println("Please select one of the following actions:");
                            System.out.println("1. Roll dice");
                            System.out.println("2. Show points");
                            System.out.println("3. Show rules");
                            if (uITrue.toLowerCase().equals("roll") || (uITrue.equals("1"))) {
                                //rolldice append to p1P
                                v1 = v1 + 1;
                            }else if (uITrue.toLowerCase().equals("show points") || (uITrue.equals("2"))) {
                                //show points
                                System.out.print("Player 1 points: " + sP1);
                            }else if (uITrue.toLowerCase().equals("show rules") || (uITrue.equals("3"))) {
                                //show rules
                                System.out.print("We rulez");
                            }
                        }else if (v1 > 0) {
                            System.out.println("Please select one of the following actions:");
                            System.out.println("1. Roll dice");
                            System.out.println("2. Show points");
                            System.out.println("3. Show rules");
                            if (uITrue.toLowerCase().equals("roll") || (uITrue.equals("1"))) {
                                //rolldice append to p2P
                                v1 = v1 - 1;
                            } else if (uITrue.toLowerCase().equals("show points") || (uITrue.equals("2"))) {
                                //show points
                                System.out.print("Player 2 points: " + sP2);
                            } else if (uITrue.toLowerCase().equals("show rules") || (uITrue.equals("3"))) {
                                //show rules
                                System.out.print("We rulez");
                            }
                        }
                    }else if (sP1 > 40 || sP2 > 40) {
                        if (sP1 > 40) {
                            System.out.println("Player 1 wins!");
                            winner = winner +1;
                            wP1 = wP1 + 1;
                            break;

                        } else {
                            System.out.println("Player 2 wins!");
                            winner = winner + 1;
                            wP2 = wP2 + 1;
                            break;
                        }
                    }
                }
            }
        if (winner > 0){
            System.out.println("Please choose one of the following actions: ");
            System.out.println("1. Play again");
            System.out.println("2. Exit");
            System.out.println("3. Show winner statistics");
            if (uITrue.toLowerCase().equals("play again") || (uITrue.equals("1"))) {
                winner = 0;
            }
            if (uITrue.toLowerCase().equals("exit") || (uITrue.equals("2"))) {
                exit = 1;
            }
        }
        }
    }


