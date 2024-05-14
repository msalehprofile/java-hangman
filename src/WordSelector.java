//import java.util.Math;

public class WordSelector {
    String word;

    String[] words = {"Summer", "Short", "Pasta", "Coffee", "Travel", "Plants", "Tumbler", "Jazz", "Jumper", "Vampire"};

    public WordSelector(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getRandomNumber() {
        int min=0, max=9;
        return (int)(Math.random()*((max-min)+1))+min;
    }

    public void setWord(String[] words) {
        this.word = words[getRandomNumber()];
    }


}

