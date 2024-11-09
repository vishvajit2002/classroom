package Collections.List;

import java.util.Deque;
import java.util.Iterator;
import java.util.ArrayDeque;

public class ArrayDequenew
{

	public static void main(String[] args) 
		{
			Deque <String> dq=new ArrayDeque <String>();
			dq.add("for");
			dq.addFirst("and");
			dq.addLast("will");
			dq.add("its so good");
			for(Iterator itr=dq.iterator(); 
			
				itr.hasNext())
			{
				System.out.println(itr.next()+"");
			}
			for(Iterator itr= dq.descendingIterator() )
					
				}
			}

}

}

}
