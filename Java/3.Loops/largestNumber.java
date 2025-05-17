//5. Write a program to print largest number among three numbers.
public class largestNumber{
    public static void main(String[] args) {
        int a=10 , b= 8, c=9;
        if(a>b && a>c){
            System.out.println(a+" is the largest number");
        } else if(b>a && b>c){
            System.out.println(b+" is the largest Number");
        } else{
            System.out.println(c+" is the largest number");
        }
    }    
}