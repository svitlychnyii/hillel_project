package Lesson9;

class Main {
    public static void main(String[] args) {
        try {
            Person john = new Man("John", 30, PersonRole.ENGINEER);
            Person mary = new Woman("Mary", 25, PersonRole.TEACHER);
            Person bob = new Man("Bob", 35, PersonRole.DOCTOR);
            Person alice = new Woman("Alice", 28, PersonRole.OTHER);

            john.displayInformation();
            mary.displayInformation();
            bob.displayInformation();
            alice.displayInformation();
            
            // Person invalid = new Woman("", -5, PersonRole.OTHER); // неправильные данные

        } catch (InvalidPersonDataException e) {
            System.out.println("Ошибка при создании пользователя: " + e.getMessage());
        }
    }
}

