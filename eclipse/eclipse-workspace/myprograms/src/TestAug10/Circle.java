package TestAug10;

public class Circle 
{
    double radius;
    String color;
    public double getArea(double rad,String col) 
    {
    	radius=rad;
    	color=col;
        return Math.PI * radius * radius;
    }
    public static void main(String[] args)
    {
        Circle a = new Circle();
        System.out.println("Area: " + a.getArea(1.0,"red"));
    }
}
