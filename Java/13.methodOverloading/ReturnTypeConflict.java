/*5. Write two methods with the same name, number of parameters and data type but
different return Type */

public class ReturnTypeConflict {
    int calculate(int a) {
        return a * a;
    }

    /*String calculate(int a) {
         return "Square is " + (a * a);
     }*/

    public static void main(String[] args) {
        ReturnTypeConflict obj = new ReturnTypeConflict();
        System.out.println("Result: " + obj.calculate(5));
    }
}
