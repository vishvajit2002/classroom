package Thread;
public class ThreadRunnab implements Runnable
{
	public void run()
	{
		System.out.println("thread is running successfully");
	}
	public static void main(String[] args)
	{
		
		Runnable r1= new ThreadRunnab();
		Thread t1=new Thread(r1, "myThread");
		t1.start();
		String str=t1.getName();
		System.out.println(str);
	}
}
