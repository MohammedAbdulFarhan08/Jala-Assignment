/*2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {
    public static void main(String[] args) {
        // Create a HashMap with 10 key-value pairs
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Farhan");
        students.put(102, "Ayan");
        students.put(103, "Marco");
        students.put(104, "David");
        students.put(105, "Ziyan");
        students.put(106, "Rayyan");
        students.put(107, "Arhan");
        students.put(108, "Helen");
        students.put(109, "Ivy");
        students.put(110, "Jack");

        // Insert a new key-value mapping
        students.put(111, "Karen");
        System.out.println("After inserting (111, Karen): " + students);

        // Fetch the value of a key
        String name = students.get(103);
        System.out.println("Value for key 103: " + name);

        // Create a clone/copy of the HashMap
        HashMap<Integer, String> studentCopy = new HashMap<>(students);
        System.out.println("Copied HashMap: " + studentCopy);

        // Check if a specific key is in the map
        boolean hasKey = students.containsKey(104);
        System.out.println("Does key 104 exist? " + hasKey);

        // Check if a specific value is in the map
        boolean hasValue = students.containsValue("Eve");
        System.out.println("Does value 'Eve' exist? " + hasValue);

        // Check if the map is empty
        boolean isEmpty = students.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        // Print the size of the map
        int size = students.size();
        System.out.println("Size of the map: " + size);

        // Print all keys of the map
        System.out.println("Keys in the map:");
        for (Integer key : students.keySet()) {
            System.out.println(key);
        }

        // Print all values of the map
        System.out.println("Values in the map:");
        for (String value : students.values()) {
            System.out.println(value);
        }

        // Remove a specific key-value pair
        students.remove(108);
        System.out.println("After removing key 108: " + students);

        // Copy all elements to another map
        HashMap<Integer, String> studentBackup = new HashMap<>();
        studentBackup.putAll(students);
        System.out.println("Backup map: " + studentBackup);
    }
}
