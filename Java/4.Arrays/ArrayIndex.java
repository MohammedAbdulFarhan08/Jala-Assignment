//3. Write a program to find the index of an array element
import java.util.Scanner;
public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        System.out.println("Enter the element to find the index:");
        int element= sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(element==arr[i]){
                System.out.println(i+" is a index of element you entered");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
        sc.close();
    }
}
