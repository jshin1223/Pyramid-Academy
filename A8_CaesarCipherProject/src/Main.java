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
            Encrypting encrypting = new Encrypting(inputText,key);
            System.out.println(String.format("Your translated text is:\n%s",encrypting.encode()));

        }
        else if(choice == 2)
        {
            System.out.print("Enter your message: ");
            String inputText = scanner.nextLine();
            System.out.print("Enter a key number (1-52): ");
            int key = scanner.nextInt();
            Decrypting decrypting = new Decrypting(key, inputText);
            System.out.println(String.format("Your translated text is:\n%s",decrypting.decode()));
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