import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame implements MouseListener
{
	JPanel btn_panel;
	/*Constructor que define los atributos base
	 * de mi ventana */
	public Ventana() {

		//tamaño de la ventana
		this.setSize(1000,750);
		
		//tamaño de la calculadora
		//this.setSize(520,750);
	
		//cerrar ventana por defecto
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//titulo
		this.setTitle("Mi ventana");
		//this.setTitle("Calculadora");
		//this.setTitle("Inicio de sesión");
		//this.setTitle("Mario Bros");
	
		//tamaños de la ventana
		this.setMinimumSize(new Dimension(250,250));//tamaño maximo
		this.setMaximumSize(new Dimension(1000,270));//tamaño minimo
		this.setResizable(false);
	
		//ubicacion en la pantalla
		this.setLocation(100,200);
	
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
		//this.calculator();
		//this.myAccount();
		//this.calculadora();
		//this.calcularInteres();
		this.botones();
		addMouseListener(this);

		//size
		//location
		//background-opaque
		//string cosntructor

		this.repaint();
		this.validate();
	}
	
	public void login() {
		
		//this.setSize(500, 750);
		
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
		
//		JLabel logo = new JLabel();
//		logo.setIcon(new ImageIcon(getClass().getResource("piensa-diferente.png")));
//		logo.setBounds(100,50,256,256);
//		login.add(logo);
		
		JLabel usuario = new JLabel("NOMBRE DE USUARIO: ");
		usuario.setBounds(10,120,250,40);//(x,y,ancho,alto)
		usuario.setFont(new Font("Comic Sans MS",Font.BOLD,20));//establece fuente del texto
		login.add(usuario);//añade el componente

		JTextField email_field = new JTextField();
		email_field.setBounds(10, 160, 300, 40); // Ajustar las coordenadas y tamaño del campo de texto
	    login.add(email_field);

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
		accept.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String usr = email_field.getText();				
				String pwd = new String(pwd_field.getPassword());
				
				if (usr.length()<=0) {
                    email_field.setBorder(BorderFactory.createLineBorder(Color.red,2));
                }
				else {
					email_field.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				if (pwd.length()<=0) {
					pwd_field.setBorder(BorderFactory.createLineBorder(Color.red,2));
                }
				else {
					pwd_field.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				if(usr.equals("yayis")) {
					System.out.println("Bienvenido");
				}
				else {
					System.out.println("usuario incorrecto");
				}
				
				if(pwd.equals("23012003")) {
					System.out.println("Bienvenido");
				}
				else {
					System.out.println("usuario incorrecto");
				}
			}

		});
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
		accept.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = name_text.getText();				
				String bio = bio_text.getText();
				
				if (name.length()<=0) {
					name_text.setBorder(BorderFactory.createLineBorder(Color.red,2));
                }
				else {
					name_text.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				if (bio.length()<=0) {
					bio_text.setBorder(BorderFactory.createLineBorder(Color.red,2));
                }
				else {
					bio_text.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				if(!acceptRadio.isSelected()) {
					acceptRadio.setBorderPainted(true);
					acceptRadio.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}
				else {
					acceptRadio.setBorder(null);
					acceptRadio.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
			}
		});

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
		//login_title.setOpaque(true);//agrega fondo al texto
		//login_title.setBackground(Color.BLACK);//color al fondo del texto
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
		pantalla.setFont(new Font("Franklin Gothic",Font.BOLD,30));
		pantalla.setForeground(Color.WHITE);
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

	public void myAccount() {
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth(), this.getHeight());
		login.setBackground(Color.decode("#3f66b1"));
		login.setLayout(null);
		
		JLabel inicio = new JLabel("Mi cuenta",0);
		inicio.setSize(350, 80);
		inicio.setFont(new Font("Berlin Sans FB",Font.BOLD,60));
		inicio.setForeground(Color.WHITE);
		inicio.setLocation(300,20);
		add(inicio);
		
		JLabel sesion = new JLabel("Inicio de sesión",0);
		sesion.setSize(350, 100);
		sesion.setFont(new Font("Arial",Font.BOLD,40));
		sesion.setForeground(Color.YELLOW);
		sesion.setLocation(300,80);
		add(sesion);
		
		JLabel user = new JLabel();
		user.setIcon(new ImageIcon(getClass().getResource("agregar-usuario prueba.png")));
		user.setBounds(220,250,40,40);
		login.add(user);
		
		JLabel inputUser = new JLabel("Ingresa tu nombre de usuario: ");
		inputUser.setBounds(270,200,300,40);//(x,y,ancho,alto)
		inputUser.setFont(new Font("Arial",Font.BOLD,20));
		inputUser.setForeground(Color.WHITE);
		login.add(inputUser);

		JTextField nombre = new JTextField();
		nombre.setBounds(270, 250, 430, 40); 
	    login.add(nombre);
	    
	    JLabel imagenContra = new JLabel();
	    imagenContra.setIcon(new ImageIcon(getClass().getResource("invisible prueba.png")));
	    imagenContra.setBounds(220,350,40,40);
		login.add(imagenContra);
	    
	    JLabel inputPassword = new JLabel("Ingresa tu contraseña: ");
	    inputPassword.setBounds(270,300,250,40);//(x,y,ancho,alto)
	    inputPassword.setFont(new Font("Arial",Font.BOLD,20));
	    inputPassword.setForeground(Color.WHITE);
		login.add(inputPassword);

		JPasswordField password = new JPasswordField();
		password.setBounds(270, 350, 430, 40); 
	    login.add(password);
	    
//	    JButton acceder = new JButton("Acceder");
//	    acceder.setFont(new Font("Arial",Font.BOLD,15));
//	    acceder.setBounds(380, 420, 200, 60);
//	    acceder.setOpaque(true);
//		acceder.setBackground(Color.YELLOW);
//		login.add(acceder);
		
		JLabel btnAcceder = new JLabel();
		btnAcceder.setIcon(new ImageIcon(getClass().getResource("btnAcceder.png")));
		btnAcceder.setBounds(380, 420, 200, 60);
		login.add(btnAcceder);
		
		JLabel sinCuenta = new JLabel("¿No tienes cuenta?",0);
		sinCuenta.setBounds(350,500,250,40);//(x,y,ancho,alto)
		sinCuenta.setFont(new Font("Arial",Font.BOLD,15));
		sinCuenta.setForeground(Color.WHITE);
		login.add(sinCuenta);
		
//		JButton registro = new JButton("Registrarse");
//		registro.setFont(new Font("Arial",Font.BOLD,15));
//		registro.setBounds(380, 550, 200, 60);
//		registro.setOpaque(true);
//		registro.setBackground(Color.decode("#3887BE"));
//		registro.setForeground(Color.WHITE);
//		login.add(registro);
		
		JLabel btnRegistro = new JLabel();
		btnRegistro.setIcon(new ImageIcon(getClass().getResource("btnRegistro.png")));
		btnRegistro.setBounds(380, 550, 200, 60);
		login.add(btnRegistro);
		
		JLabel widget = new JLabel();
		widget.setBounds(40,100,900,550);
		widget.setOpaque(true);
		widget.setBackground(Color.decode("#2b4582"));
		login.add(widget);
		
		this.add(login);
	}
	
	public void calculadora() {

		
		this.setSize(480,650);
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(), this.getHeight());
		panel.setBackground(Color.decode("#AF2655"));
		panel.setLayout(new BorderLayout());
        
		//CODIGO HECHO EN CLASE 
		JLabel text = new JLabel("100.00",4);
		text.setOpaque(true);
		text.setFont(new Font("Arial",Font.BOLD,40));
		text.setBackground(Color.WHITE);
		panel.add(text, BorderLayout.NORTH);//indicar en que posicion lo queremos
		
		JPanel centro = new JPanel();
		//centro.setSize(this.getWidth(), this.getHeight());
		centro.setBackground(Color.decode("#A3B763"));
		centro.setLayout(new GridLayout(4,3,10,10));
		panel.add(centro,BorderLayout.CENTER);
		
		String btn[] = {"7","8","9","6","5","4","3","2","1","0",".","/"};
		for(int i=0; i<12; i++) {
			JButton boton = new JButton(btn[i]);
			centro.add(boton);
		}
		
		JPanel east = new JPanel();
		east.setBackground(Color.decode("#EC8F5E"));
		east.setLayout(new GridLayout(3,1,10,10));
		panel.add(east,BorderLayout.EAST);
		
		String btn2[] = {"+","-","="};
		for(int i=0; i<3; i++) {
			JButton boton = new JButton(btn2[i]);
			east.add(boton);
		}
		
		JPanel west = new JPanel();
		west.setBackground(Color.BLUE);
		west.setLayout(new BoxLayout(west,BoxLayout.Y_AXIS));
		panel.add(west,BorderLayout.WEST);
		
		String btn3[] = {"MC","M+","*"};
		for(int i=0; i<3; i++) {
			JButton boton = new JButton(btn3[i]);
			west.add(boton);
		}
		
		this.add(panel);
	}

	public void calcularInteres() {
		
		this.setSize(500,690);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setSize(this.getWidth(), this.getHeight());
		panelPrincipal.setBackground(Color.decode("#ffffff"));
		panelPrincipal.setLayout(new BorderLayout());
		
		JLabel etiqueta_titulo = new JLabel("     Interés");
		etiqueta_titulo.setFont(new Font("Arial",Font.BOLD,30));
		etiqueta_titulo.setForeground(Color.RED);
		panelPrincipal.add(etiqueta_titulo,BorderLayout.NORTH);
		
		
		//panel que va en el centro
		JPanel panelCentral = new JPanel();
		panelCentral.setOpaque(true);
		panelCentral.setBackground(Color.decode("#ffffff"));
		panelCentral.setLayout(new GridLayout(2,1,30,30));
		panelPrincipal.add(panelCentral,BorderLayout.CENTER);
		
		
		//espacios en blanco en los bordes del panel principal
		JLabel espacio_este = new JLabel("     ");
		espacio_este.setOpaque(true);
		espacio_este.setFont(new Font("Arial",Font.BOLD,30));
		espacio_este.setBackground(Color.decode("#ffffff"));
		panelPrincipal.add(espacio_este,BorderLayout.EAST);
		
		JLabel espacio_oeste = new JLabel("     ");
		espacio_oeste.setOpaque(true);
		espacio_oeste.setFont(new Font("Arial",Font.BOLD,30));
		espacio_oeste.setBackground(Color.decode("#ffffff"));
		panelPrincipal.add(espacio_oeste,BorderLayout.WEST);
		
		JLabel espacio_sur = new JLabel("     ");
		espacio_sur.setOpaque(true);
		espacio_sur.setFont(new Font("Arial",Font.BOLD,60));
		espacio_sur.setBackground(Color.decode("#ffffff"));
		panelPrincipal.add(espacio_sur,BorderLayout.SOUTH);
		
		
		//panel que pide al usuario las cantidades
		JPanel panel_central_1 = new JPanel();
		panel_central_1.setOpaque(true);
		panel_central_1.setBackground(Color.decode("#99ff99"));
		panel_central_1.setLayout(null);
		panelCentral.add(panel_central_1);
		
		
		//etiquetas del panel de calcular el interes
		JLabel calcular_etiqueta = new JLabel("Calcular interés");
		calcular_etiqueta.setBounds(10,10,150,30);
		calcular_etiqueta.setFont(new Font("Arial",Font.BOLD,20));
		calcular_etiqueta.setForeground(Color.BLACK);
		panel_central_1.add(calcular_etiqueta,BorderLayout.NORTH);
		
		JLabel capital_etiqueta = new JLabel("Capital:");
		capital_etiqueta.setBounds(30,20,100,100);
		capital_etiqueta.setOpaque(false);
		capital_etiqueta.setFont(new Font("Arial",Font.BOLD,15));
		capital_etiqueta.setForeground(Color.BLACK);
		panel_central_1.add(capital_etiqueta);
		
		JLabel tiempo_etiqueta = new JLabel("Tiempo:");
		tiempo_etiqueta.setBounds(30,70,100,100);
		tiempo_etiqueta.setOpaque(false);
		tiempo_etiqueta.setFont(new Font("Arial",Font.BOLD,15));
		tiempo_etiqueta.setForeground(Color.BLACK);
		panel_central_1.add(tiempo_etiqueta);
		
		JLabel tasa_etiqueta = new JLabel("Tasa interés:");
		tasa_etiqueta.setBounds(30,120,100,100);
		tasa_etiqueta.setOpaque(false);
		tasa_etiqueta.setFont(new Font("Arial",Font.BOLD,15));
		tasa_etiqueta.setForeground(Color.BLACK);
		panel_central_1.add(tasa_etiqueta);
		
		
		//cuadros de texto del panel de calcular el interes
		JTextField capital_cuadro = new JTextField();
		capital_cuadro.setBounds(140, 60, 240, 30); 
		panel_central_1.add(capital_cuadro);
		
		JTextField tiempo_cuadro = new JTextField();
		tiempo_cuadro.setBounds(140, 110, 240, 30); 
		panel_central_1.add(tiempo_cuadro);
		
		JTextField tasa_cuadro = new JTextField();
		tasa_cuadro.setBounds(140, 160, 240, 30); 
		panel_central_1.add(tasa_cuadro);
		
		
		//botones del panel de calcular el interes
		JButton calcular = new JButton("Calcular");
		calcular.setBounds(50,220,100,40);
		calcular.setOpaque(true);
		calcular.setBackground(Color.BLACK);
		calcular.setForeground(Color.WHITE);
		panel_central_1.add(calcular);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBounds(260,220,100,40);
		cancelar.setOpaque(true);
		cancelar.setBackground(Color.BLACK);
		cancelar.setForeground(Color.WHITE);
		panel_central_1.add(cancelar);
		
		
		//panel que muestra los resultados
		JPanel panel_central_2 = new JPanel();
		panel_central_2.setOpaque(true);
		panel_central_2.setBackground(Color.decode("#ff9999"));
		panel_central_2.setLayout(null);
		panelCentral.add(panel_central_2);
		
		
		//etiquetas del panel de resultados
		JLabel interes_etiqueta = new JLabel("Interés:");
		interes_etiqueta.setBounds(30,20,100,100);
		interes_etiqueta.setOpaque(false);
		interes_etiqueta.setFont(new Font("Arial",Font.BOLD,15));
		interes_etiqueta.setForeground(Color.BLACK);
		panel_central_2.add(interes_etiqueta);
		
		JLabel monto_etiqueta = new JLabel("Monto:");
		monto_etiqueta.setBounds(30,70,100,100);
		monto_etiqueta.setOpaque(false);
		monto_etiqueta.setFont(new Font("Arial",Font.BOLD,15));
		monto_etiqueta.setForeground(Color.BLACK);
		panel_central_2.add(monto_etiqueta);
		
		
		//cuadros de texto del panel de resultados
		JTextField interes_cuadro = new JTextField();
		interes_cuadro.setBounds(140, 60, 240, 30); 
		panel_central_2.add(interes_cuadro);
		
		JTextField monto_cuadro = new JTextField();
		monto_cuadro.setBounds(140, 110, 240, 30); 
		panel_central_2.add(monto_cuadro);
		
		this.add(panelPrincipal);
	}

