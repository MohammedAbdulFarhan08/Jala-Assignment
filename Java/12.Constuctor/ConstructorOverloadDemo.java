/*1. Write a class with a default constructor, one argument constructor and two argument
constructors. Instantiate the class to call all the constructors of that class from a main
class */

public class ConstructorOverloadDemo {
    ConstructorOverloadDemo() {
        System.out.println("Default constructor");
    }

    ConstructorOverloadDemo(int a) {
        System.out.println("One-arg constructor: a = " + a);
    }

    ConstructorOverloadDemo(int a, int b) {
        System.out.println("Two-arg constructor: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        new ConstructorOverloadDemo();
        new ConstructorOverloadDemo(10);
        new ConstructorOverloadDemo(10, 20);
    }
}
