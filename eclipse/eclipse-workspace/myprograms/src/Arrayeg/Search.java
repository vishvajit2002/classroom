package Arrayeg;

import java.util.Scanner;

public class Search
{
	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of elements you want in array");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the elements");
		for(int i=0; i<n;i++)
		{
			a[i]=s.nextInt();
	
		}
		System.out.println("enter the kth position which you wanna check");
		int k=s.nextInt();
		System.out.println("number"+a[k-1]);
	}

}
