

import java.util.*;

class Battleship {


    public static String result;
    public static int humanShipPosRow = 0;
    public static int humanShipPosColumn = 0;
    public static String humanShipPosHorVer;

    public static int rDC, cDC, rCC, cCC, rBC, cBC, rACC, cACC;
    public static String hvDC, hvCC, hvBC, hvACC;

    public static int realHumanShipPosRow1;
    public static int realHumanShipPosRow2;
    public static int realHumanShipPosRow3;
    public static int realHumanShipPosRow4;
    public static int realHumanShipPosRow5;


    public static int realHumanShipPosColumn1;
    public static int realHumanShipPosColumn2;
    public static int realHumanShipPosColumn3;
    public static int realHumanShipPosColumn4;
    public static int realHumanShipPosColumn5;



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


        printSeaHuman(seaHuman);
        System.out.println("<<<<<<<< Human Sea: [row][column] >>>>>>>>>");


// Will place ships for human ships
            /* 1 Destroyer: 2
            1 Cruiser: 3
            1 Battleship: 4
            1 Aircraft Carrier 5

             */

        // Destroyer: 2
        humanShipPosRow = 0;
        humanShipPosColumn = 0;
        System.out.println("Placing Human Ships:\n" +
                "Please place a Destroyer (Size 2).\n" +
                "Choose a row (0-9):");
        Scanner rowDestroyerHuman = new Scanner(System.in);
        humanShipPosRow = rowDestroyerHuman.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnDestroyerHuman = new Scanner(System.in);
        humanShipPosColumn = columnDestroyerHuman.nextInt();
        System.out.println(
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvDestroyerHuman = new Scanner(System.in);
        humanShipPosHorVer = hvDestroyerHuman.nextLine();


        placePieceHuman(seaHuman, "destroyer");
        printSeaHuman(seaHuman);
        System.out.println("<<<<<<<< Human Sea: [row][column] >>>>>>>>>");


        // Cruiser: 3
        humanShipPosRow = 0;
        humanShipPosColumn = 0;
        System.out.println("Placing Human Ships:\n" +
                "Please place a Cruiser (Size 3).\n" +
                "Choose a row (0-9):");
        Scanner rowCruiserHuman = new Scanner(System.in);
        humanShipPosRow = rowCruiserHuman.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnCruiserHuman = new Scanner(System.in);
        humanShipPosColumn = columnCruiserHuman.nextInt();
        System.out.println(
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvCruiserHuman = new Scanner(System.in);
        humanShipPosHorVer = hvCruiserHuman.nextLine();

        placePieceHuman(seaHuman, "cruiser");
        printSeaHuman(seaHuman);
        System.out.println("<<<<<<<< Human Sea: [row][column] >>>>>>>>>");


        // Battleship: 4
        humanShipPosRow = 0;
        humanShipPosColumn = 0;
        System.out.println("Placing Human Ships:\n" +
                "Please place a Battleship (Size 4).\n" +
                "Choose a row (0-9):");
        Scanner rowBattleshipHuman = new Scanner(System.in);
        humanShipPosRow = rowBattleshipHuman.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnBattleshipHuman = new Scanner(System.in);
        humanShipPosColumn = columnBattleshipHuman.nextInt();
        System.out.println(
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvBattleshipHuman = new Scanner(System.in);
        humanShipPosHorVer = hvBattleshipHuman.nextLine();

        placePieceHuman(seaHuman, "battleship");
        printSeaHuman(seaHuman);
        System.out.println("<<<<<<<< Human Sea: [row][column] >>>>>>>>>");


        // Aircraft Carrier: 5
        humanShipPosRow = 0;
        humanShipPosColumn = 0;
        System.out.println("Placing Human Ships:\n" +
                "Please place a Aircraft Carrier (Size 5).\n" +
                "Choose a row (0-9):");
        Scanner rowAircraftCarrierHuman = new Scanner(System.in);
        humanShipPosRow = rowAircraftCarrierHuman.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnAircraftCarrierHuman = new Scanner(System.in);
        humanShipPosColumn = columnAircraftCarrierHuman.nextInt();
        System.out.println(
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvAircraftCarrierHuman = new Scanner(System.in);
        humanShipPosHorVer = hvAircraftCarrierHuman.nextLine();

        placePieceHuman(seaHuman, "aircraftCarrier");
        printSeaHuman(seaHuman);
        System.out.println("<<<<<<<< Human Sea: [row][column] >>>>>>>>>");






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

        printSeaCPU(seaCPU);
        System.out.println("<<<<<<<<<< CPU Sea: [row][column] >>>>>>>>>>");


        // Randomly will place CPU ships
                  /* 1 Destroyer: 2
            1 Cruiser: 3
            1 Battleship: 4
            1 Aircraft Carrier 5

             */


        // Destroyer: 2
        humanShipPosRow = 0;
        humanShipPosColumn = 0;
        System.out.println("Placing CPU Ships:\n" +
                "Please place a Destroyer (Size 2).\n" +
                "Choose a row (0-9):");
        Scanner rowDestroyerCPU = new Scanner(System.in);
        int rDC = rowDestroyerCPU.nextInt();
        System.out.println("Placing CPU Ships:\n" +
                "Please place a Destroyer (Size 2).\n" +
                "Choose a column (0-9):");
        Scanner columnDestroyerCPU = new Scanner(System.in);
        int cDC = columnDestroyerCPU.nextInt();
        System.out.println("Placing CPU Ships:\n" +
                "Please place a Destroyer (Size 2).\n" +
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvDestroyerCPU = new Scanner(System.in);
        hvDC = hvDestroyerCPU.nextLine();

        printSeaCPU(seaCPU);
        System.out.println("<<<<<<<<<< CPU Sea: [row][column] >>>>>>>>>>");

        // Cruiser: 3
        humanShipPosRow = 0;
        humanShipPosColumn = 0;
        System.out.println("Placing CPU Ships:\n" +
                "Please place a Cruiser (Size 3).\n" +
                "Choose a row (0-9):");
        Scanner rowCruiserCPU = new Scanner(System.in);
        int rCC = rowCruiserCPU.nextInt();
        System.out.println("Placing CPU Ships:\n" +
                "Please place a Cruiser (Size 3).\n" +
                "Choose a column (0-9):");
        Scanner columnCruiserCPU = new Scanner(System.in);
        int cCC = columnCruiserCPU.nextInt();
        System.out.println("Placing CPU Ships:\n" +
                "Please place a Cruiser (Size 3).\n" +
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvCruiserCPU = new Scanner(System.in);
        hvCC = hvCruiserCPU.nextLine();

        printSeaCPU(seaCPU);
        System.out.println("<<<<<<<<<< CPU Sea: [row][column] >>>>>>>>>>");


        // Battleship: 4
        humanShipPosRow = 0;
        humanShipPosColumn = 0;
        System.out.println("Placing CPU Ships:\n" +
                "Please place a Battleship (Size 4).\n" +
                "Choose a row (0-9):");
        Scanner rowBattleshipCPU = new Scanner(System.in);
        int rBC = rowBattleshipCPU.nextInt();
        System.out.println("Placing CPU Ships:\n" +
                "Please place a Battleship (Size 4).\n" +
                "Choose a column (0-9):");
        Scanner columnBattleshipCPU = new Scanner(System.in);
        int cBC = columnBattleshipCPU.nextInt();
        System.out.println("Placing CPU Ships:\n" +
                "Please place a Battleship (Size 4).\n" +
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvBattleshipCPU = new Scanner(System.in);
        hvBC = hvBattleshipCPU.nextLine();

        printSeaCPU(seaCPU);
        System.out.println("<<<<<<<<<< CPU Sea: [row][column] >>>>>>>>>>");


        // Aircraft Carrier: 5
        humanShipPosRow = 0;
        humanShipPosColumn = 0;
        System.out.println("Placing CPU Ships:\n" +
                "Please place a Aircraft Carrier (Size 5).\n" +
                "Choose a row (0-9):");
        Scanner rowAircraftCarrierCPU = new Scanner(System.in);
        int rACC = rowAircraftCarrierCPU.nextInt();
        System.out.println("Placing CPU Ships:\n" +
                "Please place a Aircraft Carrier (Size 5).\n" +
                "Choose a column (0-9):");
        Scanner columnAircraftCarrierCPU = new Scanner(System.in);
        int cACC = columnAircraftCarrierCPU.nextInt();
        System.out.println("Placing CPU Ships:\n" +
                "Please place a Aircraft Carrier (Size 5).\n" +
                "Would you place it horizontally or vertically (h or v)?");
        Scanner hvAircraftCarrierCPU = new Scanner(System.in);
        hvACC = hvAircraftCarrierCPU.nextLine();

        printSeaCPU(seaCPU);
        System.out.println("<<<<<<<<<< CPU Sea: [row][column] >>>>>>>>>>");


        while (true) {

            System.out.println("What is your next target? [row][column]");
            System.out.println("Horizontal Target (0-9): ");
            Scanner targetHumanH = new Scanner(System.in);
            int tHH = targetHumanH.nextInt();
            System.out.println("Vertical Target (0-9): ");
            Scanner targetCPUH = new Scanner(System.in);
            int tVH = targetCPUH.nextInt();
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


    public static void placeTargetHuman(char[][] seaCPU, char[][] cpuPos, String humanShip) {


    }

    public static void placeTargetCPU(char[][] seaHuman, char[][] humanPos, String humanShip) {


    }


    public static void placePieceHuman(char[][] seaHuman, String humanShip) {

                          /* 1 Destroyer: 2
            1 Cruiser: 3
            1 Battleship: 4
            1 Aircraft Carrier 5

             */


        realHumanShipPosRow1 = humanShipPosRow + 1;
        realHumanShipPosRow2 = humanShipPosRow + 2;
        realHumanShipPosRow3 = humanShipPosRow + 3;
        realHumanShipPosRow4 = humanShipPosRow + 4;
        realHumanShipPosRow5 = humanShipPosRow + 5;


        realHumanShipPosColumn1 = (humanShipPosColumn * 2) + 3;
        realHumanShipPosColumn2 = (humanShipPosColumn * 2) + 5;
        realHumanShipPosColumn3 = (humanShipPosColumn * 2) + 7;
        realHumanShipPosColumn4 = (humanShipPosColumn * 2) + 9;
        realHumanShipPosColumn5 = (humanShipPosColumn * 2) + 11;


        char symbol = 'D';





        if (humanShip.equals("destroyer")) {

            symbol = 'D';

            if (humanShipPosHorVer.charAt(0) == 'h') {
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn2] = symbol;
            } else {
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow2][realHumanShipPosColumn1] = symbol;
            }




        } else if (humanShip.equals("cruiser")) {
            symbol = 'C';
            if (humanShipPosHorVer.charAt(0) == 'h') {
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn2] = symbol;
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn3] = symbol;

            } else {
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow2][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow3][realHumanShipPosColumn1] = symbol;
            }

        } else if (humanShip.equals("battleship")) {
            symbol = 'B';


            if (humanShipPosHorVer.charAt(0) == 'h') {
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn2] = symbol;
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn3] = symbol;
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn4] = symbol;


            } else {
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow2][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow3][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow4][realHumanShipPosColumn1] = symbol;

            }

        } else if (humanShip.equals("aircraftCarrier")) {
            symbol = 'A';

            if (humanShipPosHorVer.charAt(0) == 'h') {
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn2] = symbol;
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn3] = symbol;
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn4] = symbol;
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn5] = symbol;


            } else {
                seaHuman[realHumanShipPosRow1][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow2][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow3][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow4][realHumanShipPosColumn1] = symbol;
                seaHuman[realHumanShipPosRow5][realHumanShipPosColumn1] = symbol;

            }
        }
    }


//    public static int humanShipPosRow, humanShipPosColumn, humanShipPosRow, humanShipPosColumn;
//    public static String , humanShipPosHorVer, humanShipPosHorVer;
//
//    public static int rDC, cDC, rCC, cCC, rBC, cBC, rACC, cACC;
//    public static String hvDC, hvCC, hvBC, hvACC;


    public static void placePieceCPU(char[][] seaCPU, char[][] cpuPos, String cpuShip) {

                          /* 1 Destroyer: 2
            1 Cruiser: 3
            1 Battleship: 4
            1 Aircraft Carrier 5

             */

        char symbol = 'D';


        if (cpuShip.equals("destroyer")) {
            symbol = 'D';

        } else if (cpuShip.equals("cruiser")) {
            symbol = 'C';
        } else if (cpuShip.equals("battleship")) {
            symbol = 'B';
        } else if (cpuShip.equals("aircraftCarrier")) {
            symbol = 'A';
        }
    }


    public static String checkWinner() {

        return "";
    }

}







