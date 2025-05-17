//5. Try to call the constructor multiple times with the same object

public class ConstructorMultipleCall {
    ConstructorMultipleCall() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        ConstructorMultipleCall obj = new ConstructorMultipleCall(); 

        new ConstructorMultipleCall();
        new ConstructorMultipleCall();
    }
}
