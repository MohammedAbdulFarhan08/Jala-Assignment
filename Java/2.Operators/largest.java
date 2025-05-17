import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a =sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a+" is the largest number");
            System.out.println(b+" is the smallest number");
        } else if(b>a){
            System.out.println(b+" is the largest number");
            System.out.println(a+" is the smallest number");        
        } else{
            System.out.println("Both are same");
        }
        sc.close();
    }
}
