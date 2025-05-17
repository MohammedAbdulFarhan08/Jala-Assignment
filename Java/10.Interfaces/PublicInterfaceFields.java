/*8. Create a PUBLIC interface with fields and methods, fields should have values assigned.
Implement this interface to some class and print the values of the interface fields and
call the interface methods */

public interface Constants {
    int VALUE = 100;
    void showValue();
}

public class PublicInterfaceFields implements Constants {
    public void showValue() {
        System.out.println("Value = " + VALUE);
    }

    public static void main(String[] args) {
        PublicInterfaceFields obj = new PublicInterfaceFields();
        obj.showValue();
    }
}
