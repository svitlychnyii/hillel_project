package Lesson5;

public class GradeChecker {
    // Визначення оцінки
    public static void getGrade(int mark) {
        switch (mark) {
            case 5:
                System.out.println("Відмінно");
                break;
            case 4:
                System.out.println("Добре");
                break;
            case 3:
                System.out.println("Задовільно");
                break;
            case 2:
                System.out.println("Погано");
                break;
            case 1:
                System.out.println("Погано");
                break;
            default:
                System.out.println("Неправильна оцінка");
        }
    }

    public static void main(String[] args) {
        getGrade(5);   // → "Відмінно"
        getGrade(1);   // → "Погано"
        getGrade(-3);  // → "Неправильна оцінка"
        getGrade(3);   // → "Задовільно"
        getGrade(7);   // → "Неправильна оцінка"
    }
}
