// Abstract class with abstract and non-abstract methods
abstract class Animal {
    // Abstract method (to be implemented by the subclass)
    abstract void sound();

    // Non-abstract method (with implementation)
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Subclass of Animal
public class Dog extends Animal {
    
    // Implementing the abstract method
    public void sound() {
        System.out.println("Dog barks.");
    }

    public static void main(String[] args) {
        // Creating an object of Dog (which is a subclass of Animal)
        Dog dog = new Dog();
        
        // Accessing non-abstract method 'sleep' from Animal class
        dog.sleep();  // Output: This animal is sleeping.
        
        // Accessing the abstract method 'sound' implemented in Dog class
        dog.sound();  // Output: Dog barks.
    }
}
