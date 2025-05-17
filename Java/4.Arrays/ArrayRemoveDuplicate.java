//12. Write a method to remove duplicate elements from an array
public class ArrayRemoveDuplicate {

    public static void removeDuplicate(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] is already in temp[]
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to temp[]
            if (!isDuplicate) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Print the result array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < index; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 6};
        removeDuplicate(arr);
    }
}
