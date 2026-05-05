//A program to access variables of a class and of a method using lambda expression
//a lambda expression that access the variables with class scope and method scope

package Java8.LambdaExpressions;

public class LambdaDemo4
{
    //variable in the class
    int x = 11;

    //method in the class
    void method()
    {
        //variable in the method
        int x = 19;

        //create  reference of functional interface to the lambda expression
        Runnable r = () -> {
            System.out.println("Var of the class: " + this.x);
            System.out.println("Var of the method: " + x);
        };

        //create a thread and run it
        Thread t = new Thread(r);
        t.start();
    }

    public static void main(String[] args)
    {
        //create object to the Class and Call the method
        LambdaDemo4 obj = new LambdaDemo4();
        obj.method();
    }
}