//	//EJERCICIO HECHO EN CLASE
//	public void paint(Graphics g) {
//		super.paint(g);
//		
//		Graphics2D g2d = (Graphics2D) g;
//		
//		//asigna color
//		g2d.setColor(Color.BLUE);
//		
//		g2d.fillRect(50, 50, 200, 100);
//		
//		g2d.clearRect(100, 100, 100, 100);
//		//g2d.drawLine(30, 70, 770, 70);
//		
//		//dibuja arcos
//		//g2d.drawArc(300, 300, 100, 100, 45, 80);
//		
//		//pinta media luna
//		g2d.fillArc(300, 300, 100, 100, 45, 180);
//		
//		g2d.setColor(Color.BLACK);
//		//dibuja linea
//		g2d.drawLine(0, 0, 500, 500);
//		
//		//ovalo 
//		g2d.drawOval(400, 400, 50, 80);
//		
//		//ovalo con relleno
//		g2d.fillOval(350, 400, 50, 80);
//		
//		int xPoints[]={100,250,300};
//		int yPoints[]={100,200,350};
//		//int nPoints[]={1,2};
//		g2d.drawPolygon(xPoints, yPoints, 3);
//		g2d.setColor(Color.RED);
//		g2d.fillPolygon(xPoints, yPoints, 3);
//		
//		//estilo de texto (siempre va primero)
//		g2d.setFont(new Font("Comic Sans MS",Font.BOLD,38));
//		//dibuja el texto
//		g2d.drawString("Hola", 250, 100);
//		
//		//storke: contorno
//		g2d.setStroke(new BasicStroke(10));
//		g2d.drawRoundRect(420, 150, 200, 150, 10, 10);
//		
//		//subir imagenes
////		Toolkit t = Toolkit.getDefaultToolkit ();
////        Image imagen = t.getImage ("src/piensa-diferente.png");
////        g.drawImage (imagen, 0, 0, this);	
//		
//		try {
//			
//			BufferedImage image = ImageIO.read(new File("src/btnAcceder.png"));
//			g2d.drawImage(image, 10, 10, null);
//		}catch(IOException e)
//		{
//			//TODO Auto-generated catch black
//			e.printStackTrace();
//		}
//	}

	//CASA
