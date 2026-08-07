//Problem: A program for a method without parameters but with a return type

package Methods;

//Understanding the methods
class Sample
{
    //insatnce variables
    private double num1, num2;
    Sample(double x, double y)
    {
        num1 = x;
        num2 = y;
    }

    double sum(double num1, double num2)
    {
        double res = num1 + num2;
        return res; // return result
    }
}

public class Method_2 
{
    public static void main(String[] args) 
    {
        //create the object and pass values 10 and 25.4 to constructor
        //they will be stored into num1, num2
        Sample s = new Sample(10, 22.5);

        //call the method and store the result in x
        double x = s.sum(10,22.5);
        System.out.println("Sum: " + x);
    }
}
