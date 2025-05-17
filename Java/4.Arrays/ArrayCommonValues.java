//11. Write a program to find the common values between two arrays
public class ArrayCommonValues{
    public static void commonValues(int arr1[], int arr2[]){
        System.out.println("This are common values in both the array: ");
        for(int i=0;i<arr1.length;i++){
            boolean alreadyPrinted = false;
            for(int j=0;j<i;j++){
                if(arr1[i]==arr1[j]){
                    alreadyPrinted = true;
                    break;
                }
            }
            if(!alreadyPrinted){
                for(int k=0; k<arr2.length;k++){
                    if(arr1[i]==arr2[k]){
                        System.out.println(arr2[k]);
                        break;
                    }
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,4, 4, 5, 9};
        int[] arr2 = {4, 5, 6, 7,0, 8, 9};
        commonValues(arr1, arr2);
    }
}