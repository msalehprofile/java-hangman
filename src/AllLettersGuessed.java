import java.util.ArrayList;

public class AllLettersGuessed {

    private ArrayList<Character> allLettersGuessed = new ArrayList<>();

    public void addAllLetters(char userGuess) {
        this.allLettersGuessed.add(userGuess);
    }

    public ArrayList<Character> getAllLettersGuessed() {
//        System.out.println(allLettersGuessed);
        return allLettersGuessed;
    }

    public void listLettersGuessed() {
        for(char letter: allLettersGuessed) {

        }
    }

}
