package Lesson8;

public class EndsWith {
    public static void main(String[] args) {
        System.out.println(endsWith("AbC", "HiaBc"));
        System.out.println(endsWith("abc", "abXabc"));
        System.out.println(endsWith("Hiabc", "abc"));
        System.out.println(endsWith("abc", "xyz"));
    }

    public static boolean endsWith(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();

        return aLower.endsWith(bLower) || bLower.endsWith(aLower);
    }
}
