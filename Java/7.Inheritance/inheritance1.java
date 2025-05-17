/*A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B.
Create three methods in each class, 2 methods are specific to each class and third
method (override method) should be in all three Classes A, B and C */


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

// Main class to test
public class inheritance1 {
    public static void main(String[] args) {
        C obj = new C();

        // Methods from class A
        obj.methodA1();
        obj.methodA2();

        // Methods from class B
        obj.methodB1();
        obj.methodB2();

        // Methods from class C
        obj.methodC1();
        obj.methodC2();

        // Overridden method
        obj.display();  // Will call display() from class C
    }
}


