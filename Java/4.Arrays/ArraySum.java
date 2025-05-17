//1. Write a function to add integer values of an array
public class ArraySum {
        public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i=0;i<arr.length;i++ ) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int total = sumArray(arr);
        System.out.println("Sum of array elements: " + total);
    }
}

