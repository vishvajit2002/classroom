package Constructorpg;
//In constructors, the methods doesnt have reutrn type 
public class Paramtaskeg2
{
    private double radius = 1.0;
    private String color = "red";

    // Parameterized Constructor
    public Paramtaskeg2(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
    	Paramtaskeg2 defaultCircle = new Paramtaskeg2(1.0, "red"); // Default values
    	Paramtaskeg2 customCircle = new Paramtaskeg2(5.0, "blue");

        System.out.println("Default Circle: radius=" + defaultCircle.radius + ", color=" + defaultCircle.color + ", area=" + defaultCircle.getArea());
        System.out.println("Custom Circle: radius=" + customCircle.radius + ", color=" + customCircle.color + ", area=" + customCircle.getArea());
    }
}

