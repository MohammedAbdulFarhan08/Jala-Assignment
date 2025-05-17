//4. Write constructors with return type int and String


public class ConstructorWithReturnType {

    // This is not a constructor, it's a method because it has a return type
    int ConstructorWithReturnType() {
        System.out.println("This is NOT a constructor — return type makes it a method");
        return 1;
    }

    String ConstructorWithReturnType(String msg) {
        System.out.println("This is also a method, not a constructor: " + msg);
        return msg;
    }

    // Actual constructor
    ConstructorWithReturnType() {
        System.out.println("Real constructor — no return type");
    }

    public static void main(String[] args) {
        ConstructorWithReturnType obj = new ConstructorWithReturnType();
        obj.ConstructorWithReturnType();
        obj.ConstructorWithReturnType("Hello");
    }
}
