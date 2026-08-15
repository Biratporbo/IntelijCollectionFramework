//A program to create Person class object

package Methods;

//Accessor and mutator methods
class Person
{
    //instaance variable
    private String name;
    private int age;
    //mutator methods to store data
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    //accessor methods to read data

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}

public class Method_13 
{
    public static void main(String[] args) 
    {
        //create an empty Person class object
        Person p1 = new Person();
        //store some data into the object
        p1.setName("Rahul");
        p1.setAge(22);
        //access data from object
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }    
}
