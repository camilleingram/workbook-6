package com.pluralsight;

import java.util.Collections;

public class Person implements Comparable<Person>{
    private String firstName = "";
    private String lastName = "";
    private int age = 0;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person person) {
        int last = this.lastName.compareTo(person.lastName);

        if(last == 0) {
            return this.firstName.compareTo(person.firstName);
        }
        return last;
    }

}
