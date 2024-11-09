package TesstSep14;
import java.util.ArrayList;
public class SearchInArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Date");

		String searchElement = "Cherry";

		boolean isPresent = list.contains(searchElement);
		if (isPresent)
		{
			System.out.println(searchElement + " is present in the list.");
		} else
		{
			System.out.println(searchElement + " is not present in the list.");
		}
	}
}
