package Thread;

class MyThread implements Runnable
{
	private boolean exit;
	private String name;
	Thread t;

	MyThread(String threadname)
	{
		name = threadname;
		t = new Thread(this); // Pass 'this' to the Thread constructor, not the thread name
		System.out.println("New Thread: " + t);
		exit = false;
		t.start(); // Start the thread
	}

	public void run()
	{
		int i = 0;
		while (!exit)
		{
			System.out.println(name + " : " + i);
			i++;
			try
			{
				Thread.sleep(100); // Sleep for 100 milliseconds
			}
			catch (InterruptedException e)
			{
				System.out.println("Thread interrupted: " + e);
			}
		}
		System.out.println(name + " exiting...");
	}

	// Method to stop the thread
	public void stop()
	{
		exit = true;
	}
}

public class ThreadImplementation
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread("First thread");
		MyThread t2 = new MyThread("Second thread");

		try
		{
			Thread.sleep(500); // Main thread sleeps for 500 milliseconds
			t1.stop();         // Stop the first thread
			t2.stop();         // Stop the second thread
			Thread.sleep(200); // Main thread sleeps for another 200 milliseconds
		}
		catch (InterruptedException e)
		{
			System.out.println("Main thread interrupted: " + e);
		}
		System.out.println("Exiting main thread.");
	}
}
