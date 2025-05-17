//2. Write a function to calculate the average value of an array of integers
public class ArrayAverage {
    public static double average(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        double avg=sum/arr.length;
        return avg;

    }
   public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    double result=average(arr);
    System.out.println(result);
   } 
}
