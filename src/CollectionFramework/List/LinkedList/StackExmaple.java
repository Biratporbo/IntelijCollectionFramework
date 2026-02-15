package CollectionFramework.List.LinkedList;

import java.util.LinkedList;

public class StackExmaple {
    public static void main(String[] args) {

        //Create a LinkedList to act a stack
        LinkedList<String> stack = new LinkedList<>();

        //Push elements (Add an element)
        stack.push("Java");
        stack.push("Python");
        stack.push("R");
        stack.push("Javascript");


        //Disply the stack
        System.out.println("Stack: " + stack);

        //Pop elements (remove from top)
        String top = stack.pop();
        System.out.println("Popped elements: " + top);

        //Peek at top elements
        System.out.println("Peeked elements: " + stack.peek());

        //Check Stack is empty
        System.out.println("Is stack is empty? " + stack.isEmpty());

    }
}
