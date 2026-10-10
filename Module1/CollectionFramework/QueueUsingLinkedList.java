package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // 1. add() - element add karta hai
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Queue: " + queue);

        // 2. offer() - element add karta hai
        queue.offer(60);

        System.out.println("After offer(): " + queue);

        // 3. peek() - first element dekhta hai
        System.out.println("Peek: " + queue.peek());

        // 4. element() - first element dekhta hai
        System.out.println("Element: " + queue.element());

        // 5. poll() - first element remove karta hai
        System.out.println("Removed: " + queue.poll());

        System.out.println("After poll(): " + queue);

        // 6. remove() - first element remove karta hai
        System.out.println("Removed: " + queue.remove());

        System.out.println("After remove(): " + queue);

        // 7. contains() - element present hai ya nahi
        System.out.println("Contains 30: " + queue.contains(30));

        // 8. size() - queue ka size
        System.out.println("Size: " + queue.size());

        // 9. isEmpty() - queue empty hai ya nahi
        System.out.println("Is Empty: " + queue.isEmpty());

        // 10. clear() - queue ke saare elements remove
        queue.clear();

        System.out.println("After clear(): " + queue);

        System.out.println("Is Empty: " + queue.isEmpty());
    }
}