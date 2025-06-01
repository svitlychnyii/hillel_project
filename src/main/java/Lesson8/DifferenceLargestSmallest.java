package Lesson8;

public class DifferenceLargestSmallest {
        public static void main(String[] args) {

            int[] example1 = {10, 3, 5, 6};
            int[] example2 = {7, 2, 10, 9};
            int[] example3 = {2, 10, 7, 2};

            System.out.println("Різниця (example1): " + differenceLargestSmallest(example1));
            System.out.println("Різниця (example2): " + differenceLargestSmallest(example2));
            System.out.println("Різниця (example3): " + differenceLargestSmallest(example3));
        }

        public static int differenceLargestSmallest(int[] nums) {
            int min = nums[0];
            int max = nums[0];

            for (int i = 1; i < nums.length; i++) {
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);
            }

            return max - min;
        }
    }
