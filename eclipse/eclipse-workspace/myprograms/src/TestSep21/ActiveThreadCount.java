package TestSep21;
public class ActiveThreadCount
{
	public static void main(String[] args)
	{
		ThreadGroup group = new ThreadGroup("My Thread Group");

		Thread t1 = new Thread(group, new RunnableTask(), "Thread 1");
		Thread t2 = new Thread(group, new RunnableTask(), "Thread 2");
		Thread t3 = new Thread(group, new RunnableTask(), "Thread 3");

		t1.start();
		t2.start();
		t3.start();

		System.out.println("Active threads in the group: " + group.activeCount());

		try
		{
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}

		System.out.println("Active threads after completion: " + group.activeCount());
	}
}

class RunnableTask implements Runnable
{
	@Override
	public void run()
	{
		try
		{
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName() + " is running");
		} catch (InterruptedException e)
		{
			System.out.println(Thread.currentThread().getName() + " was interrupted");
		}
	}
}
