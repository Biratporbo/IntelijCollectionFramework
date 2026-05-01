//An ArrayList handling a group of Employee object details
//To create an ArrayList of Employee objects and search for a particular Employee object based on id number.

package CollectionFramework.ArraysClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Employee
{
    //take variables
    int id;
    String name;
    String address;

    //initialize them
    Employee(int i, String n, String a)
    {
        id = i;
        name = n;
        address = a;
    }

    //display employee details
    void display()
    {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

public class EmpList
{
    public static void main(String[] args)
    throws IOException
    {
        //vars
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int id;
        String name;
        String address;

        //create an ArrayList arl to store Employee objects
        ArrayList<Employee> arl = new ArrayList<>();

        //accept 5 employee's details and store into arl
        for(int i=0; i<5; i++){
            System.out.print("Enter id: ");
            id = Integer.parseInt(br.readLine());

            System.out.print("Enter name: ");
            name = br.readLine();

            System.out.print("Enter address: ");
            address = br.readLine();

            //create Employee object with accepted data
            Employee obj = new Employee(id, name, address);

            //store Employee object into arl
            arl.add(obj);
        }

        //Now search for an employee id
        System.out.print("Enter id to search: ");
        id = Integer.parseInt(br.readLine());

        //found becomes true if employee id is found in arl
        boolean found = false;

        //search all elements in arl
        for (int i=0; i<arl.size(); i++)
        {
            //get() method of ArrayList will return i-th Employee
            //objects
            Employee obj = arl.get(i);

            //check if given id is equal to id of Employee object
            if(id == obj.id)
            {
                obj.display(); //display that Employee object
                found = true;
            }
        }

        if(!found)
            System.out.println("Employee not found");
    }
}
