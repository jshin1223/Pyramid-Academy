
import java.util.Scanner;

public class TwoCaves {

    public static void main (String[] args) {

        Scanner direction = new Scanner(System.in);

        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1 or 2)");

        int caveNumber;
        caveNumber = direction.nextInt();

        switch(caveNumber) {
            case 1:
                System.out.println("You approach the cave...\n" +
                        "It is dark and spooky...\n" +
                        "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                        "Gobbles you down in one bite!");
                break;

            case 2:
                System.out.println("You approach the cave..\n" +
                        "A large dragon comes out to greet you! He brings some of his treasures in his hands...\n" +
                        "Offers to share his treasures with you!");
                break;

        }
    }
}