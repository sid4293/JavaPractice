package example2;

public class Student2 {
    int id;
    String name;
    
    void insertRecord(int i,String n)
    {
    	id=i;
    	name=n;
    }
    void displayInformation()
    {
       System.out.println("Student with ID "+id+" is "+name);	
    }
    
	public static void main(String[] args) 
	{
       Student2 s1= new Student2();
       Student2 s2= new Student2(); 
       s1.insertRecord(1, "A");
       s2.insertRecord(2, "B");
       s1.displayInformation();
       s2.displayInformation();
	}

}
