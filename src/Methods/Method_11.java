package Methods;

// Make a program to access an instance variable 'x' and a local variable 'a' from the method access()
// local variable
class Sample
{
    //x is instance variable
    private int x;
    //a is local variable
    void modify(int a)
    {
        x = a;
    }
    //we can access x, but not a
    void access()
    {
        System.out.println("x: " + x);
    }
}

public class Method_11 
{
    public static void main(String[] args) 
    {

        Sample s = new Sample();
        s.modify(10);
        s.access();
    }    
}
