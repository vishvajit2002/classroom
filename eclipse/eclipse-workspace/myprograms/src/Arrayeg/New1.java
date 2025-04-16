package Arrayeg;
class ArrayOfObject
{
public String name;
ArrayOfObject(String name)
{
	this.name=name;
}
@Override
public String toString()
{
	return name;
}
}
//elements of the array are objects of a class student
public class New1 
{
	public static void main(String args[])
	{
		ArrayOfObject[] mystud=new ArrayOfObject[] {new ArrayOfObject("Dharma"),new ArrayOfObject("Yoga")}; 
		for(ArrayOfObject m:mystud) //class type for
		{
			System.out.println(m);
		}
	}
}
