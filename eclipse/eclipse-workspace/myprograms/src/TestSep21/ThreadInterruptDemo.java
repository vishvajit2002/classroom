package TestSep21;
class MyRunnable implements Runnable
{
	@Override
	public void run()
	{
		try
		{
			for (int i = 1; i <= 10; i++)
			{
				System.out.println("Working on task " + i);
				Thread.sleep(1000); // Simulating work with sleep
			}
		} catch (InterruptedException e)
		{
			System.out.println("Thread was interrupted.");
		}
		System.out.println("Thread exiting...");
	}
}

public class ThreadInterruptDemo
{
	public static void main(String[] args)
	{
		Thread workerThread = new Thread(new MyRunnable(), "Worker Thread");

		workerThread.start(); 
		try
		{
			Thread.sleep(5000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		// Interrupt the worker thread
		System.out.println("Interrupting the thread...");
		workerThread.interrupt();
	}
}
