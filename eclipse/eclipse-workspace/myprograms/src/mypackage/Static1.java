package mypackage;

public class Static1
{
	static void mystaticmethod()
	{
		System.out.println("hi there");
	}

	public void mypubic()
	{
		System.out.println("hello");
	}

	public static void main(String[] args)
	{
		mystaticmethod(); // static method doesn't need any object to run
		Static1 obj = new Static1(); // public method needs an object to run
		obj.mypubic();

	}

}
