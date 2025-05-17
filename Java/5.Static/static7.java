//7. Call static methods and instance methods in main method

public class static7 {

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method!");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method!");
    }

    public static void main(String[] args) {
        // Call the static method directly from main
        staticMethod();

        // Create an object to call the instance method
        static7 obj = new static7();
        obj.instanceMethod();
    }
}


