//4. Write a program with multiple catch blocks


public class A4_MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            arr[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (Exception e) {
            System.out.println("General exception caught");
        }
    }
}
