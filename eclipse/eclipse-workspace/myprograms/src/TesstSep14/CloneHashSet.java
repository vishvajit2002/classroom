package TesstSep14;
import java.util.HashSet;
public class CloneHashSet
{
	public static void main(String[] args)
	{
		HashSet<String> originalSet = new HashSet<>();
		originalSet.add("Apple");
		originalSet.add("Banana");
		originalSet.add("Cherry");

		HashSet<String> clonedSet = (HashSet<String>) originalSet.clone();

		System.out.println("Original HashSet: " + originalSet);
		System.out.println("Cloned HashSet: " + clonedSet);
	}
}
