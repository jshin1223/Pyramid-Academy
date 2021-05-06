

import java.util.*;

class Battleship {


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

    public static void main(String[] args) {


        System.out.println("");
        System.out.println("Welcome to Battleship! Human Ships vs CPU Ships!");
        System.out.println("");


        // This is a grid for human sea
        char[][] seaHuman = new char[][]
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

        System.out.println("---------------------- Human Ships ---------------");
        printSeaHuman(seaHuman);


// Will place ships for human ships
            /* 1 Destroyer: 2
            1 Cruiser: 3
            1 Battleship: 4
            1 Aircraft Carrier 5

             */

        // Destroyer: 2
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing Human Ships:\n" +
                "Please place a Destroyer (Size 2):\n" +
                "Choose a row (0-9):");
        Scanner rowDestroyerHuman = new Scanner(System.in);
        shipPosRow = rowDestroyerHuman.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnDestroyerHuman = new Scanner(System.in);
        shipPosColumn = columnDestroyerHuman.nextInt();
        System.out.println(
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvDestroyerHuman = new Scanner(System.in);
        shipPosHorVer = hvDestroyerHuman.nextLine();


        placePieceHuman(seaHuman, "destroyer");
        System.out.println("---------------------- Human ships shown below ---------------");
        printSeaHuman(seaHuman);

        // Cruiser: 3
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing Human Ships:\n" +
                "Please place a Cruiser (Size 3):\n" +
                "Choose a row (0-9):");
        Scanner rowCruiserHuman = new Scanner(System.in);
        shipPosRow = rowCruiserHuman.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnCruiserHuman = new Scanner(System.in);
        shipPosColumn = columnCruiserHuman.nextInt();
        System.out.println(
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvCruiserHuman = new Scanner(System.in);
        shipPosHorVer = hvCruiserHuman.nextLine();

        placePieceHuman(seaHuman, "cruiser");
        System.out.println("---------------------- Human ships shown below ---------------");
        printSeaHuman(seaHuman);


        // Battleship: 4
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing Human Ships:\n" +
                "Please place a Battleship (Size 4):\n" +
                "Choose a row (0-9):");
        Scanner rowBattleshipHuman = new Scanner(System.in);
        shipPosRow = rowBattleshipHuman.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnBattleshipHuman = new Scanner(System.in);
        shipPosColumn = columnBattleshipHuman.nextInt();
        System.out.println(
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvBattleshipHuman = new Scanner(System.in);
        shipPosHorVer = hvBattleshipHuman.nextLine();

        placePieceHuman(seaHuman, "battleship");
        System.out.println("---------------------- Human ships shown below ---------------");
        printSeaHuman(seaHuman);


        // Aircraft Carrier: 5
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing Human Ships:\n" +
                "Please place a Aircraft Carrier (Size 5):\n" +
                "Choose a row (0-9):");
        Scanner rowAircraftCarrierHuman = new Scanner(System.in);
        shipPosRow = rowAircraftCarrierHuman.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnAircraftCarrierHuman = new Scanner(System.in);
        shipPosColumn = columnAircraftCarrierHuman.nextInt();
        System.out.println(
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvAircraftCarrierHuman = new Scanner(System.in);
        shipPosHorVer = hvAircraftCarrierHuman.nextLine();

        placePieceHuman(seaHuman, "aircraftCarrier");
        System.out.println("---------------------- Human ships shown below ---------------"); 
        printSeaHuman(seaHuman);





        // This is a grid for CPU sea.
        char[][] seaCPU = new char[][]
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


        System.out.println("\n\n\n\n" + "------------------- CPU Ships: ---------------");
        printSeaCPU(seaCPU);
        System.out.println("\nNext Computer will place its ships:");


        // Randomly will place CPU ships
                  /* 1 Destroyer: 2
            1 Cruiser: 3
            1 Battleship: 4
            1 Aircraft Carrier 5

             */


        // Destroyer: 2
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing Computer Ships:\n" +
                "Please place a Destroyer (Size 2):\n" +
                "Choose a row (0-9):");
        Scanner rowDestroyerCPU = new Scanner(System.in);
        shipPosRow = rowDestroyerCPU.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnDestroyerCPU = new Scanner(System.in);
        shipPosColumn = columnDestroyerCPU.nextInt();
        System.out.println(
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvDestroyerCPU = new Scanner(System.in);
        shipPosHorVer = hvDestroyerCPU.nextLine();


        placePieceCPU(seaCPU, "destroyer");
        System.out.println("--------------------------- Computer ships shown below ----------------");
        printSeaCPU(seaCPU);



        // Cruiser: 3
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing Computer Ships:\n" +
                "Please place a Cruiser (Size 3):\n" +
                "Choose a row (0-9):");
        Scanner rowCruiserCPU = new Scanner(System.in);
        shipPosRow = rowCruiserCPU.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnCruiserCPU = new Scanner(System.in);
        shipPosColumn = columnCruiserCPU.nextInt();
        System.out.println(
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvCruiserCPU = new Scanner(System.in);
        shipPosHorVer = hvCruiserCPU.nextLine();

        placePieceCPU(seaCPU, "cruiser");
        System.out.println("--------------------------- Computer ships shown below ----------------");
        printSeaCPU(seaCPU);



        // Battleship: 4
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing Computer Ships:\n" +
                "Please place a Battleship (Size 4):\n" +
                "Choose a row (0-9):");
        Scanner rowBattleshipCPU = new Scanner(System.in);
        shipPosRow = rowBattleshipCPU.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnBattleshipCPU = new Scanner(System.in);
        shipPosColumn = columnBattleshipCPU.nextInt();
        System.out.println(
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvBattleshipCPU = new Scanner(System.in);
        shipPosHorVer = hvBattleshipCPU.nextLine();

        placePieceCPU(seaCPU, "battleship");
        System.out.println("--------------------------- Computer ships shown below ----------------");
        printSeaCPU(seaCPU);



        // Aircraft Carrier: 5
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing Computer Ships:\n" +
                "Please place a Aircraft Carrier (Size 5):\n" +
                "Choose a row (0-9):");
        Scanner rowAircraftCarrierCPU = new Scanner(System.in);
        shipPosRow = rowAircraftCarrierCPU.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnAircraftCarrierCPU = new Scanner(System.in);
        shipPosColumn = columnAircraftCarrierCPU.nextInt();
        System.out.println(
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvAircraftCarrierCPU = new Scanner(System.in);
        shipPosHorVer = hvAircraftCarrierCPU.nextLine();

        placePieceCPU(seaCPU, "aircraftCarrier");
        System.out.println("--------------------------- Computer ships shown below ----------------");
        printSeaCPU(seaCPU);



        while (true) {

            // Human Targeting
            shipTargetRowH = 0;
            shipTargetColumnH = 0;
            System.out.println("\nYour turn:\n" + "What is your next target? [row][column]");
            System.out.println("Horizontal Target (0-9): ");
            Scanner targetRow = new Scanner(System.in);
            shipTargetRowH = targetRow.nextInt();
            System.out.println("Vertical Target (0-9): ");
            Scanner targetCol = new Scanner(System.in);
            shipTargetColumnH = targetCol.nextInt();




            // CPU Targeting
            shipTargetRowC = 0;
            shipTargetColumnC = 0;
            Random randRow = new Random();
            int cpuTargetRow = randRow.nextInt(9) + 1;
            shipTargetRowC = cpuTargetRow;

            Random randCol = new Random();
            int cpuTargetColumn = randCol.nextInt(9) + 1;
            shipTargetColumnC = cpuTargetColumn;

            System.out.println("\nComputer's turn:\nComputer has made a guess: ");

            System.out.println("\n============================================\n" +
                    "============================================\n" +
                    "============ Here is the result ============\n" +
                    "============================================\n" +
                    "============================================");


                    // Showing the Result

            placeTargetHuman(seaCPU);
            placeTargetCPU(seaHuman);

            System.out.println("\n------------ Human ships shown below ------------\n");
            printSeaCPU(seaHuman);

            System.out.println("\n------------ Computer ships shown below -------------\n");
            printSeaCPU(seaCPU);

            countShipsHuman(seaHuman);
            countShipsCPU(seaCPU);

            if (gameOver == true) {
                break;
            }


        }


    }


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

