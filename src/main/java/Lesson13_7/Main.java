package Lesson13_7;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> setA = new LinkedHashSet<>(Set.of(1, 2, 3, 4));
        LinkedHashSet<Integer> setB = new LinkedHashSet<>(Set.of(3, 5, 6));

        boolean result = hasIntersection(setA, setB);
        System.out.println("Has intersection: " + result);  // → true
    }

    public static boolean hasIntersection(Set<Integer> setA, Set<Integer> setB) {
        for (Integer element : setA) {
            if (setB.contains(element)) {
                return true;
            }
        }
        return false;
    }
}
