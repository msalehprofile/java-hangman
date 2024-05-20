import java.util.List;

public class GameStatus {

public static void gameStart(String word, int lifeCount, String underscores) {

    System.out.println();
    System.out.println("You have "+ lifeCount + " ♥"+ "'s to start.");
    System.out.println();
    System.out.println("Please guess the word below:");
    System.out.println(underscores);
    System.out.println();
}




    public static void allLivesLost(String word) {
        System.out.println();
        System.out.println("You lost all your lives, please try again! The word was " + word + ".");
        System.out.println();
        System.out.println(" \n"
                + " ------\n"
                + "|      |\n"
                + "|   \\  O  /\n"
                + "|    \\ | /\n"
                + "|     \\|/\n"
                + "|      |\n"
                + "|      |\n"
                + "|     / \\\n"
                + "|    /   \\\n"
                + "|   /     \\\n"
                + "| ____________\n");

    }

    public static void completedWord(int endingLives, int lifeCount, String word, List<Character> lettersGuessed) {
        System.out.println();
        System.out.println("Congratulations, you correctly guessed the word " + word + " with " + endingLives + " ♥"+ "'s left!");
        System.out.println("You used " + lettersGuessed.size() + " guesses, including these letters: " + lettersGuessed);
        if (endingLives == lifeCount) {
            System.out.println();
        } else {
            hangmanStatus(endingLives);
        }
}

    public static void hangmanStatus(int endingLives) {
    switch (endingLives) {
        case 1:
            System.out.println(" \n"
                    + " ------\n"
                    + "|      |\n"
                    + "|   \\  O  \n"
                    + "|    \\ | \n"
                    + "|     \\|\n"
                    + "|      |\n"
                    + "|      |\n"
                    + "|     / \\\n"
                    + "|    /   \\\n"
                    + "|   /     \\\n"
                    + " ____________\n");
            break;
        case 2:
            System.out.println(" \n"
                    + " ------\n"
                    + "|      |\n"
                    + "|      O\n"
                    + "|      |\n"
                    + "|      |\n"
                    + "|      |\n"
                    + "|      |\n"
                    + "|     / \\\n"
                    + "|    /   \\\n"
                    + "|   /     \\\n"
                    + "| ____________\n");
            break;
        case 3:
            System.out.println(" \n"
                    + " ------\n"
                    + "|      |\n"
                    + "|      O\n"
                    + "|      |\n"
                    + "|      |\n"
                    + "|      |\n"
                    + "|      |\n"
                    + "|       \\\n"
                    + "|        \\\n"
                    + "|         \\\n"
                    + " ____________\n");
            break;
        case 4:
            System.out.println(" \n"
                    + " ------\n"
                    + "|      |\n"
                    + "|      O\n"
                    + "|      |\n"
                    + "|      |\n"
                    + "|      |\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + " ____________\n");
            break;
        case 5:
            System.out.println(" \n"
                    + " ------\n"
                    + "|      |\n"
                    + "|      O\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + " ____________\n");
            break;
        case 6:
            System.out.println(" \n"
                    + " ------\n"
                    + "|      |\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + " ____________\n");
            break;
        case 7:
            System.out.println(" \n"
                    + " ------\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + " ____________\n");
            break;
        case 8:
            System.out.println(" \n"
                    + " \n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "____________\n");
            break;
        case 9:
            System.out.println(" \n"
                    + " \n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "|\n"
                    + "\n");
            break;
        case 10:
            System.out.println();

    }

    }
}
