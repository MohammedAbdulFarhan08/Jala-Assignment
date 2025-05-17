//8. Write a program to find Armstrong number or not
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int result = 0;

        // Step 1: Count the number of digits
        int digits = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        // Step 2: Compute the sum of each digit raised to the power of total digits
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
        }

        // Step 3: Check and display the result
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        sc.close();
    }
}

