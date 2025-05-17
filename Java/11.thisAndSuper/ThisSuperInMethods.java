//6. Use this() and super() in methods not in constructors

class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

public class ThisSuperInMethods extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }

    void callMethods() {
        this.makeSound();   // Calls current class method
        super.makeSound();  // Calls parent class method
    }

    public static void main(String[] args) {
        new ThisSuperInMethods().callMethods();
    }
}
