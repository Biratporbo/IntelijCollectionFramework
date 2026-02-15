package CollectionFramework.Map;

import java.util.HashMap;

public class HashMapCreate {
    public static void main(String[] args) {

        HashMap<Integer, String> coding = new HashMap<>();
        System.out.println("Initial HasMap(): " + coding);
        coding.put(1, "Java");
        coding.put(2, "Python");
        coding.put(3, "Javascript");
        coding.put(4, "C");

        System.out.println("Display the Maps: " + coding);

        String  val = coding.get(2);
        System.out.println("Display 2: " + val);

        System.out.println("Display keys: " + coding.keySet());

        System.out.println("Display values: " + coding.values());

        System.out.println("Display keys-values entries set: " + coding.entrySet());

        coding.replace(4, "DSA");
        System.out.println("Replace the Maps: " + coding);

        String value = coding.remove(2);
        System.out.println("Removed value: " + value);

        System.out.println("Updated Maps: " + coding);


    }
}
