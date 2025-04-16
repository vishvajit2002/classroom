package Methodoverloading;
public class Consover
{
	int id; // instance variables
	String name;

	public Consover()
	{
		System.out.println("hi there");
	}

	public Consover(int i, String n)
	{
		id = i;
		name = n;
	}

	public static void main(String[] args)
	{
		Consover s = new Consover();
		System.out.println(s.id + s.name);
		Consover s1 = new Consover(15, "hi");// we getting the instance varible's value through the default constructor
		System.out.println(s1.id + "" + s1.name);

	}
//Note: Do not have a return type, not even void..but can have access modifiers like public, protected, private, or package-private.
}
