package TestAug17;

public class Cat
{
	String name;
	int age;
	public Cat()
	{
		this.name="UNKNOWN";
		this.age=0;
		System.out.println("the name is "+this.name);
		System.out.println("the age is "+this.age);
	}
	public static void main(String[] args)
	{
		Cat a=new Cat();
	}
}
