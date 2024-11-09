package TesstSep14;
import java.util.HashSet;
public class RemoveAllFromHashSet
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");

		System.out.println("Original HashSet: " + set);

		set.clear();

		System.out.println("HashSet after clear: " + set);
	}
}
