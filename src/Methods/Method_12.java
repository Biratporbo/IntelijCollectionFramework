//A program to use this refer the current class parameterized constructor as 'this()', its method as 'this.method()'
// and its instance variable as 'this.variable'

package Methods;

//this - refers to all the members of present class
class Sample
{
    //x is instance variable
    private int x;
    //default constructor
    Sample()
    {
        this(55); // call present class para constructor and send 55
        this.access();
    }

    //parameterized constructor
    Sample(int x)
    {
        this.x = x;
    }
    //method
    void access()
    {
        System.out.println("x: " + x);
    }
}

public class Method_12 
{
    public static void main(String[] args) 
    {
        Sample s = new Sample();
    }   
}
