package Lesson9;

class Woman extends Person {
    public static final String GENDER = "жінка";

    public Woman(String name, int age, PersonRole role) throws InvalidPersonDataException {
        super(name, age, role);
    }

    @Override
    public void displayInformation() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + role + ", Стать: " + GENDER);
    }
}
