import java.util.List;
import java.util.Scanner;

public class GameLogic {
    private static String word;
    private static String underscores;
    private static int lifeCount;
    private static int endingLives;
    private static String numberOfPlayers;

    public static void chosePlayers() {
        NumberOfPlayers noOfPlayers = new NumberOfPlayers();
        System.out.println("Please chose one or two players (One/Two)");
        Scanner noOfPlayersScanner = new Scanner(System.in);

        noOfPlayers.setNoOfPlayers(noOfPlayersScanner.nextLine().toLowerCase());

        numberOfPlayers = noOfPlayers.getNoOfPlayers();
        newGame();
    }



    public static void choseLevel() {
        System.out.println("What level should you like to play? Easy(E), Medium(M) or Hard(H)");
        Scanner gameLevel = new Scanner(System.in);
        String chosenLevel = gameLevel.nextLine().toLowerCase();

        switch (chosenLevel) {
            case "e":
                lifeCount = 10;
                chosePlayers();
                break;
            case "m":
                lifeCount = 7;
                chosePlayers();
                break;
            case "h":
                lifeCount = 4;
                chosePlayers();
                break;
            default:
                System.out.println("That is not an optional level");
                choseLevel();
        }
    }

    public static void newGame() {
// if one player a word is randomly selected, if two player, player 1 choses word.
        if (numberOfPlayers.equals("one")) {
            WordSelector chosenWord = new WordSelector();

            chosenWord.setWord();
            chosenWord.setUnderscores();

            word = chosenWord.getWord();
            underscores = chosenWord.getUnderscores();
            endingLives = lifeCount;
            gameLogic();
        } else if (numberOfPlayers.equals("two")) {
            WordSelector chosenWord = new WordSelector();
            System.out.println("Player One, please type your selected word below:");
            Scanner playerSelectedWord = new Scanner(System.in);

            chosenWord.setPlayerSelectedWord(playerSelectedWord.nextLine());
            chosenWord.setUnderscores();

            word = chosenWord.getWord();
            underscores = chosenWord.getUnderscores();
            endingLives = lifeCount;
            gameLogic();
        } else {
            System.out.println();
            System.out.println("Number of players not available, please try again.");
            chosePlayers();
        }
    }


    public static void gameLogic( ) {
        GameStatus.gameStart(word, lifeCount, underscores);
        AllLettersGuessed allLettersGuessed = new AllLettersGuessed();

        while(true) {
            System.out.println("Enter your guess below:");
            Scanner userInputs = new Scanner(System.in);

            String userInput = userInputs.nextLine().toLowerCase();
            char userGuess = userInput.charAt(0);

            // checking user input.
        if (userInput.length() > 1){
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
                        choseLevel();
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
                    GameStatus.allLivesLost(word);
                    System.out.println();
                    System.out.println("Would you like to play again? (Y/N)");
                    Scanner playAgain = new Scanner(System.in);

                    userInput = playAgain.nextLine().toLowerCase();

                    if(userInput.equals("y")) {
                        choseLevel();
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
