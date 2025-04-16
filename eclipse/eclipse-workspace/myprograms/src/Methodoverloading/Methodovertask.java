package Methodoverloading;
public class Methodovertask
{
	void add(int a, int b)
	{
		System.out.println(a + b);
	}
	void add(double a, double b)
	{
		System.out.println(a + b);
	}
	public static void main(String[] args)
	{
		Methodovertask a = new Methodovertask();
		a.add(10, 20);
		a.add(1220, 220);
	}

}
