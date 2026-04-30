//A program that shows sorting using Integer objects
//Sorting an array with a group of Integer objects

package CollectionFramework.ArraysClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//to sort into ascending order
class Ascend implements Comparator<Integer>
{
    public int compare(Integer i1, Integer i2)
    {
        return i1.compareTo(i2);
    }
}

//to sort into descending order
class Descend implements Comparator<Integer>
{
    public int compare(Integer i1, Integer i2)
    {
        return i2.compareTo(i1);
    }
}

public class Array1
{
    public static void main(String[] args)
            throws IOException
    {
        //to accept array elements from keyborad
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many elements? ");
        int size = Integer.parseInt(br.readLine());

        //create an array to store Integer type objects
        Integer arr[] = new Integer[size];

        //below, we pass int values to the array but they are
        //converted into Intege objects and then stored
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter int: ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        //sort the array in ascending order
        Arrays.sort(arr, new Ascend());

        //display the sorted array
        System.out.println("\nSorted in Ascending order: ");
        display(arr);

        //in descending order
        Arrays.sort(arr, new Descend());
        System.out.println("\nSorted in Descending order: ");
        display(arr);
    }

    static void display(Integer arr[])
    {
        for(Integer i: arr)
            System.out.print(i + "\t");
    }
}


/* OUTPUT:
How many elements? 5
Enter int: 55
Enter int: 60
Enter int: 22
Enter int: 45
Enter int: 12

Sorted in Ascending order:
12	22	45	55	60
Sorted in Descending order:
60	55	45	22	12	 */