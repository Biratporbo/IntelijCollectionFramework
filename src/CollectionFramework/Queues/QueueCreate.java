package CollectionFramework.Queues;

import java.util.Queue;
import java.util.LinkedList;

public class QueueCreate {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        numbers.offer(4);

        System.out.println("Queue of the numbers: " + numbers);

        int accessednumber = numbers.peek();
        System.out.println("Accessd the number: " + accessednumber);

        int removednumber = numbers.poll();
        System.out.println("Removed the number: " + removednumber);

        System.out.println("System updated queue numbers:  " + numbers);
    }
}
