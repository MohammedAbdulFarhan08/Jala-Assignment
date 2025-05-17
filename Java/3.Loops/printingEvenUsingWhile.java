//6. Write a program to print even number between 10 and 100 using while
public class printingEvenUsingWhile {
    public static void main(String[] args) {
        int n=10;
        while(n<=100){
            if(n%2==0){
                System.out.println(n);
            }
            n++;
        }
    }
}
