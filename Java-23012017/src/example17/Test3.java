package example17;
class Bank {
	int getRateofInterest()
	{
		return 10;
	}
}
class ICICI extends Bank
{
	int getRateofInterest()
	{
		return 7;
	}
}
class SBI extends Bank
{
	int getRateofInterest()
	{
		return 8;
	}
}
class HDFC extends Bank
{
	int getRateofInterest()
	{
		return 9;
	}
}
public class Test3 {

	public static void main(String[] args) {
		Bank b4 = new Bank();                          // upcasting
		Bank b1 = new ICICI();
		Bank b2 = new SBI();
		Bank b3 = new HDFC();
		System.out.println(b1.getRateofInterest());
		System.out.println(b2.getRateofInterest());
		System.out.println(b3.getRateofInterest());
		System.out.println(b4.getRateofInterest());
		

	}

}
