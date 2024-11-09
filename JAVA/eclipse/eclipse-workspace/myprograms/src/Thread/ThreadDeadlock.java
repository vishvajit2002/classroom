package Thread;
public class ThreadDeadlock
{
	private final String name;
	public ThreadDeadlock(String name)
	{
		this.name = name;
	}
	public String getname()
	{
		return this.name;
	}
	public synchronized void call(ThreadDeadlock caller)
	{
		System.out.println(this.getname() + "has asked to call me " + caller.getname());
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		caller.callMe(this);
	}
	// deadlock for 2 generated methods but lock on objects
	// caller1& caller2 forcing to wait for each other
	// unlock suck lock.this would trigger and
	// prevent callme() func from being called
	public synchronized void callMe(ThreadDeadlock caller)
	{
		System.out.println(this.getname() + "has called me " + caller.getname());
	}
	public static void main(String[] args)
	{
		ThreadDeadlock caller1 = new ThreadDeadlock("caller-1");
		ThreadDeadlock caller2 = new ThreadDeadlock("caller-2");
		new Thread(new Runnable()
		{
			public void run()
			{
				caller1.call(caller2);
			}
		}).start();
		new Thread(new Runnable()
		{
			public void run()
			{
				caller2.call(caller1);
			}
		}).start();
	}
}
