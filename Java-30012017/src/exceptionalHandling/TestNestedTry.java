package exceptionalHandling;

public class TestNestedTry {

	public static void main(String[] args) {
	try
	{
	try	
	{
		int s=23/0;
		System.out.println(s);
	}catch(ArithmeticException e){System.out.println(e);}
		
	try
	{
		int a[]=new int[5];
		a[5]=5;
	}catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
	System.out.println("other statements");
	}catch(Exception e){System.out.println("Handled");}
	
	
System.out.println("normal flow..");  
	}
	}
