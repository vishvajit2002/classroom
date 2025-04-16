package TestAug10;

public class Studentsamjohn 
{
	public void print(String name, int rollno, int phoneno, String address)
	{
		System.out.println("The name is "+name+". The rollno is "+rollno+". The phone no is "+phoneno+". The address is "+address);
		
	}
	public static void main(String[] args) 
	{
		Studentsamjohn a= new Studentsamjohn();
		a.print("sam", 11, 989, "chennai");
		a.print("john", 12, 990, "pondicherry");

	}

}
