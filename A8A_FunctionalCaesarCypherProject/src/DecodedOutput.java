import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class DecodedOutput {

    public DecodedOutput (String secretWord) {
        this.secretWord = secretWord;
    }

    private String secretWord;

    private Set<String> decodedOutput = new HashSet<String>();

    public Stream<String> getDecodedOutput() {

        return decodedOutput.stream();

    }

    public void addDecodedOutput(String guess){
        if (secretWord.contains(guess)) {

            decodedOutput.add(guess);

        };

    };

    public boolean isLetterCorrectGuess(String letter) {
        return decodedOutput.contains(letter);
    }




}