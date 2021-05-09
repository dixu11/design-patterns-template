package creational.tanks;

abstract class Tank {

    private Barrel barrel;

    Tank() {
        barrel = createBarrel();
    }

    public abstract Barrel createBarrel();

    public  void attack(){
        barrel.attack();
    }
}
