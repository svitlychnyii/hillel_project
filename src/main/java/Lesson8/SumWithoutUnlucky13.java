package Lesson8;

public class SumWithoutUnlucky13 {
    public static int sumWithoutUnlucky13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumWithoutUnlucky13(new int[]{1, 2, 2, 1}));
        System.out.println(sumWithoutUnlucky13(new int[]{1, 1}));
        System.out.println(sumWithoutUnlucky13(new int[]{1, 2, 2, 1, 13}));
        System.out.println(sumWithoutUnlucky13(new int[]{1, 13, 2, 1}));
    }
}
