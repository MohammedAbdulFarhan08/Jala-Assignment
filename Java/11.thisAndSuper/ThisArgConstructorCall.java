//4. Call argument constructor of current class using this()


public class ThisArgConstructorCall {
    ThisArgConstructorCall() {
        this(50); // Calling constructor with argument
        System.out.println("No-arg constructor");
    }

    ThisArgConstructorCall(int n) {
        System.out.println("Argument constructor: " + n);
    }

    public static void main(String[] args) {
        new ThisArgConstructorCall();
    }
}
