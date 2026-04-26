package CollectionFramework.List.VectorClass;

import java.util.Vector;

public class VectorCreate {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();

        names.add("Bishal");
        names.add("Birat");
        names.add("Joy");

        System.out.println("Display the adding name: " + names);

        names.add(1, "Ajoy");

        System.out.println("Second Person name: " + names.get(1));

        System.out.println("Vector names: " + names);

        names.remove("Joy");

        System.out.println("Names: " + names);

    }
}