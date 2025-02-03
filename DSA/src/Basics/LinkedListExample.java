package Basics;
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        // 1. Creating a LinkedList
        LinkedList<String> cities = new LinkedList<>();

        // 2. Adding elements
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");

        // Display LinkedList
        System.out.println("LinkedList: " + cities);

        // 3. Accessing elements
        System.out.println("First city: " + cities.get(0));
        System.out.println("Second city: " + cities.get(1));

        // 4. Modifying elements
        cities.set(1, "Berlin"); // Changing "London" to "Berlin"
        System.out.println("Modified LinkedList: " + cities);

        // 5. Removing elements
        cities.remove(2); // Removes "Paris"
        System.out.println("After removing third element: " + cities);

        // Removing by value
        cities.remove("Tokyo"); // Removes "Tokyo"
        System.out.println("After removing 'Tokyo': " + cities);
    }
}