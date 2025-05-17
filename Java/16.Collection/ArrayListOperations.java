/*1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to
ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create an ArrayList of Strings and add 10 elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grapes");
        fruits.add("Honeydew");
        fruits.add("Kiwi");
        fruits.add("Lemon");

        // Add an element to the ArrayList
        fruits.add("Mango");
        System.out.println("After adding Mango: " + fruits);

        // Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add an element at a specific index
        fruits.add(2, "Blackberry");
        System.out.println("After adding Blackberry at index 2: " + fruits);

        // Remove an element (by object)
        fruits.remove("Fig");
        System.out.println("After removing 'Fig': " + fruits);

        // Remove an element at an index
        fruits.remove(5);
        System.out.println("After removing element at index 5: " + fruits);

        // Update an element at a specific index
        fruits.set(3, "Guava");
        System.out.println("After updating index 3 to 'Guava': " + fruits);

        // Check element at a particular index
        String elementAt4 = fruits.get(4);
        System.out.println("Element at index 4: " + elementAt4);

        // Find the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);

        // Check if a specific element is in the ArrayList
        boolean containsMango = fruits.contains("Mango");
        System.out.println("Does the list contain 'Mango'? " + containsMango);

        // Remove all elements
        fruits.clear();
        System.out.println("After clearing all elements: " + fruits);
    }
}
