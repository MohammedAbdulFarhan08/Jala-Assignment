/* 1. How to create a class, object, method and its signature

Ans: To create a class, object, method, and understand its signature in Java, you start by defining a class using the class keyword.
Inside the class, you can define attributes (variables) and methods (functions). Creating an object involves using the new keyword with the class name.
Methods are defined within the class and have a signature that includes the return type, name, and parameters.
*/

/* 1. Creating a Class:
A class is a blueprint for creating objects. It defines fields (variables) and methods (functions). */
class Car {
    // Fields (attributes)
    String color;
    int speed;

    // Method (behavior)
    void drive() {
        System.out.println("The car is driving.");
    }
}

/* 2. Creating an Object:
An object is an instance of a class. You create it using the new keyword. */
public class first {
    public static void main(String[] args) {
        Car myCar = new Car(); // Object creation
        myCar.color = "Red";
        myCar.speed = 100;

        myCar.drive(); // Calling method

        // Optional: Print object attributes
        System.out.println("Color: " + myCar.color);
        System.out.println("Speed: " + myCar.speed);
    }
}

/* 3. Creating a Method:
A method is a block of code that performs an action. It can take parameters and return a value. */
class Calculator {
    // Method with parameters and return value
    int add(int a, int b) {
        return a + b;
    }
}

/* 4. Understanding Method Signature:
The method signature consists of:
i) Method name
ii) Parameter types and order (not return type or parameter names) */
