//A program to understand how to use default of an interface
//an interface with a default method

package Java8.DefaultMethod;

interface MyInter
{
    int add(int x, int y); //this is default method

    default int mul(int x, int y) //this is default method00
    {
        return (x * y);
    }
}

    class A implements MyInter
    {
        public int add(int x, int y)
        {
            return (x + y);
        }
    }

public class DefaultDemo1
{
    public static void main(String[] args) {
        //interface reference can refer to object of its implementation classes
        MyInter mi = new A();
        System.out.println("Sum= " + mi.add(9, 10));

        //default method is by default available in implementation class
        System.out.println("Product= " + mi.mul(10, 5));
    }
}
