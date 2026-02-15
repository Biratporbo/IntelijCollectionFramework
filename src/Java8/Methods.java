package Java8;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        //filter(Predicate)--> filtering out
            //boolean value function
                //e -> e > 10


        //map(Function)----> value return that means TRUE/FALSE
        /*
            each element operation

        */

        //filter
        List<String> names = List.of("Aman", "Birat", "Ankit", "Rahul", "Arijit");

        //Predicate pass ---> filter(e->e.startsWith("A"))
        List<String> newName = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newName);

        //map
        List<Integer> numbers = List.of(12,10,4,2,8,6);
        List<Integer> newNumbers = numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newNumbers);


        //sort(method)--->
        numbers.stream().sorted().forEach(System.out::println);

        Integer integer = numbers.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("Min" + integer);

        Integer integer1 = numbers.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("Max" + integer1);
    }
}
