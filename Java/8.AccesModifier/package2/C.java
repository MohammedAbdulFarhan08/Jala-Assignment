package package2;

import package1.A;

// Class C in package2 (Different package, subclass of A) accessing protected members
public class C extends A {
    // Constructor of class C
    public C() {
        // Accessing protected members of A through subclass C
        System.out.println("In subclass C (package2) - Constructor:");
        System.out.println("Accessing protected field from A: " + this.value);
        this.display();  // Calling protected method from A
    }
}
