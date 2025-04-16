package Arrayeg;
public class ArrayOfObjectBasics
{
	public static void main(String[] args)
	{
		Student[] arr;

		// Creating an array of Student objects
		arr = new Student[3];

		// Initializing the Student objects
		arr[0] = new Student(101, "malar");
		arr[1] = new Student(102, "malar");
		arr[2] = new Student(103, "malar");

		// Displaying the student data
		System.out.println("Student data arr[0]:");
		arr[0].display();

		System.out.println("Student data arr[1]:");
		arr[1].display();

		System.out.println("Student data arr[2]:");
		arr[2].display();
	}

	// Static inner class Student
	static class Student
	{
		public int id;
		public String name;

		// Constructor
		Student(int id, String name)
		{
			this.id = id;
			this.name = name;
		}

		// Method to display student details
		public void display()
		{
			System.out.println("Student ID is " + id + ", Name is " + name);
		}
	}
}
