package example19;

abstract class Shape
{
	abstract void draw();
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle: Parallelogram with "
				+ "all angles of 90 degrees ");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle: extending a line "
				+ "such that it is equidistance from a point"
				+ " ");
	}
	
}

public class TestAbstraction1 {

	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		s1.draw();
	
	}

}
