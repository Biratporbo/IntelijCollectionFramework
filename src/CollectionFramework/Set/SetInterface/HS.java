package CollectionFramework.Set.SetInterface;

import java.util.*;

public class HS {
    public static void main(String[] args) {

        //create a hashset to store string
        HashSet<String> hs = new HashSet<>();

        //store some string elements
        hs.add("India");
        hs.add("America");
        hs.add("Japan");
        hs.add("China");
        hs.add("America");

        //view the HashSet
        System.out.println("Hash set = "+ hs);

        //add an Iterator to hs.
        Iterator it = hs.iterator();

        //display element by element using Iterator
        System.out.println("Elements using iterator: ");
        while(it.hasNext())
        {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
