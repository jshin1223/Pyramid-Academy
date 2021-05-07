import java.util.*;

class Battleship extends Ship {


    public static void main(String[] args) {


        Setting();


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

        System.out.println("------------------------- " + getPlayer1Name() + "'s" + " ships shown below ---------------");
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
        System.out.println("\nPlacing " + getPlayer1Name() + "'s" + " Ships:\n" +
               "Please place a Destroyer (Size 2):\n" +
               "Choose a row (0-9):");
        Scanner rowDestroyerHuman = new Scanner(System.in);
        shipPosRow = rowDestroyerHuman.nextInt();
        System.out.println(
               "Choose a column (0-9):");
        Scanner columnDestroyerHuman = new Scanner(System.in);
        shipPosColumn = columnDestroyerHuman.nextInt();
        System.out.println(
               "Place horizontally or vertically (h or v)?");
        Scanner hvDestroyerHuman = new Scanner(System.in);
        shipPosHorVer = hvDestroyerHuman.nextLine();


        placePieceHuman(seaHuman, "destroyer");
        System.out.println("------------------------- " + getPlayer1Name() + "'s" + " ships shown below ---------------");
        printSeaHuman(seaHuman);

        // Cruiser: 3
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing " + getPlayer1Name() + "'s" + " \n" +
               "Please place a Cruiser (Size 3):\n" +
               "Choose a row (0-9):");
        Scanner rowCruiserHuman = new Scanner(System.in);
        shipPosRow = rowCruiserHuman.nextInt();
        System.out.println(
               "Choose a column (0-9):");
        Scanner columnCruiserHuman = new Scanner(System.in);
        shipPosColumn = columnCruiserHuman.nextInt();
        System.out.println(
               "Place horizontally or vertically (h or v)?");
        Scanner hvCruiserHuman = new Scanner(System.in);
        shipPosHorVer = hvCruiserHuman.nextLine();

        placePieceHuman(seaHuman, "cruiser");
        System.out.println("------------------------- " + getPlayer1Name() + "'s" + " ships shown below ---------------");
        printSeaHuman(seaHuman);


