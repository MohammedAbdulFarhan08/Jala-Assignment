/*2. Create a class with DEFAULT fields and methods. Access these fields and methods
from any other class in the same package*/

// Class A (in the same package)
class A {
    // Default field (package-private)
    int value = 10;

    // Default method (package-private)
    void display() {
        System.out.println("This is a default method in A.");
    }
}

// Class B (in the same package, accessing Class A's default fields and methods)
public class Second {
    public static void main(String[] args) {
        // Create an object of class A
        A objA = new A();
        
        // Accessing default field and method of class A
        System.out.println("Accessing default field from A: " + objA.value);
        objA.display();  // Calling default method from A
    }
}

