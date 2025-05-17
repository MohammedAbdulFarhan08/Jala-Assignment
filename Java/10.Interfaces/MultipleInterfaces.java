/*4. Create two interfaces with one method each. Implement these two interfaces in one
class.  */

interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class MultipleInterfaces implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }

    public static void main(String[] args) {
        MultipleInterfaces obj = new MultipleInterfaces();
        obj.print();
        obj.show();
    }
}
