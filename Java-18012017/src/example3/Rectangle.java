package example3;

public class Rectangle {
	int length;
	int breadth;
	int area=length*breadth;
	void displayArea()
	{   
		System.out.println("Area of the rectangle is "+ area);
	}
	void insertPara(int l, int b)
	{ 
		
		length=l;
		breadth=b;
		area=length*breadth;
	}
	
	public static void main(String[] args) {
		
	Rectangle r1= new Rectangle();
	r1.insertPara(6,4);
	r1.displayArea();
	}

}
