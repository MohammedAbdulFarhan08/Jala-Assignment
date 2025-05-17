package package1;

import package2.C;

// Class B in the same package (package1) accessing protected members
class B {
    public static void main(String[] args) {
        // Accessing protected fields and methods in the same package
        A objA = new A();
        System.out.println("In package1 (Same Package) - Accessing protected field from A: " + objA.value);
        objA.display();  // Calling protected method from A

        System.out.println("\n=====================\n");

        // Accessing protected members from a subclass in a different package (package2)
        C objC = new C();
        System.out.println("In package2 (Subclass of A) - Accessing protected field from A through subclass C: " + objC.value);
        objC.display();  // Calling protected method from A through subclass C
    }
}
