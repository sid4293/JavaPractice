package example24;


public class Student18 implements Cloneable {

	int rollNo;
	String name;
	
	Student18(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String[] args) {
	try{
		Student18 s1=new Student18(007,"Siddhant");
		Student18 s2=(Student18)s1.clone();
		System.out.println(s1.rollNo+" "+s1.name);  
		System.out.println(s2.rollNo+" "+s2.name); 
	}catch(CloneNotSupportedException c){}
		
	}

}
