//8. Write a function to find the minimum and maximum value of an array
public class ArrayMaxMinValue {
    public static void minMax(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum value in array is: "+max);
        System.out.println("Minimum value  in array is: "+min);

    }
    public static void main(String[] args) {
        int arr[] = {0,8,919,89,78};
        minMax(arr);
        
    }
}
