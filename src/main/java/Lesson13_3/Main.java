package Lesson13_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(countWords(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(countWords(new String[]{"c", "b", "a"}));
        System.out.println(countWords(new String[]{"c", "c", "c", "c"}));
    }

    public static Map<String, Integer> countWords(String[] strings) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String s : strings) {
            wordCount.put(s, wordCount.getOrDefault(s, 0) + 1);
        }

        return wordCount;
    }
}
