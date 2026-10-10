package CollectionFramework;

import java.util.LinkedList;

public class LinkedListMethods {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("LinkedList: " + list);

        list.add(2, 25);
        System.out.println("After add(index, element): " + list);

        list.addFirst(5);
        System.out.println("After addFirst(): " + list);

        list.addLast(50);
        System.out.println("After addLast(): " + list);

        
        System.out.println("Element at index 2: " + list.get(2));

        System.out.println("First element: " + list.getFirst());

        System.out.println("Last element: " + list.getLast());

        list.set(2, 35);
        System.out.println("After set(): " + list);

        System.out.println("Size: " + list.size());

        // 10. contains()
        System.out.println("Contains 30: " + list.contains(30));
        System.out.println("Contains 100: " + list.contains(100));

        // 11. indexOf()
        System.out.println("Index of 30: " + list.indexOf(30));

        // 12. lastIndexOf()
        list.add(30);
        System.out.println("Last index of 30: " + list.lastIndexOf(30));

        // 13. remove(index)
        list.remove(2);
        System.out.println("After remove(index): " + list);

        // 14. remove(object)
        list.remove(Integer.valueOf(20));
        System.out.println("After remove(object): " + list);

        // 15. removeFirst()
        list.removeFirst();
        System.out.println("After removeFirst(): " + list);

        // 16. removeLast()
        list.removeLast();
        System.out.println("After removeLast(): " + list);

        // 17. peek()
        System.out.println("Peek: " + list.peek());

        // 18. peekFirst()
        System.out.println("Peek First: " + list.peekFirst());

        // 19. peekLast()
        System.out.println("Peek Last: " + list.peekLast());

        // 20. element()
        System.out.println("Element: " + list.element());

        // 21. poll()
        System.out.println("Poll: " + list.poll());
        System.out.println("After poll(): " + list);

        // 22. pollFirst()
        System.out.println("Poll First: " + list.pollFirst());
        System.out.println("After pollFirst(): " + list);

        // 23. pollLast()
        System.out.println("Poll Last: " + list.pollLast());
        System.out.println("After pollLast(): " + list);

        // Add some elements again
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // 24. push()
        list.push(5);
        System.out.println("After push(): " + list);

        // 25. pop()
        System.out.println("Pop: " + list.pop());
        System.out.println("After pop(): " + list);

        // 26. isEmpty()
        System.out.println("Is Empty: " + list.isEmpty());

        // 27. equals()
        LinkedList<Integer> list2 = new LinkedList<>();

        list2.addAll(list);

        System.out.println("List 1: " + list);
        System.out.println("List 2: " + list2);
        System.out.println("Are lists equal: " + list.equals(list2));

        // 28. addAll()
        LinkedList<Integer> list3 = new LinkedList<>();

        list3.add(100);
        list3.add(200);

        list.addAll(list3);
        System.out.println("After addAll(): " + list);

        // 29. containsAll()
        System.out.println("Contains all list3: " +
                list.containsAll(list3));

        // 30. removeAll()
        list.removeAll(list3);
        System.out.println("After removeAll(): " + list);

        // 31. retainAll()
        LinkedList<Integer> list4 = new LinkedList<>();

        list4.add(10);
        list4.add(30);

        list.retainAll(list4);
        System.out.println("After retainAll(): " + list);

        // 32. clear()
        list.clear();
        System.out.println("After clear(): " + list);

        // 33. isEmpty() after clear
        System.out.println("Is Empty after clear: " + list.isEmpty());
    }
}