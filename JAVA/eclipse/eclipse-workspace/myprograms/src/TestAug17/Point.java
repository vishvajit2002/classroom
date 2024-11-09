package TestAug17;
public class Point
{
	private int x;
	private int y;
	private double x1;
	private double y1;
	public Point(int x, int y)
	{
		this.x=x;
		this.y=y;
		System.out.println( this.x +"," +this.y);
	}
	public Point(double x, double y)
	{
		this.x1=x;
		this.y1=y;
	}
	public static void main(String[] args)
	{
		Point a= new Point(10,20);
		Point a1=new Point(1000,2000);
	}

}
