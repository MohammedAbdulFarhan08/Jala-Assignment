//7. Create an interface and inherit it from the other interface

interface Base {
    void baseMethod();
}

interface Derived extends Base {
    void derivedMethod();
}

public class InterfaceInheritance implements Derived {
    public void baseMethod() {
        System.out.println("Base method");
    }

    public void derivedMethod() {
        System.out.println("Derived method");
    }

    public static void main(String[] args) {
        InterfaceInheritance obj = new InterfaceInheritance();
        obj.baseMethod();
        obj.derivedMethod();
    }
}
