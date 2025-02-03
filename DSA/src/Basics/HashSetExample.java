package Basics;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // 1. Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");  // Duplicate, will not be added
        System.out.println("HashSet: " + set);

        // 2. Checking if an element exists
        System.out.println("Contains 'Banana'? " + set.contains("Banana"));

        // 3. Removing an element
        set.remove("Cherry");
        System.out.println("After removing 'Cherry': " + set);

        // 4. Finding size
        System.out.println("Size of HashSet: " + set.size());

        // 5. Checking if empty
        System.out.println("Is HashSet empty? " + set.isEmpty());

        // 6. Iterating through HashSet
        System.out.println("Iterating through HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // 7. Clearing all elements
        set.clear();
        System.out.println("HashSet after clear: " + set);
    }
}