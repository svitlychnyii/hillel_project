package Lesson4;

public class PowerCalculator {
    // до степеня
    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void main(String[] args) {
        System.out.println("2^3 = " + power(2, 3));
        System.out.println("5^0 = " + power(5, 0));
        System.out.println("7^2 = " + power(7, 2));
        System.out.println("10^4 = " + power(10, 4));
    }
}
