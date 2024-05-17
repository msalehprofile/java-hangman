import java.util.List;
import java.util.Scanner;

public class GameLogic {
    private static String word;
    private static String underscores;
    private static List lettersGuessed;
    private static char userGuess;
    private static String userInput;


    public static void main(String[] args) {
        WordSelector chosenWord = new WordSelector();
        chosenWord.setWord();
        chosenWord.setUnderscores();

        word = chosenWord.getWord();
        underscores = chosenWord.getUnderscores();

        System.out.println(word);

        System.out.println("Please guess the word below:");
        System.out.println(underscores);
        System.out.println();


        gameLogic();
    }


public static void test() {
    System.out.println(word);
}

    public static void gameLogic( ) {
        AllLettersGuessed allLettersGuessed = new AllLettersGuessed();
        while(true) {
            System.out.println("Enter your guess below:");
            Scanner userInputs = new Scanner(System.in);

            userInput = userInputs.nextLine().toLowerCase();
            userGuess = userInput.charAt(0);

        if (userInput.length() != 1){
            System.out.println("Please only type one letter");
            System.out.println();
        }

        if (userInput.length() == 1) {
            allLettersGuessed.addAllLetters(userGuess);
            allLettersGuessed.listLettersGuessed();
            lettersGuessed = allLettersGuessed.getAllLettersGuessed();
            System.out.println("So far you have guessed: " + lettersGuessed);

            if(lettersGuessed.contains(userInput) ) {
                System.out.println("You have already guessed that letter");
                System.out.println();
            }


            if (word.toLowerCase().contains(userInput)) {
                System.out.println("You have selected letter " + userGuess + ", which is correct!");
                System.out.println();
                for (int i=0; i < word.length(); i++) {
                    char currentChar = word.toLowerCase().charAt(i);
                    if (lettersGuessed.contains(currentChar)) {
                        System.out.print(currentChar);
                    } else {
                        System.out.print("_");
                        System.out.println();
                    };
                }



            } else {
                System.out.println("You have selected letter " + userGuess + ", which is incorrect.");

            }
            }
        }
    }
}
