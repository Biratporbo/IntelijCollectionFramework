//a simple thread program -- version 3
//in this version, we are using anonymous inner class

package Java8.LambdaExpressions;

public class LambdaDemo8
{
    public static void main(String[] args) {
        //create thread object and pass the object of anonymous class
        //implement the run() of the Runnable class
        Thread t = new Thread(() -> System.out.println("This is from anonymous inner class"));

        //run the thread
        t.start();
    }
}
