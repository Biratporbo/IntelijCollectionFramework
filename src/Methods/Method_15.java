//A program to make interchange two Employee objectss by passing them to swap() method 

package Methods;

//Objects are also passed to methods by value
class Employee
{
    //instance variable
    int id;
    //to initialize id value
    Employee(int id)
    {
        this.id = id;
    }
}

class Check
{
    //to interchange Employee class objects
    void swap(Employee obj1, Employee obj2)
    {
        Employee temp; //take a temporary reference
        temp = obj1; 
        obj1 = obj2;
        obj2 = temp;
    }
}

public class Method_15 
{
    public static void main(String[] args) 
    {
        //take two Employee class objects
        Employee obj1 = new Employee(19);
        Employee obj2 = new Employee(29);

        //create Check class object
        Check obj = new Check();

        //display data before calling
        System.out.println(obj1.id+"\t"+obj2.id);
        //call swap and pass Employee class objects
        obj.swap(obj1, obj2);

        //display data after calling
        System.out.println(obj1.id+"\t"+obj2.id);
    }    
}
