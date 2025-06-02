package Lesson13_5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(buildResultString(new String[]{"a", "b", "a"}));
        System.out.println(buildResultString(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(buildResultString(new String[]{"a", "", "a"}));
        System.out.println(buildResultString(new String[]{"x", "y", "z"}));
    }

    public static String buildResultString(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        Set<String> added = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            int count = countMap.getOrDefault(str, 0) + 1;
            countMap.put(str, count);

            if (count % 2 == 0 && !added.contains(str)) {
                result.append(str);
                added.add(str);
            }
        }

        return result.toString();
    }
}
