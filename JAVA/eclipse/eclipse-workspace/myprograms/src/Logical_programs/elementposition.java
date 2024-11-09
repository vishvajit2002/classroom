package Logical_programs;

public class elementposition {

    public static int findIndex(int arr[], int t) {
        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) {
                return i;
            }
            i++;
        }
        return -1; // Moved outside of the loop
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 6, 8, 9, 7, 9, 7};
        System.out.println("Index of 5: " + findIndex(arr, 5));
    }
}
