//9. Write a program to find the prime or not.
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count=0;
        if(n>1){
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==2){
            System.out.println(n+" is a prime number");
        } else{
            System.out.println(n+ " is not a prime");
        }
        } else{
            System.out.println("Enter number greater then 1");
        }
        
        sc.close();
    }
}