        // Battleship: 4
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing " + getPlayer1Name() + "'s" + " \n" +
               "Please place a Battleship (Size 4):\n" +
               "Choose a row (0-9):");
        Scanner rowBattleshipHuman = new Scanner(System.in);
        shipPosRow = rowBattleshipHuman.nextInt();
        System.out.println(
               "Choose a column (0-9):");
        Scanner columnBattleshipHuman = new Scanner(System.in);
        shipPosColumn = columnBattleshipHuman.nextInt();
        System.out.println(
               "Place horizontally or vertically (h or v)?");
        Scanner hvBattleshipHuman = new Scanner(System.in);
        shipPosHorVer = hvBattleshipHuman.nextLine();

        placePieceHuman(seaHuman, "battleship");
        System.out.println("------------------------- " + getPlayer1Name() + "'s" + " ships shown below ---------------");
        printSeaHuman(seaHuman);


        // Aircraft Carrier: 5
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing " + getPlayer1Name() + "'s" + " \n" +
               "Please place a Aircraft Carrier (Size 5):\n" +
               "Choose a row (0-9):");
        Scanner rowAircraftCarrierHuman = new Scanner(System.in);
        shipPosRow = rowAircraftCarrierHuman.nextInt();
        System.out.println(
               "Choose a column (0-9):");
        Scanner columnAircraftCarrierHuman = new Scanner(System.in);
        shipPosColumn = columnAircraftCarrierHuman.nextInt();
        System.out.println(
               "Place horizontally or vertically (h or v)?");
        Scanner hvAircraftCarrierHuman = new Scanner(System.in);
        shipPosHorVer = hvAircraftCarrierHuman.nextLine();

        placePieceHuman(seaHuman, "aircraftCarrier");
        System.out.println("------------------------- " + getPlayer1Name() + "'s" + " ships shown below ---------------");
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


        System.out.println("------------------------- " + getPlayer2Name() + "'s" + " ships shown below ---------------");
        printSeaCPU(seaCPU);
        System.out.println("\nNext " + getPlayer2Name() + " will place the ships:");







        // Randomly will place Computer Ships
                  /* 1 Destroyer: 2
            1 Cruiser: 3
            1 Battleship: 4
            1 Aircraft Carrier 5

             */


        // Destroyer: 2
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing " + getPlayer2Name() + "'s" + " Ships:\n" +
               "Please place a Destroyer (Size 2):\n" +
               "Choose a row (0-9):");
        Scanner rowDestroyerCPU = new Scanner(System.in);
        shipPosRow = rowDestroyerCPU.nextInt();
        System.out.println(
               "Choose a column (0-9):");
        Scanner columnDestroyerCPU = new Scanner(System.in);
        shipPosColumn = columnDestroyerCPU.nextInt();
        System.out.println(
               "Place horizontally or vertically (h or v)?");
        Scanner hvDestroyerCPU = new Scanner(System.in);
        shipPosHorVer = hvDestroyerCPU.nextLine();


        placePieceCPU(seaCPU, "destroyer");
        System.out.println("------------------------- " + getPlayer2Name() + "'s" + " ships shown below ---------------");
        printSeaCPU(seaCPU);



        // Cruiser: 3
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing " + getPlayer2Name() + "'s" + " Ships:\n" +
               "Please place a Cruiser (Size 3):\n" +
               "Choose a row (0-9):");
        Scanner rowCruiserCPU = new Scanner(System.in);
        shipPosRow = rowCruiserCPU.nextInt();
        System.out.println(
               "Choose a column (0-9):");
        Scanner columnCruiserCPU = new Scanner(System.in);
        shipPosColumn = columnCruiserCPU.nextInt();
        System.out.println(
               "Place horizontally or vertically (h or v)?");
        Scanner hvCruiserCPU = new Scanner(System.in);
        shipPosHorVer = hvCruiserCPU.nextLine();

        placePieceCPU(seaCPU, "cruiser");
        System.out.println("------------------------- " + getPlayer2Name() + "'s" + " ships shown below ---------------");
        printSeaCPU(seaCPU);



        // Battleship: 4
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing " + getPlayer2Name() + "'s" + " Ships:\n" +
               "Please place a Battleship (Size 4):\n" +
               "Choose a row (0-9):");
        Scanner rowBattleshipCPU = new Scanner(System.in);
        shipPosRow = rowBattleshipCPU.nextInt();
        System.out.println(
               "Choose a column (0-9):");
        Scanner columnBattleshipCPU = new Scanner(System.in);
        shipPosColumn = columnBattleshipCPU.nextInt();
        System.out.println(
               "Place horizontally or vertically (h or v)?");
        Scanner hvBattleshipCPU = new Scanner(System.in);
        shipPosHorVer = hvBattleshipCPU.nextLine();

        placePieceCPU(seaCPU, "battleship");
        System.out.println("------------------------- " + getPlayer2Name() + "'s" + " ships shown below ---------------");
        printSeaCPU(seaCPU);



        // Aircraft Carrier: 5
        shipPosRow = 0;
        shipPosColumn = 0;
        System.out.println("\nPlacing " + getPlayer2Name() + "'s" + " Ships:\n" +
               "Please place a Aircraft Carrier (Size 5):\n" +
               "Choose a row (0-9):");
        Scanner rowAircraftCarrierCPU = new Scanner(System.in);
        shipPosRow = rowAircraftCarrierCPU.nextInt();
        System.out.println(
               "Choose a column (0-9):");
        Scanner columnAircraftCarrierCPU = new Scanner(System.in);
        shipPosColumn = columnAircraftCarrierCPU.nextInt();
        System.out.println(
               "Place horizontally or vertically (h or v)?");
        Scanner hvAircraftCarrierCPU = new Scanner(System.in);
        shipPosHorVer = hvAircraftCarrierCPU.nextLine();

        placePieceCPU(seaCPU, "aircraftCarrier");
        System.out.println("------------------------- " + getPlayer2Name() + "'s" + " ships shown below ---------------");
        printSeaCPU(seaCPU);



        System.out.println("\n============================================\n" +
                "=============== Let's begin! ===============\n" +
                "============================================\n");
        System.out.println("------------------------- " + getPlayer1Name() + "'s" + " ships shown below ---------------");
        printSeaHuman(seaHuman);
        System.out.println("------------------------- " + getPlayer2Name() + "'s" + " ships shown below ---------------");
        printSeaResultCPU(seaResultCPU);


        while (true) {

            // Human Targeting
            shipTargetRowH = 0;
            shipTargetColumnH = 0;

            System.out.println("\n" + getPlayer1Name() + "'s" + " turn:\n" + "What is " + getPlayer1Name() + "'s" + " next target? [row][column]");
            System.out.println("Target Row (0-9): ");
            Scanner targetRow = new Scanner(System.in);
            shipTargetRowH = targetRow.nextInt();
            System.out.println("Target Column (0-9): ");
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

            System.out.println("\n" + getPlayer2Name() + "'s" + " turn:\n" + getPlayer2Name() + " has made a guess: ");

            System.out.println("\n============================================\n" +
                   "============ Here is the result ============\n" +
                   "============================================");


            // Showing the Result

            placeTargetHuman(seaCPU);
            placeTargetCPU(seaHuman);

            System.out.println("------------------------- " + getPlayer1Name() + "'s" + " ships shown below ---------------");
            printSeaCPU(seaHuman);

            System.out.println("------------------------- " + getPlayer2Name() + "'s" + " ships shown below ---------------");
            printSeaResultCPU(seaResultCPU);

            countShipsHuman(seaHuman);
            countShipsCPU(seaCPU);

            if (gameOver == true) {
                break;
            }


        }


    }






}







