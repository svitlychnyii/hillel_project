package Lesson12;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 14, 15, 92, 6));
        System.out.println("Коллекция чисел: " + numbers);

        List<String> fullName = new ArrayList<>(Arrays.asList("Ілля", "Світличний", "Андрійович"));
        System.out.println("Колекція ФІО: " + fullName);

        Set<String> uniqueItems = new HashSet<>();
        uniqueItems.add("apple");
        uniqueItems.add("banana");
        uniqueItems.add("apple"); // дубликат, не добавится
        System.out.println("Сет унікальних елементів: " + uniqueItems);

        Map<String, Integer> cityCodes = new HashMap<>();
        cityCodes.put("Харків", 57);
        cityCodes.put("Київ", 44);
        cityCodes.put("Львів", 32);
        cityCodes.put("Одеса", 48);
        cityCodes.put("Дніпро", 56);

        System.out.println("Мапа міст та телефонних кодів:");
        for (Map.Entry<String, Integer> entry : cityCodes.entrySet()) {
            System.out.println(entry.getKey() + " - 0" + entry.getValue());
        }
    }
}
