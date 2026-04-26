//A program to create a queue with Integer Objects

//a queue with Integer Objects

package CollectionFramework.Queues;

import java.util.*;
public class QueueDemo
{
    public static void main(String[] args) {
        //create a linked list queue
        Queue<Integer> q = new LinkedList<>();

        //store integers from 1 to 5
        //these integers are covered into Integer Objects and then stored into "q"

        for(int i=1; i<=5; i++){
            q.offer(i);
        }

        //retrieve integers from queue
        System.out.println("The queue is: ");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
