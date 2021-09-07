package Homework8.impl;

import Homework8.Obstacles;
import Homework8.Participants;

public class Human implements Participants {

    private int maxRun;
    private int maxJump;

    public Human(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public boolean run(Obstacles n) {
        if(n.overcomingObstacle(maxRun)) {
            System.out.println("Human ran the distance.");
            return true;
        } else {
            System.out.println("Human did not run the distance.");
            return false;
        }
    }

    public void jump(Obstacles n) {
        if(n.overcomingObstacle(maxJump)) {
            System.out.println("Human jumped over the wall.");
        } else {
            System.out.println("Human did not jump over the wall.");
        }
    }

}
