package CollectionFramework.Map;

import java.util.TreeMap;

public class TreeMapCreate {
    public static void main(String[] args) {

        TreeMap<String, Integer> names = new TreeMap<>();
        names.put("Trisha", 1);
        names.put("Sulegna", 2);
        names.put("Sneha", 3);

        System.out.println("Name mapping: " + names);

//        names.putIfAbsent("Sukanya",4);
//        System.out.println("Upgrade name: " + names);
//
//        TreeMap<String, Integer> oddNames = new TreeMap<>();
//        oddNames.put("Sana",1);
//
//        oddNames.putAll(names);
//        System.out.println("Tree map of names: " + oddNames);

        names.replace("Sneha", 10);
        names.replace("Sulegna", 2, 33);
        System.out.println("Tree map of replace the names: " + names);

        names.replaceAll((key, oldValue) -> oldValue + 2); // by Lambda Expression
        System.out.println("Updateing mapping old values numbers: " + names);


    }
}
