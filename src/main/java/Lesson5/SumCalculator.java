package Lesson5;

public class SumCalculator {
    public static void calculateSum(int N) {
        if (N <= 0) {
            System.out.println("Хибні вхідні параметри");
            return;
        }

        int sum = 0;
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            sum += i;
            output.append(i).append(" ");
        }

        System.out.println("Числа: " + output.toString().trim());
        System.out.println("Сума: " + sum);
    }

    public static void main(String[] args) {
        calculateSum(1);
        calculateSum(3);
        calculateSum(0);
        calculateSum(5);
    }
}
