//A program that lambda expression calculates and returns the square root value of a given number
//a lambda expression that returns square root value of a number

package Java8.LambdaExpressions;

public class LambdaDemo3
{
    // create a functional interface with a single abstract method
    interface MyInter
    {
        double squareroot(double num);
    }

    public static void main(String[] args)
    {
        // lambda expression
        MyInter mi = (double x) -> { return Math.sqrt(x); };

        // call the method
        System.out.println("Square root of 256 = " + mi.squareroot(256));
    }
}