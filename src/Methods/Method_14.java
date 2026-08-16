// A program to interchange between two integers 10 and 20 by passing them to swap() method

package Methods;

//Primitive data types are passed to methods by value
class Check
{
    //to interchange num1 and num2 values
    void swap(int num1, int num2)
    {
        int temp; //take a temporary variable
        temp = num1;
        num1 = num2;
        num2 = temp;
    }
}

public class Method_14 
{
    public static void main(String[] args) 
    {
        //take two primitive data types
        int num1 = 10, num2 = 19;
        //create check class object
        Check obj = new Check();
        //display data before calling
        System.out.println(num1+"\t"+num2);
        //call swap and pass primitive data types
        obj.swap(num1, num2);
        //display data after calling
        System.out.println(num1+"\t"+num2);
    }    
}
