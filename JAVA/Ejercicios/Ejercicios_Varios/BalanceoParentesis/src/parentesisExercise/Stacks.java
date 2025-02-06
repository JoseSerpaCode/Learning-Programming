package parentesisExercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stacks {
    public static boolean isBalanced(String input){
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                // Si la pila está vacía, no hay un paréntesis de apertura correspondiente
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    /*
    pila = {  }
     */

    public static void main(String[] args) {
        // Pruebas
        String[] testCases = {
                "(())",    // true
                "(()))",   // false
                "((())",   // false
                "()()()",  // true
                "(()())(())" // true
        };

        for (String testCase : testCases) {
            System.out.println("Input: " + testCase + " -> Balanced: " + isBalanced(testCase));
        }
    }
}
