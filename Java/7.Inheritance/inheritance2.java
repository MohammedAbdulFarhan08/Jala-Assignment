/*Create a class with main method. Create an object for each class A, B and C in main
method and call every method of each class using its own object/instance.*/

// Superclass A
class A {
    void methodA1() {
        System.out.println("Method A1: Specific to class A");
    }

    void methodA2() {
        System.out.println("Method A2: Specific to class A");
    }

    void display() {
        System.out.println("Display from class A");
    }
}

// Subclass B of A
class B extends A {
    void methodB1() {
        System.out.println("Method B1: Specific to class B");
    }

    void methodB2() {
        System.out.println("Method B2: Specific to class B");
    }

    @Override
    void display() {
        System.out.println("Display from class B");
    }
}

// Subclass C of B
class C extends B {
    void methodC1() {
        System.out.println("Method C1: Specific to class C");
    }

    void methodC2() {
        System.out.println("Method C2: Specific to class C");
    }

    @Override
    void display() {
        System.out.println("Display from class C");
    }
}

// Main class with main() method
public class inheritance2 {
    public static void main(String[] args) {
        // Object of class A
        A objA = new A();
        System.out.println("Calling methods using object of class A:");
        objA.methodA1();
        objA.methodA2();
        objA.display();

        System.out.println();

        // Object of class B
        B objB = new B();
        System.out.println("Calling methods using object of class B:");
        objB.methodA1();  // Inherited from A
        objB.methodA2();  // Inherited from A
        objB.methodB1();
        objB.methodB2();
        objB.display();   // Overridden in B

        System.out.println();

        // Object of class C
        C objC = new C();
        System.out.println("Calling methods using object of class C:");
        objC.methodA1();  // Inherited from A
        objC.methodA2();  // Inherited from A
        objC.methodB1();  // Inherited from B
        objC.methodB2();  // Inherited from B
        objC.methodC1();
        objC.methodC2();
        objC.display();   // Overridden in C
    }
}
