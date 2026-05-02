//A program to create a lambda expression that display a hello message

package Java8.LambdaExpressions;

public class LambdaDemo1
{
    //create a functional interface with a single abstract method
    interface MyInter
    {
        void message();
    }

    public static void main(String[] args)
    {
        //create functional interface reference that refers to lambda expression
         MyInter mi = () -> {
             System.out.println("Hello There! This side Birat!");
         };

         //call the method using reference
        mi.message();
    }
}
