package Lesson9;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", 30, "Інженер");
        Person mary = new Person("Mary", 25, "Вчитель");
        Person bob = new Person("Bob", 35, "Лікар");

        john.printInfo();
        mary.printInfo();
        bob.printInfo();

        System.out.println();

        Person alice = new Person("Alice", 28, "Архітектор");
        alice.printInfo();

        alice.changeProfession("Дизайнер");

        System.out.println("(Після оновлення професії)");
        alice.printInfo();
    }
}
