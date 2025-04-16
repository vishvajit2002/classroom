package TestOct19;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollection
{
	public static void main(String[] args)
	{
		String[] fruits ={ "Apple", "Banana", "Cherry", "Date" };

		List<String> fruitList = new ArrayList<>(Arrays.asList(fruits));

		System.out.println("Array as a List: " + fruitList);
	}
}
