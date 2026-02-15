package CollectionFramework.Queues;

import java.util.PriorityQueue;

public class PriorityQueueCreate {
    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);

        System.out.println("Priority Queue: " + numbers);

        numbers.offer(1);
        System.out.println("Update Queue: " + numbers);

        int accessednum = numbers.peek();
        System.out.println("Accessed numbers: " + accessednum);

        int removednum = numbers.poll();
        System.out.println("Removed numbers: " + removednum);

        System.out.println("Updated Queue: " + numbers);
    }
}
