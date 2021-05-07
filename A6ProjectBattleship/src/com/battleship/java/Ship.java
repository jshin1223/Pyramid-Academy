package com.battleship.java;

public abstract class Ship{


    public static String result;
    public static int shipPosRow = 0;
    public static int shipPosColumn = 0;
    public static String shipPosHorVer;


    public static int realShipPosRow1;
    public static int realShipPosRow2;
    public static int realShipPosRow3;
    public static int realShipPosRow4;
    public static int realShipPosRow5;


    public static int realShipPosColumn1;
    public static int realShipPosColumn2;
    public static int realShipPosColumn3;
    public static int realShipPosColumn4;
    public static int realShipPosColumn5;


    public static int realShipTargetRowH;
    public static int shipTargetRowH;
    public static int realShipTargetColumnH;
    public static int shipTargetColumnH;


    public static int realShipTargetRowC;
    public static int shipTargetRowC;
    public static int realShipTargetColumnC;
    public static int shipTargetColumnC;

    public static boolean gameOver = false;


    private static String player1Name;
    private static String player2Name;

    public static String getPlayer1Name() {

        return player1Name;
    }

    public static String getPlayer2Name() {
        return player2Name;
    }


    public static void setPlayer1Name(String player1Name) {
        Ship.player1Name = player1Name;
    }

    public static void setPlayer2Name(String player2Name) {
        Ship.player2Name = player2Name;
    }


