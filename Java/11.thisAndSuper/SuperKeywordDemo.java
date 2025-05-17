//2. Print the fields/instance members of the parent class using super

class Parent {
    int a = 20;
}

public class SuperKeywordDemo extends Parent {
    int a = 10;

    void printParentValue() {
        System.out.println("Value of a from parent class: " + super.a);
    }

    public static void main(String[] args) {
        new SuperKeywordDemo().printParentValue();
    }
}
