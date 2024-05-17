public class GameStatus {
private boolean gameFinished = true;

    public boolean isGameFinished() {
        return gameFinished;
    }

    public void setGameFinished(boolean gameFinished) {
        this.gameFinished = !gameFinished;
    }
}
