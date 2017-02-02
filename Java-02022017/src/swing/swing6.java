package swing;
import javax.swing.*;

public class swing6 {
	
	swing6()
	{
		JFrame f=new JFrame();
		JTextArea ta = new JTextArea();
		ta.setBounds(0, 0, 200, 300);
		f.setSize(500,500);
		f.add(ta);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args)
	{
		new swing6();
			}

}
