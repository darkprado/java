import Players.*;
import Courses.ObstacleCourse;

public class Main {

    public static void main(String[] args) {

        Team team = new Team(
                new Cat("Persic", 200, 2.5),
                new Dog("Bobik", 400, 50, 1.5),
                new Human("Egor", 1_500, 300, 1),
                new Human("Olga", 700, 200, 0.3)
        );

        ObstacleCourse obstacleCourse = new ObstacleCourse(200, 10,1);
        obstacleCourse.infoCourse();

        team.getTeamInfo();
        team.start(obstacleCourse);
    }



}
