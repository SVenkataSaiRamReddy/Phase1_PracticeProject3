
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Inserting (pushing) elements into the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println("Stack elements after pushing:");
        System.out.println(stack);

        // Removing (popping) elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Stack elements after popping:");
        System.out.println(stack);

        // Peek: Retrieve the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element in the stack: " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}
