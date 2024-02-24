import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	/*Constructor que define los atributos base
	 * de mi ventana */
	public Ventana() {

		//tamaño de la ventana
		this.setSize(1000, 500);
	
		//cerrar ventana por defecto
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//titulo
		this.setTitle("Mi ventana");
	
		//tamaños de la ventana
		this.setMinimumSize(new Dimension(250,250));//tamaño maximo
		this.setMaximumSize(new Dimension(1000,270));//tamaño minimo
		this.setResizable(true);
	
		//ubicacion en la pantalla
		this.setLocation(200,200);
	
		//quita el molde
		this.setLayout(null);
	
		//centrar
		this.setLocationRelativeTo(null);
	
		//agrega los componentes
		this.iniciarComponentes();
		
		//hace visible la pantalla
		this.setVisible(true);
	}
	
	public void iniciarComponentes() {
	
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());//el panel aparece a la mitad del frame
		login.setBackground(Color.pink);
		login.setBackground(new Color(128, 188, 189));//añade color en RGB
		login.setLayout(null);//quitar el molde
	
		JLabel login_title = new JLabel("ACCEDER",0);
		login_title.setSize(300, 80);//tamaño del texto
		login_title.setFont(new Font("Comic Sans MS",Font.BOLD,38));//establece fuente del texto
		login_title.setForeground(Color.blue);//cambiar color al texto
		login_title.setLocation(100,20);//añade en donde localizar el componente;
		login_title.setOpaque(true);//agrega fondo al texto
		login_title.setBackground(Color.ORANGE);//color al fondo del texto
		add(login_title);
		
		JLabel usuario = new JLabel("NOMBRE DE USUARIO: ");
		usuario.setBounds(10,120,250,40);//(x,y,ancho,alto)
		usuario.setFont(new Font("Comic Sans MS",Font.BOLD,20));//establece fuente del texto
		login.add(usuario);//añade el componente

		JTextField email = new JTextField();
	    email.setBounds(10, 160, 300, 40); // Ajustar las coordenadas y tamaño del campo de texto
	    login.add(email);

		JLabel contraseña = new JLabel("CONTRASEÑA: ");
		contraseña.setBounds(10,220,250,40);//(x,y,ancho,alto)
		contraseña.setFont(new Font("Comic Sans MS",Font.BOLD,20));//establece fuente del texto
		login.add(contraseña);//añade el componente

		JPasswordField pwd_field = new JPasswordField();
	    pwd_field.setBounds(10, 260, 300, 40); // Ajustar las coordenadas y tamaño del campo de contraseña
	    login.add(pwd_field);

		JCheckBox remember = new JCheckBox("Recordarme");
		remember.setBounds(10, 300, 150, 40);
		remember.setOpaque(false);//vuelve opaco el fondo de la casilla
		login.add(remember);

		JLabel forgot = new JLabel("¿Olvidó su contraseña?");
		forgot.setBounds(160,300,150,40);//(x,y,ancho,alto)
		login.add(forgot);//añade el componente

		JButton accept = new JButton("Acceder");
		accept.setFont(new Font("Comic Sans MS",Font.BOLD,28));//establece fuente del texto
		accept.setBounds(50, 340, 200, 70);
		login.add(accept);

	
		//size
		//location
		//background-opaque
		//string cosntructor
	
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setBackground(Color.BLUE);
		registro.setLocation(500,0);//el panel aparece en la otra mitad del frame
		registro.setBackground(new Color(170, 217, 187));//añade color en RGB
		registro.setLocation(500,0);//el panel aparece en la otra mitad del frame
	
		this.add(login);//añadir el panel de login
		//this.add(registro);//añadir el panel de registro
	
	}
}
