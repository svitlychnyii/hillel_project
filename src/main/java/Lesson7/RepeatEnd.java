package Lesson7;

public class RepeatEnd {
    //повторення останніх символів
    public static String repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(end);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }
}
