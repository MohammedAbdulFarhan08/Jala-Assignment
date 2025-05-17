/*5. Create two interfaces with the same method (same signature) in both the interfaces.
Implement these two interfaces in one class. Call the method. */

interface A {
    void display();
}

interface B {
    void display();
}

public class SameMethodInterface implements A, B {
    public void display() {
        System.out.println("Display from both interfaces.");
    }

    public static void main(String[] args) {
        SameMethodInterface obj = new SameMethodInterface();
        obj.display();
    }
}
