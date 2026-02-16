package Exception;

public class Exii {
    public static void main(String[] args){
        System.out.println("Started...");

        try
        {
            int n1 =  Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println("We have got two numbers..");
            int result = n1/n2;
            System.out.println("Divison is "+ result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("n2 can not be zero");
            System.out.println(e);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Numbers!");
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("Error !!");
            System.out.println(e);
        }
        finally{
            System.out.println("Close files");
            System.out.println("Closing all the resource");
        }

        System.out.println("Terminated..");
    }
}