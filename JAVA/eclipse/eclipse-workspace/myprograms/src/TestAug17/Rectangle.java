package TestAug17;
public class Rectangle
{
	private int length;
	private int width;
	Rectangle(int length1,int width1)
	{
		this.length=length1;
		this.width=width1;
		System.out.println("The length is "+length);
		System.out.println("The width is "+width);
	}
	public Rectangle(Rectangle a)
	{
		this.length=a.length;
		this.width=a.width;
		System.out.println("The length is "+this.length);
		System.out.println("The width is "+this.width);
	}
	
	public static void main(String[] args)
	{
		Rectangle a= new Rectangle(12,13);
		Rectangle a1= new Rectangle(a);
	}
}

