package mypackage;
public class Arithmetic 
{
	public void add(int a, int b)
	{
		System.out.println("add="+(a+b));
	}
	public void sub(int a, int b)
	{
		System.out.println("sub="+(a-b));
	}
	public void mul(int a, int b)
	{
		System.out.println("mul="+(a*b));
	}
	public void div(int a, int b)
	{
		System.out.println("div="+(a/b));
	}
	
	
	public static void main(String[] args)
	{		
		Arithmetic obj=new Arithmetic();
		obj.add(10,20);
		obj.sub(10,20);
		obj.mul(10,20);
		obj.div(10,20);
	}

}