    // This is a grid for human sea
    public static char[][] seaHuman = new char[][]
            {{' ', ' ', ' ', '0', ' ', '1', ' ', '2', ' ', '3', ' ', '4', ' ', '5', ' ', '6', ' ', '7', ' ', '8', ' ', '9'},
                    {'0', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'1', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'2', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'3', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'4', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'5', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'6', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'7', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'8', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'9', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'}};


    // This is a grid for CPU sea.
    public static char[][] seaCPU = new char[][]
            {{' ', ' ', ' ', '0', ' ', '1', ' ', '2', ' ', '3', ' ', '4', ' ', '5', ' ', '6', ' ', '7', ' ', '8', ' ', '9'},
                    {'0', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'1', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'2', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'3', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'4', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'5', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'6', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'7', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'8', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'9', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'}};


    // This is a grid to show results for CPU sea.
    public static char[][] seaResultCPU = new char[][]
            {{' ', ' ', ' ', '0', ' ', '1', ' ', '2', ' ', '3', ' ', '4', ' ', '5', ' ', '6', ' ', '7', ' ', '8', ' ', '9'},
                    {'0', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'1', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'2', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'3', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'4', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'5', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'6', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'7', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'8', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'},
                    {'9', ' ', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~', ' ', '~'}};










    public static void countShipsHuman(char[][] seaHuman) {

        int countD = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;

        for (char[] row : seaHuman) {
            for (char c : row) {
                if (c == 'D') {
                    countD++;
                }
                if (c == 'C') {
                    countC++;
                }
                if (c == 'B') {
                    countB++;
                }
                if (c == 'A') {
                    countA++;
                }
            }
        }

        System.out.println("\n" + getPlayer1Name() + "'s" + " Ships: Destroyer(" + countD + "/" + "2)" + " " + "Cruiser(" + countC + "/" + "3)" + " " +
                "Battleship(" + countB + "/" + "4)" + " " + "Aircraft Carrier(" + countA + "/" + "5)");


        if (countD == 0) {
            System.out.println("- " + getPlayer1Name() + "'s" + " destroyer has sunk!");
        }

        if (countC == 0) {
            System.out.println("- " + getPlayer1Name() + "'s" + " cruiser has sunk!");

        }

        if (countB == 0) {
            System.out.println("- " + getPlayer1Name() + "'s" + " battleship has sunk!");
        }

        if (countA == 0) {
            System.out.println("- " + getPlayer1Name() + "'s" + " aircraft carrier has sunk!");
        }

        if (countD == 0 && countC == 0 && countB == 0 && countA == 0) {
            System.out.println("- All of " + getPlayer1Name() + "'s" + " ships have sunk!\n" +
                    "============== Game Over ===============");
            gameOver = true;
        }

    }





    public static void countShipsCPU ( char[][] seaCPU){

        int countD = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;

        for (char[] row : seaCPU) {
            for (char c : row) {
                if (c == 'D') {
                    countD++;
                }
                if (c == 'C') {
                    countC++;
                }
                if (c == 'B') {
                    countB++;
                }
                if (c == 'A') {
                    countA++;
                }
            }
        }


        System.out.println("\n" + getPlayer2Name() + "'s" + " Ships: Destroyer(" + countD + "/" + "2)" + " " + "Cruiser(" + countC + "/" + "3)" + " " +
                "Battleship(" + countB + "/" + "4)" + " " + "Aircraft Carrier(" + countA + "/" + "5)");


        if (countD == 0) {
            System.out.println("- " + getPlayer2Name() + "'s" + " destroyer has sunk!");
        }

        if (countC == 0) {
            System.out.println("- " + getPlayer2Name() + "'s" + " cruiser has sunk!");

        }

        if (countB == 0) {
            System.out.println("- " + getPlayer2Name() + "'s" + " battleship has sunk!");
        }

        if (countA == 0) {
            System.out.println("- " + getPlayer2Name() + "'s" + " aircraft carrier has sunk!");
        }

        if (countD == 0 && countC == 0 && countB == 0 && countA == 0) {
            System.out.println("- All of " + getPlayer2Name() + "'s" + " ships have sunk!\n" +
                    "============== Game Over ===============");
            gameOver = true;
        }
    }


    public static void printSeaHuman ( char[][] seaHuman){

        for (char[] row : seaHuman) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


    public static void printSeaCPU ( char[][] seaCPU){

        for (char[] row : seaCPU) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }



    public static void placeTargetHuman ( char[][] seaCPU){


        realShipTargetRowH = shipTargetRowH + 1;
        realShipTargetColumnH = (shipTargetColumnH * 2) + 3;


        if (seaCPU[realShipTargetRowH][realShipTargetColumnH] == 'D' ||
                seaCPU[realShipTargetRowH][realShipTargetColumnH] == 'C' ||
                seaCPU[realShipTargetRowH][realShipTargetColumnH] == 'B' ||
                seaCPU[realShipTargetRowH][realShipTargetColumnH] == 'A') {

            System.out.println("===> " + getPlayer1Name() + " hit a " + getPlayer2Name() + "'s" + " ship! X added at " + "("+ shipTargetRowH + ", " + shipTargetColumnH+").");
            seaCPU[realShipTargetRowH][realShipTargetColumnH] = 'X';
            seaResultCPU[realShipTargetRowH][realShipTargetColumnH] = 'X';



        } else {
            System.out.println("~~~> " + getPlayer1Name() + " missed a target! M added at " + "("+ shipTargetRowH + ", " + shipTargetColumnH+").");
            seaCPU[realShipTargetRowH][realShipTargetColumnH] = 'M';
            seaResultCPU[realShipTargetRowH][realShipTargetColumnH] = 'M';
        }

    }




    public static void printSeaResultCPU ( char[][] seaResultCPU) {

        for (char[] row : seaResultCPU) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }



    public static void placeTargetCPU ( char[][] seaHuman){

        realShipTargetRowC = shipTargetRowC + 1;
        realShipTargetColumnC = (shipTargetColumnC * 2) + 3;

        if (seaHuman[realShipTargetRowC][realShipTargetColumnC] == 'D' ||
                seaHuman[realShipTargetRowC][realShipTargetColumnC] == 'C' ||
                seaHuman[realShipTargetRowC][realShipTargetColumnC] == 'B' ||
                seaHuman[realShipTargetRowC][realShipTargetColumnC] == 'A') {

            System.out.println("===> " + getPlayer2Name() + " hit a " + getPlayer1Name() + "'s" + " ship! X added at " + "("+ shipTargetRowC + ", " + shipTargetColumnC+").\n");
            seaHuman[realShipTargetRowC][realShipTargetColumnC] = 'X';

        } else {
            System.out.println("~~~> " + getPlayer2Name() + " missed a target! M added at " + "("+ shipTargetRowC + ", " + shipTargetColumnC+").\n");
            seaHuman[realShipTargetRowC][realShipTargetColumnC] = 'M';
        }

    }


    public static void placePieceHuman ( char[][] seaHuman, String humanShip){

                          /* 1 Destroyer: 2
            1 Cruiser: 3
            1 Battleship: 4
            1 Aircraft Carrier 5

             */


        realShipPosRow1 = shipPosRow + 1;
        realShipPosRow2 = shipPosRow + 2;
        realShipPosRow3 = shipPosRow + 3;
        realShipPosRow4 = shipPosRow + 4;
        realShipPosRow5 = shipPosRow + 5;


        realShipPosColumn1 = (shipPosColumn * 2) + 3;
        realShipPosColumn2 = (shipPosColumn * 2) + 5;
        realShipPosColumn3 = (shipPosColumn * 2) + 7;
        realShipPosColumn4 = (shipPosColumn * 2) + 9;
        realShipPosColumn5 = (shipPosColumn * 2) + 11;


        char symbol = 'D';


        if (humanShip.equals("destroyer")) {

            symbol = 'D';

            if (shipPosHorVer.charAt(0) == 'h') {
                seaHuman[realShipPosRow1][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow1][realShipPosColumn2] = symbol;
            } else {
                seaHuman[realShipPosRow1][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow2][realShipPosColumn1] = symbol;
            }


        } else if (humanShip.equals("cruiser")) {
            symbol = 'C';
            if (shipPosHorVer.charAt(0) == 'h') {
                seaHuman[realShipPosRow1][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow1][realShipPosColumn2] = symbol;
                seaHuman[realShipPosRow1][realShipPosColumn3] = symbol;

            } else {
                seaHuman[realShipPosRow1][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow2][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow3][realShipPosColumn1] = symbol;
            }

        } else if (humanShip.equals("battleship")) {
            symbol = 'B';


            if (shipPosHorVer.charAt(0) == 'h') {
                seaHuman[realShipPosRow1][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow1][realShipPosColumn2] = symbol;
                seaHuman[realShipPosRow1][realShipPosColumn3] = symbol;
                seaHuman[realShipPosRow1][realShipPosColumn4] = symbol;


            } else {
                seaHuman[realShipPosRow1][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow2][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow3][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow4][realShipPosColumn1] = symbol;

            }

        } else if (humanShip.equals("aircraftCarrier")) {
            symbol = 'A';

            if (shipPosHorVer.charAt(0) == 'h') {
                seaHuman[realShipPosRow1][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow1][realShipPosColumn2] = symbol;
                seaHuman[realShipPosRow1][realShipPosColumn3] = symbol;
                seaHuman[realShipPosRow1][realShipPosColumn4] = symbol;
                seaHuman[realShipPosRow1][realShipPosColumn5] = symbol;


            } else {
                seaHuman[realShipPosRow1][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow2][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow3][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow4][realShipPosColumn1] = symbol;
                seaHuman[realShipPosRow5][realShipPosColumn1] = symbol;

            }
        }
    }


    public static void placePieceCPU ( char[][] seaCPU, String cpuShip){

                             /* 1 Destroyer: 2
            1 Cruiser: 3
            1 Battleship: 4
            1 Aircraft Carrier 5

             */


        realShipPosRow1 = shipPosRow + 1;
        realShipPosRow2 = shipPosRow + 2;
        realShipPosRow3 = shipPosRow + 3;
        realShipPosRow4 = shipPosRow + 4;
        realShipPosRow5 = shipPosRow + 5;


        realShipPosColumn1 = (shipPosColumn * 2) + 3;
        realShipPosColumn2 = (shipPosColumn * 2) + 5;
        realShipPosColumn3 = (shipPosColumn * 2) + 7;
        realShipPosColumn4 = (shipPosColumn * 2) + 9;
        realShipPosColumn5 = (shipPosColumn * 2) + 11;


        char symbol = 'D';


        if (cpuShip.equals("destroyer")) {

            symbol = 'D';

            if (shipPosHorVer.charAt(0) == 'h') {
                seaCPU[realShipPosRow1][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow1][realShipPosColumn2] = symbol;
            } else {
                seaCPU[realShipPosRow1][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow2][realShipPosColumn1] = symbol;
            }


        } else if (cpuShip.equals("cruiser")) {
            symbol = 'C';
            if (shipPosHorVer.charAt(0) == 'h') {
                seaCPU[realShipPosRow1][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow1][realShipPosColumn2] = symbol;
                seaCPU[realShipPosRow1][realShipPosColumn3] = symbol;

            } else {
                seaCPU[realShipPosRow1][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow2][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow3][realShipPosColumn1] = symbol;
            }

        } else if (cpuShip.equals("battleship")) {
            symbol = 'B';


            if (shipPosHorVer.charAt(0) == 'h') {
                seaCPU[realShipPosRow1][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow1][realShipPosColumn2] = symbol;
                seaCPU[realShipPosRow1][realShipPosColumn3] = symbol;
                seaCPU[realShipPosRow1][realShipPosColumn4] = symbol;


            } else {
                seaCPU[realShipPosRow1][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow2][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow3][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow4][realShipPosColumn1] = symbol;

            }

        } else if (cpuShip.equals("aircraftCarrier")) {
            symbol = 'A';

            if (shipPosHorVer.charAt(0) == 'h') {
                seaCPU[realShipPosRow1][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow1][realShipPosColumn2] = symbol;
                seaCPU[realShipPosRow1][realShipPosColumn3] = symbol;
                seaCPU[realShipPosRow1][realShipPosColumn4] = symbol;
                seaCPU[realShipPosRow1][realShipPosColumn5] = symbol;


            } else {
                seaCPU[realShipPosRow1][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow2][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow3][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow4][realShipPosColumn1] = symbol;
                seaCPU[realShipPosRow5][realShipPosColumn1] = symbol;

            }
        }
    }

}




