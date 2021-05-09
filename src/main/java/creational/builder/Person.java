package creational.builder;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String fullName;
    private String mail;
    private String address;
    private LocalDate birthDate;
    private int phone;

    //1. Prywatny konstruktor -> budowaniem obiektu zajmie się klasa PersonBuilder
    private Person() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return fullName.equals(person.fullName) &&
                mail.equals(person.mail) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, mail, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", tel=" + phone +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //2. klasa statyczna wewnetrzna
    // wewnętrzna żeby miała dostęp do konstruktora person
    // statyczna żeby była niezależna od obiektu klasy zewnętrznej
   static class PersonBuilder{

    }

}


