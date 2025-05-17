//3. Call constructor of the current class using this()

public class ThisConstructorCall {
    ThisConstructorCall() {
        this(100); // Calling parameterized constructor
        System.out.println("Default constructor called");
    }

    ThisConstructorCall(int x) {
        System.out.println("Parameterized constructor called with x = " + x);
    }

    public static void main(String[] args) {
        new ThisConstructorCall(); // Calls default, which then calls parameterized
    }
}
