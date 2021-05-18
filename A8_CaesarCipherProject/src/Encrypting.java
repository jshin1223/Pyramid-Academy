import java.io.FileWriter;
import java.io.IOException;


public class Encrypting {
    private int mKey;
    private String mInputText;

    public Encrypting(String inputText,int key) {
        mKey = key;
        mInputText = inputText;
    }
    public String getInputText() {
        return mInputText;
    }
    public int getKey()
    {
        return mKey;
    }
    public boolean isValidInputText()
    {
        char[] chars = mInputText.toCharArray();


        // old code
        for (char c : chars) {
            if(!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }


        return true;
    }

    public boolean isNotEmpty()
    {
        return !mInputText.trim().isEmpty();
    }
    public boolean isValidKey()
    {
        return mKey >1 && mKey < 54;

    }

    public String encode()
    {
        String encoded = "";
        String encodedArray[] = mInputText.split("");
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ.,";

        // old code
        for (int i = 0; i<encodedArray.length;i++)
        {
            if (mInputText.charAt(i) == ' ')
            {
                encoded += " ";
            }
            else
            {
                int charPosition = alphabet.indexOf(mInputText.charAt(i));
                int key = (mKey + charPosition) % 54;
                encoded += alphabet.charAt(key);
            }
        }



        try {

            FileWriter encodedText = new FileWriter("text.txt");
            encodedText.write(encoded);
            encodedText.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");

        }

        return encoded;
    }
}