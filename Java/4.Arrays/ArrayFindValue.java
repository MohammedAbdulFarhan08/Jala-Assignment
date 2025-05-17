//4. Write a function to test if array contains a specific value
import java.util.*;
public class ArrayFindValue {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("Enter the value:");
    int value = sc.nextInt();
    boolean found=false;
    for(int i=0;i<arr.length;i++){
        if(value==arr[i]){
            System.out.println(value+" found at index "+i);
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
