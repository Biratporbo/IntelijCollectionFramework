//a simple thread program -- version 2
//in this version, we are separately creating implementation
//class of Runnable interface

package Java8.LambdaExpressions;

public class LambdaDemo7
{
    public static void main(String[] args)
    {
        //create thread object and pass the object of implementation class of Runnable interface
        Thread t = new Thread(new implclass());

        //run the thread
        t.start();
    }
}

//this is the implementation class for Runnable interface

class implclass implements Runnable
{
    //implement the run() of the Runnable interface
    public void run()
    {
        System.out.println("This is from implementation class");
    }
}
