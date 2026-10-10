
package CollectionFramework;

import java.util.ArrayDeque;

public class StackUsingArrayDeque {

    public static void main(String[] args) {

        // Creating Stack using ArrayDeque
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // 1. push() - Add elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: " + stack);

        // 2. peek() - View top element
        System.out.println("Top element: " + stack.peek());

        // 3. pop() - Remove top element
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // 4. size() - Count elements
        System.out.println("Stack size: " + stack.size());

        // 5. isEmpty() - Check whether stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Pop remaining elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Check empty stack
        System.out.println("Is stack empty now? " + stack.isEmpty());
    }
}
