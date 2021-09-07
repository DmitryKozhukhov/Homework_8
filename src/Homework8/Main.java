package Homework8;

import Homework8.impl.Cat;
import Homework8.impl.Human;
import Homework8.impl.Robot;

    public class Main {

        public static void main(String[] args) {

            Participants[] participants = new Participants[]{
                    new Human(10, 1),
                    new Robot(500, 10),
                    new Cat(70, 2)
            };

            Obstacles[] obstacles = new Obstacles[]{
                    new Treadmill(100),
                    new Wall(2),
            };

            for (int i = 0; i < participants.length; i++) {
                if (participants[i].run(obstacles[0])) {
                    participants[i].jump(obstacles[1]);
                }
                System.out.println();
            }
        }
    }


