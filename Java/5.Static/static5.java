//5. Call static methods in instance methods

public class static5 {

    // Static method
    public static void sayHello() {
        System.out.println("Hello from static method!");
    }

    // Instance method
    public void callStatic() {
        // Direct call to static method
        sayHello();
    }

    public static void main(String[] args) {
        static5 obj = new static5();
        obj.callStatic();
    }
}


