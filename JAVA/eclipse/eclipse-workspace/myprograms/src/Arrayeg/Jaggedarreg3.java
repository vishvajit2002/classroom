package Arrayeg;
import java.util.Scanner;
public class Jaggedarreg3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of arrays:");
		int numberofarrays = scan.nextInt();
		int[][] arr = new int[numberofarrays][];

		for (int i = 0; i < numberofarrays; i++)
		{
			System.out.println("Enter the size of sub-array " + (i + 1) + ": ");
			int sizeOfSubArray = scan.nextInt();
			arr[i] = new int[sizeOfSubArray];
		}

		for (int i = 0; i < numberofarrays; i++)
		{
			System.out.println("Enter the elements of sub-array " + (i + 1) + ": ");
			for (int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}

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