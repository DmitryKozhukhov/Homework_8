package Homework8;

public class Treadmill extends Obstacles {
    private int lengthTreadmill;

    public Treadmill(int lengthTreadmill) {
        this.lengthTreadmill = lengthTreadmill;
    }
    @Override
    public boolean overcomingObstacle(int n) {
        return lengthTreadmill <= n;
    }
}

