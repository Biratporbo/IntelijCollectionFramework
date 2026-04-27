//A program that shows the use of HashMap class.

package CollectionFramework.Map;

import java.io.*;
import java.util.*;

public class HashMapDemo
{
    public static void main(String[] args)
            throws IOException
    {
        //create HashMap
        HashMap<String, Long> hm = new HashMap<>();

        //vars
        String name,str;
        Long phno;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //menu
        while(true)
        {
            System.out.println("1 Enter Phone Entries");
            System.out.println("2 Lookup In The Book");
            System.out.println("3 Display Names In Book");
            System.out.println("4 Exit");

            System.out.println("Your choice: ");
            int n = Integer.parseInt(br.readLine());

            switch (n)
            {
                case 1:
                    System.out.print("Enter name: ");
                    name = br.readLine();
                    System.out.print("Enter phno: ");
                    str = br.readLine();
                    phno = new Long(str);
                    //store name and phno into HashMap
                    hm.put(name, phno);
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    name = br.readLine();
                    name = name.trim(); //remove unnecessary
                    //spaces
                    //pass name and get phno
                    phno = hm.get(name);
                    System.out.println("Phno: " + phno);
                    break;

                case 3:
                    //use KeySet() to display the names
                    //create HashSet object to store names and refer it by Set reference
                    Set<String> set = new HashSet<String>();
                    set = hm.keySet();
                    System.out.println(set);
                    break;

                case 4: return;
            }
        }
    }
}
