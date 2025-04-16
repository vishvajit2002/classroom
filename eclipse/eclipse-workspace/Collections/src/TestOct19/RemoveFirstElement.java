package TestOct19;
import java.util.LinkedList;
public class RemoveFirstElement
{
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		System.out.println("Original LinkedList: " + list);
		String firstElement = removeFirstElement(list);

		System.out.println("Removed Element: " + firstElement);
		System.out.println("LinkedList after removal: " + list);
	}

	public static String removeFirstElement(LinkedList<String> list)
	{
		if (list.isEmpty())
		{
			return null;
		}
		return list.removeFirst(); 
	}
}