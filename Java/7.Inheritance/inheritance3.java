//Call an overridden method with super class reference to B and C class’s objects


public class inheritance3 {
    public static void main(String[] args) {
        // Superclass reference to subclass B object
        A ref1 = new B();
        System.out.println("Calling overridden method using superclass reference to B:");
        ref1.display();  // Calls display() from class B

        System.out.println();

        // Superclass reference to subclass C object
        A ref2 = new C();
        System.out.println("Calling overridden method using superclass reference to C:");
        ref2.display();  // Calls display() from class C
    }
}
