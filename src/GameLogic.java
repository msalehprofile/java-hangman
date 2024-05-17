import java.util.List;
import java.util.Scanner;

public class GameLogic {
    private static String word;
    private static String underscores;
    private static List lettersGuessed;
    private static char userGuess;
    private static String userInput;
    private static int lifeCount;
    private static GameStatus gameFinished;


    public static void main(String[] args) {
        WordSelector chosenWord = new WordSelector();
        LifeCount newGameLives = new LifeCount();
        newGameLives.setLifeCount(9);
        chosenWord.setWord();
        chosenWord.setUnderscores();

        word = chosenWord.getWord();
        underscores = chosenWord.getUnderscores();
        lifeCount = newGameLives.getLifeCount();


    }

    public static void gameStart() {
        System.out.println(word);
        System.out.println();
        System.out.println("You have "+ lifeCount + " lives to start.");
        System.out.println("Please guess the word below:");
        System.out.println(underscores);
        System.out.println();
        gameLogic();
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

            lettersGuessed = allLettersGuessed.getAllLettersGuessed();

            System.out.println();

            if(lettersGuessed.contains(userGuess) ) {
                System.out.println("You have already guessed that letter");
                System.out.println();
            } else {
                allLettersGuessed.addAllLetters(userGuess);
                allLettersGuessed.listLettersGuessed();
            }

            System.out.println("So far you have guessed: " + lettersGuessed);

            boolean gameFinished = true;
            if (word.toLowerCase().contains(userInput)) {
                System.out.println("You have selected letter " + userGuess + ", which is correct!");
                System.out.println();
                for (int i=0; i < word.length(); i++) {
                    char currentChar = word.toLowerCase().charAt(i);
                    if (lettersGuessed.contains(currentChar)) {
                        System.out.print(currentChar);
                    } else {
                        System.out.print("_");
                        gameFinished = false;
                    };
                }

                if (gameFinished) {
                    GameStatus.completedWord(lifeCount, word);
                    System.out.println();
                    System.out.println("Would you like to play again? (Y/N)");


                }

                System.out.println();

            } else {
                System.out.println("You have selected letter " + userGuess + ", which is incorrect.");
                System.out.println();
                lifeCount -= 1;

                if(lifeCount > 0) {
                    System.out.println("You have " + lifeCount + " lives remaining.");
                    System.out.println();
                } else {
                    GameStatus.allLivesLost();
                    break;
                }

            }
            }
        }
    }
}
