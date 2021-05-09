package creational.tanks;

class Demo {

    public static void main(String[] args) {
        Tank tank = new TankLeft();
        tank.attack(); // atakuje lewym działem

        Tank tank2 = new TankRight();
        tank2.attack(); //atakuje prawym działem
    }
}
