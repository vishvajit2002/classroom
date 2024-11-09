package Methodoverloading;

public class Consovertask
{
	Consovertask(int a, String b)
	{
		System.out.println(a + b);
	}

	Consovertask(int a, String b, int c)
	{
		System.out.println(a + b + c);
	}

	Consovertask(int a, String b, int c, int d)
	{
		System.out.println(a + b + c + d);
	}

	public static void main(String[] args)
	{
		Consovertask a = new Consovertask(12, "hi");
		Consovertask a1 = new Consovertask(12, "hi", 13);
		Consovertask a2 = new Consovertask(12, "hi", 13, 14);
	}

}
