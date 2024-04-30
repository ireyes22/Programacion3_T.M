

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frmLogin;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JPanel panelSecond;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setLocation(0, 0);
		frmLogin.setBounds(100, 100, 541, 640);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(new CardLayout(0, 0));
		
		//se crea el panel de iniciar sesion
		JPanel panelLogin = new JPanel();
		frmLogin.getContentPane().add(panelLogin, "name_122035637687500");
		panelLogin.setLayout(new BorderLayout(0, 0));
		
		JPanel panelMain = new JPanel();
		panelMain.setBorder(new EmptyBorder(35, 25, 0, 25));
		panelMain.setBackground(Color.decode("#9BB0C1"));
		panelLogin.add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(new GridLayout(10, 1, 0, 0));
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setFont(new Font("Elephant", Font.PLAIN, 45));
		panelMain.add(lblLogin);
		
		//se le pide el username al usuario
		JLabel lblUsername = new JLabel("Username");//etiqueta
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setForeground(new Color(255, 255, 255));
		panelMain.add(lblUsername);
		
		txtUsername = new JTextField();//campo para ingresar lo solicitado
		txtUsername.setToolTipText("");
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(txtUsername);
		txtUsername.setColumns(10);
		
		//se le pide la contraseña al usuario
		JLabel lblPassword = new JLabel("Password");//etiqueta
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setForeground(new Color(255, 255, 255));
		panelMain.add(lblPassword);
		
		txtPassword = new JPasswordField();//campo para ingresar lo solicitado
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPassword.setEchoChar('*');
		panelMain.add(txtPassword);
		
		JLabel lblForgotPassword = new JLabel("Forgot password?");//etiqueta que pregunta si olvido la contraseña
		lblForgotPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblForgotPassword.setForeground(new Color(255, 255, 255));
		lblForgotPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelMain.add(lblForgotPassword);
		
		JButton btnLogin = new JButton("Login");//boton para acceder a otro panel
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JSONParser parser = new JSONParser();
				String usr = txtUsername.getText();
			    String pwd = new String(txtPassword.getPassword());
			    boolean found = false;
			    
				try {
		            
		            Object obj = parser.parse(new FileReader("src/user")); 
		            JSONObject jsonObject = (JSONObject) obj;
		           
		            JSONArray users = (JSONArray) jsonObject.get("users");

		            for (Object user : users) //muestra los usuarios y las contraseñas del JSON
		            {
		                JSONObject userObject = (JSONObject) user;
		                String username = (String) userObject.get("username");
		                String password = (String) userObject.get("password");
		                
		                System.out.println("Username: " + username);
		                System.out.println("Password: " + password);
		                System.out.println();
		                
		                if (usr.equals(username) && pwd.equals(password))//verifica si la contraseña ingresada se encuentra en el JSON
		                {
		                    found = true;
		                    break;
		                }
		                
		            }
		            
		            if (found)//si encuentra la contraseña, lanza un mensaje y cambia de panel 
		            {
		                found = true;
		                JOptionPane.showMessageDialog(null, "Welcome " + usr + "!");
		                CardLayout cardLayout = (CardLayout) frmLogin.getContentPane().getLayout();
				        cardLayout.show(frmLogin.getContentPane(), "panelMenu");
				        frmLogin.getContentPane().add(panelSecond, "panelMenu");
				        frmLogin.getContentPane().removeAll();
				        otroPanel();
						frmLogin.validate();
						frmLogin.repaint();
				     }
		            else//si no lo encuentra lanza un mensaje de error
		            {
		            	JOptionPane.showMessageDialog(null, "Incorrect username or password. Please try again.");
		            }
		            
		        } catch (IOException e1) 
				{
		            e1.printStackTrace();
		        } //Read json file path where json file in system
				catch (org.json.simple.parser.ParseException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnLogin.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 0, true), null));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(Color.decode("#51829B"));
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panelMain.add(btnLogin);
		
		JLabel lblRegister = new JLabel("Don't have an account? Register");//etiqueta de registrarse
		lblRegister.setForeground(new Color(255, 255, 255));
		lblRegister.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		panelMain.add(lblRegister);
		
		otroPanel();
		frmLogin.getContentPane().add(panelSecond, "panelWelcome");
	}
	
	
	public void otroPanel() {//crea otro panel de bienvenida
		panelSecond = new JPanel();
		frmLogin.getContentPane().add(panelSecond, "panelWelcome");
		panelSecond.setBackground(Color.decode("#9BB0C1"));
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setForeground(new Color(255, 255, 255));
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		panelSecond.add(lblWelcome);
		panelSecond.setVisible(true);
		
	}

}
