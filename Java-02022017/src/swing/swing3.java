package swing;
import javax.swing.*;
import java.awt.event.*;


public class swing3 implements ActionListener {
	JFrame f=new JFrame();
	JButton b1,b2,b3,b4,b5;
	JTextField tf1,tf2;
	swing3()
	{  	
		f.setSize(400,400);
		b1=new JButton();
		b2=new JButton();		
		b3=new JButton();
		b4=new JButton();
		b5=new JButton();
		tf1=new JTextField();
		tf2=new JTextField();
		b1.setBounds(50,100,95,30);
		b2.setBounds(50,150,95,30);
		b3.setBounds(50,200,95,30);
		b4.setBounds(50,250,95,30);
		b5.setBounds(50, 300, 95, 30);
		tf1.setBounds(20, 0, 95, 30);
		tf2.setBounds(20, 50, 95, 30);
		f.add(b1);
		b1.setText("+");
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(tf1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	
	}
	public void actionPerformed(ActionEvent e)
	{
		int b=0;
		//while(e.getSource()!=b5)
		//{
			String s1=tf1.getText();
			int a;
			a=Integer.parseInt(s1);
			if(e.getSource()==b1)
			{	
				b=a+b;
			}
		//}
		if(e.getSource()==b5)
		{
		String result=String.valueOf(b);
		tf1.setText(result);
		}
	}
	
	public static void main(String[] args) {
		
		new swing3();
		
	}

}
