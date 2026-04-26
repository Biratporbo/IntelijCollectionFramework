//A program that shows the use of Vector Class defines
//Creating a vector with Integer elements

package CollectionFramework.List.VectorClass;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args)
    {
        //take a vector to store Integer Objects
        Vector<Integer> v = new Vector<>();

        //take an int type array
        int x[]={22, 20, 10, 40, 15, 60};

        //when x[i] is stored into v below. x[i] values are coverted into Integer objects and stored into v.
        //This is auto boxing.
        for (int i=0; i<x.length; i++)
        {
            v.add(x[i]);
        }

        //retrieve the elements using get()
        System.out.println("Vector Elements: ");
        for (int i=0; i < v.size(); i++)
        {
            System.out.println(v.get(i));
        }

        //retrieve using ListIterator
        System.out.println("Elements using ListIterator: ");
        ListIterator lit = v.listIterator();

        System.out.println("In forward direction: ");
        while (lit.hasNext())
            System.out.print(lit.next()+"\t");

        System.out.println("\nIn backward direction:");
        while (lit.hasPrevious())
            System.out.print(lit.previous()+"\t");
    }
}
