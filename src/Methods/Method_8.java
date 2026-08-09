//A program to test which one is executed first by JVM, the static block or the static method.
//Static block or Static method?
class Test
{
    static
    {
        System.out.println("Static Block");
    }

}

public class Method_8 
{
    public static void main(String[] args) 
    {
         System.out.println("Static method");
    }
}
