package Collections.List;
import java.util.LinkedList;
import java.util.Queue;
public class SimpleQueueLinked
{
public static void main(String[] args)
{
	Queue<String> queue=new LinkedList<>();
	queue.add("apple");
	queue.add("mango");
	
	queue.add("orange");
	queue.add("grapes");
	System.out.println(queue);
	System.out.println("queue total size"+ queue.size());
	System.out.println("queue includes fruit 'apple ?:" + queue.contains("apple"));
	queue.clear();
}
}
