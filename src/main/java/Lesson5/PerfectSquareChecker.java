package Lesson5;

public class PerfectSquareChecker {
    // квадрат цілого числа
    public static boolean isPerfectSquare(int number) {
        if (number < 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static void main(String[] args) {
        System.out.println("isPerfectSquare(25) → " + isPerfectSquare(25)); // true
        System.out.println("isPerfectSquare(20) → " + isPerfectSquare(20)); // false
        System.out.println("isPerfectSquare(9) → " + isPerfectSquare(9));   // true
        System.out.println("isPerfectSquare(1) → " + isPerfectSquare(1));   // true
        System.out.println("isPerfectSquare(0) → " + isPerfectSquare(0));   // true
        System.out.println("isPerfectSquare(-4) → " + isPerfectSquare(-4)); // false
    }
}
