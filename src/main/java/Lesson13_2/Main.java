package Lesson13_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(createMap(new String[]{"code", "bug"}));
        System.out.println(createMap(new String[]{"man", "moon", "main"}));
        System.out.println(createMap(new String[]{"man", "moon", "good", "night"}));
    }

    public static Map<String, String> createMap(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String s : strings) {
            String firstChar = String.valueOf(s.charAt(0));
            String lastChar = String.valueOf(s.charAt(s.length() - 1));
            result.put(firstChar, lastChar);
        }

        return result;
    }
}
