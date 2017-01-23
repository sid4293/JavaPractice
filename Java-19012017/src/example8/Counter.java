package example8;

public class Counter {
    int count1=0;                // instance variable gets memory each time its called
    static int count2=0;		 // static variable gets memory only one time
    
    Counter()
    {
    	count1++;  				 
    	count2++;
    	
    }
    void Display()
    {
    	System.out.println("Count1 = "+count1+" & Count2 = "+count2);
    }
	public static void main(String[] args) {
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
 		c1.Display();
 		c2.Display();
 		c3.Display();
 		
	}

}
