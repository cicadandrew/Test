

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 tt = new Test2();
		JFrame window = new JFrame("Test");
		JPanel P = new JPanel();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setBackground(Color.CYAN);
		window.add(tt);
		window.pack();
		
		
		window.setVisible(true);
		
	}

}
