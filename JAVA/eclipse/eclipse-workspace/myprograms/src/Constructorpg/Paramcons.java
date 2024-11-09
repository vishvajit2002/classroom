package Constructorpg;
//In constructors, the methods doesnt have reutrn type 
public class Paramcons
{
	private String name1;
	private int age;
	public Paramcons(String name, int age) // parameterized constructor class name and method name is same.. and all
											// attributes should be private.. this keyword is used to get the value of
											// the instance variable of the current class, where the value is passed in
											// the parameters
	{
		this.name1 = name;
		this.age = age;
	}

	public void display()
	{
		System.out.println(this.name1);
		System.out.println(this.age);
	}

	public static void main(String[] args)
	{
		Paramcons s = new Paramcons("mohan", 15);
		s.display();
		// TODO Auto-generated method stub

	}

}
