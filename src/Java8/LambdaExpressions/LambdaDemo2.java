//create a lambda expression to find Sum of two integers

package Java8.LambdaExpressions;

public class LambdaDemo2
{
    //create a functional interface with a single abstract method
    interface MyInter
    {
        void add(int a, int b);
    }

    public static void main(String[] args)
    {
        //create a functional interface that refers to lambda expression
        MyInter mi = (int a, int b) ->{
            System.out.println("Sum= "+(a+b));
        };

        //call the method using reference
        mi.add(10,20);
        mi.add(20, 33);
    }
}
