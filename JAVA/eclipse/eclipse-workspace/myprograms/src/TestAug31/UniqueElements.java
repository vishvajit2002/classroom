package TestAug31;
import java.util.Scanner;
public class UniqueElements
{
	public static void main(String[] args)
	{ 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		int[] newArray = new int[n];
		int newArrayIndex = 0;
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++)
		{
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++)
		{
			boolean isUnique = true;
			for (int j = 0; j < n; j++)
			{
				if (i != j && array[i] == array[j])
				{
					isUnique = false;
					break;
				}
			}

			if (isUnique)
			{
				newArray[newArrayIndex++] = array[i];
			}
		}

		System.out.println("Unique elements in the array:");
		for (int i = 0; i < newArrayIndex; i++)
		{
			System.out.print(newArray[i] + " ");
		}
	}
}
