package Basics;
import java.util.Arrays;
public class ArrayExample{
    public static void main(String[] args) {
        // 1. Creating an array
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Accessing elements
        System.out.println("First element: " + numbers[0]); // Accessing first element

        // 3. Modifying elements
        numbers[2] = 99; // Changing the third element
        System.out.println("Modified third element: " + numbers[2]);
        System.out.println("After modification: "+ Arrays.toString(numbers));

        // 4. Finding array length
        System.out.println("Array length: " + numbers.length);

        // 5. Iterating through the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Using enhanced for-loop (alternative way to iterate)
        System.out.println("Using enhanced for-loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

