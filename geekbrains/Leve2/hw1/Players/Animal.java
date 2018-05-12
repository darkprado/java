package Players;

import Courses.ObstacleCourse;

public abstract class Animal implements Player {

    protected String name;
    protected double maxRun;
    protected double maxSwim;
    protected double maxJump;

    Animal(String name, double maxRun, double maxSwim, double maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(double distance){
        return distance <= maxRun;
    }

    @Override
    public boolean swim(double distance){
        return distance <= maxSwim;
    }

    @Override
    public boolean jump(double height){
        return height <= maxJump;
    }

}
