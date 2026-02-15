package CollectionFramework.Set.SetInterface;

import java.util.HashSet;

public class InterSectionhashSet {
    public static void main(String[] args) {

        HashSet<Integer> primenumbers = new HashSet<>();
        primenumbers.add(2);
        primenumbers.add(3);
        primenumbers.add(5);

        System.out.println("Hash Set 1: " + primenumbers);

        HashSet<Integer> oddnumbers = new HashSet<>();
        oddnumbers.add(1);
        oddnumbers.add(3);
        oddnumbers.add(5);

        System.out.println("Hash Set 2: " + oddnumbers);

        primenumbers.retainAll(oddnumbers);
        System.out.println("Intersection set are: " + primenumbers);
    }
}
