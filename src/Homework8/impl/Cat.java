package Homework8.impl;

import Homework8.Obstacles;
import Homework8.Participants;

public class Cat implements Participants {

    private int maxRun;
    private int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public boolean run(Obstacles n) {
        if(n.overcomingObstacle(maxRun)) {
            System.out.println("Cat ran the distance.");
            return true;
        } else {
            System.out.println("Cat did not run the distance.");
            return false;
        }
    }

    public void jump(Obstacles n) {
        if(n.overcomingObstacle(maxJump)) {
            System.out.println("Cat jumped over the wall.");
        } else {
            System.out.println("Cat did not jump over the wall.");
        }
    }
}
