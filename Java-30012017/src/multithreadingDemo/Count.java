package multithreadingDemo;

public class Count extends Thread {
	Count()
	{
		super("my extending thread");
		System.out.println("my thread created" + this);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Printing the count "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println("my thread interrupted");
		}
		System.out.println("mythread is over");
	}
	
	public static void main(String[] args) 
	{
		Count cnt = new Count();
		try
		{
			while(cnt.isAlive())
			{
				System.out.println("Main thread will be alive till the child thread is alive "
						+ ""
						+ "kjk");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println("Main Thread is Interrupted");
		}
		System.out.println("Main thread run is over");
	}

}
