import javax.naming.ConfigurationException;
import javax.swing.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class HangmanTwo {

    public static String[] words = {
            "abstraction",
            "ambiguous",
            "arithmetic",
            "backslash",
            "bitmap",
            "circumstance",
            "combination",
            "consequently",
            "consortium",
            "decrementing",
            "dependency",
            "disambiguate",
            "dynamic",
            "encapsulation",
            "equivalent",
            "expression",
            "facilitate",
            "fragment",
            "hexadecimal",
            "implementation",
            "indistinguishable",
            "inheritance",
            "internet",
            "java",
            "localization",
            "microprocessor",
            "navigation",
            "optimization",
            "parameter",
            "patrick",
            "pickle",
            "polymorphic",
            "rigorously",
            "simultaneously",
            "specification",
            "structure",
            "lexical",
            "likewise",
            "management",
            "manipulate",
            "mathematics",
            "hotjava",
            "vertex",
            "unsigned",
            "primitives",
            "traditional"};
    public static String word = words[(int) (Math.random() * words.length)];

    public static CorrectGuesses correctGuesses = new CorrectGuesses(word);


    public static String underline = new String(new char[word.length()]).replace("\0", "-");
    public static int count = 0;
    public static Scanner sc;
    public static String newUnderline = "";
    public static char userAnswer;
    public static String missedLetters = "";
    public static String guess;
    public static String repeatMessage;
    public static int countCorrect;
    public static int countRepeat;
    public static int countUnderlineRepeat;
    public static int getCountCorrect = 0;
    public static String playerName;


    public static void main(String[] args) throws IOException {





            do {


            System.out.print("Welcome to Hangman!\n\n" + "Please enter your name: ");





            Scanner scanner = new Scanner(System.in);
            playerName = scanner.nextLine();


            try{
                FileWriter recordName = new FileWriter("scores.csv",true);
                BufferedWriter out = new BufferedWriter(recordName);
                out.write(playerName + ", ");
                out.close();
                System.out.println("\nSuccessfully recorded you name.\n");
            }catch (Exception e){
                System.err.println("Error while writing to file: " +
                        e.getMessage());
            }


            count = 0;
            missedLetters = "";


            String newWord = words[(int) (Math.random() * words.length)];
            word = newWord;
            correctGuesses = new CorrectGuesses(word);


            System.out.println("(Answer: " + word + ")\n");

            // old code
//            newUnderline = "";
//
//            for (int i = 0; i < word.length(); i++) {
//                newUnderline += "-";
//            }


            underline = Arrays.stream(Arrays.stream(word.split(""))
                    .map(s -> "-")
                    .toArray(String[]::new))
                    .collect(Collectors.joining());

            gameCount();

            Scores.totalScore();



            System.out.println("Do you want to play again? (y or n)");
            Scanner playAgain = new Scanner(System.in);
            userAnswer = playAgain.next().charAt(0);
            if (userAnswer == 'n') {
                System.out.println("============= Good Bye =============");
                break;
            }

        } while (userAnswer == 'y');

    }





    private static void gameCount() {

        Scanner sc = new Scanner(System.in);


        do {


            hangmanImage();
            int attemptsRemaining = 7 - count;
            System.out.println("You've got " + attemptsRemaining + " Attempts Remaining.");


            try {
                System.out.println("Guess a letter.");
                System.out.println(underline);
                guess = sc.next();

                correctGuesses.addGuess(guess);

                hang(guess);
            } catch (Exception e) {
                System.out.println("Please enter a single letter.");
            }


            repeatMissedLetters(guess);
            repeatMessage();
            wrongGuess(guess);
            underlineCheck(guess);
            underlineCheckMessage();

        } while (count < 7 && underline.contains("-"));
    }





    public static void hang(String guess) {
        String newUnderline = "";

// old code

//        for (int i = 0; i < word.length(); i++) {
//
//            if (word.charAt(i) == guess.charAt(0)) {
//                newUnderline += guess.charAt(0);
//            } else if (underline.charAt(i) != '-') {
//                newUnderline += word.charAt(i);
//            } else {
//                newUnderline += "-";
//            }
//
//        }



        newUnderline = Arrays.stream(Arrays.stream(word.split(""))
                .map(s -> {
                    if (correctGuesses.isLetterCorrectGuess(s)) {
                        return s;

                    } else {
                        return "-";
                    }
                }).toArray(String[]::new))
                .collect(Collectors.joining());




        if (underline.equals(newUnderline)) {
            count++;
            hangmanImage();
        } else {
            underline = newUnderline;
        }

        if (underline.equals(word)) {
            System.out.println("Yes! The secret word was " + "\"" + word + "\"" + "! You have won!");


            int score = 1;

            try{
                FileWriter recordScore = new FileWriter("scores.csv",true);
                BufferedWriter out = new BufferedWriter(recordScore);
                out.write(score + "\n");
                out.close();
                System.out.println("\nSuccessfully recorded you score.\n");
            }catch (Exception e){
                System.err.println("Error while writing to file: " +
                        e.getMessage());
            }




        }



    }




    public static void wrongGuess(String guess) {

        int i;
        int countCorrect;
        countCorrect = 0;


        // old code
//        for (i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == guess.charAt(0)) {
//                countCorrect++;
//                repeatMessage = "";
//            }
//        }


        if (correctGuesses.isLetterCorrectGuess(guess)) {
            countCorrect = 1;

        }




        if (countCorrect == 0) {
            if (countRepeat == 0 ) {
                missedLetters = missedLetters + guess.charAt(0);
            } else {
                repeatMessage = "You have already guessed that letter. Choose again.\n";
            };
        }


    }

    public static void underlineCheck (String guess) {

        countUnderlineRepeat = 0;

        int i;

        // old code
        for (i = 0; i < underline.length(); i++) {
            if (underline.charAt(i) == guess.charAt(0))
                countUnderlineRepeat++;
        }


    }

    public static void underlineCheckMessage () {

        if (countUnderlineRepeat > 0) {
            repeatMessage = "You have already guessed that letter. Choose again.\n";

        }

    }


    public static void repeatMissedLetters (String guess) {
        int i;
        countRepeat = 0;
        repeatMessage = "";

        // old code
//        for (i = 0; i < missedLetters.length(); i++) {
//            if (missedLetters.charAt(i) == guess.charAt(0))
//                countRepeat++;
//        }
//

        if (missedLetters.contains(guess)) {

            countRepeat = 1;

        }
    }


    public static void repeatMessage() {
        repeatMessage = "";

        if (countRepeat == 0) {
            repeatMessage = "";
        } else { }

    }






    public static <StackPane, Scene> void hangmanImage() {
        if (count == 0) {


            String fileName = "images/0.jpg";
            ImageIcon icon = new ImageIcon(fileName);
            JLabel label = new JLabel(icon);
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.getContentPane().add(new JScrollPane(label));
            f.setSize(400,400);
            f.setLocation(200,200);
            f.setVisible(true);

            System.out.println("Missed letters" + ": " + missedLetters + "\n");

        }
        if (count == 1) {


            String fileName = "images/1.jpg";
            ImageIcon icon = new ImageIcon(fileName);
            JLabel label = new JLabel(icon);
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.getContentPane().add(new JScrollPane(label));
            f.setSize(400,400);
            f.setLocation(200,200);
            f.setVisible(true);


            System.out.println("Missed letters" + ": " + missedLetters + "\n" + repeatMessage);
        }
        if (count == 2) {

            String fileName = "images/2.jpg";
            ImageIcon icon = new ImageIcon(fileName);
            JLabel label = new JLabel(icon);
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.getContentPane().add(new JScrollPane(label));
            f.setSize(400,400);
            f.setLocation(200,200);
            f.setVisible(true);

            System.out.println("Missed letters" + ": " + missedLetters + "\n" + repeatMessage);

        }
        if (count == 3) {

            String fileName = "images/3.jpg";
            ImageIcon icon = new ImageIcon(fileName);
            JLabel label = new JLabel(icon);
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.getContentPane().add(new JScrollPane(label));
            f.setSize(400,400);
            f.setLocation(200,200);
            f.setVisible(true);

            System.out.println("Missed letters" + ": " + missedLetters + "\n" + repeatMessage);

        }
        if (count == 4) {

            String fileName = "images/4.jpg";
            ImageIcon icon = new ImageIcon(fileName);
            JLabel label = new JLabel(icon);
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.getContentPane().add(new JScrollPane(label));
            f.setSize(400,400);
            f.setLocation(200,200);
            f.setVisible(true);

            System.out.println("Missed letters" + ": " + missedLetters + "\n" + repeatMessage);

        }
        if (count == 5) {

            String fileName = "images/5.jpg";
            ImageIcon icon = new ImageIcon(fileName);
            JLabel label = new JLabel(icon);
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.getContentPane().add(new JScrollPane(label));
            f.setSize(400,400);
            f.setLocation(200,200);
            f.setVisible(true);

            System.out.println("Missed letters" + ": " + missedLetters + "\n" + repeatMessage);

        }
        if (count == 6) {

            String fileName = "images/6.jpg";
            ImageIcon icon = new ImageIcon(fileName);
            JLabel label = new JLabel(icon);
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.getContentPane().add(new JScrollPane(label));
            f.setSize(400,400);
            f.setLocation(200,200);
            f.setVisible(true);

            System.out.println("Missed letters" + ": " + missedLetters + "\n" + repeatMessage);

        }
        if (count == 7) {

            String fileName = "images/7.jpg";
            ImageIcon icon = new ImageIcon(fileName);
            JLabel label = new JLabel(icon);
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.getContentPane().add(new JScrollPane(label));
            f.setSize(400,400);
            f.setLocation(200,200);
            f.setVisible(true);

            System.out.println("Game Over! The secret word was " + "\"" + word + "\"" + "!");

            int score = 0;

            try{
                FileWriter recordScore = new FileWriter("scores.csv",true);
                BufferedWriter out = new BufferedWriter(recordScore);
                out.write(score + "\n");
                out.close();
                System.out.println("\nSuccessfully recorded you score.\n");
            }catch (Exception e){
                System.err.println("Error while writing to file: " +
                        e.getMessage());
            }

        }
    }



}





