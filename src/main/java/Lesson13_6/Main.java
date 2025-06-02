package Lesson13_6;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 1, 2, 3, 3, 3);
        System.out.println("Most frequent element: " + findMostFrequent(numbers)); 
    }

    public static int findMostFrequent(List<Integer> list) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequent = list.get(0);
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }
}

