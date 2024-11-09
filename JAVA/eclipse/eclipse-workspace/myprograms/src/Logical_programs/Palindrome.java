package Logical_programs;
import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		System.out.println("Enter the word:");
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		scan.close(); 
		boolean isPalindrome = true;
		for (int i = 0; i < a.length()-1; i++)
		{
			int b = a.length();
			if (a.charAt(i) != a.charAt(b))
			{
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome)
		{
			System.out.println("It's a palindrome");
		} else
		{
			System.out.println("It's not a palindrome");
		}
	}
}
