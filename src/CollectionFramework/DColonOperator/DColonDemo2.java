//A program to understand how to use a double colon operator as a reference to the constructor of a class

package CollectionFramework.DColonOperator;

class Sample
{
    //instance variable
    private String x;

    //constructor
    Sample(String x){
        this.x = x;
        System.out.println("Constructor executed " + x);
    }
}

//functional interface with get() method that returns Sample class object
interface MyInter
{
    Sample get(String str);
}

public class DColonDemo2
{
    public static void main(String[] args)
    {
        //this lambda expression returns Sample class object
        MyInter mi = (String x) -> {return new Sample(x);};
        Sample s = mi.get("from lambda expression");

        //double colon operator refers to sample class constructor
        MyInter mi1 = Sample::new;
        Sample s1 = mi1.get("from double colon operator");
    }
}
