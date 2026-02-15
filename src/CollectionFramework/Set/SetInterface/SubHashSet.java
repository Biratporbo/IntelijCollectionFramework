package CollectionFramework.Set.SetInterface;

import java.util.HashSet;

public class SubHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Hash set 1: " + numbers);

        HashSet<Integer> primenumbers = new HashSet<>();
        primenumbers.add(2);
        primenumbers.add(3);

        System.out.println("Hash set 2: " + primenumbers);

        boolean results = numbers.containsAll(primenumbers);
        System.out.println("Is Hashset 2 is a subset of Hashset 1? " + results);

    }
}
