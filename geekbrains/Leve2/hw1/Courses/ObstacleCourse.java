package Courses;

public class ObstacleCourse {

    private double cross, water, wall;

    public ObstacleCourse (double cross, double water, double wall) {
        this.cross = cross;
        this.water = water;
        this.wall = wall;
    }

    public double getCross() {
        return cross;
    }

    public double getWater() {
        return water;
    }

    public double getWall() {
        return wall;
    }

    public void infoCourse () {
        System.out.println("Obstacle course: cross - " + cross + "m, water - "
            + water + "m, wall - " + wall
        );
    }
}
