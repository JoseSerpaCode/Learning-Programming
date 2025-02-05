package stacks;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Empty stack: " + stack);
        System.out.println("Is the stack empty: " + stack.isEmpty());

        // add elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // traverse stack
        stack.forEach(System.out::println);

        // show stack
        System.out.println("Stack: " + stack);

        stack.pop(); // Delete the last element
        System.out.println("Does the stack contain the number three?: " +  stack.search(3));
        System.out.println("Last added element: " + stack.peek());
    }
}
