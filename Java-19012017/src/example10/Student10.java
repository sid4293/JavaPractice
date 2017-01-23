package example10;

public class Student10 {
	String name="A";
	String subject="Maths";

	Student10()
	{
		System.out.println(name+" "+subject);
	}
	Student10(String name,String subject)
	{ 	this();                                       //invokes current class constructor
		this.name=name;								  //value changed for current class variable	
		this.subject=subject;						  //value changed for current class variable
		
	}
	
	public static void main(String[] args) 
	{
		Student10 s1=new Student10("B","Science");
		System.out.println(s1.name+" "+s1.subject);
	}

}
