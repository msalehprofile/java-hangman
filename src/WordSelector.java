
import java.util.Random;


public class WordSelector {
    private String word;
    private String underscores;

    String[] words = {"Summer", "Short", "Pasta", "Coffee", "Travel", "Plants", "Tumbler", "Jazz", "Jumper", "Vampire"};

    public String getWord() {
        return word;
    }

    public void setUnderscores() {
        int numberOfLetters = word.length();
        String underscore = "_";
        this.underscores = underscore.repeat(numberOfLetters);
        }

    public String getUnderscores() {
        return underscores;
    }

    public void setWord() {
        int min=0, max=9;
        int selectedNumber = (int)(Math.random()*((max-min)+1))+min;
        this.word = words[selectedNumber];
    }

}

