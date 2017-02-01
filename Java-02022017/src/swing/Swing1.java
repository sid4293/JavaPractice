package swing;

import javax.swing.*;
public class Swing1 {
	JFrame f;
	Swing1(){
		f= new JFrame();
		JButton b= new JButton("Click");
		b.setBounds(0,0,100,100);
		f.add(b);
		f.setSize(400,600);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
	new Swing1();
	}

}
