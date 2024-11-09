package Arrayeg;
import java.util.Scanner;
public class Arrayeg1
{
	public static void main(String[] args)
	{
		int n, sum = 0;
		float average;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no of elements you want in the array");
		n = s.nextInt();
		int a[] = new int[n]; // n=10
		System.out.println("enter all the elements");
		for (int i = 0; i < n; i++)
		{
			a[i] = s.nextInt();
			sum = sum + a[i];
		}
		System.out.println("sum" + sum);
		average = (float) sum / n; // typecasting
		System.out.println("average" + average);
	}
}
