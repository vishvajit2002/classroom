package TesstSep14;
import java.util.ArrayList;
public class StudentList
{
	public static void main(String[] args)
	{
		ArrayList<String> studentNames = new ArrayList<>();

		studentNames.add("Samantha");
		studentNames.add("Sam");
		studentNames.add("Sruthi");
		studentNames.add("Shivani");
		studentNames.add("vishva");
		studentNames.add("vishvajit");

		System.out.println("Original list of students: " + studentNames);

		studentNames.removeIf(vishva -> vishva.startsWith("S"));

		System.out.println("Updated list of students: " + studentNames);
	}
}
