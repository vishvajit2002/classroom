;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;...package Logical_programs;
import java.util.Scanner;
public class Reversenumber
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		scanner.close();

		int reversed = reverseNumber(number);
		
		System.out.println("Reversed number: " + reversed);
	}	

	public static int reverseNumber(int number)
	{
		int reversed = 0;
		while (number != 0)
		{
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;
		}
		return reversed;
	}
}

//to convert a number into string 
//int a = 123;
//String str = String.valueOf(a);
//or
//String str = Integer.toString(n); 