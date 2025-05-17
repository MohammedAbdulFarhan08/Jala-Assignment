//4. Create an instance for the child class in child class and call non-abstract methods


// Abstract base class
abstract class Animal {
    // Abstract method
    abstract void sound();

    // Non-abstract method
    String info() {
        return "This is an animal.";
    }
}

// Child class
class Dog extends Animal {
    // Implementing the abstract method
    @Override
    void sound() {
        System.out.println("Bark");
    }

    // Method to create an instance of Dog and call non-abstract methods
    void createInstance() {
        // Create an instance of Dog within Dog class
        Dog dogInstance = new Dog();
        // Call non-abstract method
        System.out.println(dogInstance.info());
        // Call the overridden abstract method
        dogInstance.sound();
    }
}

// Main class to run the program
public class Main1 {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog();
        dog.createInstance();
    }
}
