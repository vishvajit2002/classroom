package Thread;
class ThreadImpl implements Runnable
{
	private boolean exit;
	private String name;
	Thread t;

	ThreadImpl(String threadname)
	{
		name = threadname;
		t = new Thread(this.name);
		System.out.println("New Thread" + t);
		exit = false;
		t.start();
	}

	public void run()
	{
		int i = 0;
		while (!exit)
		{
			System.out.println(name + " :" + i);
			i++;
			try
			{
				Thread.sleep(100);
			} catch (InterruptedException e)
			{
				System.out.println("caught" + e);

			}
		}
	}

	public void stop()
	{
		exit = true;
	}
}

public class ThreadImplementation1
{
	public static void main(String[] args) 
		{
			ThreadImpl t1=new ThreadImpl("First thread");
			ThreadImpl t2=new ThreadImpl("Second thread");
			
			try 
			{
				Thread.sleep(200);
				t1.stop();
				t2.stop();
				Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
				System.out.println("Caught"+e);
			}
			System.out.println("Exit the main thread");
		}
}
