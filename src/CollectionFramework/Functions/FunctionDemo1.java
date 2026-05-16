//A program to create a Function that returns the length of a string.

package CollectionFramework.Functions;

import java.util.function.*;

public class FunctionDemo1
{
    public static void main(String[] args)
    {
        // create a Function reference to lambda expression to find length of a string */

        Function<String, Integer> len = (str) -> str.length();

        //find the length of the string str
        String str = "One Nine";
        System.out.println("Length = " + len.apply(str));
    }
}