        System.out.println ("\nYour Ships: Destroyer(" + countD + "/" + "2)" + " " + "Cruiser(" + countC + "/" + "3)" + " " +
                "Battleship(" + countB + "/" + "4)" + " " + "Aircraft Carrier(" + countA + "/" + "5)");


        if (countD == 0) {
            System.out.println("- Your destroyer has sunk!");
        }

        if (countC == 0) {
            System.out.println("- Your cruiser has sunk!");

        }

        if (countB == 0) {
            System.out.println("- Your battleship has sunk!");
        }

        if (countA == 0) {
            System.out.println("- Your aircraft carrier has sunk!");
        }

        if (countD == 0 && countC == 0 && countB == 0 && countA == 0 ) {
            System.out.println("- All of your ships have sunk!\n" +
                    "============== Game Over ===============");
                     gameOver = true;
        }


    }





    public static void countShipsCPU(char[][] seaCPU) {

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



        System.out.println ("\nComputer's Ships: Destroyer(" + countD + "/" + "2)" + " " + "Cruiser(" + countC + "/" + "3)" + " " +
                "Battleship(" + countB + "/" + "4)" + " " + "Aircraft Carrier(" + countA + "/" + "5)");


        if (countD == 0) {
            System.out.println("- Computer's destroyer has sunk!");
        }

        if (countC == 0) {
            System.out.println("- Computer's cruiser has sunk!");

        }

        if (countB == 0) {
            System.out.println("- Computer's battleship has sunk!");
        }

        if (countA == 0) {
            System.out.println("- Computer's aircraft carrier has sunk!");
        }

        if (countD == 0 && countC == 0 && countB == 0 && countA == 0 ) {
            System.out.println("- All of Computer's ships have sunk!\n" +
                    "============== Game Over ===============");
                    gameOver = true;
        }
    }


    public static void printSeaHuman(char[][] seaHuman) {

        for (char[] row : seaHuman) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


    public static void printSeaCPU(char[][] seaCPU) {

        for (char[] row : seaCPU) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }


    public static void placeTargetHuman(char[][] seaCPU) {



        realShipTargetRowH = shipTargetRowH + 1;
        realShipTargetColumnH = (shipTargetColumnH * 2) + 3;

        if (seaCPU[realShipTargetRowH][realShipTargetColumnH] == 'D' ||
                seaCPU[realShipTargetRowH][realShipTargetColumnH] == 'C' ||
                seaCPU[realShipTargetRowH][realShipTargetColumnH] == 'B' ||
                seaCPU[realShipTargetRowH][realShipTargetColumnH] == 'A') {

            System.out.println("\n===> You hit a computer ship! (X added)");
            seaCPU[realShipTargetRowH][realShipTargetColumnH] = 'X';

        } else {
            System.out.println("\n~~~> You missed a target! (M addded)");
            seaCPU[realShipTargetRowH][realShipTargetColumnH] = 'M';
        }


    }

    public static void placeTargetCPU(char[][] seaHuman) {

        realShipTargetRowC = shipTargetRowC + 1;
        realShipTargetColumnC = (shipTargetColumnC * 2) + 3;

        if (seaHuman[realShipTargetRowC][realShipTargetColumnC] == 'D' ||
                seaHuman[realShipTargetRowC][realShipTargetColumnC] == 'C' ||
                seaHuman[realShipTargetRowC][realShipTargetColumnC] == 'B' ||
                seaHuman[realShipTargetRowC][realShipTargetColumnC] == 'A') {

            System.out.println("\n===> Computer hit a human ship! (X added)");
            seaHuman[realShipTargetRowC][realShipTargetColumnC] = 'X';

        } else {
            System.out.println("\n~~~> Computer missed a target! (M added)");
            seaHuman[realShipTargetRowC][realShipTargetColumnC] = 'M';
        }

    }


    public static void placePieceHuman(char[][] seaHuman, String humanShip) {

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


//    public static int shipPosRow, shipPosColumn, shipPosRow, shipPosColumn;
//    public static String , shipPosHorVer, shipPosHorVer;
//
//    public static int rDC, cDC, rCC, cCC, rBC, cBC, rACC, cACC;
//    public static String hvDC, hvCC, hvBC, hvACC;


    public static void placePieceCPU(char[][] seaCPU, String cpuShip) {

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


    public static String checkWinner() {

        return "";
    }

}







