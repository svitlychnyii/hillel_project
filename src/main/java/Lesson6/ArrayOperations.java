package Lesson6;

import java.util.Scanner;

public class ArrayOperations {

    //середнє значення
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            sum = sum + currentNumber;
        }
        double average = (double) sum / array.length;

        return average;
    }

    // максимальне і мінімальне значення
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num > max) max = num;
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num < min) min = num;
        }
        return min;
    }

    // елементи масиву у зворотному порядку
    public static void printReversed(int[] array) {
        System.out.print("Масив у зворотному порядку: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // чи є число у масиві
    public static boolean containsNumber(int[] array, int target) {
//        for (int num : array) {
//            if (num == target) return true;
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            if (currentNumber == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів у масиві: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Середнє значення: " + calculateAverage(array));
        System.out.println("Максимальне значення: " + findMax(array));
        System.out.println("Мінімальне значення: " + findMin(array));

        printReversed(array);

        System.out.print("Введіть число для перевірки наявності в масиві: ");
        int target = scanner.nextInt();
        if (containsNumber(array, target)) {
            System.out.println("Число присутнє у масиві.");
        } else {
            System.out.println("Число відсутнє у масиві.");
        }
    }
}