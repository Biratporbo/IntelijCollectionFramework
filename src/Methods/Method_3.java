//Problem: A program for a method with two parameters and a return type

package Methods;

class Sample
{
    //method to calculate sum of num1, num2
    //this method accepts two double values
    //and also returns the double type result
    double sum(double num1, double num2)
    {
        double res = num1 + num2;
        return res;
    }
}

public class Method_3 
{
    public static void main(String[] args) 
    {
        //create the object to Sample class
        Sample sample = new Sample();

        //call the method and pass two values to
        //the method. Store the returned result in x
        double result = sample.sum(10.5, 20.3);
        System.out.println("Sum: " + result);
    }    
}
