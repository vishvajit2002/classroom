package Constructorpg;//In constructors, the methods doesn't have return type 
public class Copycons
{
	private String name;
	private int age;
	private String namecopy;
	private int agecopy;
	public Copycons(String name1, int age1)
	{
		this.name = name1;
		this.age = age1;
	}

	public Copycons(Copycons hi) //  (ClassName obj)
	{
		this.namecopy = hi.name; // hi.name=> hi is para's obj..NOTE:- We calling the instance variable(this.name)					
								// not the parameter variable(name1)
		this.agecopy = hi.age;
	}

	
	public void display() 
	{
		System.out.println(this.namecopy);
		System.out.println(this.agecopy);
	}

	public static void main(String[] args)
	{
		Copycons s = new Copycons("mohan", 15);
		System.out.println("displaying original object");		
		Copycons s1 = new Copycons(s);  // passing the param's object
		s1.display();
	}

}
