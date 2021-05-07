package com.battleship.java;

import java.util.*;

public class Battleship extends Ship {

    public static void main(String[] args) {

        SetUp.SettingNames();
        SetUp.SettingShips();


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







