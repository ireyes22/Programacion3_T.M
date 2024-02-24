import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	/*Constructor que define los atributos base
	 * de mi ventana */
	public Ventana() {

		//tamaño de la ventana
		this.setSize(1000,750);
	
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
	
		this.login();

		//size
		//location
		//background-opaque
		//string cosntructor

		JPanel registro = new JPanel();//crear otro panel
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setBackground(Color.decode("#9195F6"));//añade color en RGB
		registro.setLocation(500,0);//el panel aparece en la otra mitad del frame
		registro.setLayout(null);

		JLabel login_title = new JLabel("REGISTRO",0);
		login_title.setSize(300, 80);//tamaño del texto
		login_title.setFont(new Font("Comic Sans MS",Font.BOLD,38));//establece fuente del texto
		login_title.setForeground(Color.white);//cambiar color al texto
		login_title.setLocation(100,20);//añade en donde localizar el componente
		login_title.setOpaque(true);//agrega fondo al texto
		login_title.setBackground(Color.BLACK);//color al fondo del texto
		registro.add(login_title);

		JLabel usuario = new JLabel("NOMBRE DE USUARIO: ",0);
		usuario.setBounds(50,120,400,40);//(x,y,ancho,alto)
		usuario.setFont(new Font("Comic Sans MS",Font.BOLD,20));//establece fuente del texto
		usuario.setOpaque(true);
		usuario.setBackground(Color.yellow);
		registro.add(usuario);//añade el componente

		JTextField name_text = new JTextField();
		name_text.setBounds(50, 160, 400, 40); // Ajustar las coordenadas y tamaño del campo de texto
		name_text.setHorizontalAlignment(0);//alinear al centro
		name_text.setFont(new Font("Comic Sans MS",Font.ITALIC,17));
	    registro.add(name_text);

	    JLabel bio = new JLabel("BIOGRAFIA",0);
	    bio.setBounds(50, 200, 400, 40);
	    bio.setFont(new Font("Comic Sans MS",Font.BOLD,20));//establece fuente del texto
	    registro.add(bio);//añade el componente

	    JTextArea bio_text = new JTextArea();//escribir varias lineas de texto
	    bio_text.setBounds(50, 240, 400, 80);
	    bio_text.setFont(new Font("Comic Sans MS",Font.ITALIC,17));
	    registro.add(bio_text);

	    JLabel prefer = new JLabel("PREFERENCIAS",0);
	    prefer.setBounds(50, 320, 400, 40);
	    prefer.setFont(new Font("Comic Sans MS",Font.BOLD,20));//establece fuente del texto
	    registro.add(prefer);//añade el componente

		JCheckBox item_box1=new JCheckBox("Dulce");
		item_box1.setBounds(50, 360, 80, 40);
		item_box1.setFont(new Font("Comic Sans MS",Font.BOLD,20));//establece fuente del texto
		item_box1.setOpaque(false);
		//item_box1.setBackground(Color.red);
		registro.add(item_box1);

		JCheckBox item_box2=new JCheckBox("Salado");
		item_box2.setBounds(140, 360, 90, 40);
		item_box2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		item_box2.setOpaque(false);
		//item_box2.setBackground(Color.red);
		registro.add(item_box2);

		JCheckBox item_box3=new JCheckBox("Saludable");
		item_box3.setBounds(240, 360, 120, 40);
		item_box3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		item_box3.setOpaque(false);
		//item_box3.setBackground(Color.red);
		item_box3.setBorderPainted(true);//agregar bordes
		item_box3.setBorder(BorderFactory.createLineBorder(Color.blue,2));//pintar bordes 
		registro.add(item_box3);

		 JLabel terminos = new JLabel("TERMINOS",0);
	    terminos.setBounds(50, 400, 400, 40);
	    terminos.setFont(new Font("Comic Sans MS",Font.BOLD,20));
	    terminos.setOpaque(true);//agrega fondo al texto
		terminos.setBackground(Color.YELLOW);//color al fondo del texto
	    registro.add(terminos);

	    JRadioButton acceptRadio = new JRadioButton("Acepto los terminos");
	    acceptRadio.setBounds(50, 440, 200, 40);
	    acceptRadio.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	    acceptRadio.setOpaque(false);
	    registro.add(acceptRadio);

	    JRadioButton noAcceptRadio = new JRadioButton("No acepto los terminos");
	    noAcceptRadio.setBounds(250, 440, 200, 40);
	    noAcceptRadio.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	    noAcceptRadio.setOpaque(false);
	    registro.add(noAcceptRadio);

	    ButtonGroup terms = new ButtonGroup();//agrupa los radios buttons
	    terms.add(acceptRadio);
	    terms.add(noAcceptRadio);

	    String colonia[]= {"Centro", "Camino Real","Pedregal","Conchalito","La 8"};
	    JComboBox location = new JComboBox(colonia);
	    location.setBounds(50, 480, 400, 40);
	    location.setFont(new Font("Comic Sans MS",Font.BOLD,20));
	    registro.add(location);

	    JButton accept = new JButton("Crear Cuenta");
		accept.setFont(new Font("Comic Sans MS",Font.BOLD,28));//establece fuente del texto
		accept.setBounds(50, 530, 400, 70);
		registro.add(accept);

		this.add(registro);//añadir el panel de registro

		this.repaint();
		this.validate();
	}
	
	public void login() {

		JPanel login = new JPanel();
		login.setSize(this.getWidth(), this.getHeight());
		login.setBackground(Color.red);
		this.add(login);
		login.setSize(this.getWidth()/2, this.getHeight());//el panel aparece a la mitad del frame
		login.setBackground(new Color(128, 188, 189));//añade color en RGB
		login.setLayout(null);//quitar el molde

		JLabel login_title = new JLabel("ACCEDER",0);
		login_title.setSize(300, 80);//tamaño del texto
		login_title.setFont(new Font("Comic Sans MS",Font.BOLD,38));//establece fuente del texto
		login_title.setForeground(Color.blue);//cambiar color al texto
		login_title.setLocation(100,20);//añade en donde localizar el componente
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

		this.add(login);//añadir el panel de login
	}
}
