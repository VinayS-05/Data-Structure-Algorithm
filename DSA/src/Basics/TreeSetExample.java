package Basics;
import java.util.TreeSet;
public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 1. Adding elements
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        System.out.println("TreeSet: " + treeSet);

        // 2. Removing an element
        treeSet.remove(20);
        System.out.println("After removing 20: " + treeSet);

        // 3. Checking if an element exists
        System.out.println("Contains 30? " + treeSet.contains(30));

        // 4. Finding the size
        System.out.println("Size of TreeSet: " + treeSet.size());

        // 5. Getting the first (smallest) element
        System.out.println("First element: " + treeSet.first());

        // 6. Getting the last (largest) element
        System.out.println("Last element: " + treeSet.last());

        // 7. Finding the next higher element
        System.out.println("Higher than 10: " + treeSet.higher(10));

        // 8. Finding the next lower element
        System.out.println("Lower than 30: " + treeSet.lower(30));
    }
}