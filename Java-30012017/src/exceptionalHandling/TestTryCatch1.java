package exceptionalHandling;

public class TestTryCatch1  {
	TestTryCatch1()
	{
		throw new ArithmeticException("Infinity");
	}

	public static void main(String[] args) {
try{
		TestTryCatch1 t=new TestTryCatch1();
		
			int data=50/0;
			System.out.println(data);
		}catch(Exception e)
		{System.out.println(e);}
	
		System.out.println("rest of the code");
		
	}

}
