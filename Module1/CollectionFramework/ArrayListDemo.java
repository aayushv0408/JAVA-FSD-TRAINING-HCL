
package CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 10 elements:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = sc.nextInt();
            list.add(value);
        }

        System.out.println("\nOriginal ArrayList: " + list);

        System.out.print("\nEnter first index to update (0-9): ");
        int index1 = sc.nextInt();

        System.out.print("Enter new value: ");
        int value1 = sc.nextInt();

        System.out.print("Enter second index to update (0-9): ");
        int index2 = sc.nextInt();

        System.out.print("Enter new value: ");
        int value2 = sc.nextInt();

        list.set(index1, value1);
        list.set(index2, value2);

        System.out.println("\nUpdated element at index " + index1 + ": " + list.get(index1));
        System.out.println("Updated element at index " + index2 + ": " + list.get(index2));

        System.out.println("\nUpdated ArrayList: " + list);

        sc.close();
    }
}