//	public void paint(Graphics g) {
//		super.paint(g);
		
//		Graphics2D g2d = (Graphics2D) g;
//		
//		//el cielo
//		g2d.setColor(Color.decode("#16589e")); 
//	    g2d.fillRect(0, 0, getWidth(), getHeight());
//	    
//	    //cerco
//  		int y = 530;
//  		g2d.setColor(Color.decode("#d5953b")); 
//  		for (int i = 0; i < 4; i++) {
//  		    g2d.drawRect(0, y, 1000, 10); 
//  		    g2d.fillRect(0, y, 1000,10); 
//  		    y += 30; 
//  		}
//  		
//  		int x = 20;
//  		g2d.setColor(Color.decode("#ffb951")); 
//  		for (int i = 0; i < 49; i++) {
//  		    g2d.drawRect(x, 510, 20, 140); 
//  		    g2d.fillRect(x, 510, 20, 140); 
//  		    x += 40; 
//  		}
//	    
//	    //pared
//	    g2d.setColor(Color.decode("#02fab8")); 
//	    g2d.drawRect(250, 200, 500, 500); 
//	    g2d.fillRect(250, 200, 500, 500);
//	    
//	    g2d.setColor(Color.decode("#747575")); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(250, 200, 500, 500, 5, 5);
//	    
//	    //puerta
//	    g2d.setColor(Color.decode("#e6f0ed")); 
//	    g2d.drawRect(550, 420, 110, 500); 
//	    g2d.fillRect(550, 420, 110, 500);
//	    
//	    g2d.setColor(Color.decode("#747575")); 
//	    g2d.setStroke(new BasicStroke(8));
//		g2d.drawRoundRect(550, 420, 110, 500, 10, 10);
//		
//		g2d.setColor(Color.decode("#ffea00")); 
//		g2d.drawRect(640,540,10,10);
//		g2d.fillRect(640,540,10,10); 
//	    
//	    //ventana
//	    g2d.setColor(Color.decode("#e6f0ed")); 
//	    g2d.drawRect(350, 340, 110, 100); 
//	    g2d.fillRect(350, 340, 110, 100);
//	    
//	    g2d.setColor(Color.decode("#b4f9e6")); 
//	    g2d.drawRect(370, 360, 70, 60); 
//	    g2d.fillRect(370, 360, 40, 60);
//	    
//	    g2d.setColor(Color.decode("#747575")); 
//	    g2d.setStroke(new BasicStroke(10));
//		g2d.drawRoundRect(350, 340, 110, 100,0,10);
//	    
//	    //techo
//		g2d.setColor(Color.decode("#dadadc"));
//		g2d.fillRect(260, 160, 10, 40);
//		
//		g2d.setColor(Color.decode("#dadadc"));
//		g2d.fillRect(280, 180, 10, 40);
//		
//	    g2d.setColor(Color.decode("#587970"));
//		g2d.fillRect(230, 190, 540, 50);
//		
//		//piso de la casa
//		g2d.setColor(Color.decode("#26b00e"));
//		g2d.drawLine(0, 650, 1000, 650);
//		g2d.fillRect(0, 650, 1000, 650);
//		
//		g2d.setColor(Color.decode("#634c16"));
//		g2d.drawLine(0, 700, 1000, 700);
//		g2d.fillRect(0, 700, 1000, 700);
//	}
	
	//EJERCICIO 32 MIERCOLES
