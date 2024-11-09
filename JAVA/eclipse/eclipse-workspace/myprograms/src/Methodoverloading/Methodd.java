package Methodoverloading;

public class Methodd
{
	public static void main(String[] args)
	{
		Methodover ob = new Methodover();
		int prod = ob.multiply(1, 2);
		System.out.println(prod);
		int prod1 = ob.multiply(1, 2, 3);
		System.out.println(prod1);

	}

}
