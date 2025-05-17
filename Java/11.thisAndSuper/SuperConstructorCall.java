//5. Call constructor of the parent class using super()


class Base {
    Base() {
        System.out.println("Parent constructor called");
    }
}

public class SuperConstructorCall extends Base {
    SuperConstructorCall() {
        super(); // Calls parent class constructor
        System.out.println("Child constructor called");
    }

    public static void main(String[] args) {
        new SuperConstructorCall();
    }
}
