package structural.wrapper;

class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Im " + name);
    }

    String getName() {
        return name;
    }
}
