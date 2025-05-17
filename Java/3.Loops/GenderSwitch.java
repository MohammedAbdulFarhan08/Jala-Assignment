//12. Print gender (Male/Female) program according to given M/F using switch
import java.util.Scanner;

public class GenderSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().toUpperCase().charAt(0); // Read first character and convert to uppercase
        switch (gender) {
            case 'M':
                System.out.println("Gender: Male");
                break;
            case 'F':
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Invalid input. Please enter M or F.");
        }

        sc.close();
    }
}
