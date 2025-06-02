package Lesson13_8;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> setA = new TreeSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        TreeSet<Integer> setB = new TreeSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);

        TreeSet<Integer> mergedSet = mergeTreeSets(setA, setB);
        System.out.println("Merged TreeSet: " + mergedSet); 
    }

    public static TreeSet<Integer> mergeTreeSets(TreeSet<Integer> setA, TreeSet<Integer> setB) {
        TreeSet<Integer> result = new TreeSet<>(setA);
        result.addAll(setB);
        return result;
    }
}
