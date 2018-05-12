package Players;

import Courses.ObstacleCourse;

public class Team {

    private Player[] players;

    public Team(Player p1, Player p2, Player p3, Player p4) {
        players = new Player[4];
        players[0] = p1;
        players[1] = p2;
        players[2] = p3;
        players[3] = p4;
    }

    public void getTeamInfo() {
        for(Player p : players) {
            p.infoAboutThis();
        }
    }

    public void start(ObstacleCourse o) {
        for(Player p : players) {
            p.doIt(o);
        }
    }

}
