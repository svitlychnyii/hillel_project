package Lesson8;

public class EvenCounter {
    public static int countEvenInts(int[] array) {
        int count = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countEvenInts(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvenInts(new int[]{2, 2, 0}));
        System.out.println(countEvenInts(new int[]{1, 3, 5}));
    }

}
