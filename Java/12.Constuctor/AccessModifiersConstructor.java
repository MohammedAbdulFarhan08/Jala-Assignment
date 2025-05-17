//3. Apply private, public, protected and default access modifiers to the constructor


public class AccessModifiersConstructor {
    private AccessModifiersConstructor() {
        System.out.println("Private constructor");
    }

    public AccessModifiersConstructor(int a) {
        System.out.println("Public constructor: " + a);
    }

    protected AccessModifiersConstructor(String msg) {
        System.out.println("Protected constructor: " + msg);
    }

    AccessModifiersConstructor(double d) {
        System.out.println("Default (package-private) constructor: " + d);
    }

    public static void main(String[] args) {
        new AccessModifiersConstructor();         // private — allowed inside same class
        new AccessModifiersConstructor(10);       // public
        new AccessModifiersConstructor("Hi");     // protected
        new AccessModifiersConstructor(3.14);     // default
    }
}
