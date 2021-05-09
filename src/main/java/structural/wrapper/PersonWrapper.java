package structural.wrapper;

class PersonWrapper extends Person {

    private Person person;

    PersonWrapper(Person person) {
       super(person.getName());
        this.person = person;
    }

    @Override
    public void sayHello() {
       person.sayHello();
    }



}
