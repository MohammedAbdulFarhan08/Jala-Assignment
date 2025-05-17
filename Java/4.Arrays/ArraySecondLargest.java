//13. Write a method to find the second largest number in an array
public class ArraySecondLargest {
    public static void secondLargest(int array[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        if(array.length<2){
            System.out.println("Length of array should be atleast 2");
            return;
        } 
        for(int i=0; i<array.length; i++){
                if(array[i]>max){
                    max=array[i]; 
                }
                
        }
        for(int i=0; i<array.length; i++){
           if(array[i]>secondMax && array[i]<max ){
            secondMax = array[i];
           }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest value.");
        } else {
            System.out.println("Second largest is: " + secondMax);
        }
    }
   public static void main(String [] args){
        int[] array = {1, 2, 3, 4, 5};
        secondLargest(array);
        
    }
} 

