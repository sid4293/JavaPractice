package example22;

interface Pizza
{
 void Crust();
 void Toppings();
 void Cheese();
}

abstract class Option2 implements Pizza
{
	public void Crust()                                        // Crust class need not to implement methods of Pizza as it is abstract
	{
		System.out.println("Crust Optional");
	}
}
class Option1 extends Option2
{
	public void Toppings()
	{
		System.out.println("Toppings Mandatory");
	}
	public void Cheese()
	{
		System.out.println("Cheese Mandatory");
	}
}
public class Test6 {

	public static void main(String[] args) {
	Pizza p=new Option1();
	p.Toppings();
	p.Cheese();
	p.Crust();
	
	}

}
