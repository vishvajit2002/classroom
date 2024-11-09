package Arrayeg;
public class OddIndexedEvenNumbers
{
    public static void main(String[] args) {
        int[] numbers = {5, 8, 3, 10, 4, 15, 2, 18}; // Example array

        // Print the even numbers located at odd indices
        System.out.println("Even numbers at odd indices:");
        printOddIndexedEvenNumbers(numbers);
    }

    // Method to print even numbers at odd indices
    static void printOddIndexedEvenNumbers(int[] array) {
        for (int i = 1; i < array.length; i += 2) { // Start at index 1 and increment by 2
            if (array[i] % 2 == 0) { // Check if the number is even
                System.out.println("Index " + i + ": " + array[i]);
            }
        }
    }
}

