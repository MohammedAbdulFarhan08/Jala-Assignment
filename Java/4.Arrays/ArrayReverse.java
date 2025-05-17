//9. Write a function to reverse an array of integer values
public class ArrayReverse {
    public static void reverse(int arr[]){
        int reverseArr[] = new int [arr.length];
        for(int i=arr.length-1,j=0;i>=0;i--,j++){
            reverseArr[j]=arr[i];
        }
        System.out.println("Reversed Array: ");
        for(int i=0; i<reverseArr.length;i++){
            System.out.print(reverseArr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        reverse(arr);
    }
}
