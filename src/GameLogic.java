import java.util.List;
import java.util.Scanner;

public class GameLogic {
    private static String word;
    private static String underscores;
    private static int lifeCount;
    private static int endingLives;


    public void choseLevel() {
        System.out.println("What level should you like to play? Easy(E), Medium(M) or Hard(H)");
        Scanner gameLevel = new Scanner(System.in);
        String chosenLevel = gameLevel.nextLine().toLowerCase();

        switch (chosenLevel) {
            case "e":
                lifeCount = 10;
                newGame();
                break;
            case "m":
                lifeCount = 7;
                newGame();
                break;
            case "h":
                lifeCount = 4;
                newGame();
                break;
            default:
                System.out.println("That is not an optional level");
                choseLevel();
        }
    }

    public static void newGame() {
        WordSelector chosenWord = new WordSelector();

        chosenWord.setWord();
        chosenWord.setUnderscores();

        word = chosenWord.getWord();
        underscores = chosenWord.getUnderscores();
        endingLives = lifeCount;
        gameStart();
    }



    public static void gameStart() {
        GameStatus.gameStart(word, lifeCount, underscores);
        gameLogic();
    }


    public static void gameLogic( ) {
        AllLettersGuessed allLettersGuessed = new AllLettersGuessed();

        while(true) {
            System.out.println("Enter your guess below:");
            Scanner userInputs = new Scanner(System.in);

            String userInput = userInputs.nextLine().toLowerCase();
            char userGuess = userInput.charAt(0);

        if (userInput.length() != 1){
            System.out.println("Please only type one letter");
            System.out.println();
        } else if (userInput.matches(".*[1234567890].*")) {
            System.out.println();
            System.out.println("That is not a letter.");
            System.out.println();
        } else {
            List<Character> lettersGuessed = allLettersGuessed.getAllLettersGuessed();
            System.out.println();

            boolean gameFinished = true;

            if(lettersGuessed.contains(userGuess) ) {
                System.out.println("You have already guessed that letter");
                System.out.println();
            } else {
                allLettersGuessed.addAllLetters(userGuess);

            if (word.toLowerCase().contains(userInput)) {
                System.out.println("You have selected letter " + userGuess + ", which is correct!");
                System.out.println();
                for (int i = 0; i < word.length(); i++) {
                    char currentChar = word.toLowerCase().charAt(i);
                    if (lettersGuessed.contains(currentChar)) {
                        System.out.print(currentChar);
                    } else {
                        System.out.print("_");
                        gameFinished = false;
                    }
                }
                System.out.println();

                if (gameFinished) {
                    GameStatus.completedWord(endingLives, lifeCount, word, lettersGuessed);
                    System.out.println();
                    System.out.println("Would you like to play again? (Y/N)");
                    Scanner playAgain = new Scanner(System.in);

                    userInput = playAgain.nextLine().toLowerCase();

                    if (userInput.equals("y")) {
                        newGame();
                    } else if (userInput.equals("n")){
                        System.out.println("Thank you for playing, see you soon!");
                        break;
                    } else {
                        System.out.println("Sorry I don't understand");
                        break;
                    }
                }

                System.out.println();

            } else {
                System.out.println("You have selected letter " + userGuess + ", which is incorrect.");
                System.out.println();
                endingLives -= 1;

                if(endingLives > 0) {
                    System.out.println("You have " + endingLives + " ♥"+ "'s remaining.");
                    System.out.println();
                } else {
                    GameStatus.allLivesLost();
                    System.out.println();
                    System.out.println("Would you like to play again? (Y/N)");
                    Scanner playAgain = new Scanner(System.in);

                    userInput = playAgain.nextLine().toLowerCase();

                    if(userInput.equals("y")) {
                        newGame();
                    } else {
                        System.out.println("Thank you for playing, see you soon!");
                        break;
                    }
                    break;
                }

            }
            }
        }
    }
}}
