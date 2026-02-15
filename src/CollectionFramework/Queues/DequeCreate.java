package CollectionFramework.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeCreate {
    public static void main(String[] args) {

        Deque<String> domain = new ArrayDeque<>();

        domain.add("Cyber-security");
        domain.add("Cloud computing");
        domain.add("Dev-Ops");
        domain.add("AI-Ml");
        domain.add("Webdev");
        domain.add("Software Engineer");

        System.out.println("Deque of the list: " + domain);

        domain.addFirst("Tech Role");
        System.out.println("Addfirst adding domain: " + domain);

        domain.addLast("DSA");
        System.out.println("Addlast adding domain: " + domain);

        domain.offerFirst("BTech");
        System.out.println("Offering first domain: " + domain);

        domain.offerLast("BCA");
        System.out.println("Offering last domain: " + domain);

        System.out.println("Get first of deque: " + domain.getFirst());

        System.out.println("Get last of deque: " + domain.getLast());

        System.out.println("First domain: " + domain.peekFirst());

        System.out.println("Last domain: " + domain.peekLast());

        System.out.println("Removed first domain: " + domain.removeFirst());

        System.out.println("Removed last domain: " + domain.removeLast());

        System.out.println("Updated of Queue: " + domain);
    }
}
