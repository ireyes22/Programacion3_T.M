package org.eclipse.wb.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;

public class nuevaTarea {

	private JFrame frame;
	private JTextField textUsuario;
	private JPasswordField passwordField;
	private JTextField textNombre;
	private JTextField textNombres;
	private JTextField textApellidos;
	private JTextField textCorreo;
	private JPasswordField password;
	private JPasswordField passwordConfirm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nuevaTarea window = new nuevaTarea();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public nuevaTarea() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 539, 634);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		
//		JPanel panel_login = new JPanel();
//		panel_login.setBackground(new Color(0, 153, 102));
//		frame.getContentPane().add(panel_login, "name_60430107011100");
//		panel_login.setLayout(new BorderLayout(0, 0));
//		
//		JPanel panel_2 = new JPanel();
//		panel_2.setBackground(new Color(0, 153, 102));
//		panel_login.add(panel_2, BorderLayout.NORTH);
//		
//		
//		JPanel panel_3 = new JPanel();
//		panel_3.setBackground(new Color(0, 153, 102));
//		panel_login.add(panel_3, BorderLayout.SOUTH);
//		
//		JLabel lblNewLabel_2 = new JLabel("New label");
//		lblNewLabel_2.setForeground(new Color(0, 153, 102));
//		panel_3.add(lblNewLabel_2);
//		
//		JPanel panel_4 = new JPanel();
//		panel_4.setBackground(new Color(0, 153, 102));
//		panel_login.add(panel_4, BorderLayout.WEST);
//		
//		JLabel lblNewLabel = new JLabel("New label");
//		lblNewLabel.setForeground(new Color(0, 153, 102));
//		panel_4.add(lblNewLabel);
//		
//		JPanel panel_5 = new JPanel();
//		panel_5.setBackground(new Color(0, 153, 102));
//		panel_login.add(panel_5, BorderLayout.EAST);
//		
//		JLabel lblNewLabel_1 = new JLabel("New label");
//		lblNewLabel_1.setForeground(new Color(0, 153, 102));
//		panel_5.add(lblNewLabel_1);
//		
//		JPanel panel_6 = new JPanel();
//		panel_6.setBackground(new Color(0, 153, 102));
//		panel_login.add(panel_6, BorderLayout.CENTER);
//		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
//		
//		JLabel lblNewLabel_3 = new JLabel("Acceso");
//		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
//		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
//		panel_6.add(lblNewLabel_3);
//		
//		JLabel lblNewLabel_4 = new JLabel("Usuario:");
//		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_6.add(lblNewLabel_4);
//		
//		textNombre = new JTextField();
//		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_6.add(textNombre);
//		textNombre.setColumns(10);
//		
//		JLabel lblNewLabel_5 = new JLabel("Contraseña:");
//		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_6.add(lblNewLabel_5);
//		
//		passwordField = new JPasswordField();
//		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_6.add(passwordField);
//		
//		JLabel lblNewLabel_6 = new JLabel("New label");
//		lblNewLabel_6.setForeground(new Color(0, 153, 102));
//		lblNewLabel_6.setBackground(new Color(0, 153, 102));
//		panel_6.add(lblNewLabel_6);
//		
//		JButton btnNewButton = new JButton("Acceder");
//		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String usr = textNombre.getText();				
//				String pwd = new String(passwordField .getPassword());
//				
//				//comprueba que el campo de usuario no este vacio 
//				if (usr.length()<=0) {
//					textNombre.setBorder(BorderFactory.createLineBorder(Color.red,2));
//                }
//				else {
//					textNombre.setBorder(BorderFactory.createLineBorder(Color.green,2));
//				}
//				
//				//comprueba que el campo de contraseña no este vacio
//				if (pwd.length()<=0) {
//					passwordField .setBorder(BorderFactory.createLineBorder(Color.red,2));
//                }
//				else {
//					passwordField .setBorder(BorderFactory.createLineBorder(Color.green,2));
//				}
//				
//				if(usr.length()==0 || pwd.length()==0) {
//					
//					JOptionPane.showMessageDialog( null, "Error al querer acceder",  "Un aviso", JOptionPane.ERROR_MESSAGE);
//				}
//			}
//		});
//		panel_6.add(btnNewButton);
//		
//		JLabel lblNewLabel_17 = new JLabel("¿Olvido su contraseña?");
//		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		panel_6.add(lblNewLabel_17);
//		
//		JLabel lblNewLabel_18 = new JLabel("¿No tienes cuenta? Registrate aquí");
//		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 15));
//		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
//		panel_6.add(lblNewLabel_18);
		
