package Logical_programs;
import java.util.Scanner;
public class Elementposition1
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the array index values");
		int a= scan.nextInt();
		int arr[]=new int[a];
		System.out.println("enter the elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("enter the size of 2nd index value");
		int b= scan.nextInt();
		System.out.println("enter the elements to search");
		int arr1[]=new int[a];
		for(int i=0; i<arr.length; i++)
		{
			arr1[i]=scan.nextInt();
		}
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
			  if(arr1[i]==arr[j])	
			  {
				  System.out.println(arr1[i]+"is found in position"+j);
			  }
			}
			
		}
	}
}
		
	

