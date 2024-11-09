package Logical_programs;

import java.util.Scanner;

public class Reversenumbereg1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		String n=Integer.toString(number);
		for(int i=n.length()-1;i>=0;i--)
		{
			System.out.print(n.charAt(i));
		}
		scanner.close();
	}
		
		


}
