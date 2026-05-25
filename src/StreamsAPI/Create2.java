// A program to create a stream of objects using the Stream.generate() method test purposes

package StreamsAPI;

import java.util.stream.Stream;


public class Create2
{
    public static void main(String[] args)
    {
        //create the stream from random numbers
        Stream<Double>sm = Stream.generate(Math::random);
        /*
         or Stream<Double>sm = Stream. generate (Math: : random); <--- This can be used
         display the elements of the stream
        */

        sm.forEach(System.out::println);

    }
}
