package example6;

public class Student4 {
    int id;
    String name;
    int age;
	Student4(int i,String n)
	{
		initial(i,n);
	}
	void initial(int i,String n)
	{
		id=i;
		name=n;
	}	
	Student4(int i,String n,int a)   // Constructor Overloading
	{
		initial(i,n);
		age=a;
		
	}
	Student4(Student4 s)    //Copy constructor
	{
		id=s.id;
		name=s.name;
		age=s.age;
	}
	public static void main(String[] args) {
		Student4 s1 = new Student4(1,"A");
		Student4 s2 = new Student4(s1);    //Copy using constructor //s1 object data in s2 
		Student4 s3 = new Student4(3,"C",5);   
		System.out.println(s1.id+s1.name+s1.age);
		System.out.println(s2.id+s2.name);//
		System.out.println(s3.id+s3.name+s3.age);
		System.out.println(s2.age+s2.name);
		s1.age=s3.age;                      // Copy without using constructor
		System.out.println(s1.id+s1.name+s1.age); // age from s3 object to s1 object
		
		
	}

}