//	public void paint(Graphics g) {
//		super.paint(g);
//	
//		Graphics2D g2d = (Graphics2D) g;
//		
//		//FONDO
//		g2d.setColor(Color.decode("#b3eefe")); 
//	    g2d.fillRect(0, 0, getWidth(), getHeight());
//	    
//	    //PLATAFORMAS
//	    //bonus
//	    g2d.setColor(Color.decode("#ff9061"));
//		g2d.drawRect(100, 200, 80, 80);
//		g2d.fillRect(100, 200, 80, 80);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(100, 200, 80, 80,0,5);
//		
//		//tornillo
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(110, 210, 1, 1,0,5);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(170, 210, 1, 1,0,5);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(110, 270, 1, 1,0,5);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(170, 270, 1, 1,0,5);
//		
//		g2d.setColor(Color.decode("#ff9061"));
//		g2d.drawRect(300, 100, 80, 80);
//		g2d.fillRect(300, 100, 80, 80);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(300, 100, 80, 80,0,5);
//		
//		//tornillo
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(310, 110, 1, 1,0,5);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(370, 110, 1, 1,0,5);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(310, 170, 1, 1,0,5);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(370, 170, 1, 1,0,5);
//		
//		g2d.setColor(Color.decode("#ff9061"));
//		g2d.drawRect(380, 100, 80, 80);
//		g2d.fillRect(380, 100, 80, 80);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(380, 100, 80, 80,0,5);
//		
//		//tornillo
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(390, 110, 1, 1,0,5);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(450, 110, 1, 1,0,5);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(390, 170, 1, 1,0,5);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(450, 170, 1, 1,0,5);
//		
//		g2d.setColor(Color.decode("#ff9061"));
//		g2d.drawRect(860, 190, 80, 80);
//		g2d.fillRect(860, 190, 80, 80);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(860, 190, 80, 80,0,5);
//		
//		//tornillo
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(870, 200, 0, 1,0,5);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(870, 260, 0, 1,0,5);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(930, 200, 0, 1,0,5);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(930, 260, 0, 1,0,5);
//	    
//	    //verde
//	    g2d.setColor(Color.decode("#51d96b"));
//		g2d.drawRect(800, 420, 200, 700);
//		g2d.fillRect(800, 420, 200, 700);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(800, 420, 200, 700,0,5);
//		
//		//tornillos verde
//		g2d.setColor(Color.decode("#c0cbcd"));
//		g2d.drawOval(810, 430, 10, 10);
//		g2d.fillOval(810, 430, 10, 10);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(4));
//		g2d.drawRoundRect(810, 430, 10, 10, 0, 0);
//		
//		g2d.setColor(Color.decode("#c0cbcd"));
//		g2d.drawOval(810, 600, 10, 10);
//		g2d.fillOval(810, 600, 10, 10);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(4));
//		g2d.drawRoundRect(810, 600, 10, 10, 0, 0);
//	    
//		//azul
//	    g2d.setColor(Color.decode("#84c0ff"));
//		g2d.drawRect(300, 320, 200, 700);
//		g2d.fillRect(300, 320, 200, 700);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(300, 320, 200, 700,0,5);
//		
//		//sombra
//		g2d.setColor(Color.BLACK);
//		g2d.drawRect(500, 350, 30, 275);
//		g2d.fillRect(500, 350, 30, 275);
//		
//		//tornillos azul
//		g2d.setColor(Color.decode("#c0cbcd"));
//		g2d.drawOval(480, 330, 10, 10);
//		g2d.fillOval(480, 330, 10, 10);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(4));
//		g2d.drawRoundRect(480, 330, 10, 10, 0, 0);
//		
//		g2d.setColor(Color.decode("#c0cbcd"));
//		g2d.drawOval(310, 330, 10, 10);
//		g2d.fillOval(310, 330, 10, 10);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(4));
//		g2d.drawRoundRect(310, 330, 10, 10, 0, 0);
//		
//		g2d.setColor(Color.decode("#c0cbcd"));
//		g2d.drawOval(480, 600, 10, 10);
//		g2d.fillOval(480, 600, 10, 10);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(4));
//		g2d.drawRoundRect(480, 600, 10, 10, 0, 0);
//	    
//		//rosa
//	    g2d.setColor(Color.decode("#ffc3b8"));
//		g2d.drawRect(150, 420, 200, 700);
//		g2d.fillRect(150, 420, 200, 700);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(150, 420, 200, 700,0,5);
//		
//		//sombra
//		g2d.setColor(Color.BLACK);
//		g2d.drawRect(350, 450, 30, 165);
//		g2d.fillRect(350, 450, 30, 165);
//		
//		//tornillos rosa
//		g2d.setColor(Color.decode("#c0cbcd"));
//		g2d.drawOval(160, 430, 10, 10);
//		g2d.fillOval(160, 430, 10, 10);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(4));
//		g2d.drawRoundRect(160, 430, 10, 10, 0, 0);
//		
//		g2d.setColor(Color.decode("#c0cbcd"));
//		g2d.drawOval(330, 430, 10, 10);
//		g2d.fillOval(330, 430, 10, 10);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(4));
//		g2d.drawRoundRect(330, 430, 10, 10, 0, 0);
//		
//		g2d.setColor(Color.decode("#c0cbcd"));
//		g2d.drawOval(160, 600, 10, 10);
//		g2d.fillOval(160, 600, 10, 10);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(4));
//		g2d.drawRoundRect(160, 600, 10, 10, 0, 0);
//		
//		g2d.setColor(Color.decode("#c0cbcd"));
//		g2d.drawOval(330, 600, 10, 10);
//		g2d.fillOval(330, 600, 10, 10);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(4));
//		g2d.drawRoundRect(330, 600, 10, 10, 0, 0);
//		
//		//tubo
//		g2d.setColor(Color.decode("#197a10"));
//		g2d.drawRect(600, 450, 100, 700);
//		g2d.fillRect(600, 450, 100, 700);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(600, 450, 100, 700,0,5);
//		
//		//sombra
//		g2d.setColor(Color.decode("#145f0d"));
//		g2d.drawRect(655, 450, 40, 450);
//		g2d.fillRect(655, 450, 40, 450);
//		
//		//color
//		g2d.setColor(Color.decode("#197a10"));
//		g2d.drawRect(580, 390, 140, 60);
//		g2d.fillRect(580, 390, 140, 60);
//		
//		//sombra
//		g2d.setColor(Color.decode("#145f0d"));
//		g2d.drawRect(680, 390, 40, 60);
//		g2d.fillRect(680, 390, 40, 60);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(580, 390, 140, 60,0,5);
//	    
//	    //BASE
//		g2d.setColor(Color.BLACK);
//		g2d.drawOval(20, 550, 80, 80);
//		g2d.setColor(Color.decode("#43d06f"));
//		g2d.fillOval(20, 550, 80, 80);
//		
//		g2d.setColor(Color.BLACK);
//		g2d.drawOval(40, 520, 80, 80);
//		g2d.setColor(Color.decode("#43d06f"));
//		g2d.fillOval(40, 520, 80, 80);
//		
//		g2d.setColor(Color.BLACK);
//		g2d.drawOval(60, 550, 80, 80);
//		g2d.setColor(Color.decode("#43d06f"));
//		g2d.fillOval(60, 550, 80, 80);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		
//	    g2d.setColor(Color.decode("#a87245"));
//		g2d.drawRect(0, 620, 1000, 700);
//		g2d.fillRect(0, 620, 1000, 700);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(0, 620, 1000, 700,0,5);
//		
//	    
//	    g2d.setColor(Color.decode("#f39c70"));
//		g2d.drawRect(0, 650, 1000, 700);
//		g2d.fillRect(0, 650, 1000, 700);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(0, 650, 1000, 700,0,5);
//		
//		g2d.setColor(Color.decode("#350906")); 
//		g2d.drawLine(0,670, 30, 750);
//		for (int i = 0; i < 50; i++) {
//		    g2d.drawLine(10 + i * 20, 650, 60 + i * 20, 750);
//		}
//	}
	
