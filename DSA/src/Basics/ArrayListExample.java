package Basics;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        // 3. Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // 4. Modifying elements
        fruits.set(1, "Blueberry"); // Replacing "Banana" with "Blueberry"
        System.out.println("Modified second fruit: " + fruits.get(1));

        // 5. Finding size of the ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());

        // 6. Removing an element
        fruits.remove(2); // Removes "Cherry"
        System.out.println("After removing third element: " + fruits);

        // 7. Iterating through the ArrayList (using for loop)
        System.out.println("Iterating using for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Element at index " + i + ": " + fruits.get(i));
        }

        // Using enhanced for-loop (alternative way)
        System.out.println("Using enhanced for-loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Using forEach with lambda expression (Java 8+)
        System.out.println("Using forEach with lambda:");
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}
