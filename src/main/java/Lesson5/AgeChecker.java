package Lesson5;

public class AgeChecker {
    // перевірка повноліття
    public static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Ви доросла особа");
        } else {
            System.out.println("Ви не є дорослою особою");
        }
    }

    public static void main(String[] args) {
        checkAge(18);
        checkAge(0);
        checkAge(99);
        checkAge(15);
    }
}
