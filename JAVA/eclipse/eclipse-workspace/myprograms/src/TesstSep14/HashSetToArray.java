package TesstSep14;
import java.util.HashSet;
public class HashSetToArray
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");

		String[] array = set.toArray(new String[set.size()]);

		System.out.println("Array elements: ");
		for (String element : array)
		{
			System.out.println(element);
		}
	}
}
