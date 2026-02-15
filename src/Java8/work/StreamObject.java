package Java8.work;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //Stream API ---> collection process
        //collection / group of objects

        //1-blank
        Stream<Object> emptyStream = Stream.empty();

        //2-array, object, collection
        String names[] = {"Ankit", "Birat", "Depesh"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        //3-builder pattern using in here
        Stream<Object> streamBuilder = Stream.builder().build();

        //4- To input array string using ---> IntStream
        IntStream stream = Arrays.stream(new int[]{2,4,65,67,35,232});
        stream.forEach(e -> {
            System.out.println(e);
        });

        //5. List, Set many times using --->
        List<Integer> list2 = new ArrayList<>();
        list2.add(34);
        list2.add(67);
        list2.add(40);
        list2.add(88);

        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e -> {
            System.out.println(e);
        });
    }
}
