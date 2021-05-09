package creational.builder;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
       /* Person person = new Person("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2");*/

        //tworzymy obiekt buildera - dostarczając obowiązkowe dane
     /*   Person.PersonBuilder builder = new Person.PersonBuilder("Anna Markowska","a.markowska2" +
                "2", "Wojska Polskiego 2");
        builder.setBirthDate(LocalDate.now().minusYears(20));
        builder.setPhone(345567678);
        Person person = builder.getPerson();*/


        Person person2 =

        Person person = new Person.PersonBuilder("Anna Markowska","a.markowska2" +
                "2", "Wojska Polskiego 2")
                .bornIn(LocalDate.now().minusYears(20))
                .withPhone(334545656)
                .build();

        //wykonaj polecenie z ar




    }
}
