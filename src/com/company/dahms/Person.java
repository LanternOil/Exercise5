package com.company.dahms;

public class Person {
    static String name;
    static String email;

    public Person(String name,String email) {
        setEmail(email);
        setName(name);
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Person.email = email;
    }
}
