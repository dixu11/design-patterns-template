package creational.builder;

public class Demo {
    public static void main(String[] args) {
       /* Person person = new Person("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2");*/

        //tworzymy obiekt buildera - dostarczając obowiązkowe dane
        Person.PersonBuilder builder = new Person.PersonBuilder("Anna Markowska","a.markowska2" +
                "2", "Wojska Polskiego 2");


        //wykonaj polecenie z ar




    }
}
