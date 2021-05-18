import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDo you wish to encrypt or decrypt the message? (1 Encrypt/ 2 Decrypt)");
        int choice = scanner.nextInt();
        scanner.nextLine(); //throw away the \n not consumed by nextInt()

        if(choice == 1)
        {
            System.out.print("Enter your message: ");
            String inputText = scanner.nextLine();
            System.out.print("Enter a key number (1-52): ");
            int key = scanner.nextInt();
            Encoding encoding = new Encoding(inputText,key);
            System.out.println(String.format("Your translated text is:\n%s",encoding.encode()));

        }
        else if(choice == 2)
        {
            System.out.print("Enter your message: ");
            String inputText = scanner.nextLine();
            System.out.print("Enter a key number (1-52): ");
            int key = scanner.nextInt();
            Decoding decoding = new Decoding(key, inputText);
            System.out.println(String.format("Your translated text is:\n%s",decoding.decode()));
        }
        else if(choice == 3)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("Input not known");
        }
    }
}