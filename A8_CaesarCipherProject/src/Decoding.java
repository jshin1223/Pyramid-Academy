public class Decoding {
    private int mKey;
    private String mInputText;

    public Decoding(int key, String inputText) {
        mKey = key;
        mInputText = inputText;
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
        String decodedValue = "";
        String encodedArray[] = mInputText.split("");
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i<encodedArray.length;i++)
        {
            if (mInputText.charAt(i) == ' ')
            {
                decodedValue += " ";
            }
            else
            {
                int charPosition = alphabet.indexOf(mInputText.charAt(i));
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
    }
}
