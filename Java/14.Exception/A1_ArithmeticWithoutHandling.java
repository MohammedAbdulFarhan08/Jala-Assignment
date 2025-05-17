//1. Write a program to generate Arithmetic Exception without exception handling


public class A1_ArithmeticWithoutHandling {
    public static void main(String[] args) {
        int result = 10 / 0; // Causes ArithmeticException
        System.out.println(result);
    }
}
