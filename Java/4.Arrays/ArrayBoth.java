//17. Write a method to verify if the array contains two specified elements(12,23)
public class ArrayBoth {
     public static boolean containsElements(int[] arr, int a, int b) {
        boolean hasA = false;
        boolean hasB = false;

        for (int num : arr) {
            if (num == a) {
                hasA = true;
            }
            if (num == b) {
                hasB = true;
            }
            // Exit early if both found
            if (hasA && hasB) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {5, 12, 8, 23, 45, 7};

        if (containsElements(array, 12, 23)) {
            System.out.println("Array contains both 12 and 23.");
        } else {
            System.out.println("Array does NOT contain both 12 and 23.");
        }
    }
}


