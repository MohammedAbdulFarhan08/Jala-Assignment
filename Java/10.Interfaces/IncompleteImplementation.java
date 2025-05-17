/*2. Create an interface with two methods, but implement only one in a class. Call the
method implemented.
 */

 
interface Actions {
    void run();
    void walk();
}

// Abstract class because only one method is implemented
abstract class IncompleteImplWithMain implements Actions {
    public void run() {
        System.out.println("Running...");
    }

    public static void main(String[] args) {
        // Anonymous class to provide missing method 'walk'
        IncompleteImplWithMain obj = new IncompleteImplWithMain() {
            public void walk() {
                System.out.println("Walking...");
            }
        };

        obj.run();   // from abstract class
        obj.walk();  // from anonymous class
    }
}
