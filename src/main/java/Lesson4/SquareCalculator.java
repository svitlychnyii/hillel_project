package Lesson4;

public class SquareCalculator {
    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("Квадрат числа " + number + " дорівнює " + square);
    }

    public static void main(String[] args) {
        printSquare(5);
        printSquare(-3);
        printSquare(10);
        printSquare(7);
        printSquare(22);
    }
}
