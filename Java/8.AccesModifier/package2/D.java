package package2;

import package1.A;

// Class D in package2 (Non-subclass of A, trying to access protected members)
public class D {
    public static void main(String[] args) {
        // Trying to access protected members of class A
        A objA = new A();

        // The following lines will cause compilation errors because protected members
        // are not accessible from a non-subclass in a different package:
        // System.out.println("Accessing protected field from A: " + objA.value); // Error: value has protected access in A
        // objA.display(); // Error: display() has protected access in A

        // These lines are commented out to fix compilation errors.
    }
}
