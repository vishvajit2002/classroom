package Constructorpg;

//In constructors, the methods doesnt have reutrn type 
public class Paramtask
{
	private String name;
	private int rollnumber;
	private double marks;
	public Paramtask(String name12, int rollnumberrrr, double marks2)
	{
		this.name = name12;
		this.rollnumber = rollnumberrrr;
		this.marks = marks2;
	}

	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.rollnumber);
		System.out.println(this.marks);

	}

	public static void main(String[] args)
	{
		Paramtask a = new Paramtask("hi", 12, 100);
		a.display();
	}

}
