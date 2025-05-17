public class ArithmeticOperator {

    // Function to perform arithmetic operations
    public static void performArithmeticOperations(int num1, int num2) {
        // Performing addition
        int sum = num1 + num2;
        System.out.println("Addition: " + sum);

        // Performing subtraction
        int difference = num1 - num2;
        System.out.println("Subtraction: " + difference);

        // Performing multiplication
        int product = num1 * num2;
        System.out.println("Multiplication: " + product);

        // Performing division
        if (num2 != 0) {
            double quotient = (double) num1 / num2;  
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Calling the function with two numbers
        int number1 = 10;
        int number2 = 5;
        
        performArithmeticOperations(number1, number2);  // Pass the numbers to the function
    }
}