//		JPanel panel_registro = new JPanel();
//		frame.getContentPane().add(panel_registro, "name_60438502519400");
//		panel_registro.setLayout(new BorderLayout(0, 0));
//		
//		JPanel panel = new JPanel();
//		panel.setBackground(new Color(0, 153, 102));
//		panel_registro.add(panel, BorderLayout.NORTH);
//		
//		JLabel lblNewLabel_7 = new JLabel("New label");
//		lblNewLabel_7.setForeground(new Color(0, 153, 102));
//		panel.add(lblNewLabel_7);
//		
//		JPanel panel_7 = new JPanel();
//		panel_7.setBackground(new Color(0, 153, 102));
//		panel_registro.add(panel_7, BorderLayout.WEST);
//		
//		JLabel lblNewLabel_8 = new JLabel("New label");
//		lblNewLabel_8.setForeground(new Color(0, 153, 102));
//		panel_7.add(lblNewLabel_8);
//		
//		JPanel panel_8 = new JPanel();
//		panel_8.setBackground(new Color(0, 153, 102));
//		panel_registro.add(panel_8, BorderLayout.EAST);
//		
//		JLabel lblNewLabel_9 = new JLabel("New label");
//		lblNewLabel_9.setForeground(new Color(0, 153, 102));
//		panel_8.add(lblNewLabel_9);
//		
//		JPanel panel_9 = new JPanel();
//		panel_9.setBackground(new Color(0, 153, 102));
//		panel_registro.add(panel_9, BorderLayout.SOUTH);
//		
//		JLabel lblNewLabel_10 = new JLabel("New label");
//		lblNewLabel_10.setForeground(new Color(0, 153, 102));
//		panel_9.add(lblNewLabel_10);
//		
//		JPanel panel_10 = new JPanel();
//		panel_10.setBackground(new Color(0, 153, 102));
//		panel_registro.add(panel_10, BorderLayout.CENTER);
//		panel_10.setLayout(new GridLayout(13, 0, 0, 0));
//		
//		JLabel lblNewLabel_11 = new JLabel("Registro");
//		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
//		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
//		panel_10.add(lblNewLabel_11);
//		
//		JLabel lblNewLabel_12 = new JLabel("Nombres:");
//		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_10.add(lblNewLabel_12);
//		
//		textNombres = new JTextField();
//		textNombres.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_10.add(textNombres);
//		textNombres.setColumns(10);
//		
//		JLabel lblNewLabel_13 = new JLabel("Apellidos:");
//		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_10.add(lblNewLabel_13);
//		
//		textApellidos = new JTextField();
//		textApellidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_10.add(textApellidos);
//		textApellidos.setColumns(10);
//		
//		JLabel lblNewLabel_14 = new JLabel("Correo electronico:");
//		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_10.add(lblNewLabel_14);
//		
//		textCorreo = new JTextField();
//		textCorreo.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_10.add(textCorreo);
//		textCorreo.setColumns(10);
//		
//		JLabel lblNewLabel_15 = new JLabel("Contraseña:");
//		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_10.add(lblNewLabel_15);
//		
//		password = new JPasswordField();
//		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_10.add(password);
//		
//		JLabel lblNewLabel_16 = new JLabel("Confirmar contraseña:");
//		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_10.add(lblNewLabel_16);
//		
//		passwordConfirm = new JPasswordField();
//		passwordConfirm.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		panel_10.add(passwordConfirm);
//		
//		JCheckBox checkTerminos = new JCheckBox("He leido y acepto los terminos y condiciones");
//		checkTerminos.setFont(new Font("Tahoma", Font.PLAIN, 10));
//		checkTerminos.setBackground(new Color(0, 153, 102));
//		panel_10.add(checkTerminos);
//		
//		JButton btnNewButton_1 = new JButton("Registrarse");
//		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String nombre = textNombre.getText();	
//				String apellido = textApellidos.getText();
//				String correo = textCorreo.getText();	
//				String contra = new String(password.getPassword());
//				String confirmarContra = new String(passwordConfirm.getPassword());
//				
//				//comprueba que el campo de nombre no este vacio
//				if (nombre.length()<=0) {
//					textNombre.setBorder(BorderFactory.createLineBorder(Color.red,2));
//                }
//				else {
//					textNombre.setBorder(BorderFactory.createLineBorder(Color.green,2));
//				}
//				
//				//comprueba que el campo de apellido no este vacio
//				if (apellido.length()<=0) {
//					textApellidos.setBorder(BorderFactory.createLineBorder(Color.red,2));
//                }
//				else {
//					textApellidos.setBorder(BorderFactory.createLineBorder(Color.green,2));
//				}
//				
//				//comprueba que el campo de correo electronico no este vacio
//				if (correo.length()<=0) {
//					textCorreo.setBorder(BorderFactory.createLineBorder(Color.red,2));
//                }
//				else {
//					textCorreo.setBorder(BorderFactory.createLineBorder(Color.green,2));
//				}
//				
//				//comprueba que el campo de contraseña no este vacio
//				if (contra.length()<=0) {
//					password.setBorder(BorderFactory.createLineBorder(Color.red,2));
//                }
//				else {
//					password.setBorder(BorderFactory.createLineBorder(Color.green,2));
//				}
//				
//				//comprueba que el campo de confirmar contraseña no este vacio
//				if (confirmarContra.length()<=0) {
//					passwordConfirm.setBorder(BorderFactory.createLineBorder(Color.red,2));
//                }
//				else {
//					passwordConfirm.setBorder(BorderFactory.createLineBorder(Color.green,2));
//				}
//				
//				//manda mensaje si las contraseñas no son iguales
//				if(!contra.equals(confirmarContra)) {
//					JOptionPane.showMessageDialog( null, "Las contraseñas no son iguales",  "Alto ahi!", 0);
//				}
//				
//				//comprueba si el usuario acepto su destino
//				if(!checkTerminos.isSelected()) {
//					checkTerminos.setBorderPainted(true);
//					checkTerminos.setBorder(BorderFactory.createLineBorder(Color.red,2));
//				}
//				else {
//					checkTerminos.setBorder(null);
//					checkTerminos.setBorder(BorderFactory.createLineBorder(Color.green,2));
//				}
//				
//				if(nombre.length()!=0 && apellido.length()!=0 
//						&& correo.length()!=0 && contra.length()!=0 
//						&& confirmarContra.length()!=0 
//						&& checkTerminos.isSelected()) {
//					
//					JOptionPane.showMessageDialog( null, "Sucess",  "Bien hecho :)", JOptionPane.INFORMATION_MESSAGE);
//				}
//			}
//		});
//		panel_10.add(btnNewButton_1);
		
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("Cuenta");
        
        JMenuItem newItem = new JMenuItem("Login");
        newItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
                cardLayout.show(frame.getContentPane(), "login");
                frame.getContentPane().removeAll();
                login();
                frame.validate();
                frame.repaint();
        	}
        });
        fileMenu.add(newItem);
        
        JMenuItem openItem = new JMenuItem("Registro");
        openItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
        		frame.getContentPane().removeAll();
                cardLayout.show(frame.getContentPane(), "registro");
                register();
                frame.validate();
                frame.repaint();
        	}
        });
        fileMenu.add(openItem);
        
        JMenuItem recoverItem = new JMenuItem("Recuperar cuenta");
        recoverItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
                cardLayout.show(frame.getContentPane(), "recuperar cuenta");
                frame.getContentPane().removeAll();
        		recuperar();
                frame.validate();
                frame.repaint();
        	}
        });
        fileMenu.add(recoverItem);
        
        frame.setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        
        JMenu userItem = new JMenu("Usuario");
        menuBar.add(userItem);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Alta\r\n");
        userItem.add(mntmNewMenuItem);
        
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Baja");
        userItem.add(mntmNewMenuItem_1);
        
        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Consultar");
        userItem.add(mntmNewMenuItem_2);
        
        JMenu helpItem = new JMenu("Ayuda");
        menuBar.add(helpItem);
        
        JMenuItem mntmNewMenuItem_5 = new JMenuItem("¿Como crear un usuario?");
        helpItem.add(mntmNewMenuItem_5);
        
        JMenuItem mntmNewMenuItem_3 = new JMenuItem("¿Como acceder al sistema?");
        helpItem.add(mntmNewMenuItem_3);
        
        JMenuItem mntmNewMenuItem_4 = new JMenuItem("¿Que pasa si olvide mi contraseña?");
        helpItem.add(mntmNewMenuItem_4);
        
        login();
        register();
        recuperar();
	}
	
	public void login() {
		JPanel panel_login = new JPanel();
		panel_login.setBackground(new Color(0, 153, 102));
		frame.getContentPane().add(panel_login, "name_60430107011100");
		panel_login.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 153, 102));
		panel_login.add(panel_2, BorderLayout.NORTH);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 153, 102));
		panel_login.add(panel_3, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(new Color(0, 153, 102));
		panel_3.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 153, 102));
		panel_login.add(panel_4, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(0, 153, 102));
		panel_4.add(lblNewLabel);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 153, 102));
		panel_login.add(panel_5, BorderLayout.EAST);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(0, 153, 102));
		panel_5.add(lblNewLabel_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 153, 102));
		panel_login.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Acceso");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Usuario:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_6.add(lblNewLabel_4);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_6.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Contraseña:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_6.add(lblNewLabel_5);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_6.add(passwordField);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setForeground(new Color(0, 153, 102));
		lblNewLabel_6.setBackground(new Color(0, 153, 102));
		panel_6.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usr = textNombre.getText();				
				String pwd = new String(passwordField .getPassword());
				
				//comprueba que el campo de usuario no este vacio 
				if (usr.length()<=0) {
					textNombre.setBorder(BorderFactory.createLineBorder(Color.red,2));
                }
				else {
					textNombre.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				//comprueba que el campo de contraseña no este vacio
				if (pwd.length()<=0) {
					passwordField .setBorder(BorderFactory.createLineBorder(Color.red,2));
                }
				else {
					passwordField .setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				if(usr.length()==0 || pwd.length()==0) {
					
					JOptionPane.showMessageDialog( null, "Error al querer acceder",  "Un aviso", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel_6.add(btnNewButton);
		
		JLabel lblNewLabel_17 = new JLabel("¿Olvido su contraseña?");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_6.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("¿No tienes cuenta? Registrate aquí");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_18);
		
		frame.getContentPane().add(panel_login, "login");
	}
	
	public void register() {
		JPanel panel_registro = new JPanel();
		frame.getContentPane().add(panel_registro, "name_60438502519400");
		panel_registro.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 102));
		panel_registro.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setForeground(new Color(0, 153, 102));
		panel.add(lblNewLabel_7);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 153, 102));
		panel_registro.add(panel_7, BorderLayout.WEST);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setForeground(new Color(0, 153, 102));
		panel_7.add(lblNewLabel_8);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(0, 153, 102));
		panel_registro.add(panel_8, BorderLayout.EAST);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setForeground(new Color(0, 153, 102));
		panel_8.add(lblNewLabel_9);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(0, 153, 102));
		panel_registro.add(panel_9, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setForeground(new Color(0, 153, 102));
		panel_9.add(lblNewLabel_10);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 153, 102));
		panel_registro.add(panel_10, BorderLayout.CENTER);
		panel_10.setLayout(new GridLayout(13, 0, 0, 0));
		
		JLabel lblNewLabel_11 = new JLabel("Registro");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Nombres:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_10.add(lblNewLabel_12);
		
		textNombres = new JTextField();
		textNombres.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_10.add(textNombres);
		textNombres.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Apellidos:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_10.add(lblNewLabel_13);
		
		textApellidos = new JTextField();
		textApellidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_10.add(textApellidos);
		textApellidos.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Correo electronico:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_10.add(lblNewLabel_14);
		
		textCorreo = new JTextField();
		textCorreo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_10.add(textCorreo);
		textCorreo.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Contraseña:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_10.add(lblNewLabel_15);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_10.add(password);
		
		JLabel lblNewLabel_16 = new JLabel("Confirmar contraseña:");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_10.add(lblNewLabel_16);
		
		passwordConfirm = new JPasswordField();
		passwordConfirm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_10.add(passwordConfirm);
		
		JCheckBox checkTerminos = new JCheckBox("He leido y acepto los terminos y condiciones");
		checkTerminos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		checkTerminos.setBackground(new Color(0, 153, 102));
		panel_10.add(checkTerminos);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textNombre.getText();	
				String apellido = textApellidos.getText();
				String correo = textCorreo.getText();	
				String contra = new String(password.getPassword());
				String confirmarContra = new String(passwordConfirm.getPassword());
				
				//comprueba que el campo de nombre no este vacio
				if (nombre.length()<=0) {
					textNombre.setBorder(BorderFactory.createLineBorder(Color.red,2));
                }
				else {
					textNombre.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				//comprueba que el campo de apellido no este vacio
				if (apellido.length()<=0) {
					textApellidos.setBorder(BorderFactory.createLineBorder(Color.red,2));
                }
				else {
					textApellidos.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				//comprueba que el campo de correo electronico no este vacio
				if (correo.length()<=0) {
					textCorreo.setBorder(BorderFactory.createLineBorder(Color.red,2));
                }
				else {
					textCorreo.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				//comprueba que el campo de contraseña no este vacio
				if (contra.length()<=0) {
					password.setBorder(BorderFactory.createLineBorder(Color.red,2));
                }
				else {
					password.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				//comprueba que el campo de confirmar contraseña no este vacio
				if (confirmarContra.length()<=0) {
					passwordConfirm.setBorder(BorderFactory.createLineBorder(Color.red,2));
                }
				else {
					passwordConfirm.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				//manda mensaje si las contraseñas no son iguales
				if(!contra.equals(confirmarContra)) {
					JOptionPane.showMessageDialog( null, "Las contraseñas no son iguales",  "Alto ahi!", 0);
				}
				
				//comprueba si el usuario acepto su destino
				if(!checkTerminos.isSelected()) {
					checkTerminos.setBorderPainted(true);
					checkTerminos.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					checkTerminos.setBorder(null);
					checkTerminos.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				if(nombre.length()!=0 && apellido.length()!=0 
						&& correo.length()!=0 && contra.length()!=0 
						&& confirmarContra.length()!=0 
						&& checkTerminos.isSelected()) {
					
					JOptionPane.showMessageDialog( null, "Sucess",  "Bien hecho :)", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		panel_10.add(btnNewButton_1);
		
		frame.getContentPane().add(panel_registro, "registro");
		
		
	}

	public void recuperar() {
		JPanel panel_recuperar = new JPanel();
		frame.getContentPane().add(panel_recuperar, "name_957422848500");
		panel_recuperar.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 102));
		panel_recuperar.add(panel, BorderLayout.WEST);
		
		JLabel lblNewLabel_19 = new JLabel("New label");
		lblNewLabel_19.setForeground(new Color(0, 153, 102));
		panel.add(lblNewLabel_19);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 153, 102));
		panel_recuperar.add(panel_1, BorderLayout.EAST);
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setForeground(new Color(0, 153, 102));
		panel_1.add(lblNewLabel_20);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 153, 102));
		panel_recuperar.add(panel_2, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setForeground(new Color(0, 153, 102));
		panel_2.add(lblNewLabel_21);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 153, 102));
		panel_recuperar.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setForeground(new Color(0, 153, 102));
		panel_3.add(lblNewLabel_22);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 153, 102));
		panel_recuperar.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(5, 0, 0, 0));
		
		JLabel lblNewLabel_23 = new JLabel("Recuperar cuenta");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_23);
	}
	
	







}
