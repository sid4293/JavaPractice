package example4;

public class Calculation {
	
	void fact(int n)
	{
		int fact=n;
		for(int i=n-1;i>0;--i)
		{
			fact=fact*i;
		}
	System.out.println("The factorial of "+n+" is "+fact);
	}

	public static void main(String[] args) {
		new Calculation().fact(5); // anonymous object

	}

}
