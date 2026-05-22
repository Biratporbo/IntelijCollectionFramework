package StreamsAPI;

import java.util.stream.Stream;

public class Create2
{
    public static void main(String[] args)
    {
        //create the stream from random numbers
        Stream<Double>sm = Stream.generate(() -> {return Math.random();});

        //display the elements of the stream
        sm.forEach(System.out::println);
    }
}
