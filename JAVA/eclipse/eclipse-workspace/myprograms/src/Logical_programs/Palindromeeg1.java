package Logical_programs;
import java.util.Scanner;
public class Palindromeeg1
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the string");
		String a=scan.nextLine();
		char[] b=new char[a.length()];
		for(int i=0; i<a.length(); i++)
		{
			b[i]=a.charAt(i);
		}
		StringBuilder after=new StringBuilder();
		for(int i=b.length-1; i>=0;i--)	
		{
			after.append(b[i]);
		}
		if(a.equals(after.toString()))
		{
			System.out.println("its a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
		
		
	}
}
