package example14;

class Bank{
	int getRateOfInterest(){               // Over-riding getRateofInterest() method 
		return 0;
	}
}
class SBI extends Bank{
	int getRateOfInterest(){
		return 8;
	}
}
class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}

}
class HDFC extends Bank
{
	int getRateOfInterest()
	{
		return 10;
	}

}


public class Test1 {
	public static void main(String args[]){
		Bank b1=new Bank();
		SBI b2=new SBI();
		ICICI b3=new ICICI();
		HDFC b4=new HDFC();
		
		System.out.println(b1.getRateOfInterest());
		System.out.println(b2.getRateOfInterest());
		System.out.println(b3.getRateOfInterest());
		System.out.println(b4.getRateOfInterest());
		
		
	}

}
