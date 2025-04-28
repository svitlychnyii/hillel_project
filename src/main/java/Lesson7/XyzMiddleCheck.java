package Lesson7;

public class XyzMiddleCheck {
    public static boolean xyzMiddle(String str) {
        int len = str.length();

        for (int i = 0; i <= len - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int left = i;
                int right = len - (i + 3);
                if (Math.abs(left - right) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("xyz"));
        System.out.println(xyzMiddle("AAxyzB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }
}
