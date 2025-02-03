package Basics;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 1. Put (Adding elements)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("HashMap: " + map);

        // 2. Get (Retrieve value using key)
        System.out.println("Value for key 2: " + map.get(2));

        // 3. Contains Key
        System.out.println("Contains key 3? " + map.containsKey(3));

        // 4. Contains Value
        System.out.println("Contains value 'Grapes'? " + map.containsValue("Grapes"));

        // 5. Remove (Deleting an entry)
        map.remove(2);
        System.out.println("After removing key 2: " + map);

        // 6. Size of HashMap
        System.out.println("Size of HashMap: " + map.size());

        // 7. Check if HashMap is empty
        System.out.println("Is HashMap empty? " + map.isEmpty());

        // 8. KeySet (Retrieve all keys)
        Set<Integer> keys = map.keySet();
        System.out.println("Keys: " + keys);

        // 9. Values (Retrieve all values)
        Collection<String> values = map.values();
        System.out.println("Values: " + values);

        // 10. Clear (Remove all elements)
        map.clear();
        System.out.println("HashMap after clear: " + map);
    }
}