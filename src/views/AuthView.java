package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controllers.Auth;
import models.AuthModel;


public class AuthView {
	
	private JFrame frame;
	private Auth controller;
	private AuthModel auth;

	public AuthView() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 541, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0,1,0,0));
		
		auth = new AuthModel();
		//controller = new Auth();
	}
	
	public void login() {
		//frame.add();
		JPanel panel= new JPanel();
		
		panel.setBackground(Color.decode("#9BB0C1"));
//		panel.setLayout(new BorderLayout(0, 0));

//		JPanel panelMain = new JPanel();
		panel.setBorder(new EmptyBorder(35, 25, 0, 25));
//		panelMain.setBackground(Color.decode("#9BB0C1"));
//		panel.add(panelMain, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(10, 1, 0, 0));

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setFont(new Font("Elephant", Font.PLAIN, 45));
		panel.add(lblLogin);

		//se le pide el username al usuario
		JLabel lblUsername = new JLabel("Username");//etiqueta
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setForeground(new Color(255, 255, 255));
		panel.add(lblUsername);

		JTextField txtUsername = new JTextField();//campo para ingresar lo solicitado
		txtUsername.setToolTipText("");
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(txtUsername);
		txtUsername.setColumns(10);

		//se le pide la contraseña al usuario
		JLabel lblPassword = new JLabel("Password");//etiqueta
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setForeground(new Color(255, 255, 255));
		panel.add(lblPassword);

		JPasswordField txtPassword = new JPasswordField();//campo para ingresar lo solicitado
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPassword.setEchoChar('*');
		panel.add(txtPassword);

		JLabel lblForgotPassword = new JLabel("Forgot password?");//etiqueta que pregunta si olvido la contraseña
		lblForgotPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblForgotPassword.setForeground(new Color(255, 255, 255));
		lblForgotPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblForgotPassword);

		JButton btnLogin = new JButton("Login");//boton para acceder a otro panel
		btnLogin.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 0, true), null));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(Color.decode("#51829B"));
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame.remove(panel);
				//register();
//				controller = new Auth();
//				frame.removeAll();
//				frame.setVisible(false);
//				controller.register();
				
				auth.login(txtUsername.getText(),txtPassword.getText());
				
				
			}
		});
		panel.add(btnLogin);

		JLabel lblRegister = new JLabel("Don't have an account? Register");//etiqueta de registrarse
		lblRegister.setForeground(new Color(255, 255, 255));
		lblRegister.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				controller = new Auth();
				frame.removeAll();
				frame.setVisible(false);
				controller.register();
				
			} 
			
		});
		panel.add(lblRegister);

		frame.add(panel);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
	
	public void register() {
		JPanel panel= new JPanel();
		
		panel.setBackground(Color.decode("#9BB0C1"));
//		panel.setLayout(new BorderLayout(0, 0));

//		JPanel panelMain = new JPanel();
		panel.setBorder(new EmptyBorder(35, 25, 0, 25));
//		panelMain.setBackground(Color.decode("#9BB0C1"));
//		panel.add(panelMain, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(10, 1, 0, 0));

		JLabel lblLogin = new JLabel("Create account");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setFont(new Font("Elephant", Font.PLAIN, 45));
		panel.add(lblLogin);

		//se le pide el username al usuario
		JLabel lblUsername = new JLabel("Username");//etiqueta
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setForeground(new Color(255, 255, 255));
		panel.add(lblUsername);

		JTextField txtUsername = new JTextField();//campo para ingresar lo solicitado
		txtUsername.setToolTipText("");
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(txtUsername);
		txtUsername.setColumns(10);

		//se le pide la contraseña al usuario
		JLabel lblPassword = new JLabel("Password");//etiqueta
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setForeground(new Color(255, 255, 255));
		panel.add(lblPassword);

		JPasswordField txtPassword = new JPasswordField();//campo para ingresar lo solicitado
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPassword.setEchoChar('*');
		panel.add(txtPassword);

		JLabel lblForgotPassword = new JLabel("Forgot password?");//etiqueta que pregunta si olvido la contraseña
		lblForgotPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblForgotPassword.setForeground(new Color(255, 255, 255));
		lblForgotPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblForgotPassword);

		JButton btnLogin = new JButton("Login");//boton para acceder a otro panel
		btnLogin.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 0, true), null));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(Color.decode("#51829B"));
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel.add(btnLogin);

		JLabel lblRegister = new JLabel("Don't have an account? Register");//etiqueta de registrarse
		lblRegister.setForeground(new Color(255, 255, 255));
		lblRegister.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblRegister);

		frame.add(panel);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
		
	}

}
