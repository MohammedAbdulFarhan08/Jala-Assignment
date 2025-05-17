/*1. Write two methods with the same name but different number of parameters of same type
and call the methods from main method */

public class MethodOverloadSameType {
    void display(int a) {
        System.out.println("One int: " + a);
    }

    void display(int a, int b) {
        System.out.println("Two ints: " + a + ", " + b);
    }

    public static void main(String[] args) {
        MethodOverloadSameType obj = new MethodOverloadSameType();
        obj.display(10);
        obj.display(10, 20);
    }
}
