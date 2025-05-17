//6. Write a function to copy an array to another array
public class ArrayCopy {
    public static void copyArray(int original[]){
        int duplicate[] = new int [original.length];
        for(int i=0;i<original.length;i++){
            duplicate[i]=original[i];
        }
        System.out.print("Copied array:");
        for(int i=0;i<duplicate.length;i++){
            System.out.print(duplicate[i]+" ");
        }
    }
    public static void main(String[] args) {
        int original[]={1,2,3,4,5};
        copyArray(original);
    }
}
