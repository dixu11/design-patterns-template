package behavioral.template_method.race;

import java.util.Random;

public class Player {

    private String name;
    private int distance;

    public Player(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public Player() {
        name = "Radek";
        distance = 0;
    }

    public void runRandomDistance() {
        Random random = new Random();
        distance += random.nextInt(5) + 1;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }
}
