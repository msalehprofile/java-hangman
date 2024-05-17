import java.util.ArrayList;

public class AllLettersGuessed {

    private ArrayList<Character> allLettersGuessed = new ArrayList<>();

    public void addAllLetters(char userGuess) {
        this.allLettersGuessed.add(userGuess);
    }

    public ArrayList<Character> getAllLettersGuessed() {
        return allLettersGuessed;
    }

}
