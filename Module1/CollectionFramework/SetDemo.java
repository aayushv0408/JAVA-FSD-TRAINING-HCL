
package CollectionFramework;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        // 1. Creating HashSet
        Set<Integer> set = new HashSet<>();

        // 2. add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(20);  // Duplicate element

        System.out.println("HashSet: " + set);

        // 3. size()
        System.out.println("Size: " + set.size());

        // 4. contains()
        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Contains 50: " + set.contains(50));

        // 5. remove()
        set.remove(30);
        System.out.println("After remove(): " + set);

        // 6. isEmpty()
        System.out.println("Is Empty: " + set.isEmpty());

        // 7. Iterating Set
        System.out.println("Elements:");
        for (int x : set) {
            System.out.println(x);
        }

        // 8. addAll()
        Set<Integer> set2 = new HashSet<>();
        set2.add(40);
        set2.add(50);
        set2.add(60);

        set.addAll(set2);
        System.out.println("After addAll(): " + set);

        // 9. containsAll()
        System.out.println("Contains all set2: "
                + set.containsAll(set2));

        // 10. equals()
        Set<Integer> set3 = new HashSet<>(set);
        System.out.println("Sets equal: " + set.equals(set3));

        // 11. retainAll() - common elements
        set.retainAll(set2);
        System.out.println("After retainAll(): " + set);

        // 12. removeAll()
        set.removeAll(set2);
        System.out.println("After removeAll(): " + set);

        // 13. clear()
        set.clear();
        System.out.println("After clear(): " + set);

        // 14. isEmpty() after clear
        System.out.println("Is Empty now: " + set.isEmpty());

        // 15. LinkedHashSet
        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(30);
        linkedSet.add(10);
        linkedSet.add(20);
        linkedSet.add(10);

        System.out.println("LinkedHashSet: " + linkedSet);

        // 16. TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(10);

        System.out.println("TreeSet: " + treeSet);
    }
}
