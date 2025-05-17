/*1. Create an interface with only one method and implement it in a class. Call the method
implemented. */

interface Greetable {
    void greet();
}

public class InterfaceOneMethod implements Greetable {
    public void greet() {
        System.out.println("Hello from InterfaceOneMethod!");
    }

    public static void main(String[] args) {
        InterfaceOneMethod obj = new InterfaceOneMethod();
        obj.greet();
    }
}
