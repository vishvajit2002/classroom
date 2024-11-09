package Logical_programs;

import java.util.Scanner;

public class Vowels
{
	public static void main(String[] args)
	{
		System.out.println("enter a sentence");
		Scanner scan=new Scanner(System.in);
		String n=scan.nextLine();
		for(int i=0; i<=n.length()-1;i++)
		{
			if(n.charAt(i)=='a' ||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'|| n.charAt(i)=='u')
			{
				System.out.println("vowel is found in "+i+"th index");
			}
			else
			{
				System.out.println("consonents is found in "+i+"th index");

			}
		}
		

	}
}
