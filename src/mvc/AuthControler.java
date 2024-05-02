package mvc;

import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class AuthControler {
	
	private JFrame frame;
	private AuthView view;
	
	public AuthControler() {
		
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 541, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0,1,0,0));
		
		view=new AuthView();
	}
	
	public void login() {
		frame.add(view.login());
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
}
