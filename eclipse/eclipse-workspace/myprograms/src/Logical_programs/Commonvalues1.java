package Logical_programs;
import java.util.Scanner;
public class Commonvalues1
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the array  values");
		int a= scan.nextInt();
		String arr[]=new String[a];
		System.out.println("enter the elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=scan.nextLine();
		}
		
		System.out.println("enter the size of 2nd  value");
		int b= scan.nextInt();
		System.out.println("enter the elements to search");
		String arr1[]=new String[b];
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=scan.nextLine();
		}
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
			  if(arr1[i].equals(arr[j]))
			  {
				  System.out.println(arr1[i]);
			  }
			}
		}
		scan.close();
	}
}
		
	

