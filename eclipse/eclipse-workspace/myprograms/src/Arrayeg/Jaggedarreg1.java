package Arrayeg;

public class Jaggedarreg1
{
	public static void main(String[] args)
	{
		int r = 5;
		int arr[][] = new int[r][]; // Declare a 2D jagged array

		// Initialize the jagged array with variable column sizes
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = new int[i + 1]; // Each row has i+1 columns
		}

		int count = 0; // Initialize count outside the loop to maintain value across iterations

		// Assign values to the jagged array
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = count++;
			}
		}

		System.out.println("Displaying the contents of Jagged array:");

		// Print the jagged array
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
