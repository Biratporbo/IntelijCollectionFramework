// A program to test whether a static method can access the instance variable or not
//static method trying to access instance variable
class Test
{
    //instance var ---> static int
    static int x;
    //parameterized constructor
    Test(int x)
    {
        this.x = x;
    }
    //static method accessing x value
    static void access()
    {
        System.out.println("x = " + x); 
        //non-static variable x cannot be referenced from a static context
    }
}

public class Method_5
{
    public static void main(String[] args) 
    {
        Test obj = new Test(19);
        Test.access();
    }
}