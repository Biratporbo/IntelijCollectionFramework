package CollectionFramework.List.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        //Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<String>();

        //Add elements in Queue
        queue.add("Bishal");
        queue.add("Birat");
        queue.add("Ronit");

        //Display the Queue
        System.out.println("Queue name list: " + queue);

        //Remove the element (dequeue)
        String first = queue.poll();
        System.out.println("Remove queue list: " + first);

        //Peek at front element
        System.out.println("Front queue list: " + queue.peek());

        //Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}