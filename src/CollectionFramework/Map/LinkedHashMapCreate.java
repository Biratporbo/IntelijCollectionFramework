package CollectionFramework.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapCreate {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        evenNumbers.putIfAbsent("Six", 6);

        System.out.println("Linked Hashmap 1: " + evenNumbers);

        LinkedHashMap<String,Integer> numbers = new LinkedHashMap<>();
        numbers.put("One", 1);

        System.out.println("Linked Hashmap 2: " + numbers);

        numbers.putAll(evenNumbers);
        System.out.println("Rewrite Linked Hashmap: " + numbers);

        System.out.println("Key/Values mapping: " + numbers.entrySet());

        System.out.println("Keys mapping: " + numbers.keySet());

        System.out.println("Values mapping: " + numbers.values());

        int val1 = numbers.get("Two");
        System.out.println("Returned numbers: " + val1);

        int val2 = numbers.getOrDefault("Five", 5);
        System.out.println("Returned default value: " + val2);

        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);

        boolean result = numbers.remove("Six", 6);
        System.out.println("Is 'Six' removing in the map? " + result);

        System.out.println("Renewal mapping: " + numbers);
    }
}
