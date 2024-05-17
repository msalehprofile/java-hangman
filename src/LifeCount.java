public class LifeCount {
    private int LifeCount = 9;

    public String getLifeCount() {
        return "You have " + LifeCount + " lives left";
    }

    public void setLifeCount(int lifeCount) {
        LifeCount = lifeCount;
    }

    public int lifeLost() {
        return LifeCount - 1;
    }
}
