package Lesson9;

import java.util.Objects;

public abstract class Person implements Displayable {
    protected String name;
    protected int age;
    protected PersonRole role;

    public Person(String name, int age, PersonRole role) throws InvalidPersonDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidPersonDataException("Name cannot be null or empty");
        }
        if (age < 0) {
            throw new InvalidPersonDataException("Age cannot be negative");
        }
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public abstract void displayInformation();

    public void displayInformation(String prefix) {
        System.out.println(prefix + ": " + name + ", Вік: " + age + ", Професія: " + role);
    }
}