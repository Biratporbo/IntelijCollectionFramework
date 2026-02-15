package CollectionFramework.Set.SetInterface;

import java.util.HashSet;

public class DifferenceHashSet {
    public static void main(String[] args) {

        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);

        System.out.println("Hash set 1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);

        System.out.println("Hash set 2: " + oddNumbers);

        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference set is: " + primeNumbers);
    }
}
