package CollectionFramework.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetCreate {
    public static void main(String[] args) {

        LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);

        System.out.println("Linked Hash set 1: " + evenNumbers);

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.addAll(evenNumbers);
        numbers.add(5);
        numbers.add(7);

        System.out.println("New Linked Hash set 2: " + numbers);

        boolean val1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + val1);

        boolean val2 = numbers.removeAll(evenNumbers);
        System.out.println("Is removed all the numbers? " + val2);

        System.out.println("Updated numbers of the LinkedHash set : " + numbers);

        numbers.clear();
        System.out.println(numbers);
    }
}
