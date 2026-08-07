//Problem: A program for a method without parameters and without a return type.

package Methods;

//Understanding the methods

class Sample
{
    //instance variables
    private double num1, num2;
    //parameterized constructor
    Sample(double x, double y)
    {
        num1 = x;
        num2 = y;
    }
    //method to calculate the sum of num1 and num2
    //this method does not accept any values and
    //does not return result
    void sum()
    {
        double res = num1 + num2;
        System.out.println("Sum : " + res);
    }
}

public class Method 
{
    public static void main(String[] args) 
    {
        //create the obk=ject and pass values 10 and 22.5 to constructor.
        //they will be stored into num1, num2
        Sample s = new Sample(10, 22.5);
        
        //call the method and find sum of num1, num2
        s.sum();
    }    
}
