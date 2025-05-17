package package1;

// Class in the same package accessing public members of PublicClass
public class PublicAccessTest {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        System.out.println("Accessing public field from PublicClass: " + obj.publicValue);
        obj.publicDisplay();
    }
}
