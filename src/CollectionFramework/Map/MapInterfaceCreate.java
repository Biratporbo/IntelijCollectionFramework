package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceCreate {
    public static void main(String[] args) {

        Map<String, Integer> num = new HashMap<>();
        num.put("One", 1);
        num.put("Two", 2);
        num.put("Three", 3);

        System.out.println("Display the Maps: " + num);

        System.out.println("Access the Keys: " + num.keySet());

        System.out.println("Access the Values: " + num.values());

        System.out.println("Access the Entries: " + num.entrySet());

        int val = num.remove("Two");
        System.out.println("Removed value: " + val);

        System.out.println("Updated of Maps: " + num);
    }
}
