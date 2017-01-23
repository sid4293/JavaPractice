package example7;

public class Student8 {
	int rollno;
	String name;
	static String college="IIT-Delhi";    //static variable

	Student8(int r,String n,String c)
	{
		rollno=r;
		name=n;	
		college=c;
	}
	Student8(int r,String n)
	{
		rollno=r;
		name=n;	
		
	}
	
	public static void main(String[] args) {
		
  Student8 s1=new Student8(1,"A");
  System.out.println(s1.rollno+s1.name+Student8.college);       
  Student8 s2=new Student8(2,"B","IIT-Roorkee");
  System.out.println(s2.rollno+s2.name+Student8.college);
  Student8 s3=new Student8(3,"C");
  System.out.println(s3.rollno+s3.name+Student8.college);  // static variable is allocated memory at the time of class loading 
	}     												   // to avoid re-allocation of memory every time and once the value    	
														   // of static variable(college) changes it remains unchanged 
}
