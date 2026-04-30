//A program that shows the use of Arrays
//Sorting and searching an array

package CollectionFramework.ArraysClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysDemo
{
    public static void main(String[] args)
    throws IOException
    {
        //to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //create an array
        int arr[] = new int[5];

        //store elements into arr[]
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter an integer: ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        //display the array contents
        System.out.println("Contents of the array: ");
        display(arr);

        //sort the array into ascending order
        Arrays.sort(arr);

        //display the arr[] contents
        System.out.println("The Sorted array: ");
        display(arr);

        //Now search for an element
        System.out.print("Which element to search?");
        int element = Integer.parseInt(br.readLine());
        int index = Arrays.binarySearch(arr, element);
        if(index<0) System.out.println("Element not found");
        else System.out.println("Element found at location: "+(index+1));
    }
    //display method- uses for each loop
    static void display(int arr[])
    {
        for(int i:arr)
            System.out.println(i);
    }
}//end of ArrayDemo Class
