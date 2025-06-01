package Lesson8;

public class SumIgnoreSections {
    public static int sumIgnoreSections(int[] nums) {
        int sum = 0;
        boolean inSection = false;

        for (int num : nums) {
            if (inSection) {
                if (num == 7) {
                    inSection = false;
                }

            } else if (num == 6) {
                inSection = true;
            } else {
                sum += num;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumIgnoreSections(new int[]{1, 2, 2}));
        System.out.println(sumIgnoreSections(new int[]{1, 2, 2, 6, 99, 99, 7}));
        System.out.println(sumIgnoreSections(new int[]{1, 1, 6, 7, 2}));
    }
}
