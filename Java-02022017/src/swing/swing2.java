package swing;
import javax.swing.*;

public class swing2 {
	JFrame f1;
	Button1 b1;
	swing2(){
		f1=new JFrame();
		b1=new Button1();
		
		f1.add(b1.b1);
		f1.setSize(600, 400);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	}
	

	public static void main(String[] args) {
	     new swing2();

	}

}

class Button1{
	JButton b1;
	Button1()
	{	
		b1=new JButton(new ImageIcon("D:\\egit.png"));
		b1.setBounds(10, 10, 100, 100);
	}
	
	
}

class Button2
{
	JButton b1;
Button2()
{	
	b1=new JButton(new ImageIcon("D:\\egit.png"));
	b1.setBounds(10, 10, 100, 100);
}

	}

