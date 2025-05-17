//13. Program for multiple if else statement(Largest number in 10,20 and 30)
public class largest1 {
    public static void main(String[] args) {
        int a=10 , b= 20, c=30;
        if(a>b && a>c){
            System.out.println(a+" is the largest number");
        } else if(b>a && b>c){
            System.out.println(b+" is the largest Number");
        } else{
            System.out.println(c+" is the largest number");
        }
    }   
}
