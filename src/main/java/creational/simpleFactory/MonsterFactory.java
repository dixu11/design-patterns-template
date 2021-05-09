package creational.simpleFactory;

class MonsterFactory {

    Monster createMonster(MonsterType type) {
        switch (type){
            case DRAGON:
                return new Dragon();
            case TROLL:
                return new Troll();
        }
        return null;
    }



}
