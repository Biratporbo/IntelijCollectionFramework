package CollectionFramework.List;

import java.util.*; //Step 1: Import the ArrayList class

public class ArrayListCreate {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>(); //Step 2: Create an ArrayList in String

        // ✅ Step 3: Create a regular array of names
        String[] names = {"Birat", "Bishal", "Joy", "Bijoy", "Ajoy", "Pabel"};
        // ✅ Step 4: Add each name from the array to the ArrayList
        for (int k = 0; k < names.length; k++) {
            nameList.add(names[k]);
        }

        // ✅ Step 5: Display each name from the ArrayList
        for (int k = 0; k < nameList.size(); k++) {
            System.out.println(nameList.get(k));
        }




        //Step 1: Create an ArrayList
//        ArrayList<String> names = new ArrayList<String>();
//
//        //Step 2: Add element of the ArrayList
//        names.add("Birat");
//        names.add("Trisha");
//        names.add("Sulegna");
//
//        //Step 3: Print the ArrayList
//        System.out.println("Names: " + names);
//
//        //Step 4: Access elements by index
//        System.out.println("Names: " + names.get(0));
//        System.out.println("Names: " + names.get(1));
//
//        //Step 5: Modify an element
//        names.set(1,"Spriha");
//        System.out.println("Names: " + names.get(1));
//
//        //Step 6: Remove an element
//        names.remove("Spriha");
//        System.out.println("After Removal: " + names);
//
//        //Step 7: Loop through the ArrayList
//        System.out.println("Looping through names: ");
//        for(String name: names){
//            System.out.println(name);
//        }
//
//        //Step 8: Check Size
//        System.out.println("List of the Names: " + names.size());
    }
}