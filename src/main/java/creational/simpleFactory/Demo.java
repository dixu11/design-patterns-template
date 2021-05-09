package creational.simpleFactory;

class Demo {

    public static void main(String[] args) {

        MonsterFactory factory = new MonsterFactory();

        Monster dragon = factory.createMonster(MonsterType.DRAGON);
        Monster troll = factory.createMonster(MonsterType.TROLL);

        dragon.show();
        troll.show();
    }


}
