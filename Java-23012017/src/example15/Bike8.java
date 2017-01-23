package example15;

 class A
{ int speed;
	A()
	{
		speed=70;
		System.out.println(speed);
	}
}
 public class Bike8 extends A {
	int speed;

	Bike8(){
		super();                     // calls the parent class constructor 1st and then copies the instance initialer block and calls it
		speed=100;
		System.out.println(speed);
	}

	{
		speed=50;
		System.out.println(speed);   // instance initializer is copied by the compiler after super() constructor so constructor is invoked
									 // first 
	}
	public static void main(String[] args) {
		Bike8 b=new Bike8();

	}

}
