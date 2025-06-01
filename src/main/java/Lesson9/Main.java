package Lesson9;

public class Main {
    public static void main(String[] args) {
        Man john = new Man("John", 30, PersonRole.ENGINEER);
        Woman mary = new Woman("Mary", 25, PersonRole.TEACHER);
        Man bob = new Man("Bob", 35, PersonRole.DOCTOR);

        Woman alice = new Woman("Alice", 28, PersonRole.ARTIST);
        alice.setRole(PersonRole.OTHER);

        john.displayInformation();
        mary.displayInformation();
        bob.displayInformation();
        alice.displayInformation();
    }
}
