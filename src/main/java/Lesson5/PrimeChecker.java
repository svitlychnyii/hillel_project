package Lesson5;

public class PrimeChecker {

    // Чи є число простим
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(0));
        System.out.println(isPrime(8));
        System.out.println(isPrime(7));
        System.out.println(isPrime(13));
        System.out.println(isPrime(25));
    }
}
