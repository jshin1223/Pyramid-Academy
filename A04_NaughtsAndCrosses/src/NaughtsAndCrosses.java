import java.util.*;

public class NaughtsAndCrosses {

    public static char[][] gameBoard;
    public static int pos;
    public static String user;
    public static int playerPos;
    public static int cpuPos;


    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();
    public static String userAnswer;
    public static String result;

    public static <Board> void main (String[] args) {




        do {

            playerPositions = new ArrayList<Integer>();
            cpuPositions = new ArrayList<Integer>();

            System.out.println("Welcome to Tick-Tac-Toe!");

            gameBoard = new char[][] {{' ', '|', ' ', '|', ' '},
                    {'-', '-', '-', '-', '-'},
                    {' ', '|', ' ', '|', ' '},
                    {'-', '-', '-', '-', '-'},
                    {' ', '|', ' ', '|', ' '}};


            printGameBoard(gameBoard);

            System.out.println("Do you want to go first? (y or n)");
            Scanner answer = new Scanner(System.in);
            String playerAnswer = answer.nextLine();

            if (playerAnswer.charAt(0) == 'y') {
                printGameBoard(gameBoard);
                System.out.println("You(X) will go first.");

            } else {
                System.out.println("The computer(O) will go first.");
                Random rand = new Random();
                int cpuPos = rand.nextInt(9) + 1;
                placePiece(gameBoard, cpuPos, "cpu");
                printGameBoard(gameBoard);
                System.out.println("The computer(O) has chosen the position.");
            }





            while(true) {



               try {

                   Scanner scan = new Scanner(System.in);
                   System.out.println("What is your next move? (1-9)");
                   int playerPos = scan.nextInt();

                   while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
                       System.out.println("Position taken! Enter a correct Position.");
                       playerPos = scan.nextInt();
                   }

                   placePiece(gameBoard, playerPos, "player");
                   printGameBoard(gameBoard);
                   System.out.println("The player(X) has chosen the next position.\n");

               } catch (InputMismatchException e) {
                   System.out.println("Input should be a number between 1 and 9.");
                   break;
               }



                String result = checkWinner();
                if (result.length() > 0) {
                    printGameBoard(gameBoard);
                    System.out.println(result);
                    break;
                }


                Random rand = new Random();
                int cpuPos = rand.nextInt(9) + 1;
                while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                    //System.out.println("Position taken! Enter a correct Position.");
                    cpuPos = rand.nextInt(9) + 1;

                }

                placePiece(gameBoard, cpuPos, "cpu");
                printGameBoard(gameBoard);
                System.out.println("The computer(O) has chosen the next position.\n");

                result = checkWinner();
                if (result.length() > 0) {
                    printGameBoard(gameBoard);
                    System.out.println(result);
                    break;
                }


            }




            System.out.println("Do you want to play again? (y or n)");
            Scanner againAnswer = new Scanner(System.in);
            userAnswer = againAnswer.nextLine();


        } while (userAnswer.charAt(0) == 'y');
    }





    public static void printGameBoard(char[][] gameBoard) {

        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }



    public static void placePiece(char[][] gameBoard, int pos, String user) {

        char symbol = 'X';

        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else if (user.equals("cpu")) {
            symbol = 'O';
            cpuPositions.add(pos);
        }

        switch(pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }

    }

    public static String checkWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l : winning) {

                  if (cpuPositions.containsAll(l)) {
                      return "The computer has beaten you! You lose.";
                  } else if (playerPositions.containsAll(l)) {
                      return "Congratulations you won!";
                  } else if (playerPositions.size() + cpuPositions.size() == 9) {

                      if (cpuPositions.containsAll(l)) {
                          return "The computer has beaten you! You lose.";
                      } else if (playerPositions.containsAll(l)) {
                          return "Congratulations you won!";
                      } else {
                          return "Tie";
                      }
                  }


        }


        return "";
    }


}