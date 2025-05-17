/*3. Create a HashSet with at least 10 elements of type String
Write program covering all the operations of HashSet */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetOperations {
    public static void main(String[] args) {
        // Create a HashSet with at least 10 elements
        HashSet<String> cities = new HashSet<>();
        cities.add("New York");
        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Nizamabad");
        cities.add("Paris");
        cities.add("Berlin");
        cities.add("Toronto");
        cities.add("Dubai");
        cities.add("Mumbai");
        cities.add("Singapore");

        // Add a new element
        cities.add("Los Angeles");
        System.out.println("After adding Los Angeles: " + cities);

        // Check size of HashSet
        System.out.println("Size of HashSet: " + cities.size());

        // Check if a specific element exists
        System.out.println("Does the set contain 'Paris'? " + cities.contains("Paris"));

        // Remove an element
        cities.remove("Tokyo");
        System.out.println("After removing Tokyo: " + cities);

        // Iterate using enhanced for loop
        System.out.println("Iterating using for-each loop:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Clone the HashSet
        HashSet<String> clonedSet = new HashSet<>(cities);
        System.out.println("Cloned HashSet: " + clonedSet);

        // Check if HashSet is empty
        System.out.println("Is HashSet empty? " + cities.isEmpty());

        // Clear the HashSet
        cities.clear();
        System.out.println("After clearing all elements: " + cities);

        // Verify if it's empty after clearing
        System.out.println("Is HashSet empty now? " + cities.isEmpty());
    }
}
