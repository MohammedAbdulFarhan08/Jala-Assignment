/*2. Call the constructors(both default and argument constructors) of super class from a child
class */

class Parent {
    Parent() {
        System.out.println("Parent default constructor");
    }

    Parent(String msg) {
        System.out.println("Parent argument constructor: " + msg);
    }
}

public class SuperConstructorCallDemo extends Parent {
    SuperConstructorCallDemo() {
        super(); // Call default constructor
        System.out.println("Child default constructor");
    }

    SuperConstructorCallDemo(String msg) {
        super(msg); // Call argument constructor
        System.out.println("Child argument constructor: " + msg);
    }

    public static void main(String[] args) {
        new SuperConstructorCallDemo();
        new SuperConstructorCallDemo("Hello");
    }
}
