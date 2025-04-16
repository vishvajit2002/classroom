package Arrayeg;

import java.util.Scanner;

public class Insert
{
	public static void main(String[] args)
	{
		int n, pos, x;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of elements you want in array");
		n=s.nextInt();
		int a[]=new int[n+1];
		System.out.println("enter all elements");
		for(int i=0; i<n; i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the position you wanna insert an element");
		pos=s.nextInt();
		System.out.println("enter the element you want to insert");
		x=s.nextInt();
		for(int i=(n-1); i>=(pos-1); i--)
		{
			a[i+1]=a[i];
		}
		a[pos-1]=x;
		System.out.println("after inserting");
		for(int i=0; i<n; i++)
		{
			System.out.println(a[i]+",");
		}
		System.out.println(a[n]);
	}
}
