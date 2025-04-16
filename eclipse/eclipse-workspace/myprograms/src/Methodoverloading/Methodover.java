package Methodoverloading;

public class Methodover // helper class
{
	public int multiply(int a, int b)
	{
		int prod = a * b;
		return prod;
	}

	public int multiply(int a, int b, int c)
	{
		int prod1 = a * b * c;
		return prod1;
	}
}
