package mypackage;
abstract class Shape // you cannot create obj for the abstract class
{
	abstract void draw(); //abstract method or non concrete method
	void hi() //concrete method
	{
		System.out.println("hi");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("drawing rectangle");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}
}

public class Testabstraction
{
	public static void main(String[] args)
	{
		Shape s = new Circle();
		s.draw();
		s.hi();
	}
}
