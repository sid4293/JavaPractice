package exceptionalHandling;
import java.io.*	;

public class ThrowExample {
	void mymethod(int num) throws IOException,ClassNotFoundException{
		if(num==1)
			throw new IOException("IOException Handled");
		else
			throw new ClassNotFoundException("Message 2");
	}

	public static void main(String[] args) {
		ThrowExample a=new ThrowExample();
		try{
			a.mymethod(2);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}


