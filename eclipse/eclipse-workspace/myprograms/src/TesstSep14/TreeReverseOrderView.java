package TesstSep14;
import java.util.NavigableSet;
import java.util.TreeSet;
public class TreeReverseOrderView
{
	public static void main(String[] args)
	{
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(50);

		System.out.println("Original TreeSet: " + treeSet);

		NavigableSet<Integer> reverseOrderSet = treeSet.descendingSet();

		System.out.println("Reverse Order View: " + reverseOrderSet);
	}
}
