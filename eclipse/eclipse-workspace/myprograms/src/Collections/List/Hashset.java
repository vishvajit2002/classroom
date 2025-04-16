package Collections.List;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Hashset
{
public static void main(String[] args)
{
	int count[]= {21,22,23,24,25,26};
	Set<Integer> set=new HashSet<Integer>();
	try
	{
		for(int i=0; i<=5; i++)
		{
			set.add(count[i]);
		}
		System.out.println(set);
		
        TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
		System.out.println(sortedSet);
		System.out.println("first Eleemnt of the set is"+(Integer)sortedSet.first());
		System.out.println("Last Eleemnt of the set  is"+(Integer) sortedSet.last());
	}
	catch(Exception e) {}
}	

}
