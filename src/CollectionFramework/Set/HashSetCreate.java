package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetCreate {
    public static void main(String[] args) {

        HashSet<Integer> evenNumber = new HashSet<>();

        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);

        System.out.println("Hash set of even numbers: " + evenNumber);

        HashSet<Integer> oddNumbers = new HashSet<>();

        oddNumbers.addAll(evenNumber);
        oddNumbers.add(5);

        System.out.println("Hash set of the all numbers: " + oddNumbers);

        boolean val1 = oddNumbers.remove(5);

        System.out.println("does all of the Odd numbers are removed? " + val1);

        System.out.println("Updated Sets: " + oddNumbers);
    }
}