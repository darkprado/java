package Players;

import Courses.ObstacleCourse;

public class Cat extends Animal {

    public Cat(String name, double maxRun, double maxJump) {
        super(name, maxRun, 0, maxJump);
    }

    @Override
    public void infoAboutThis(){
        System.out.println("Cat with name " + name + ". I can run on " + maxRun + "m, swim on "
                + maxSwim + "m, jump on " + maxJump + "m."
        );
    }

    @Override
    public void doIt(ObstacleCourse o) {
        boolean doRun = run(o.getCross()), doSwim = swim(o.getWater()), doJump = jump(o.getWall());
        if(!doRun) {
            System.out.println("Cat " + name + " fail to run");
            return;
        }
        if(!doSwim) {
            System.out.println("Cat " + name + " fail to swim");
            return;
        }
        if(!doJump) {
            System.out.println("Cat " + name + " fail to jump");
            return;
        }
        System.out.println("Cat " + name + " success all obstacle");
    }
}
