/*2. Write two methods with the same name but different number of parameters of different
data type and call the methods from main method
 */

public class MethodOverloadDiffType {
    void show(int a) {
        System.out.println("int value: " + a);
    }

    void show(int a, double b) {
        System.out.println("int and double: " + a + ", " + b);
    }

    public static void main(String[] args) {
        MethodOverloadDiffType obj = new MethodOverloadDiffType();
        obj.show(5);
        obj.show(5, 3.14);
    }
}
