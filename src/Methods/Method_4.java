//A program for a static method that accepts data and returns the result

package Methods;

class Sample
{
    //static method should be declared as static
    static double sum(double num1, double num2)
    {
        double res = num1 + num2;
        return res; //return result
    }
}

public class Method_4 
{
    public static void main(String[] args) 
    {
        //call the static method using Classname.methodname()
        double x = Sample.sum(10, 25.4);
        System.out.println("Sum: " + x);
    }    
}
