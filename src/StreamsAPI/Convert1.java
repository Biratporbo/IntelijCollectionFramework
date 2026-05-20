//To create a stream from ArrayList and collect the elements of a stream of the list using

package StreamsAPI;

import  java.util.*;
import java.util.stream.*;

public class Convert1
{
    public static void main(String[] args)
    {
        //create a list to store Integer objects
        List<Integer> lst = new ArrayList<Integer>();

        // add elements to the list
        for(int i = 1; i < 10; i++)
        {
            lst.add(i);
        }

        //convert this list into stream using stream()
        Stream<Integer> sm = lst.stream();

        /*filter the elements which are greater than 5 and collect
        them into a list using collect(Collectors.toList()) */
        List<Integer> lst1 = sm.filter(i -> i > 5).collect(Collectors.toList());

        //display the new list
        System.out.println(lst1);
    }
}
