package behavioral.template_method.race;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        RaceSimulation raceSimulation = new MountainRace();
        raceSimulation.simulateRace();
    }
}
