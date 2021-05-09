package creational.builder;
import java.time.LocalDate;
import java.util.Objects;

public class Person {

    //OBOWIĄZKOWE
    private String fullName;
    private String mail;
    private String address;

    //OPCJONALNE
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


    //8. statyczne metoda budująca buildera
    public static PersonBuilder builder(String fullName, String mail, String address){
        return new PersonBuilder(fullName, mail, address);
    }


    //2. klasa statyczna wewnetrzna
    // wewnętrzna żeby miała dostęp do konstruktora person
    // statyczna żeby była niezależna od obiektu klasy zewnętrznej
   static class PersonBuilder{

        //3. tworzę obiekt budowany
       private Person person = new Person();

       //4. uzupełniam obowiązkowe dane
       public PersonBuilder(String fullName, String mail, String address){
           person.fullName = fullName;
           person.mail = mail;
           person.address = address;
       }

       //5. umożliwić ustawianie opcjonalnych danych
       public PersonBuilder bornIn(LocalDate birthDate){
           person.birthDate = birthDate;
           return this;
       }

       //7. metody przejsciowe powinny zwracać obiekt buildera - fluent interface
       public PersonBuilder withPhone(int phone){
           person.phone = phone;
           return this;
       }

       //6. daj obiekt
       Person build() {
           return person;
       }
   }

}


