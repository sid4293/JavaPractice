package example12;


public class Power
{	
	
	Pow p1;
	Power()
	{
		p1=new Pow();
		
	}	
	
	public static void main(String[] args) {
		
		Power pow=new Power();
		System.out.println((pow.p1.p(2,3)));   // Power object has a object Pow which has a method p that returns power of a number raised to its exponent 
	}

}

class Pow
{   
    int p(int b , int e)
    {
    	int f=b;
    	for(int i=1;i<e;i++)
    	{
    		b=b*f;
    	}
    	return b;
    }
}

