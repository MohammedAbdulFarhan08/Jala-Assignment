//5. Write a function to remove a specific element from an array
import java.util.Scanner;
public class ArrayRemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter the element to remove: ");
        int element = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        } else {
            int[] newArr = new int[arr.length - 1];
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != element || found == false) {
                    newArr[j++] = arr[i];
                } else {
                    found = false; // only skip the first match
                }
            }

            System.out.print("Array after removing the element: ");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
