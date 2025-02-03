package Basics;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // 1. Adding elements
        treeMap.put(101, "Apple");
        treeMap.put(102, "Banana");
        treeMap.put(103, "Cherry");
        treeMap.put(104, "Dates");
        System.out.println("TreeMap: " + treeMap);

        // 2. Retrieving a value
        System.out.println("Value for key 102: " + treeMap.get(102));

        // 3. Checking if a key exists
        System.out.println("Contains key 103? " + treeMap.containsKey(103));

        // 4. Removing an element
        treeMap.remove(102);
        System.out.println("After removing key 102: " + treeMap);

        // 5. Finding the size
        System.out.println("Size of TreeMap: " + treeMap.size());

        // 6. Getting all keys
        Set<Integer> keys = treeMap.keySet();
        System.out.println("Keys: " + keys);

        // 7. Getting all values
        Collection<String> values = treeMap.values();
        System.out.println("Values: " + values);

        // 8. Getting all key-value pairs
        Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();
        System.out.println("Key-Value pairs:");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}