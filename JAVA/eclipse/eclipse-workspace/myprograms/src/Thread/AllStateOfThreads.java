package Thread;

public class AllStateOfThreads implements Runnable
{
    public void run()
    {
        try
        {
            Thread.sleep(1500);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("State of thread1 while it called join(): " + Test.thread1.getState());

        try
        {
            Thread.sleep(200);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static class Test implements Runnable
    {
        public static Thread thread1;
        public static Test obj;

        public static void main(String args[])
        {
            // Create the Test object and assign it to a thread
            obj = new Test();
            thread1 = new Thread(obj);

            // Thread1 created and currently in the NEW state
            System.out.println("State of thread1 after creating it: " + thread1.getState());

            thread1.start(); // Moving thread1 to runnable state
            System.out.println("State of thread1 after calling start(): " + thread1.getState());

            try
            {
                // Waiting for thread1 to terminate
                thread1.join();
                System.out.println("State of thread1 after finishing execution: " + thread1.getState());
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        public void run()
        {
            AllStateOfThreads myThread = new AllStateOfThreads();
            Thread thread2 = new Thread(myThread);

            // Thread2 created and currently in the NEW state
            System.out.println("State of thread2 after creating it: " + thread2.getState());

            thread2.start(); // Moving thread2 to runnable state
            System.out.println("State of thread2 after calling start(): " + thread2.getState());

            try
            {
                // Wait for thread2 to terminate
                thread2.join();
                System.out.println("State of thread2 after finishing execution: " + thread2.getState());
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
