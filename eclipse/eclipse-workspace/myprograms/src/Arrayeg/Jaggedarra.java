package Arrayeg;

public class Jaggedarra 
{
    public static void main(String[] args) 
    {
        int arr[][] = new int[2][]; // Declare a 2D jagged array
        arr[0] = new int[3]; // First row with 3 elements
        arr[1] = new int[2]; // Second row with 2 elements

        int count = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                arr[i][j] = count++;
            }
        }

        System.out.println("Displaying the contents of Jagged array:");

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                System.out.print(arr[i][j] + " "); // Use print to keep elements on the same line
            }
            System.out.println(); // New line after each row
        }
    }
}
 