package Lesson9;

public class Main {
    public static void main(String[] args) {
        Person john = new Man("John", 30, PersonRole.ENGINEER);
        Person mary = new Woman("Mary", 25, PersonRole.TEACHER);
        Person bob = new Man("Bob", 35, PersonRole.DOCTOR);

        john.displayInformation();
        mary.displayInformation();
        bob.displayInformation();

        Person alice = new Woman("Alice", 28, PersonRole.ARCHITECT);
        alice.changeProfession(PersonRole.DESIGNER);
        alice.displayInformation();
    }
}
