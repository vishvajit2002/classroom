package Arrayeg;
import java.util.Arrays;
import java.util.Collections;
public class DescendingOrderUsingSorting 
{
    public static void main(String[] args) {
        Integer[] numbers = {5, 3, 8, 1, 4}; // Array of integers

        // Print original array
        System.out.println("Original array:");
        printArray(numbers);
        
        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print sorted array in descending order
        System.out.println("Array in descending order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }

    // Method to print array elements
    static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }
}
