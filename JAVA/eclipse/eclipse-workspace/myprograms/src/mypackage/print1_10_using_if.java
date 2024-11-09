package mypackage;

public class print1_10_using_if
{
	public static void main(String[] args)
	{
		hi(1);
	}

	public static void hi(int num)
	{
		if (num <= 10)
		{
			System.out.println(num);
			hi(num + 1);
		}

	}
}
