package Arrayeg;
public class OddEvenSeparation {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array

        // Create arrays to store odd and even numbers
        int[] oddNumbers = new int[numbers.length];
        int[] evenNumbers = new int[numbers.length];

        int oddIndex = 0;
        int evenIndex = 0;

        // Loop through the original array and separate odd and even numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenIndex++] = number;
            } else {
                oddNumbers[oddIndex++] = number;
            }
        }

        // Print even numbers
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Print odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}

