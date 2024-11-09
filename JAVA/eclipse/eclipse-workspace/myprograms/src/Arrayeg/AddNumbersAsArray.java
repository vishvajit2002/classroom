package Arrayeg;

public class AddNumbersAsArray
{
	// Method to add two numbers and return an array
	static int[] addAndReturnArray(int num1, int num2)
	{
		int sum = num1 + num2;
		// Return an array containing the two numbers and their sum
		return new int[]
		{ num1, num2, sum };
	}

	public static void main(String[] args)
	{
		int number1 = 5;
		int number2 = 10;

		// Call the method and store the returned array
		int[] resultArray = addAndReturnArray(number1, number2);

		// Print the elements of the returned array
		System.out.println("Number 1: " + resultArray[0]);
		System.out.println("Number 2: " + resultArray[1]);
		System.out.println("Sum: " + resultArray[2]);
	}
}
