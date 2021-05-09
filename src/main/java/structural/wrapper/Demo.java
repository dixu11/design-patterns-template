package structural.wrapper;

class Demo {
    public static void main(String[] args) {
        Person personWrapper = new PersonWrapper(new Person("Tomek"));
        personWrapper.sayHello();
    }
}
