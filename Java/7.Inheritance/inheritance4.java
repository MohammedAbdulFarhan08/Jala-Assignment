/*Runtime Polymorphism with Data Members/Instance variables, Repeat the above
process only for data members */

// Superclass A
class A {
    int value = 10;
}

// Subclass B
class B extends A {
    int value = 20;  // Hides A's value
}

// Subclass C
class C extends B {
    int value = 30;  // Hides B's value
}

// Main class
public class inheritance4 {
    public static void main(String[] args) {
        // Superclass reference to subclass B object
        A ref1 = new B();
        System.out.println("Using superclass reference to B object:");
        System.out.println("Accessing value: " + ref1.value);  // Output: 10

        System.out.println();

        // Superclass reference to subclass C object
        A ref2 = new C();
        System.out.println("Using superclass reference to C object:");
        System.out.println("Accessing value: " + ref2.value);  // Output: 10

        System.out.println();

        // Accessing through actual objects to see real values
        B bObj = new B();
        C cObj = new C();
        System.out.println("Accessing B object value directly: " + bObj.value);  // Output: 20
        System.out.println("Accessing C object value directly: " + cObj.value);  // Output: 30
    }
}
