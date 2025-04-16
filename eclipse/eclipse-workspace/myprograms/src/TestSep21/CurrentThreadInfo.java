package TestSep21;
public class CurrentThreadInfo
{
	public static void main(String[] args)
	{
		Thread currentThread = Thread.currentThread();

		System.out.println("Thread Name: " + currentThread.getName());

		System.out.println("Thread ID: " + currentThread.getId());

		System.out.println("Thread Priority: " + currentThread.getPriority());

		System.out.println("Thread State: " + currentThread.getState());

		System.out.println("Is Daemon: " + currentThread.isDaemon());

		System.out.println("Is Alive: " + currentThread.isAlive());
	}
}
