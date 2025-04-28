package Lesson7;

public class MixStrings {
    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();

        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        if (a.length() > minLength) {
            result.append(a.substring(minLength));
        }

        if (b.length() > minLength) {
            result.append(b.substring(minLength));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }
}
