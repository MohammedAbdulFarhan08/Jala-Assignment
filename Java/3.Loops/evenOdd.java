//4. Write a program to print the odd and even numbers.
import java.util.*;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a Number to check whether it is even or odd:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+" is even");
        } else{
            System.out.println(n+" is odd");
        }
        sc.close();
    }
}
