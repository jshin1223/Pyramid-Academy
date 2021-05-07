package com.battleship.java;

import java.util.Scanner;

public class SetUp extends Ship {



    public static void SettingNames() {


        System.out.println("Welcome to Battleship!");
        System.out.println("Battleship Multiplayer\n" +
                "Enter Player 1 name:");
        Scanner name1 = new Scanner(System.in);
        String player1Name = name1.nextLine();


        System.out.println("Enter Player 2 name:");
        Scanner name2 = new Scanner(System.in);
        String player2Name = name2.nextLine();



    }


    public static void SettingShips(){

        System.out.println("------------------------- "+

                Ship.getPlayer1Name() +"'s"+" ships shown below ---------------");

        Ship.printSeaHuman(Ship.seaHuman);


// Will place ships for human ships
            /* 1 Destroyer: 2
            1 Cruiser: 3
            1 Battleship: 4
            1 Aircraft Carrier 5
             */

        // Destroyer: 2
        Ship.shipPosRow =0;
        Ship.shipPosColumn =0;
        System.out.println("\nPlacing "+

                Ship.getPlayer1Name() +"'s"+" Ships:\n"+
                "Please place a Destroyer (Size 2):\n"+
                "Choose a row (0-9):");
        Scanner rowDestroyerHuman = new Scanner(System.in);
        Ship.shipPosRow =rowDestroyerHuman.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnDestroyerHuman = new Scanner(System.in);
        Ship.shipPosColumn =columnDestroyerHuman.nextInt();
        System.out.println(
                "Place horizontally or vertically (h or v)?");
        Scanner hvDestroyerHuman = new Scanner(System.in);
        Ship.shipPosHorVer =hvDestroyerHuman.nextLine();


        Ship.placePieceHuman(Ship.seaHuman, "destroyer");
        System.out.println("------------------------- "+

                Ship.getPlayer1Name() +"'s"+" ships shown below ---------------");

        Ship.printSeaHuman(Ship.seaHuman);

        // Cruiser: 3
        Ship.shipPosRow =0;
        Ship.shipPosColumn =0;
        System.out.println("\nPlacing "+

                Ship.getPlayer1Name() +"'s"+" \n"+
                "Please place a Cruiser (Size 3):\n"+
                "Choose a row (0-9):");
        Scanner rowCruiserHuman = new Scanner(System.in);
        Ship.shipPosRow =rowCruiserHuman.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnCruiserHuman = new Scanner(System.in);
        Ship.shipPosColumn =columnCruiserHuman.nextInt();
        System.out.println(
                "Place horizontally or vertically (h or v)?");
        Scanner hvCruiserHuman = new Scanner(System.in);
        Ship.shipPosHorVer =hvCruiserHuman.nextLine();

        Ship.placePieceHuman(Ship.seaHuman, "cruiser");
        System.out.println("------------------------- "+

                Ship.getPlayer1Name() +"'s"+" ships shown below ---------------");

        Ship.printSeaHuman(Ship.seaHuman);


        // Battleship: 4
        Ship.shipPosRow =0;
        Ship.shipPosColumn =0;
        System.out.println("\nPlacing "+

                Ship.getPlayer1Name() +"'s"+" \n"+
                "Please place a Battleship (Size 4):\n"+
                "Choose a row (0-9):");
        Scanner rowBattleshipHuman = new Scanner(System.in);
        Ship.shipPosRow =rowBattleshipHuman.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnBattleshipHuman = new Scanner(System.in);
        Ship.shipPosColumn =columnBattleshipHuman.nextInt();
        System.out.println(
                "Place horizontally or vertically (h or v)?");
        Scanner hvBattleshipHuman = new Scanner(System.in);
        Ship.shipPosHorVer =hvBattleshipHuman.nextLine();

        Ship.placePieceHuman(Ship.seaHuman, "battleship");
        System.out.println("------------------------- "+

                Ship.getPlayer1Name() +"'s"+" ships shown below ---------------");

        Ship.printSeaHuman(Ship.seaHuman);


        // Aircraft Carrier: 5
        Ship.shipPosRow =0;
        Ship.shipPosColumn =0;
        System.out.println("\nPlacing "+

                Ship.getPlayer1Name() +"'s"+" \n"+
                "Please place a Aircraft Carrier (Size 5):\n"+
                "Choose a row (0-9):");
        Scanner rowAircraftCarrierHuman = new Scanner(System.in);
        Ship.shipPosRow =rowAircraftCarrierHuman.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnAircraftCarrierHuman = new Scanner(System.in);
        Ship.shipPosColumn =columnAircraftCarrierHuman.nextInt();
        System.out.println(
                "Place horizontally or vertically (h or v)?");
        Scanner hvAircraftCarrierHuman = new Scanner(System.in);
        Ship.shipPosHorVer =hvAircraftCarrierHuman.nextLine();

        Ship.placePieceHuman(Ship.seaHuman, "aircraftCarrier");
        System.out.println("------------------------- "+

                Ship.getPlayer1Name() +"'s"+" ships shown below ---------------");

        Ship.printSeaHuman(Ship.seaHuman);


        System.out.println("------------------------- "+

                Ship.getPlayer2Name() +"'s"+" ships shown below ---------------");

        Ship.printSeaCPU(Ship.seaCPU);
        System.out.println("\nNext "+

                Ship.getPlayer2Name() +" will place the ships:");


        // Randomly will place Computer Ships
                  /* 1 Destroyer: 2
            1 Cruiser: 3
            1 Battleship: 4
            1 Aircraft Carrier 5
             */


        // Destroyer: 2
        Ship.shipPosRow =0;
        Ship.shipPosColumn =0;
        System.out.println("\nPlacing "+

                Ship.getPlayer2Name() +"'s"+" Ships:\n"+
                "Please place a Destroyer (Size 2):\n"+
                "Choose a row (0-9):");
        Scanner rowDestroyerCPU = new Scanner(System.in);
        Ship.shipPosRow =rowDestroyerCPU.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnDestroyerCPU = new Scanner(System.in);
        Ship.shipPosColumn =columnDestroyerCPU.nextInt();
        System.out.println(
                "Place horizontally or vertically (h or v)?");
        Scanner hvDestroyerCPU = new Scanner(System.in);
        Ship.shipPosHorVer =hvDestroyerCPU.nextLine();


        Ship.placePieceCPU(Ship.seaCPU, "destroyer");
        System.out.println("------------------------- "+

                Ship.getPlayer2Name() +"'s"+" ships shown below ---------------");

        Ship.printSeaCPU(Ship.seaCPU);


        // Cruiser: 3
        Ship.shipPosRow =0;
        Ship.shipPosColumn =0;
        System.out.println("\nPlacing "+

                Ship.getPlayer2Name() +"'s"+" Ships:\n"+
                "Please place a Cruiser (Size 3):\n"+
                "Choose a row (0-9):");
        Scanner rowCruiserCPU = new Scanner(System.in);
        Ship.shipPosRow =rowCruiserCPU.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnCruiserCPU = new Scanner(System.in);
        Ship.shipPosColumn =columnCruiserCPU.nextInt();
        System.out.println(
                "Place horizontally or vertically (h or v)?");
        Scanner hvCruiserCPU = new Scanner(System.in);
        Ship.shipPosHorVer =hvCruiserCPU.nextLine();

        Ship.placePieceCPU(Ship.seaCPU, "cruiser");
        System.out.println("------------------------- "+

                Ship.getPlayer2Name() +"'s"+" ships shown below ---------------");

        Ship.printSeaCPU(Ship.seaCPU);


        // Battleship: 4
        Ship.shipPosRow =0;
        Ship.shipPosColumn =0;
        System.out.println("\nPlacing "+

                Ship.getPlayer2Name() +"'s"+" Ships:\n"+
                "Please place a Battleship (Size 4):\n"+
                "Choose a row (0-9):");
        Scanner rowBattleshipCPU = new Scanner(System.in);
        Ship.shipPosRow =rowBattleshipCPU.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnBattleshipCPU = new Scanner(System.in);
        Ship.shipPosColumn =columnBattleshipCPU.nextInt();
        System.out.println(
                "Place horizontally or vertically (h or v)?");
        Scanner hvBattleshipCPU = new Scanner(System.in);
        Ship.shipPosHorVer =hvBattleshipCPU.nextLine();

        Ship.placePieceCPU(Ship.seaCPU, "battleship");
        System.out.println("------------------------- "+

                Ship.getPlayer2Name() +"'s"+" ships shown below ---------------");

        Ship.printSeaCPU(Ship.seaCPU);


        // Aircraft Carrier: 5
        Ship.shipPosRow =0;
        Ship.shipPosColumn =0;
        System.out.println("\nPlacing "+

                Ship.getPlayer2Name() +"'s"+" Ships:\n"+
                "Please place a Aircraft Carrier (Size 5):\n"+
                "Choose a row (0-9):");
        Scanner rowAircraftCarrierCPU = new Scanner(System.in);
        Ship.shipPosRow =rowAircraftCarrierCPU.nextInt();
        System.out.println(
                "Choose a column (0-9):");
        Scanner columnAircraftCarrierCPU = new Scanner(System.in);
        Ship.shipPosColumn =columnAircraftCarrierCPU.nextInt();
        System.out.println(
                "Place horizontally or vertically (h or v)?");
        Scanner hvAircraftCarrierCPU = new Scanner(System.in);
        Ship.shipPosHorVer =hvAircraftCarrierCPU.nextLine();

        Ship.placePieceCPU(Ship.seaCPU, "aircraftCarrier");
        System.out.println("------------------------- "+

                Ship.getPlayer2Name() +"'s"+" ships shown below ---------------");

        Ship.printSeaCPU(Ship.seaCPU);


    }







}
