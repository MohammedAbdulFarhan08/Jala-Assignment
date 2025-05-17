// Abstract parent class
abstract class Animal {
    // Abstract method
    abstract void makeSound();
}

// Child class extending abstract class
public class instances extends Animal {

    // Implementation of abstract method
    @Override
    void makeSound() {
        System.out.println("Dog barks!");
    }

    // main method inside child class
    public static void main(String[] args) {
        // Creating instance of child class
        instances dog = new instances();

        // Calling the abstract method (implemented in child class)
        dog.makeSound();
    }
}
