package Lesson9;

public class Woman extends Person {
    public static final String GENDER = "жінка";

    public Woman(String name, int age, PersonRole role) {
        super(name, age, role);
    }

    @Override
    public void displayInformation() {
        System.out.println("Ім'я: " + getName() + ", Вік: " + getAge() + ", Професія: " + getRole() + ", Стать: " + GENDER);
    }
}
