package TestSep21;
public class ThreadGroupDestroy
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		ThreadGroup group = new ThreadGroup("Worker Threads");

		Thread worker1 = new Thread(group, new WorkerTask(), "Worker 1");
		Thread worker2 = new Thread(group, new WorkerTask(), "Worker 2");
		Thread worker3 = new Thread(group, new WorkerTask(), "Worker 3");

		worker1.start();
		worker2.start();
		worker3.start();

		try
		{
			worker1.join();
			worker2.join();
			worker3.join();
		} catch (InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}

		if (group.activeCount() == 0)
		{
			System.out.println("All threads completed. Destroying the thread group.");
			group.destroy(); 
		} else
		{
			System.out.println("Thread group is not empty, cannot destroy.");
		}

		System.out.println("Program finished.");
	}
}

class WorkerTask implements Runnable
{
	@Override
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " has completed its task.");
		} catch (InterruptedException e)
		{
			System.out.println(Thread.currentThread().getName() + " was interrupted.");
		}
	}
}
