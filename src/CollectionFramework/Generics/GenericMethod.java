package CollectionFramework.Generics;

class Methods
{
    //Creating Generics Method
    public <T> void genericsMethod(T data)
    {
        System.out.println("Generics Method: ");
        System.out.println("Data Passed: " + data);
    }
}

public class GenericMethod {
    public static void main(String[] args) {

        //initilize with generics data
        Methods objData = new Methods();

        //generics methods working with String
        objData.<String>genericsMethod("Introduction of Generics in Java");

        //generics methods working with Integer
        objData.<Integer>genericsMethod(4);
    }
}