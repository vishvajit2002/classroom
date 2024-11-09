package Logical_programs;
import java.util.Scanner;
public class Reverseword
{
	public static void main(String[] args)
	{
		System.out.println("enter the word");
		Scanner scan=new Scanner(System.in);
		String n=scan.nextLine();
		for(int i= n.length()-1; i>=0; i--)
		{
		System.out.print(n.charAt(i));	
		}
	}
}