//	public void paint(Graphics g) {
//		super.paint(g);
//	
//		Graphics2D g2d = (Graphics2D) g;
//		
//		//FONDO
//		g2d.setColor(Color.decode("#035ab9")); 
//	    g2d.fillRect(0, 0, getWidth(), getHeight());
//	    
//	  //sombra nube 1
//  		g2d.setColor(Color.decode("#b2d3d6"));
//  		g2d.drawOval(350, 520, 30, 40);
//  	    g2d.fillOval(350, 520, 30, 40);
//  	    g2d.drawRect(135, 520, 230, 40);
//  	    g2d.fillRect(135, 520, 230, 40);
//	    
//	    //nube 1
//		g2d.setColor(Color.decode("#eaf0fe"));
//		g2d.drawOval(350, 510, 30, 40);
//	    g2d.fillOval(350, 510, 30, 40);
//	    g2d.drawRect(135, 510, 230, 40);
//	    g2d.fillRect(135, 510, 230, 40);
//	    
//	  //sombra nube 2
//  		g2d.setColor(Color.decode("#b2d3d6"));
//  		g2d.drawOval(280, 580, 30, 40);
//  	    g2d.fillOval(280, 580, 30, 40);
//  	    g2d.drawRect(290, 580, 230, 40);
//  	    g2d.fillRect(290, 580, 230, 40);
//	    
//	    //nube 2
//  		g2d.setColor(Color.decode("#eaf0fe"));
//  	    g2d.drawRect(300, 570, 230, 40);
//  	    g2d.fillRect(300, 570, 230, 40);
//  	    g2d.drawOval(280, 570, 30, 40);
//  	    g2d.fillOval(280, 570, 30, 40);
//	    
//  	  //sombra montañas azul claro 1
//  		g2d.setColor(Color.decode("#95c1c7"));
//  	    g2d.drawOval(50, 200, 150, 150);
//  		g2d.fillOval(50, 200, 150, 150);
//  	    g2d.drawRect(50, 280, 150, 700);
//  	    g2d.fillRect(50, 280, 150, 700);
//  	    
//	    //montañas azul claro 1
//		g2d.setColor(Color.decode("#bedfe3"));
//	    g2d.drawOval(30, 200, 150, 150);
//		g2d.fillOval(30, 200, 150, 150);
//	    g2d.drawRect(30, 280, 150, 700);
//	    g2d.fillRect(30, 280, 150, 700);
//	    
//	    //puntos claros montaña 1
//	    g2d.setColor(Color.decode("#eaf0fe"));
//	    g2d.drawOval(140, 280, 20, 30);
//	    g2d.fillOval(140, 280, 20, 30);
//	    g2d.drawOval(140, 380, 20, 30);
//	    g2d.fillOval(140, 380, 20, 30);
//	    g2d.drawOval(70, 420, 20, 30);
//	    g2d.fillOval(70, 420, 20, 30);
//	    
//	  //sombra nube 3
//	    g2d.setColor(Color.decode("#b2d3d6"));
//	    g2d.drawOval(140, 330, 30, 40);
//	    g2d.fillOval(140, 330, 30, 40);
//	    g2d.drawRect(0, 330, 150, 40);
//	    g2d.fillRect(0, 330, 150, 40);
//	    
//	    //nube 3
//	    g2d.setColor(Color.decode("#eaf0fe"));
//	    g2d.drawOval(140, 320, 30, 40);
//	    g2d.fillOval(140, 320, 30, 40);
//	    g2d.drawRect(0, 320, 150, 40);
//	    g2d.fillRect(0, 320, 150, 40);
//	    
//	  //sombra montaña azul fuerte 1
//	    g2d.setColor(Color.decode("#125175"));
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawOval(-70, 460, 200, 150);
//	    g2d.drawRect(-70, 530, 200, 700);
//	    g2d.fillOval(-70, 460, 200, 150);
//		g2d.fillRect(-70, 530, 200, 700);
//	    
//	    //montaña azul fuerte 1
//	    g2d.setColor(Color.decode("#125175"));
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawOval(-90, 460, 200, 150);
//	    g2d.drawRect(-90, 530, 200, 700);
//		g2d.setColor(Color.decode("#6aa9d2"));
//	    g2d.fillOval(-90, 460, 200, 150);
//		g2d.fillRect(-90, 530, 200, 700);
//		
//		//sombra nube 4
//		g2d.setColor(Color.decode("#b2d3d6"));
//	    g2d.drawRect(300, 460, 230, 40);
//	    g2d.fillRect(300, 460, 230, 40);
//	    g2d.drawOval(280, 460, 30, 40);
//	    g2d.fillOval(280, 460, 30, 40);
//		
//		//nube 4
//		g2d.setColor(Color.decode("#eaf0fe"));
//	    g2d.drawRect(300, 450, 230, 40);
//	    g2d.fillRect(300, 450, 230, 40);
//	    g2d.drawOval(280, 450, 30, 40);
//	    g2d.fillOval(280, 450, 30, 40);
//		
//  	  //sombra montañas azul claro 1
//  		g2d.setColor(Color.decode("#95c1c7"));
//  	    g2d.drawOval(410, 200, 150, 150);
//  		g2d.fillOval(410, 200, 150, 150);
//  	    g2d.drawRect(410, 280, 150, 700);
//  	    g2d.fillRect(410, 280, 150, 700);
//	    
//	    //montaña azul claro 2
//	    g2d.setColor(Color.decode("#bedfe3"));
//	    g2d.drawOval(390, 200, 150, 150);
//	    g2d.fillOval(390, 200, 150, 150);
//		g2d.drawRect(390, 280, 150, 700);
//		g2d.fillRect(390, 280, 150, 700);
//		
//		//puntos claros montaña 2
//	    g2d.setColor(Color.decode("#eaf0fe"));
//	    g2d.drawOval(490, 250, 20, 30);
//	    g2d.fillOval(490, 250, 20, 30);
//	    g2d.drawOval(420, 330, 20, 30);
//	    g2d.fillOval(420, 330, 20, 30);
//	    g2d.drawOval(420, 440, 20, 30);
//	    g2d.fillOval(420, 440, 20, 30);
//	    
//	  //sombra nube 5
//	    g2d.setColor(Color.decode("#b2d3d6"));
//	    g2d.drawOval(420, 390, 30, 40);
//	    g2d.fillOval(420, 390, 30, 40);
//	    g2d.drawRect(200, 390, 230, 40);
//	    g2d.fillRect(200, 390, 230, 40);
//	    g2d.drawOval(180, 390, 30, 40);
//	    g2d.fillOval(180, 390, 30, 40);
//	    
//	    //nube 5
//	    g2d.setColor(Color.decode("#eaf0fe"));
//	    g2d.drawOval(420, 380, 30, 40);
//	    g2d.fillOval(420, 380, 30, 40);
//	    g2d.drawRect(200, 380, 230, 40);
//	    g2d.fillRect(200, 380, 230, 40);
//	    g2d.drawOval(180, 380, 30, 40);
//	    g2d.fillOval(180, 380, 30, 40);
//	    
//	  //sombra nube 6
//  		g2d.setColor(Color.decode("#b2d3d6"));
//  	    g2d.drawOval(820, 260, 30, 40);
//  	    g2d.fillOval(820, 260, 30, 40);
//  	    g2d.drawRect(620, 260, 210, 40);
//  	    g2d.fillRect(620, 260, 210, 40);
//	    
//	    //nube 6
//  		g2d.setColor(Color.decode("#eaf0fe"));
//  	    g2d.drawOval(820, 250, 30, 40);
//  	    g2d.fillOval(820, 250, 30, 40);
//  	    g2d.drawRect(620, 250, 210, 40);
//  	    g2d.fillRect(620, 250, 210, 40);
//  	    
//		//sombra montaña azul claro 3
//	    g2d.setColor(Color.decode("#95c1c7"));
//	    g2d.drawOval(580, 100, 150, 150);
//	    g2d.fillOval(580, 100, 150, 150);
//		g2d.drawRect(580, 180, 150, 700);
//		g2d.fillRect(580, 180, 150, 700);
//	    
//		//montaña azul claro 3
//	    g2d.setColor(Color.decode("#bedfe3"));
//	    g2d.drawOval(560, 100, 150, 150);
//	    g2d.fillOval(560, 100, 150, 150);
//		g2d.drawRect(560, 180, 150, 700);
//		g2d.fillRect(560, 180, 150, 700);
//		
//		//sombra nube 7
//		g2d.setColor(Color.decode("#b2d3d6"));
//	    g2d.drawOval(940, 190, 30, 40);
//	    g2d.fillOval(940, 190, 30, 40);
//	    g2d.drawRect(740, 190, 210, 40);
//	    g2d.fillRect(740, 190, 210, 40);
//	    g2d.drawOval(720, 190, 30, 40);
//	    g2d.fillOval(720, 190, 30, 40);
//		
//		//nube 7
//		g2d.setColor(Color.decode("#eaf0fe"));
//	    g2d.drawOval(940, 180, 30, 40);
//	    g2d.fillOval(940, 180, 30, 40);
//	    g2d.drawRect(740, 180, 210, 40);
//	    g2d.fillRect(740, 180, 210, 40);
//	    g2d.drawOval(720, 180, 30, 40);
//	    g2d.fillOval(720, 180, 30, 40);
//		
//		//puntos claros montaña 3
//	    g2d.setColor(Color.decode("#eaf0fe"));
//	    g2d.drawOval(650, 150, 20, 30);
//	    g2d.fillOval(650, 150, 20, 30);
//	    g2d.drawOval(580, 230, 20, 30);
//	    g2d.fillOval(580, 230, 20, 30);
//	    
//	  // sombra montaña azul fuerte 2
//	    g2d.setColor(Color.decode("#125175"));
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawOval(410, 460, 200, 150);
//	    g2d.drawRect(410, 530, 200, 700);
//	    g2d.fillOval(410, 460, 200, 150);
//		g2d.fillRect(410, 530, 200, 700);
//	    
//	    //montaña azul fuerte 2
//	    g2d.setColor(Color.decode("#125175"));
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawOval(390, 460, 200, 150);
//	    g2d.drawRect(390, 530, 200, 700);
//		g2d.setColor(Color.decode("#6aa9d2"));
//	    g2d.fillOval(390, 460, 200, 150);
//		g2d.fillRect(390, 530, 200, 700);
//		
//		//sombra nube 8
//  		g2d.setColor(Color.decode("#b2d3d6"));
//  	    g2d.drawOval(500, 410, 30, 40);
//  	    g2d.fillOval(500, 410, 30, 40);
//  	    g2d.drawRect(520, 410, 210, 40);
//  	    g2d.fillRect(520, 410, 210, 40);
//		
//		//nube 8
//  		g2d.setColor(Color.decode("#eaf0fe"));
//  	    g2d.drawOval(500, 400, 30, 40);
//  	    g2d.fillOval(500, 400, 30, 40);
//  	    g2d.drawRect(520, 400, 210, 40);
//  	    g2d.fillRect(520, 400, 210, 40);
//		
//  	    // sombra montaña azul fuerte 3
//	    g2d.setColor(Color.decode("#125175"));
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawOval(630, 310, 200, 150);
//	    g2d.drawRect(630, 390, 200, 700);
//	    g2d.fillOval(630, 310, 200, 150);
//		g2d.fillRect(630, 390, 200, 700);
//  	    
//		//montaña azul fuerte 3
//	    g2d.setColor(Color.decode("#125175"));
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawOval(610, 310, 200, 150);
//	    g2d.drawRect(610, 390, 200, 700);
//		g2d.setColor(Color.decode("#6aa9d2"));
//	    g2d.fillOval(610, 310, 200, 150);
//		g2d.fillRect(610, 390, 200, 700);
//		
//		//puntos claros montaña azul fuerte
//	    g2d.setColor(Color.decode("#c0dede"));
//	    g2d.drawOval(650, 360, 20, 30);
//	    g2d.fillOval(650, 360, 20, 30);
//	    g2d.drawOval(740, 520, 20, 30);
//	    g2d.fillOval(740, 520, 20, 30);
//		
//		//nube 5
//		g2d.setColor(Color.decode("#eaf0fe"));
//	    g2d.drawOval(940, 580, 30, 40);
//	    g2d.fillOval(940, 580, 30, 40);
//	    g2d.drawRect(740, 580, 210, 40);
//	    g2d.fillRect(740, 580, 210, 40);
//	    g2d.drawOval(720, 580, 30, 40);
//	    g2d.fillOval(720, 580, 30, 40);
//	    
//	    //ladrillo 1
//	    g2d.setColor(Color.decode("#737071"));
//	    g2d.fillRect(820, 580, 50, 40);
//	    g2d.setColor(Color.decode("#c6c5cc"));
//		g2d.fillRect(820, 580, 40, 30);
//		g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(820, 580, 40, 30,10,15);
//	    g2d.setColor(Color.BLACK);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(820, 580, 50, 40,10,15);
//	    
//	  //ladrillo 2
//	    g2d.setColor(Color.decode("#737071"));
//	    g2d.fillRect(820, 540, 50, 40);
//	    g2d.setColor(Color.decode("#c6c5cc"));
//		g2d.fillRect(820, 540, 40, 30);
//		g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(820, 540, 40, 30,10,15);
//	    g2d.setColor(Color.BLACK);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(820, 540, 50, 40,10,15);
//	    
//	  //ladrillo 3
//	    g2d.setColor(Color.decode("#737071"));
//	    g2d.fillRect(820, 500, 50, 40);
//	    g2d.setColor(Color.decode("#c6c5cc"));
//		g2d.fillRect(820, 500, 40, 30);
//		g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(820, 500, 40, 30,10,15);
//	    g2d.setColor(Color.BLACK);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(820, 500, 50, 40,10,15);
//	    
//	  //ladrillo 4
//	    g2d.setColor(Color.decode("#737071"));
//	    g2d.fillRect(820, 460, 50, 40);
//	    g2d.setColor(Color.decode("#c6c5cc"));
//		g2d.fillRect(820, 460, 40, 30);
//		g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(820, 460, 40, 30,10,15);
//	    g2d.setColor(Color.BLACK);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(820, 460, 50, 40,10,15);
//	    
//	  //ladrillo amarillo 1
//	    g2d.setColor(Color.BLACK);
//	    g2d.setColor(Color.decode("#dd9f3e"));
//	    g2d.fillRect(870, 460, 50, 40);
//	    g2d.setColor(Color.decode("#ffd52e"));
//		g2d.fillRect(870, 460, 40, 30);
//		g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(870, 460, 40, 30,10,15);
//	    g2d.setColor(Color.BLACK);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(870, 460, 50, 40,10,15);
//	    g2d.drawRect(884, 470, 1, 6);
//	    g2d.drawRect(904, 470, 1, 6);
//	    
//	  //ladrillo amarillo 2
//	    g2d.setColor(Color.BLACK);
//	    g2d.setColor(Color.decode("#dd9f3e"));
//	    g2d.fillRect(920, 460, 50, 40);
//	    g2d.setColor(Color.decode("#ffd52e"));
//		g2d.fillRect(920, 460, 40, 30);
//		g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(920, 460, 40, 30,10,15);
//	    g2d.setColor(Color.BLACK);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(920, 460, 50, 40,10,15);
//	    g2d.drawRect(934, 470, 1, 6);
//	    g2d.drawRect(954, 470, 1, 6);
//	    
//	  //ladrillo amarillo 3
//	    g2d.setColor(Color.BLACK);
//	    g2d.setColor(Color.decode("#dd9f3e"));
//	    g2d.fillRect(970, 460, 50, 40);
//	    g2d.setColor(Color.decode("#ffd52e"));
//		g2d.fillRect(970, 460, 40, 30);
//		g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(970, 460, 40, 30,10,15);
//	    g2d.setColor(Color.BLACK);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(970, 460, 50, 40,10,15);
//	    g2d.drawRect(984, 470, 1, 6);
//	    
//	    //tubo morado 1
//	    //sombra
//	    g2d.setColor(Color.BLACK);
//	    g2d.fillRect(455, 510, 110, 125);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(455, 510, 110, 125,10,15);
//	    //parte de arriba del tubo
//	    g2d.setColor(Color.BLACK);
//	    g2d.fillRect(445, 460, 130, 50);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(445, 460, 130, 50,10,15);
//	    //tubo
//	    g2d.setColor(Color.decode("#6e6bb7"));
//	    g2d.fillRect(450, 510, 110, 125);
//	  //tubo detalles
//	    g2d.setColor(Color.decode("#434280"));
//	    g2d.fillRect(530, 510, 30, 125);
//	    g2d.fillRect(520, 510, 5, 125);
//	    g2d.setColor(Color.decode("#6360ad"));
//	    g2d.fillRect(505, 510, 15, 125);
//	    g2d.setColor(Color.decode("#e9f1fe"));
//	    g2d.fillRect(475, 510, 10, 125);
//	    g2d.setColor(Color.decode("#6865b0"));
//	    g2d.fillRect(455, 510, 10, 125);
//	    g2d.setColor(Color.decode("#434280"));
//	    g2d.fillRect(450, 510, 10, 125);
//	    //contorno
//	    g2d.setColor(Color.BLACK);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(450, 510, 110, 125,10,15);
//	    //parte de arriba del tubo
//	    g2d.setColor(Color.decode("#6e6bb7"));
//	    g2d.fillRect(440, 460, 130, 50);
//	  //tubo detalles
//	    g2d.setColor(Color.decode("#434280"));
//	    g2d.fillRect(540, 460, 30, 50);
//	    g2d.fillRect(530, 460, 5, 50);
//	    g2d.setColor(Color.decode("#6360ad"));
//	    g2d.fillRect(515, 460, 15, 50);
//	    g2d.setColor(Color.decode("#e9f1fe"));
//	    g2d.fillRect(470, 460, 10, 50);
//	    g2d.setColor(Color.decode("#6865b0"));
//	    g2d.fillRect(450, 460, 10, 50);
//	    g2d.setColor(Color.decode("#434280"));
//	    g2d.fillRect(440, 460, 10, 50);
//	    //contorno
//	    g2d.setColor(Color.BLACK);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(440, 460, 130, 50,10,15);
//	    
//	  //tubo morado 2
//	    //sombra
//	    g2d.setColor(Color.BLACK);
//	    g2d.fillRect(890, 550, 110, 125);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(890, 550, 110, 125,10,15);
//	    //parte de arriba del tubo
//	    g2d.setColor(Color.BLACK);
//	    g2d.fillRect(885, 530, 130, 50);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(885, 530, 130, 50,10,15);
//	    //tubo
//	    g2d.setColor(Color.decode("#6e6bb7"));
//	    g2d.fillRect(880, 570, 110, 125);
//	  //tubo detalles
//	    g2d.setColor(Color.decode("#434280"));
//	    g2d.fillRect(965, 570, 30, 125);
//	    g2d.fillRect(955, 570, 5, 125);
//	    g2d.setColor(Color.decode("#6360ad"));
//	    g2d.fillRect(940, 570, 15, 125);
//	    g2d.setColor(Color.decode("#e9f1fe"));
//	    g2d.fillRect(910, 570, 10, 125);
//	    g2d.setColor(Color.decode("#6865b0"));
//	    g2d.fillRect(890, 570, 10, 125);
//	    g2d.setColor(Color.decode("#434280"));
//	    g2d.fillRect(880, 570, 10, 125);
//	    //contorno
//	    g2d.setColor(Color.BLACK);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(880, 570, 110, 125,10,15);
//	    //parte de arriba del tubo
//	    g2d.setColor(Color.decode("#6e6bb7"));
//	    g2d.fillRect(875, 530, 130, 40);
//	  //tubo detalles
//	    g2d.setColor(Color.decode("#434280"));
//	    g2d.fillRect(975, 530, 30, 40);
//	    g2d.fillRect(965, 530, 5, 40);
//	    g2d.setColor(Color.decode("#6360ad"));
//	    g2d.fillRect(950, 530, 15, 40);
//	    g2d.setColor(Color.decode("#e9f1fe"));
//	    g2d.fillRect(905, 530, 10, 40);
//	    g2d.setColor(Color.decode("#6865b0"));
//	    g2d.fillRect(885, 530, 10, 40);
//	    g2d.setColor(Color.decode("#434280"));
//	    g2d.fillRect(875, 530, 10, 40);
//	    //contorno
//	    g2d.setColor(Color.BLACK);
//	    g2d.setStroke(new BasicStroke(5));
//	    g2d.drawRoundRect(875, 530, 130, 40,10,15);
//	    
//	  //imagenes
//	    try {
//	    	BufferedImage imageMario = ImageIO.read(new File("src/mario150px.png"));
//			g2d.drawImage(imageMario, 360, 480, null);
//	    	
//			BufferedImage imageArbusto = ImageIO.read(new File("src/arbusto50px.png"));
//			g2d.drawImage(imageArbusto, 150, 575, null);
//			
//			BufferedImage imageEnemigo = ImageIO.read(new File("src/planta120px.png"));
//			g2d.drawImage(imageEnemigo, 445, 275, null);	
//		}catch(IOException e)
//		{
//			//TODO Auto-generated catch black
//			e.printStackTrace();
//		}	
//	    
//	    //piso verde
//	    g2d.setColor(Color.decode("#18b22a"));
//		g2d.drawRect(0, 620, 1000, 700);
//		g2d.fillRect(0, 620, 1000, 700);
//		g2d.setColor(Color.decode("#12823c"));
//		g2d.drawRect(0, 640, 1000, 5);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(0, 620, 1000, 700,0,5);
//	    
//		//piso cremita
//	    g2d.setColor(Color.decode("#cf9e5f"));
//		g2d.drawRect(0, 650, 1000, 700);
//		g2d.fillRect(0, 650, 1000, 700);
//		
//		g2d.setColor(Color.BLACK); 
//	    g2d.setStroke(new BasicStroke(5));
//		g2d.drawRoundRect(0, 650, 1000, 700,0,5);
//		g2d.setColor(Color.decode("#85651e"));
//		g2d.drawRect(0, 655, 1000, 5);
//	    
//	}

	public void botones() {
		this.setSize(500,750);
		
		btn_panel = new JPanel();
		btn_panel.setSize(this.getWidth(), this.getHeight());
		btn_panel.setBackground(Color.red);
		this.add(btn_panel);
		btn_panel.setBackground(new Color(128, 188, 189));//añade color en RGB
		btn_panel.setLayout(null);//quitar el molde
		
		JButton botonClick = new JButton("Click me!");
		botonClick.setFont(new Font("Comic Sans MS",Font.BOLD,28));//establece fuente del texto
		botonClick.setBounds(150, 500, 200, 70);
		botonClick.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int x=(int)Math.floor(Math.random()*450+1);
				int y=(int)Math.floor(Math.random()*650+1);
				int w=(int)Math.floor(Math.random()*120+1);
				int h=(int)Math.floor(Math.random()*120+1);
				
				Random rand=new Random();
				float r=rand.nextFloat();
				float g=rand.nextFloat();
				float b=rand.nextFloat();
				
				JButton otro_boton = new JButton(r+","+g+","+b);
				otro_boton.setBounds(x,y,w,h);
				otro_boton.setOpaque(true);
				otro_boton.setBackground(new Color(r,g,b));
				otro_boton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						JButton yo = ((JButton) e.getSource());
						btn_panel.remove(yo);
						
						getContentPane().repaint();
						getContentPane().revalidate();
						
					}
				});
				btn_panel.add(otro_boton);	
				
				getContentPane().repaint();
				getContentPane().revalidate();
				
			}

		});
		btn_panel.add(botonClick);
		
		this.add(btn_panel);
	}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub

	int w=(int)Math.floor(Math.random()*120+1);
	int h=(int)Math.floor(Math.random()*120+1);
	
	Random rand=new Random();
	float r=rand.nextFloat();
	float g=rand.nextFloat();
	float b=rand.nextFloat();
	
	JButton otro_boton = new JButton(r+","+g+","+b);
	otro_boton.setBounds(e.getX(),e.getY(),w,h);
	otro_boton.setOpaque(true);	
	otro_boton.setBackground(new Color(r,g,b));
	btn_panel.add(otro_boton);
	otro_boton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String codigo = ((JButton) e.getSource()).getText();
			JOptionPane.showMessageDialog(null, codigo , "Color", JOptionPane.WARNING_MESSAGE);
			
		}
	});
	
	
	
	
	this.repaint();
	this.validate();
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
	// create object of Random class
	Random obj = new Random();
	int rand_num = obj.nextInt(0xffffff + 1);
	// format it as hexadecimal string and print
	String colorCode = String.format("#%06x", rand_num);
	
	btn_panel.setBackground(Color.decode(colorCode));
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}

