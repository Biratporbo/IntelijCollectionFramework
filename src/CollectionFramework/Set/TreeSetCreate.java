package CollectionFramework.Set;

import java.util.TreeSet;

public class TreeSetCreate {
    public static void main(String[] args) {

        TreeSet<String> candidate = new TreeSet<>();
        candidate.add("Birat");
        candidate.add("Rohit");
        candidate.add("Anushka");
        candidate.add("Soumodeep");
        candidate.add("Trisha");

        System.out.println("Candidates name: " + candidate);

        TreeSet<String> participants = new TreeSet<>();
        participants.addAll(candidate);
        participants.add("Sneha");

        System.out.println("Updated candidates name: " + participants);

        participants.size();

        boolean block = participants.remove("Birat");
        System.out.println("Is the candidate name of Birat is fail? " + block);

        System.out.println("New candidates names are: " + participants);

        participants.pollFirst();
        participants.pollLast();

        System.out.println(participants);
    }
}
