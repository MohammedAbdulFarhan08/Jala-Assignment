/*1. Create a class with PRIVATE fields, private method and a main method. Print the fields
in main method. Call the private method in main method.
Create a sub class and try to access the private fields and methods from sub class. */

// Superclass A
class A {
    private int value = 10;  // Private field
    private void display() {  // Private method
        System.out.println("This is a private method in A.");
    }

    // Public method to access private field
    public int getValue() {
        return value;
    }

    // Public method to access private method
    public void callDisplay() {
        display();
    }
}

// Subclass B
class B extends A {
    // Trying to access private fields and methods from A
    void tryAccess() {
        // System.out.println("Accessing private field: " + value); // Error: Cannot access private field
        // display();  // Error: Cannot access private method

        // Accessing private fields and methods through public methods of class A
        System.out.println("Accessing private field through public getter: " + getValue());
        callDisplay();  // Calling private method through public method
    }
}

public class first {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println("Accessing private field via getter in A: " + objA.getValue());
        objA.callDisplay();

        System.out.println();

        B objB = new B();
        objB.tryAccess();  // Trying to access private fields and methods in subclass
    }
}

