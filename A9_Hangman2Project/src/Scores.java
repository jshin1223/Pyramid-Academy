import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Scores {


    public static int totalScore = 0;
    public static int winningScore = 0;
    public static int gameNumber = 0;


    public static double winningChance = 0;

    public static double totalScoreValue = 0;
    public static double gameNumberValue = 0;


    public static int winningChanceFinalValue = 0;




    public static void displayScores() throws FileNotFoundException {

        String path = "/Users/jshin1223/Desktop/Pyramid Academy/Pyramid-Academy/A9_Hangman2Project/scores.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while((line = br.readLine()) != null) {
                String[] values = line.split(", ");
                System.out.println("Name: " + values[0] + ", Score: " + values[1]);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




    public static void totalScore() throws FileNotFoundException {

            winningScore = 0;
            totalScore = 0;
            gameNumber = 0;
            winningChance  = 0;

            totalScoreValue = 0;
            gameNumberValue = 0;

            winningChanceFinalValue = 0;



        System.out.println(HangmanTwo.playerName + ", do you want to see your total score? (y or n)");
            Scanner yesOrNo = new Scanner(System.in);
            String newYesOrNo = yesOrNo.nextLine();

            if (newYesOrNo.charAt(0) == 'y') {


                String path = "/Users/jshin1223/Desktop/Pyramid Academy/Pyramid-Academy/A9_Hangman2Project/scores.csv";
                String line = "";

                try {
                    BufferedReader br = new BufferedReader(new FileReader(path));


                    while ((line = br.readLine()) != null) {
                        String[] values = line.split(", ");

                        String currentName = values[0];


                        if (currentName.equals(HangmanTwo.playerName)) {
                            winningScore = Integer.parseInt(values[1]);
                            totalScore = totalScore + winningScore;

                            gameNumber++;
                        }


                    }

                    double totalScoreValue = totalScore;
                    double gameNumberValue = gameNumber;

                    winningChance = totalScoreValue/gameNumberValue * 100;

                    winningChanceFinalValue = (int)winningChance;



                    System.out.println("You have won total of " + totalScore + " times in " + gameNumber + " games!");

                    System.out.println("===> Your winning percentage is " + winningChanceFinalValue + "%.\n");


                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            } else if (newYesOrNo.charAt(0) == 'n') {


        }


    }



}
