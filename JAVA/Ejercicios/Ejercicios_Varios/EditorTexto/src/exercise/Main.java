package exercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        Stacks pila = new Stacks(stack);

        pila.undoStack();
        // System.out.println(pila.toString());
        pila.addText("Hello");
        pila.addText("World");
        pila.addText("");
        pila.undoStack();
        pila.undoStack();
        pila.redoStack();
        pila.redoStack();
    }
}
