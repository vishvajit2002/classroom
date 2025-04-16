package Collections.List;
import java.util.Deque;
import java.util.LinkedList;
public class Queuemethod
{
	public static void main(String[] args)
	{
		Deque<String> deque = new LinkedList<String>();
		deque.add("kitkat"); //add at last
		deque.add("5star"); // add at the first
		deque.add("diarymilk"); // add at the last
		deque.add("milkybar"); // add  at the first
		deque.add("munch"); // add at the last
		deque.add("Bounty"); ;// add at the first
		System.out.println(deque+"\n");
		
		deque.removeFirst();
		deque.removeLast();
		System.out.println("deque after removing"+deque);
	}
	}

