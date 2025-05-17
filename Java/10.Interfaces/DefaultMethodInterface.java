/*6. Create an interface with a default method and implement it in a class. Do not provide
implementation to the default method and call the method. */


interface Vehicle {
    default void start() {
        System.out.println("Vehicle started (default).");
    }
}

public class DefaultMethodInterface implements Vehicle {
    public static void main(String[] args) {
        DefaultMethodInterface car = new DefaultMethodInterface();
        car.start();
    }
}
