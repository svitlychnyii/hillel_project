package Lesson9;

public class Person implements Displayable {
    private String name;
    private int age;
    private PersonRole role;

    public Person(String name, int age, PersonRole role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PersonRole getRole() {
        return role;
    }

    public void setRole(PersonRole role) {
        this.role = role;
    }

    @Override
    public void displayInformation() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + role);
    }
}
