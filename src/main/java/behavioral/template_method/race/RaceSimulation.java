package behavioral.template_method.race;

public abstract class RaceSimulation {

    protected Player player = new Player();
    private int length = 20;


    public void simulateRace() throws InterruptedException {
        for (int i = 0; i < 15; i++) {
            clear();
            showRoute();
            player.runRandomDistance();
            Thread.sleep(500);
        }
    }

    private void clear() {
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
    }

   final public void showRoute() {
        System.out.print("S");
        for (int distance = 0; distance < length; distance++) {
            if (distance == player.getDistance()) {
                drawLine(getPlayer());

            } else {
                drawLine(getTerrain());
            }

        }
       System.out.print("M");
        endShow();
    }

    protected abstract void drawLine(String element);

    protected  abstract String getTerrain();

    protected abstract String getPlayer();

    protected abstract void endShow();




}
