//7. Write a function to insert an element at a specific position in the array
public class ArrayInsertElement {
    public static void insert(int arr[],int index,int replaceElement){
        int newArray[]=new int[arr.length+1];
        for(int i=0,j=0;i<newArray.length;i++){
            if(index==i){
                newArray[i] = replaceElement;
            } else{
                newArray[i] = arr[j];
                j++;
            }
        }
        System.out.print("After Insertion:");
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        insert(arr,0,10);
        
    }
}
