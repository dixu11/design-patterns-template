package creational.tanks;

class TankRight extends Tank {


    @Override
    public Barrel createBarrel() {
        return new BarrelRight();
    }
}
