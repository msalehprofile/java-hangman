//import java.util.Math;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class WordSelector {
    private String word;

    String[] words = {"Summer", "Short", "Pasta", "Coffee", "Travel", "Plants", "Tumbler", "Jazz", "Jumper", "Vampire"};

//    public WordSelector(int number) {
//        this.word = words[number];
//    }

    public String getWord() {
        return word;
    }

    public void setWord() {
        int selectedNumber = getRandomNumber();
        this.word = words[selectedNumber];
    }

    public int getRandomNumber() {
        int min=0, max=9;
        return (int)(Math.random()*((max-min)+1))+min;
    }

}

