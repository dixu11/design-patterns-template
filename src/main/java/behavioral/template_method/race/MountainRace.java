package behavioral.template_method.race;

public class MountainRace extends RaceSimulation{

    private int counter = 0;

    @Override
    protected void drawLine(String element) {
        String view = "";
        for (int i = 0; i < counter; i++) {
            view += " ";

        }

        view += element;
        System.out.println( view);
        counter++;
    }

    @Override
    protected String getTerrain() {
        return "\\";
    }

    @Override
    protected String getPlayer() {
        return player.getName().charAt(0)+"";
    }

    @Override
    protected void endShow() {
        counter = 0;
    }
}
