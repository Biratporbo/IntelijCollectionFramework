package CollectionFramework.List.LinkedList;

import java.util.LinkedList;

public class LinkedListCreate {
    public static void main(String[] args) {

        //Step 1: Create a LinkedList in String
        LinkedList<String> cities = new LinkedList<String>();

        //Step 2: Add an elements
        cities.add("Kolkata");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Delhi");

        //Step 3: Add a specific positions
        cities.addFirst("Assam");
        cities.addLast("Bihar");

        //Step 4: Display the LinkedList
        System.out.println("Cities: " + cities);

        //Step 5: Removes the specific elements
        cities.removeFirst();
        cities.removeLast();

        //Step 6: Access elements
        System.out.println("First city: " + cities.getFirst());
        System.out.println("Second city: " + cities.get(1));
        System.out.println("Forth city: " + cities.get(3));

        //Step 7: Loop through the List
        for(String city: cities){
            System.out.println(city);
        }
    }
}
