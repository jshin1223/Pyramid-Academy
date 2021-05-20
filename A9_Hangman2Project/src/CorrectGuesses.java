import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class CorrectGuesses {

    public CorrectGuesses(String secretWord) {
        this.secretWord = secretWord;
    }

    private String secretWord;

    private Set<String> correctGuesses = new HashSet<String>();

    public Stream<String> getCorrectGuesses() {

        return correctGuesses.stream();

    }

    public void addGuess(String guess){
        if (secretWord.contains(guess)) {

            correctGuesses.add(guess);

        };

    };

    public boolean isLetterCorrectGuess(String letter) {
        return correctGuesses.contains(letter);
    }




}