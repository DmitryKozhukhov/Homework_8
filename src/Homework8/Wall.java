package Homework8;

public class Wall extends Obstacles {
    private int heightWall;

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }
    @Override
    public boolean overcomingObstacle(int n) {
        return heightWall <= n;
    }
}
