//3. Write a method which throws exception, Call that method in main class without try block


public class A3_ThrowsInMethod {
    static void risky() throws ArithmeticException {
        int a = 10 / 0;
    }

    public static void main(String[] args) {
        risky(); // No try block; program will terminate
    }
}
