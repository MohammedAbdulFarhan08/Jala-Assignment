/*4. Write two methods with the same name and same number of parameters of different
type and call from main method */

public class MethodOverloadDiffParamType {
    void greet(String name) {
        System.out.println("Hello, " + name);
    }

    void greet(int id) {
        System.out.println("Hello, user #" + id);
    }

    public static void main(String[] args) {
        MethodOverloadDiffParamType obj = new MethodOverloadDiffParamType();
        obj.greet("Alice");
        obj.greet(101);
    }
}
