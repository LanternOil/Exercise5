package com.company.dahms;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Howie Mandel","nodeal@hotmail.com");
        Person person2 = new Person("Mark Killoran", "vigilo_confido@xcom.com");

        AddressBook book = new AddressBook(person1.getName(), person1.getEmail());
        AddressBook book1 = new AddressBook(person2.getName(), person2.getEmail());

        //Methods are stored in the classes, for demonstration purposes.
    }
}
