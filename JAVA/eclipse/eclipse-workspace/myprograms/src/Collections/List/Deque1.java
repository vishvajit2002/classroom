package Collections.List;
import java.util.ArrayDeque;
import java.util.Deque;
public class Deque1
{
	public static void main(String[] args)
	{
		Deque<Integer> deque=new ArrayDeque<>();
		deque.addFirst(1);
		deque.addFirst(1);
		
		int first=deque.removeFirst();
		int last=deque.removeLast();
		System.out.println("first"+first+" "+"last"+last);
	
	}

}
