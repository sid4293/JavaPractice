package example5;

public class Calculation1 {
	int Multiply(int a,int b,int c)
	{
		return a*b*c;
	}

	int Multiply(int a,int b)
	{
		return a*b;
	}
	double Multiply(float a,long b)
	{
		return a*b;
	}
	public static void main(String[] args) {
	 Calculation1 c1= new Calculation1();
	 System.out.println(c1.Multiply(5,6));
	 System.out.println(c1.Multiply(5,6,15)); 
	 System.out.println(c1.Multiply(2,6));
	}

}
