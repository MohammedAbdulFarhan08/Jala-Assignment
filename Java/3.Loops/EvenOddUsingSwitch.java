//11. Program to check whether a number is EVEN or ODD using switch
import java.util.*;
public class EvenOddUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int remainder=n%2;
        switch (remainder) {
            case 0:
                System.out.println(n+" is even");  
                break;
            case 1:
            case -1:
                System.out.println(n+" is odd");
                break;
            default:
                break;
        }
        sc.close();
    }
}
