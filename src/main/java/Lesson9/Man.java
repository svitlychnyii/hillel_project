package Lesson9;

class Man extends Person {
    public static final String GENDER = "чоловік";

    public Man(String name, int age, PersonRole role) throws InvalidPersonDataException {
        super(name, age, role);
    }

    @Override
    public void displayInformation() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + role + ", Стать: " + GENDER);
    }
}
