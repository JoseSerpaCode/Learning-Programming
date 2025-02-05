package exercise;

import java.util.*;

public class Stacks {
    private final Deque<String> stack;
    private final Deque<String> redoStack = new ArrayDeque<>();

    public Stacks(Deque<String> stack) {
        this.stack = stack;
    }

    public void addText(String text) {
        if (text == null || text.trim().isEmpty()) {
            System.out.println("Text cannot be null or empty.");
            return;
        }
        System.out.println("Adding: '" + text + "'");
        stack.push(text);
        System.out.println(this);
    }

    public void undoStack() {
        System.out.println("Undo last Action");
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            redoStack.push(stack.pop());
            System.out.println(this);
        }
    }

    public void redoStack() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
        } else {
            stack.push(redoStack.pop());
            System.out.println(this);
        }
    }

    @Override
    public String toString() {
        // Copiar los elementos de la pila a una lista
        List<String> elements = new ArrayList<>(stack);
        // Invertir la lista para obtener el orden correcto
        Collections.reverse(elements);
        // Unir los elementos con un espacio
        return "Current text: " + String.join(" ", elements);
    }
}