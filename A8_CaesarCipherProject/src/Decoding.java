import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Decoding {

    public String decodedValue;
    private int mKey;
    private String mInputText;

    public Decoding(int key, String inputText) {
        mKey = key;
        mInputText = inputText;

        try {

            FileWriter encodedText = new FileWriter("text.txt");
            encodedText.write(mInputText);
            encodedText.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");

        }


    }
    public String getInputText() {
        return mInputText;
    }
    public int getKey() {
        return mKey;
    }
    public boolean isValidInputText()
    {
        char[] chars = mInputText.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }
    public boolean isValidKey()
    {
        return mKey >1 && mKey < 52;
    }

    public String decode()
    {

        try {
            File myText = new File("text.txt");
            Scanner myReader = new Scanner(myText);

            String data = myReader.nextLine();

            System.out.println("\"" + data + "\"" + " is being decrypted...");

            decodedValue = "";
        String encodedArray[] = data.split("");
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i<encodedArray.length;i++)
        {
            if (data.charAt(i) == ' ')
            {
                decodedValue += " ";
            }
            else
            {
                int charPosition = alphabet.indexOf(data.charAt(i));
                int keyVal = (charPosition - mKey) % 52;

                if (keyVal < 0)
                {
                    keyVal = alphabet.length() + keyVal;
                }

                char replaceValue = alphabet.charAt(keyVal);
                decodedValue += replaceValue;
            }
        }


            return decodedValue;


        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return null;
    }
}
