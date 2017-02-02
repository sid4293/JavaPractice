package swing;
import javax.swing.*;
//import java.awt.*;  
//import java.awt.event.*;  
public class swing4{
	JFrame f;
	JLabel j1,j2;
	
	swing4()
	{
		f=new JFrame("Simple1");
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
	
	}
	void simple1()
	{
		
		j1=new JLabel();
		j2=new JLabel();
		j1.setBounds(20, 30, 70,30);
		j1.setText("Hello");
		j2.setBounds(20, 60, 70,30);
		j2.setText("Siddhant");
		f.add(j1);
		f.add(j2);
	}
	
				
	public static void main(String[] args)
	{
		swing4 s1=new swing4();
		s1.simple1();
	}

}

