//7. Write a program with finally block


public class A7_FinallyBlock {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("This always executes");
        }
    }
}
