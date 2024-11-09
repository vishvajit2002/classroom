package TestAug10;

public class Student 
{
	public void show(String name, int roll_no)
	{
		System.out.println("the name is="+name+".  The rollno is"+ roll_no);
	}
	public static void main(String[] args) 
	{
		Student a=new Student();
		a.show("John",2);
	}

}
