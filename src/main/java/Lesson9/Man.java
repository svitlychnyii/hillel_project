package Lesson9;

public class Man extends Person {
    public static final String GENDER = "чоловік";

    public Man(String name, int age, PersonRole role) {
        super(name, age, role);
    }

    @Override
    public void displayInformation() {
        System.out.println("Ім'я: " + getName() + ", Вік: " + getAge() + ", Професія: " + getRole() + ", Стать: " + GENDER);
    }
}