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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
	
		//this.login();
		//this.registro();
		//this.admin();
		this.calculator();

		//size
		//location
		//background-opaque
		//string cosntructor

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
	
	public void registro() {
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
	}
	
	public void admin() {
		//añadir panel
		JPanel adminPanel = new JPanel();//crear otro panel
		adminPanel.setSize(this.getWidth(), this.getHeight());
		adminPanel.setBackground(Color.decode("#FF407D"));//añade color en RGB
		adminPanel.setLocation(0,0);//el panel aparece en la otra mitad del frame
		adminPanel.setLayout(null);//quitar el molde para modificar

		//añadir menu
		JMenuBar barra = new JMenuBar();//crea menu padre

		JMenu menuFile = new JMenu("Archivo");//añade un menu

		JMenuItem openItem = new JMenuItem("Abrir archivo");//añade submenus al menu
		JMenuItem createItem = new JMenuItem("Crear archivo");

		barra.add(menuFile);//relaciona los menus (los junta)
		menuFile.add(openItem);
		menuFile.add(createItem);

		this.setJMenuBar(barra);

		//titulo
		JLabel login_title = new JLabel("USUARIOS",0);
		login_title.setSize(300, 80);//tamaño del texto
		login_title.setFont(new Font("Comic Sans MS",Font.BOLD,38));//establece fuente del texto
		login_title.setForeground(Color.white);//cambiar color al texto
		login_title.setLocation(350,20);//añade en donde localizar el componente
		login_title.setOpaque(true);//agrega fondo al texto
		login_title.setBackground(Color.BLACK);//color al fondo del texto
		adminPanel.add(login_title);

		/*JLabel widget = new JLabel();
		widget.setBounds(40,120,300,100);
		widget.setOpaque(true);
		widget.setBackground(Color.BLACK);
		adminPanel.add(widget);*/

		JLabel title_widget = new JLabel("Total de usuarios",0);
		title_widget.setFont(new Font("Comic Sans MS",Font.BOLD,20));//establece fuente del texto
		title_widget.setBounds(40,120,300,40);
		title_widget.setForeground(Color.white);
		adminPanel.add(title_widget);

		JLabel number_widget = new JLabel("100",0);
		number_widget.setFont(new Font("Comic Sans MS",Font.BOLD,20));//establece fuente del texto
		number_widget.setBounds(40,160,300,40);
		number_widget.setForeground(Color.white);
		adminPanel.add(number_widget);

		JLabel widget = new JLabel();
		widget.setBounds(40,120,300,100);
		widget.setOpaque(true);
		widget.setBackground(Color.BLACK);
		adminPanel.add(widget);

		//botones
		JButton descargar = new JButton("Exportar");
		descargar.setBounds(750,230,100,40);
		descargar.setOpaque(true);
		descargar.setBackground(Color.white);
		adminPanel.add(descargar);

		JButton addUser = new JButton("Añadir");
		addUser.setBounds(860,230,100,40);
		addUser.setOpaque(true);
		addUser.setBackground(Color.white);
		adminPanel.add(addUser);

		//añadir tabla

		String title[]= {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"};
		String tableData[][]= {
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
				{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"}
		};

		JTable tablaUser = new JTable(tableData,title);
		//tablaUser.setBounds(40,280,920,300);
		JScrollPane tableScroll = new JScrollPane(tablaUser);
		tableScroll.setBounds(40,280,920,300);
		adminPanel.add(tableScroll);

		this.add(adminPanel);//añade el nuevo panel al frame
	}

	public void calculator() {
		
		JPanel calculator = new JPanel();
		calculator.setSize(this.getWidth()/2, this.getHeight());
		calculator.setBackground(Color.decode("#0F0F0F"));//añade color en RGB
		calculator.setLocation(0,0);//el panel aparece en la otra mitad del frame
		calculator.setLayout(null);//quitar el molde para modificar
		
		JTextField pantalla = new JTextField ();//pantalla de la calculadora
		pantalla.setBounds(20,20,460,100);
		pantalla.setBackground(Color.decode("#232D3F"));
		calculator.add(pantalla);
		
		JButton borrar = new JButton("CE");
		borrar.setBounds(20,140,100,90);
		borrar.setOpaque(true);
		borrar.setBackground(Color.decode("#232D3F"));
		borrar.setFont(new Font("Franklin Gothic",Font.BOLD,30));//establece fuente del texto
		borrar.setForeground(Color.decode("#008170"));//cambiar color al texto
		calculator.add(borrar);
		
		JButton boton1 = new JButton("");
		boton1.setBounds(140,140,100,90);
		boton1.setOpaque(true);
		boton1.setBackground(Color.decode("#232D3F"));
		calculator.add(boton1);
		
		JButton boton2 = new JButton("");
		boton2.setBounds(260,140,100,90);
		boton2.setOpaque(true);
		boton2.setBackground(Color.decode("#232D3F"));
		calculator.add(boton2);
		
		JButton boton3 = new JButton("");
		boton3.setBounds(380,140,100,90);
		boton3.setOpaque(true);
		boton3.setBackground(Color.decode("#232D3F"));
		calculator.add(boton3);
		
		JButton btnSiete = new JButton("7");
		btnSiete.setBounds(20,250,100,90);
		btnSiete.setOpaque(true);
		btnSiete.setBackground(Color.decode("#008170"));
		btnSiete.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		btnSiete.setForeground(Color.decode("#232D3F"));
		calculator.add(btnSiete);
		
		JButton btnOcho = new JButton("8");
		btnOcho.setBounds(140,250,100,90);
		btnOcho.setOpaque(true);
		btnOcho.setBackground(Color.decode("#008170"));
		btnOcho.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		btnOcho.setForeground(Color.decode("#232D3F"));
		calculator.add(btnOcho);
		
		JButton btnNueve = new JButton("9");
		btnNueve.setBounds(260,250,100,90);
		btnNueve.setOpaque(true);
		btnNueve.setBackground(Color.decode("#008170"));
		btnNueve.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		btnNueve.setForeground(Color.decode("#232D3F"));
		calculator.add(btnNueve);
		
		JButton division = new JButton("/");
		division.setBounds(380,250,100,90);
		division.setOpaque(true);
		division.setBackground(Color.decode("#005B41"));
		division.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		division.setForeground(Color.decode("#0F0F0F"));
		calculator.add(division);
		
		JButton btnCuatro = new JButton("4");
		btnCuatro.setBounds(20,360,100,90);
		btnCuatro.setOpaque(true);
		btnCuatro.setBackground(Color.decode("#008170"));
		btnCuatro.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		btnCuatro.setForeground(Color.decode("#232D3F"));
		calculator.add(btnCuatro);
		
		JButton btnCinco = new JButton("5");
		btnCinco.setBounds(140,360,100,90);
		btnCinco.setOpaque(true);
		btnCinco.setBackground(Color.decode("#008170"));
		btnCinco.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		btnCinco.setForeground(Color.decode("#232D3F"));
		calculator.add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.setBounds(260,360,100,90);
		btnSeis.setOpaque(true);
		btnSeis.setBackground(Color.decode("#008170"));
		btnSeis.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		btnSeis.setForeground(Color.decode("#232D3F"));
		calculator.add(btnSeis);
		
		JButton multiplicar = new JButton("*");
		multiplicar.setBounds(380,360,100,90);
		multiplicar.setOpaque(true);
		multiplicar.setBackground(Color.decode("#005B41"));
		multiplicar.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		multiplicar.setForeground(Color.decode("#0F0F0F"));
		calculator.add(multiplicar);
		
		JButton btnUno = new JButton("1");
		btnUno.setBounds(20,470,100,90);
		btnUno.setOpaque(true);
		btnUno.setBackground(Color.decode("#008170"));
		btnUno.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		btnUno.setForeground(Color.decode("#232D3F"));
		calculator.add(btnUno);
		
		JButton btnDos= new JButton("2");
		btnDos.setBounds(140,470,100,90);
		btnDos.setOpaque(true);
		btnDos.setBackground(Color.decode("#008170"));
		btnDos.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		btnDos.setForeground(Color.decode("#232D3F"));
		calculator.add(btnDos);
		
		JButton btnTres= new JButton("3");
		btnTres.setBounds(260,470,100,90);
		btnTres.setOpaque(true);
		btnTres.setBackground(Color.decode("#008170"));
		btnTres.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		btnTres.setForeground(Color.decode("#232D3F"));
		calculator.add(btnTres);
		
		JButton restar= new JButton("-");
		restar.setBounds(380,470,100,90);
		restar.setOpaque(true);
		restar.setBackground(Color.decode("#005B41"));
		restar.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		restar.setForeground(Color.decode("#0F0F0F"));
		calculator.add(restar);
		
		JButton btnCero= new JButton("0");
		btnCero.setBounds(20,580,100,90);
		btnCero.setOpaque(true);
		btnCero.setBackground(Color.decode("#008170"));
		btnCero.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		btnCero.setForeground(Color.decode("#232D3F"));
		calculator.add(btnCero);
		
		JButton punto= new JButton(".");
		punto.setBounds(140,580,100,90);
		punto.setOpaque(true);
		punto.setBackground(Color.decode("#008170"));
		punto.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		punto.setForeground(Color.decode("#232D3F"));
		calculator.add(punto);
		
		JButton igualdad= new JButton("=");
		igualdad.setBounds(260,580,100,90);
		igualdad.setOpaque(true);
		igualdad.setBackground(Color.decode("#005B41"));
		igualdad.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		igualdad.setForeground(Color.decode("#0F0F0F"));
		calculator.add(igualdad);
		
		JButton sumar= new JButton("+");
		sumar.setBounds(380,580,100,90);
		sumar.setOpaque(true);
		sumar.setBackground(Color.decode("#005B41"));
		sumar.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		sumar.setForeground(Color.decode("#0F0F0F"));
		calculator.add(sumar);

		this.add(calculator);
	}



}
