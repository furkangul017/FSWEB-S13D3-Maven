package org.example;

public class Person {
    String firstName;
    String lastName;
    String eyeColor;
    double height;
    int age;
    boolean isMarried;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, String eyeColor,
                  int age, double height, boolean isMarried) {
        this(firstName, lastName, age);
        this.eyeColor = eyeColor;
        this.height = height;
        this.isMarried = isMarried;
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

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}