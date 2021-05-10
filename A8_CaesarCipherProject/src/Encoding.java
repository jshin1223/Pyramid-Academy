import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Encoding {
    private int mKey;
    private String mInputText;

    public Encoding(String inputText,int key) {
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
        return mKey >1 && mKey < 52;

    }

    public String encode()
    {
        String encoded = "";
        String encodedArray[] = mInputText.split("");
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i<encodedArray.length;i++)
        {
            if (mInputText.charAt(i) == ' ')
            {
                encoded += " ";
            }
            else
            {
                int charPosition = alphabet.indexOf(mInputText.charAt(i));
                int key = (mKey + charPosition) % 52;
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
