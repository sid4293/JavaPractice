package example9;

public class Student9 {

	int rollno;
	String name;
	static String college="ABES";
	
	Student9(int r,String n)
	{
		rollno =r;
		name=n;
		
	}
	
	static void ChangeCollege(String n)
	{
		college=n;
		Student9 s1=new Student9(1, "abhishek");
		
		System.out.println(s1.rollno+s1.name+Student9.college);
	
	}
	
	
	public static void main(String[] args) {
		
		ChangeCollege("IIT");
		
	}

}
