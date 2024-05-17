import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameLogic newGame = new GameLogic();

        System.out.println("Welcome to Hangman! Would you like to play a game? (Y/N)");
        Scanner playGame = new Scanner(System.in);
        String userInput = playGame.nextLine().toLowerCase();

        if ( userInput.equals("y")) {
            newGame.choseLevel();
        } else if (userInput.equals("n")){
            System.out.println("Okay, see you again soon!");
        } else {
            System.out.println("Sorry I don't understand");
        }
    }

}