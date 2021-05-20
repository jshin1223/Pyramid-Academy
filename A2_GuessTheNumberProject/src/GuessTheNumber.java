
import java.util.Scanner;
import java.util.Random;


public class GuessTheNumber {

    public static int numberGuess = 0;



    public static void main(String[] args) {



        System.out.println("Hello! What is your name?");
        Scanner name = new Scanner(System.in);
        String userName = name.nextLine();
        System.out.println("Well, " + userName + ", I am thinking of a number between 1 and 20.");



        int randAnswer;
        int numberGuess = 0;
        char userAnswer;

        do {

            randAnswer = (int)(Math.random() * 20 + 1);
            System.out.println("(Answer: " + randAnswer + ")");
            int count = 0;

            do {

                try {
                        System.out.println("Take a guess.");
                        Scanner guess = new Scanner(System.in);
                        numberGuess = guess.nextInt();


                        count++;
                        System.out.println("Count: " + count);


                        if (numberGuess > randAnswer) {
                            System.out.println("Your guess is too High.");

                        } else if (numberGuess < randAnswer) {
                            System.out.println("Your guess is too low.");

                        } else if (numberGuess == randAnswer) {
                            System.out.println("Good job, " + userName + "!" + " You guessed my number in " + count + " guesses!");
                        }

                } catch (Exception e) {
                    System.out.println("Input should be integers between 1-20.");
                }

            } while (numberGuess != randAnswer);

            System.out.println("Would you like to play again? (y or n)");
            Scanner playAgain = new Scanner(System.in);
            userAnswer = playAgain.next().charAt(0);

        } while (userAnswer == 'y');
    }
}



