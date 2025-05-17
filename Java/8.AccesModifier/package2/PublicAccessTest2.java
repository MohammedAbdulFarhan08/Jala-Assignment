package package2;

import package1.PublicClass;

// Class in a different package accessing public members of PublicClass
public class PublicAccessTest2 {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        System.out.println("Accessing public field from PublicClass: " + obj.publicValue);
        obj.publicDisplay();
    }
}
