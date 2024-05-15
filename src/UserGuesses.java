import java.util.ArrayList;
import java.util.Scanner;

public class UserGuesses {

    private ArrayList<String> lettersGuessed = new ArrayList<>();

    public void addAllLetters(String userGuess) {
        this.lettersGuessed.add(userGuess);
    }

    public void listLettersGuessed() {
        for(String letter: lettersGuessed) {
            System.out.println(letter);
        }
    }

}
