package example16;

final public class Circle {				// final keyword used with class to restrict its extension
	final double pi;             //final keyword used to restrict value of pi ... this is blank final keyword
	double area;
	Circle()
	{
		pi=3.14;                             //final variable initialized here  
	}
	final double Area(final int r)			//final keyword to void method over riding and final parameter restrict parameter to change its value
	{
		

		area=pi * r*r;
		return area;
	}

	public static void main(String[] args)
	{
		Circle c=new Circle();
		System.out.println(c.Area(4));

	}

}
