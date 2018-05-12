package Players;

import Courses.ObstacleCourse;

public interface Player {

    boolean run(double distance);
    boolean swim(double distance);
    boolean jump(double height);
    void infoAboutThis();
    void doIt(ObstacleCourse o);

}
