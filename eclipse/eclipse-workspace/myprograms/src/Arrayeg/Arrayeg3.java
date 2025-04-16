package Arrayeg;
import java.util.Iterator;
import java.util.Scanner;
public class Arrayeg3
{
	public static void main(String[] args)
	{
		int n, x, flag = 0, i = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no of elements you want in an array");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("enter all elements");
		for (i = 0; i < n; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("enter the elements to find");
		x = s.nextInt();
		for (i = 0; i < n; i++)
		{
			if (a[i] == x)
			{
				flag = 1;
				break;
			} else
			{
				flag = 0;
			}
		}
		if (flag == 1)
		{
			System.out.println("element fount at" + (i + 1));
		} else
		{
			System.out.println("element not found");
		}
	}
}
