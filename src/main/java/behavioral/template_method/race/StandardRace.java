package behavioral.template_method.race;

public class StandardRace extends RaceSimulation{
    @Override
    protected void drawLine(String element) {
        System.out.print(element);
    }

    @Override
    protected String getTerrain() {
        return ".";
    }

    @Override
    protected String getPlayer() {
        return player.getName().charAt(0)+"";
    }

    @Override
    protected void endShow() {

    }
}
