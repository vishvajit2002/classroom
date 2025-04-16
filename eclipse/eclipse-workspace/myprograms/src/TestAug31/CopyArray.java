package TestAug31;
import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];  

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n; i
        }

        for (int i = 0; i < n; i++) {
            array2[i] = array1[i];
        }

        System.out.println("Elements of the second array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
