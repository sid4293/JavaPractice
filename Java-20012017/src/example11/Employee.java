package example11;

public class Employee {

	String ename;
	int salary;
	public static void main(String[] args) {
	Employee e1=new Employee();                              // object can access only Employee class data members
	HR h1=new HR("Siddhant",29000,9000);					 // object can access both Employee and HR class data members 
	HR h2=new HR("Siddhant",29000);
	Programmer p1=new Programmer("Priyanka",26000,4000);
	Programmer p2=new Programmer("Priyanka",26000);
															//for e1
	System.out.println("E.Name = "+e1.ename );
	System.out.println("Salary = "+e1.salary );
															//for h1
	System.out.println("E.Name = "+h1.ename );
	System.out.println("Salary = "+h1.salary );
	System.out.println("Bonus = "+ h1.bonus);
	System.out.println("Total Salary = "+ h1.totalsal);
															//for h2
	System.out.println("E.Name = "+h2.ename );
	System.out.println("Salary = "+h2.salary );
	System.out.println("Bonus = "+ h2.bonus);
	System.out.println("Total Salary = "+ h2.totalsal);
															//for p1
	System.out.println("E.Name = "+p1.ename );
	System.out.println("Salary = "+p1.salary );
	System.out.println("Bonus = "+ p1.appraisal);
	System.out.println("Total Salary = "+ p1.totalsal);
															//for p2
	System.out.println("E.Name = "+p2.ename );
	System.out.println("Salary = "+p2.salary );
	System.out.println("Bonus = "+ p2.appraisal);
	System.out.println("Total Salary = "+ p2.totalsal);

	}

}
class HR extends Employee{                         // class HR inherits  from parent class Employee
												   // HR is an Employee who has bonus as an extra data member 
	Extra b;
	int bonus;
	int totalsal;
	HR(String n,int sal,int b)						//HR has a Extra class bonus method
	{
		this.b=new Extra();
		ename=n;
		salary=sal;
		bonus=this.b.Bonus(b);
		totalsal=salary+bonus;
	}
	HR(String n,int sal)							//HR has a Extra class bonus variable
	{
		this.b=new Extra();
		ename=n;
		salary=sal;
		bonus=this.b.b;	
		totalsal=salary+bonus;
	}

}

class Programmer extends Employee{                         // class Programmer inherits  from parent class Employee
														   // Programmer is an Employee who has appraisal has an extra data member
	Extra a;
	int appraisal;
	int totalsal;
	Programmer(String n,int sal,int a)						//Programmer has a Extra appraisal method
	{
		this.a=new Extra();
		ename=n;
		salary=sal;
		appraisal=this.a.Appraisal(a);	
		totalsal=salary+appraisal;
	}
	Programmer(String n,int sal)
	{
		this.a=new Extra();									//Programmer has an Extra class appraisal variable
		ename=n;
		salary=sal;
		appraisal=this.a.b;	
		totalsal=salary+appraisal;
	}


}

class Extra{
	int b=7000;
	int a=3000;
	int Bonus(int b)
	{
		return b;
	}
	int Appraisal(int a)
	{
		return a;
	}
}

	
