import java.io.IOException;
import java.util.Scanner;

public class Hangman {

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


    public static void main(String[] args) {

        do {
            count = 0;
            missedLetters = "";

            String newWord = words[(int) (Math.random() * words.length)];
            word = newWord;

            System.out.println(word);

            newUnderline = "";
            for (int i = 0; i < word.length(); i++) {
                newUnderline += "-";
            }
            underline = newUnderline;

            gameCount();



            System.out.println("Do you want to play again? (y or n)");
            Scanner playAgain = new Scanner(System.in);
            userAnswer = playAgain.next().charAt(0);

        } while (userAnswer == 'y');

    }


    private static void gameCount() {

        Scanner sc = new Scanner(System.in);


        do {


                hangmanImage();
                int attemptsRemaining = 7 - count;
                System.out.println("You've got " + attemptsRemaining + " Attempts Remaining.");
                System.out.println("Guess a letter.");
                System.out.println(underline);
                String guess = sc.next();
                hang(guess);
                repeatMissedLetters(guess);
                repeatMessage();
                wrongGuess(guess);
                underlineCheck(guess);
                underlineCheckMessage();




        } while (count < 7 && underline.contains("-"));
    }


    public static void hang(String guess) {
        String newUnderline = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newUnderline += guess.charAt(0);
            } else if (underline.charAt(i) != '-') {
                newUnderline += word.charAt(i);
            } else {
                newUnderline += "-";
            }
        }

        for (int i = 0; i < word.length(); i++) {
        }


        if (underline.equals(newUnderline)) {
            count++;
            hangmanImage();
        } else {
            underline = newUnderline;
        }

        if (underline.equals(word)) {
            System.out.println("Yes! The secret word was " + "\"" + word + "\"" + "! You have won!");

        }



    }


    public static void wrongGuess(String guess) {

        int i;
        int countCorrect;
        countCorrect = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                countCorrect++;
                repeatMessage = "";
            }
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

        for (i = 0; i < missedLetters.length(); i++) {
            if (missedLetters.charAt(i) == guess.charAt(0))
                countRepeat++;
        }
    }


    public static void repeatMessage() {
        repeatMessage = "";

        if (countRepeat == 0) {
            repeatMessage = "";
        } else { }

    }




    public static void hangmanImage() {
        if (count == 0) {

            System.out.println("H A N G M A N");
            System.out.println("   +----+");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("      ===");
            System.out.println("Missed letters" + ": " + missedLetters + "\n");

        }
        if (count == 1) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("      ===");
            System.out.println("Missed letters" + ": " + missedLetters + "\n" + repeatMessage);
        }
        if (count == 2) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("      ===");
            System.out.println("Missed letters" + ": " + missedLetters + "\n" + repeatMessage);

        }
        if (count == 3) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("   |   |");
            System.out.println("       |");
            System.out.println("      ===");
            System.out.println("Missed letters" + ": " + missedLetters + "\n" + repeatMessage);

        }
        if (count == 4) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|   |");
            System.out.println("       |");
            System.out.println("      ===");
            System.out.println("Missed letters" + ": " + missedLetters + "\n" + repeatMessage);

        }
        if (count == 5) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("       |");
            System.out.println("      ===");
            System.out.println("Missed letters" + ": " + missedLetters + "\n" + repeatMessage);

        }
        if (count == 6) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("  /    |");
            System.out.println("      ===");
            System.out.println("Missed letters" + ": " + missedLetters + "\n" + repeatMessage);

        }
        if (count == 7) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\  |");
            System.out.println("  / \\  |");
            System.out.println("      ===");
            System.out.println("Game Over! The secret word was " + "\"" + word + "\"" + "!");

        }
    }



}





