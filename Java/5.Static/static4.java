//4. Call instance methods in static methods

public class static4 {

    // Instance method
    public void greetUser() {
        System.out.println("Hello from an instance method!");
    }

    // Static method
    public static void callInstanceMethod() {
        // Create an object
        static4 obj = new static4();
        
        // Call instance method using object
        obj.greetUser();
    }

    public static void main(String[] args) {
        // Call static method
        callInstanceMethod();
    }
}


