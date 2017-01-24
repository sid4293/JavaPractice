package example20;

interface Printable
{ 	int a=6;
	void print();
}
interface Showable
{   int b=7;
	void print();
}

public class A6 implements Printable,Showable{
	public void print(){
		System.out.println("Hello"+a);
	}
public static void main(String args[])
{
	A6 obj=new A6();
	obj.print();
}
}
