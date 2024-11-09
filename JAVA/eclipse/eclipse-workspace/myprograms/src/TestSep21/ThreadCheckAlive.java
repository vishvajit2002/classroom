package TestSep21;
class MyThread extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			System.out.println("Thread is running");
		} catch (InterruptedException e)
		{
			System.out.println("Thread interrupted");
		}
	}
}
public class ThreadCheckAlive
{
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		System.out.println("Before starting, is thread alive? " + t.isAlive());
		t.start();
		System.out.println("After starting, is thread alive? " + t.isAlive());
		try
		{
			t.join();
		} catch (InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
		System.out.println("After completion, is thread alive? " + t.isAlive());
	}
}
