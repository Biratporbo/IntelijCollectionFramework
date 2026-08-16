//A program to interchange the values inside an object. Since the same object data is modified, we can see the data has been interchanged.

package Methods;

//Interchanging the values should be done in a single object
class Employee
{
    //instance variables
    int id1, id2;
    //to initialize id values
    Employee(int id1, int id2)
    {
        this.id1 = id1;
        this.id2 = id2;
    }
}
class Check
{
    //to interchange id values in the same Employee object
    void swap(Employee obj)
    {
        int temp; //take a temporary variable
        temp = obj.id1;
        obj.id1 = obj.id2;
        obj.id2 = temp;
    }
}

public class Method_16 
{
    public static void main(String[] args) 
    {
        //take Employee class object with id values
        Employee obj1 = new Employee(29, 39);
        //Create Check class object
        Check obj = new Check();
        //display() data before calling
        System.out.println(obj1.id1+"\t"+obj1.id2);
        //call swap and pass Employee class object
        obj.swap(obj1);
        //display data after calling
        System.out.println(obj1.id1+"\t"+obj1.id2);
    }    
}
