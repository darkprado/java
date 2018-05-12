package Players;

import Courses.ObstacleCourse;

public class Dog extends Animal {

    public Dog(String name, double maxRun, double maxSwim, double maxJump) {
        super(name, maxRun, maxSwim, maxJump);
    }

    @Override
    public void infoAboutThis(){
        System.out.println("Dog with name " + name + ". I can run on " + maxRun + "m, swim on "
                + maxSwim + "m, jump on " + maxJump + "m."
        );
    }

    @Override
    public void doIt(ObstacleCourse o) {
        boolean doRun = run(o.getCross()), doSwim = swim(o.getWater()), doJump = jump(o.getWall());
        if(!doRun) {
            System.out.println("Dog " + name + " fail to run");
            return;
        }
        if(!doSwim) {
            System.out.println("Dog " + name + " fail to swim");
            return;
        }
        if(!doJump) {
            System.out.println("Dog " + name + " fail to jump");
            return;
        }
        System.out.println("Dog " + name + " success all obstacle");
    }

}
