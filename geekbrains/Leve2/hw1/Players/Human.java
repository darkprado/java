package Players;

import Courses.ObstacleCourse;

public class Human implements Player {

    private String name;
    private double maxRun;
    private double maxSwim;
    private double maxJump;

    public Human(String name, double maxRun, double maxSwim, double maxJump) {
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

    @Override
    public void infoAboutThis(){
        System.out.println("Human with name " + name + ". I can run on " + maxRun + "m, swim on "
            + maxSwim + "m, jump on " + maxJump + "m."
        );
    }

    @Override
    public void doIt(ObstacleCourse o) {
        boolean doRun = run(o.getCross()), doSwim = swim(o.getWater()), doJump = jump(o.getWall());
        if(!doRun) {
            System.out.println("Human " + name + " fail to run");
            return;
        }
        if(!doSwim) {
            System.out.println("Human " + name + " fail to swim");
            return;
        }
        if(!doJump) {
            System.out.println("Human " + name + " fail to jump");
            return;
        }
        System.out.println("Human " + name + " success all obstacle");
    }

}
