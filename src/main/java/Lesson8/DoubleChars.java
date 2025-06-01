package Lesson8;

public class DoubleChars {
    public static void main(String[] args) {
        System.out.println(doubleChars("The"));
        System.out.println(doubleChars("AAbb"));
        System.out.println(doubleChars("Hi-There"));
    }

    public static String doubleChars(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            result.append(currentChar);
            result.append(currentChar);
        }

        return result.toString();
    }
}
