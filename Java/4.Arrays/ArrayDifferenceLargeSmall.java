//16. Write a function to get the difference of largest and smallest value
public class ArrayDifferenceLargeSmall{
    public static int minMax(int arr[]){
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("Maximum value in array is: "+large);
        System.out.println("Minimum value  in array is: "+small);
        int difference = large-small;
        return difference;

    }
    public static void main(String[] args) {
        int arr[] = {8,9,99,89,78};
        int result=minMax(arr);
        System.out.println("The difference between largest and smallest value in array is: "+result);
    }
}
 
