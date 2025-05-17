//10. Write a program to generate ClassNotFoundException


public class A10_ClassNotFound {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.unknown.NonExistingClass");
    }
}
