package Thread;
public class Threadprogram extends Thread
{
// thread -- process(init(),start(), stop(), service(), destroy(), sleep(), wait(), notify(), notifyall()
// thread --task(timebound) -- sleep(), wait(), await()
//1. extends thread (Class)
//2. implements runnable (interface)
	public static void main(String[] args)
	{
		Threadprogram tp=new Threadprogram();
		tp.start();
		System.out.println("the code is outside the thread");
	}

	public void run()
	{
		System.out.println("the code is running in the thread");
	}

}
// thread - execution path of a program
// multi-threading -- it process the task consists of many threads
//use of thread
//1. allows a program to operate by doing multiple things at same time
//lifecycle..1.new(constructing) 2.Runnable(prepare to execute the code) 
//3. Running( thread for execution with time slot 4. Blocked(in active) 
//5. Dead(thread exit at the run process)

//thread priorities
//1-lowest(Thread.MIN_PRIORITY)
//5-standard(Thread.NORM_PRIORITY)
//10- highest(Thread.MAX_PRIORITY)


//when multithread access shared resources simultaneously leads to concurrency
//problem & it can overlap based on the time period.

//message passing will be used to thread safety and also initialize 
//synchronized block. It prefer immutable obj to mutable ones.
//It used atomic classes for atomic operation.