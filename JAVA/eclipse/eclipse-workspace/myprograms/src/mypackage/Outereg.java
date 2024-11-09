package mypackage;
class name
{
	void add(int a,int b)
	{
	System.out.println("a+b="+(a+b));
	}
	class name1
	{
		void sub(int a, int b)
		{
			System.out.println("a-b="+(a-b));
		}	
	}
}
public class Outereg
{
	public static void main(String[] args) 
	{
		name b=new name();
		b.add(10,20);
		name.name1 b1=b.new name1();
		b1.sub(100, 10);
	}

}
