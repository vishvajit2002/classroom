package Arrayeg;
import java.util.Scanner;
public class jaggedarreg2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of arrays:");
		int numberofarrays = scan.nextInt();
		int[][] jaggedArrays = new int[numberofarrays][];

		for (int i = 0; i < numberofarrays; i++)
		{
			System.out.println("Enter the size of sub-array " + (i + 1) + ": ");
			int sizeOfSubArray = scan.nextInt();
			jaggedArrays[i] = new int[sizeOfSubArray];
		}

		for (int i = 0; i < numberofarrays; i++)
		{
			System.out.println("Enter the elements of sub-array " + (i + 1) + ": ");
			for (int j = 0; j < jaggedArrays[i].length; j++)
			{
				jaggedArrays[i][j] = scan.nextInt();
			}
		}

		// Displaying the contents of the jagged array
		System.out.println("Displaying the contents of Jagged array:");
		for (int i = 0; i < numberofarrays; i++)
		{
			for (int j = 0; j < jaggedArrays[i].length; j++)
			{
				System.out.print(jaggedArrays[i][j] + " ");
			}
			System.out.println(); // New line after each sub-array
		}
	}
}
