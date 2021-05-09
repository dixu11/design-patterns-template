package creational.tanks;

class TankLeft extends Tank{

    @Override
    public Barrel createBarrel() {
        return new BarrelLeft();
    }


}
