//import java.util.Math;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class WordSelector {
    private String word;
    private String underscores;

    String[] words = {"Summer", "Short", "Pasta", "Coffee", "Travel", "Plants", "Tumbler", "Jazz", "Jumper", "Vampire"};

    public String getWord() {
        return word;
    }

    public void setWord() {
        int selectedNumber = getRandomNumber();
        this.word = words[selectedNumber];
    }

    public void setUnderscores() {
        int numberOfLetters = word.length();
        String underscore = "_ ";
        this.underscores = underscore.repeat(numberOfLetters);
        }


    public String getUnderscores() {
        return underscores;
    }

    public int getRandomNumber() {
        int min=0, max=9;
        return (int)(Math.random()*((max-min)+1))+min;
    }

}

