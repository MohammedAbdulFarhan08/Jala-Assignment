//10. Write a function to find the duplicate values of an array
public class ArrayDuplicate {
    public static void duplicate(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate elements are "+arr[i]);
                    break;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,3,2,5};
        duplicate(arr);
        
    }
}
