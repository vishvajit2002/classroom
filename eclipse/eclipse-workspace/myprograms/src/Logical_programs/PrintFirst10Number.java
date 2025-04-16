package Logical_programs;

public class PrintFirst10Number
{
	public static void main(String[] args)
	{
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = i + 1; // numbers will be 1, 2, 3, ..., 10
		}

		System.out.println("The first 10 numbers are:");
		for (int num : numbers)
		{
			System.out.println(num);
		}
	}
}
