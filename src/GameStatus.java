public class GameStatus {
private boolean gameFinished;

    public boolean getGameFinished() {
        return gameFinished;
    }

    public void setGameFinished(boolean gameFinished) {
        this.gameFinished = gameFinished;
    }

    public static void allLivesLost() {
        System.out.println();
        System.out.println("You lost all your lives, please try again!");
        System.out.println();
    }

    public static void completedWord(int lifeCount, String word) {
        System.out.println();
        System.out.println("Congratulations, you correctly guessed the word " + word + " with " + lifeCount + " lives left!");
    }
}
