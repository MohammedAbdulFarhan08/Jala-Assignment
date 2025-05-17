//1. Create an abstract class with abstract and non-abstract methods.
// Abstract class with both abstract and non-abstract methods
abstract class Animal {

    // Abstract method (no body, must be implemented by subclasses)
    abstract void sound();

    // Non-abstract method (with body)
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Subclass of Animal that implements the abstract method
class Dog extends Animal {

    // Providing implementation for the abstract method
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Another subclass of Animal that implements the abstract method
class Cat extends Animal {

    // Providing implementation for the abstract method
    void sound() {
        System.out.println("Cat meows.");
    }
}

// Main class to test the abstract class
public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat (which are concrete classes)
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling implemented methods
        dog.sound();  // Output: Dog barks.
        dog.sleep();  // Output: This animal is sleeping.

        cat.sound();  // Output: Cat meows.
        cat.sleep();  // Output: This animal is sleeping.
    }
}


