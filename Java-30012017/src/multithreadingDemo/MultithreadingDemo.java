package multithreadingDemo;

class MultithreadingDemo extends Thread {
public void run()
{
	System.out.println("My thread is in running state");
}
	public static void main(String[] args) {
	
		MultithreadingDemo m = new MultithreadingDemo();
		m.start();
	}

}
