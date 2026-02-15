package CollectionFramework.List;

import java.util.LinkedList;
import java.util.Stack;

public class StackCreate {
    public static void main(String[] args) {

        Stack<String> subjects = new Stack<>();

                subjects.push("Java");
                subjects.push("Python");
                subjects.push("R");
                subjects.push("Javascript");


                //Disply the stack
                System.out.println("Stack: " + subjects);

                //Pop elements (remove from top)
                String top = subjects.pop();
                System.out.println("Popped elements: " + top);

                //Peek at top elements
                System.out.println("Peeked elements: " + subjects.peek());

                //Check Stack is empty
                System.out.println("Is stack is empty? " + subjects.isEmpty());

                //Searching elements Methods ----->
                int positions = subjects.search("Javascript");
                System.out.println("Positions of subjects: " + positions);
    }
}
