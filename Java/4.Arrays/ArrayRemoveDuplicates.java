//18. Write a program to remove the duplicate elements and return the new array
    public class ArrayRemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[index] = arr[i];
                index++;
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 5};
        int[] uniqueArray = removeDuplicates(array);

        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}


