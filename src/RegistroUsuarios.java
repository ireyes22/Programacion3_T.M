import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.ScrollPane;

public class RegistroUsuarios {

	private JFrame frmRegistroDeUsuarios;
	private JTextField text_nombre;
	private JTextField text_AP;
	private JTextField text_AM;
	private JTextField text_fecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroUsuarios window = new RegistroUsuarios();
					window.frmRegistroDeUsuarios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistroUsuarios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistroDeUsuarios = new JFrame();
		frmRegistroDeUsuarios.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconoPerfil.png")));
		frmRegistroDeUsuarios.getContentPane().setFont(new Font("Arial Black", Font.BOLD, 15));
		frmRegistroDeUsuarios.setTitle("Registro de usuarios");
		frmRegistroDeUsuarios.setResizable(false);
		frmRegistroDeUsuarios.getContentPane().setBackground(Color.WHITE);
		frmRegistroDeUsuarios.getContentPane().setLayout(new BorderLayout(0, 0));
		
		//PANEL DEL TITULO//
		JPanel panelNorte = new JPanel();
		FlowLayout fl_panelNorte = (FlowLayout) panelNorte.getLayout();
		fl_panelNorte.setAlignment(FlowLayout.LEFT);
		panelNorte.setToolTipText("");
		panelNorte.setBackground(Color.GREEN);
		frmRegistroDeUsuarios.getContentPane().add(panelNorte, BorderLayout.NORTH);
		
		JLabel etiquetaTitulo = new JLabel("Registro de usuarios");
		etiquetaTitulo.setForeground(Color.RED);
		etiquetaTitulo.setFont(new Font("Arial Black", Font.BOLD, 15));
		panelNorte.add(etiquetaTitulo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panelNorte.add(lblNewLabel_1);
		panelNorte.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{etiquetaTitulo, lblNewLabel_1}));
		
		//PANELES PARA LOS BORDES (ESTE, SUR, OESTE)//
		JPanel panelIzquiero = new JPanel();
		panelIzquiero.setBackground(Color.GREEN);
		frmRegistroDeUsuarios.getContentPane().add(panelIzquiero, BorderLayout.WEST);
		
		JPanel panelDerecho = new JPanel();
		panelDerecho.setBackground(Color.GREEN);
		frmRegistroDeUsuarios.getContentPane().add(panelDerecho, BorderLayout.EAST);
		
		JPanel panelSur = new JPanel();
		panelSur.setBackground(Color.GREEN);
		frmRegistroDeUsuarios.getContentPane().add(panelSur, BorderLayout.SOUTH);
		
		//PANEL QUE CONTIENE LOS 4 PANELES PRINCIPALES//
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(Color.GREEN);
		frmRegistroDeUsuarios.getContentPane().add(panelCenter, BorderLayout.CENTER);
		
		//PANEL DATOS GENERALES//
		JPanel panelDatosGenerales = new JPanel();
		panelDatosGenerales.setBorder(new BevelBorder(BevelBorder.LOWERED));
		panelDatosGenerales.setBackground(new Color(102, 255, 204));
		panelDatosGenerales.setLayout(null);
		
		JLabel etiqueta_datos = new JLabel("Datos generales");
		etiqueta_datos.setFont(new Font("Arial", Font.BOLD, 15));
		etiqueta_datos.setBounds(10, 0, 135, 26);
		panelDatosGenerales.add(etiqueta_datos);
		
		JLabel etiqueta_nombre = new JLabel("Nombres:");
		etiqueta_nombre.setFont(new Font("Arial", Font.BOLD, 12));
		etiqueta_nombre.setBounds(75, 46, 80, 13);
		panelDatosGenerales.add(etiqueta_nombre);
		
		text_nombre = new JTextField();
		text_nombre.setBounds(154, 43, 186, 19);
		panelDatosGenerales.add(text_nombre);
		text_nombre.setColumns(10);
		
		JLabel etiqueta_AP = new JLabel("Apellido paterno:");
		etiqueta_AP.setFont(new Font("Arial", Font.BOLD, 12));
		etiqueta_AP.setBounds(33, 86, 122, 13);
		panelDatosGenerales.add(etiqueta_AP);
		
		text_AP = new JTextField();
		text_AP.setColumns(10);
		text_AP.setBounds(154, 83, 186, 19);
		panelDatosGenerales.add(text_AP);
		
		JLabel etiqueta_AM = new JLabel("Apellido materno:");
		etiqueta_AM.setFont(new Font("Arial", Font.BOLD, 12));
		etiqueta_AM.setBounds(32, 125, 123, 13);
		panelDatosGenerales.add(etiqueta_AM);
		
		text_AM = new JTextField();
		text_AM.setColumns(10);
		text_AM.setBounds(154, 122, 186, 19);
		panelDatosGenerales.add(text_AM);
		
		JLabel etiqueta_fecha = new JLabel("Fecha de nacimiento:");
		etiqueta_fecha.setFont(new Font("Arial", Font.BOLD, 12));
		etiqueta_fecha.setBounds(10, 158, 135, 19);
		panelDatosGenerales.add(etiqueta_fecha);
		
		text_fecha = new JTextField();
		text_fecha.setColumns(10);
		text_fecha.setBounds(154, 158, 186, 19);
		panelDatosGenerales.add(text_fecha);
		
		JLabel etiqueta_Sexo = new JLabel("Sexo:");
		etiqueta_Sexo.setFont(new Font("Arial", Font.BOLD, 12));
		etiqueta_Sexo.setBounds(100, 197, 45, 13);
		panelDatosGenerales.add(etiqueta_Sexo);
			
		JRadioButton rbMasculino = new JRadioButton("Masculino");
		rbMasculino.setOpaque(false);
		rbMasculino.setFont(new Font("Arial", Font.BOLD, 12));
		rbMasculino.setBackground(new Color(255, 255, 255));
		rbMasculino.setForeground(Color.BLACK);
		rbMasculino.setBounds(154, 193, 103, 21);
		panelDatosGenerales.add(rbMasculino);
		
		JRadioButton rbFemenino = new JRadioButton("Femenino");
		rbFemenino.setOpaque(false);
		rbFemenino.setForeground(Color.BLACK);
		rbFemenino.setFont(new Font("Arial", Font.BOLD, 12));
		rbFemenino.setBackground(Color.CYAN);
		rbFemenino.setBounds(154, 216, 103, 21);
		panelDatosGenerales.add(rbFemenino);
		
		 ButtonGroup sexo = new ButtonGroup();//agrupa los radios buttons
		 sexo.add(rbMasculino);
		 sexo.add(rbFemenino);
		
		JLabel etiqueta_pais = new JLabel("Nacionalidad:");
		etiqueta_pais.setFont(new Font("Arial", Font.BOLD, 12));
		etiqueta_pais.setBounds(55, 241, 90, 13);
		panelDatosGenerales.add(etiqueta_pais);
		
		JComboBox comboNacionalidad = new JComboBox();
		comboNacionalidad.setFont(new Font("Arial", Font.BOLD, 12));
		comboNacionalidad.setModel(new DefaultComboBoxModel(new String[] {"Argentina", "Bolivia", "Brasil", "Chile", "Cuba ", "Colombia", "Costa Rica", "Ecuador", "El Salvador", "Guatemala", "Haití", "Honduras", "México", "Nicaragua", "Panamá", "Paraguay", "Perú", "Republica Dominicana", "Uruguay", "Venezuela"}));
		comboNacionalidad.setBounds(154, 243, 186, 21);
		panelDatosGenerales.add(comboNacionalidad);
		panelCenter.add(panelDatosGenerales);
		
		//PANEL PERFIL DE USUARIO//
		JPanel panelPerfil = new JPanel();
		panelPerfil.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelPerfil.setBackground(Color.PINK);
		panelPerfil.setLayout(null);
		panelCenter.add(panelPerfil);
		
		JLabel lblPerfilDelUsuario = new JLabel("Perfil del usuario");
		lblPerfilDelUsuario.setBounds(10, 10, 149, 18);
		lblPerfilDelUsuario.setFont(new Font("Arial", Font.BOLD, 15));
		panelPerfil.add(lblPerfilDelUsuario);
		panelCenter.setLayout(new GridLayout(0, 2, 0, 0));
		panelDatosGenerales.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("iconoPerfil.png")));
		lblNewLabel.setBounds(125, 47, 149, 138);
		panelPerfil.add(lblNewLabel);
		
		JCheckBox chckbxFoto = new JCheckBox("Mostrar foto de perfil");
		chckbxFoto.setBackground(Color.PINK);
		chckbxFoto.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxFoto.setForeground(Color.BLACK);
		chckbxFoto.setBounds(125, 209, 149, 21);
		panelPerfil.add(chckbxFoto);
		
		JCheckBox chckbxFecha = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxFecha.setForeground(Color.BLACK);
		chckbxFecha.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxFecha.setBackground(Color.PINK);
		chckbxFecha.setBounds(103, 246, 201, 21);
		panelPerfil.add(chckbxFecha);
		
		//PANEL DATOS OPCIONALES//
		JPanel panelDatosOpcionales = new JPanel();
		panelDatosOpcionales.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelDatosOpcionales.setBackground(new Color(255, 102, 102));
		panelDatosOpcionales.setLayout(null);
		panelCenter.add(panelDatosOpcionales);
		
		JLabel lblDatosOpcionales = new JLabel("Datos opcionales");
		lblDatosOpcionales.setFont(new Font("Arial", Font.BOLD, 15));
		lblDatosOpcionales.setBounds(10, 10, 149, 18);
		panelDatosOpcionales.add(lblDatosOpcionales);
		
		JLabel etiqueta_descripcion = new JLabel("Descripción:");
		etiqueta_descripcion.setFont(new Font("Arial", Font.BOLD, 12));
		etiqueta_descripcion.setBounds(48, 57, 89, 13);
		panelDatosOpcionales.add(etiqueta_descripcion);
		
		JLabel etiqueta_preferencias = new JLabel("Preferencias:");
		etiqueta_preferencias.setFont(new Font("Arial", Font.BOLD, 12));
		etiqueta_preferencias.setBounds(226, 57, 99, 13);
		panelDatosOpcionales.add(etiqueta_preferencias);
		
		JTextArea textDescripcionArea = new JTextArea();
		textDescripcionArea.setFont(new Font("Arial", Font.BOLD, 12));
		textDescripcionArea.setBounds(20, 80, 154, 127);
		panelDatosOpcionales.add(textDescripcionArea);
		
		JScrollPane scrollArea = new JScrollPane(textDescripcionArea);
		scrollArea.setBounds(20, 80, 154, 127);
		panelDatosOpcionales.add(scrollArea);
		
		JList listPreferencias = new JList();
		listPreferencias.setModel(new AbstractListModel() {
			String[] values = new String[] {"Bailar", "Dibujar", "Dormir", "Pintar", "Programar", "Procastinar", "Leer", "Escuchar música", "Tocar un instrumento ", "Ver peliculas ", "Ver series", "Ver caricaturas", "Ejercitarse", "Salir a pasear", "Otro..."};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listPreferencias.setFont(new Font("Arial", Font.BOLD, 12));
		listPreferencias.setBounds(204, 80, 154, 127);
		panelDatosOpcionales.add(listPreferencias);
		
		JScrollPane tableScroll = new JScrollPane(listPreferencias);
		tableScroll.setBounds(204, 80, 154, 127);
		panelDatosOpcionales.add(tableScroll);
		
		//PANEL DE LOS BOTONES//
		JPanel panelBotones = new JPanel();
		panelBotones.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelBotones.setBackground(new Color(102, 255, 204));
		panelBotones.setLayout(null);
		panelCenter.add(panelBotones);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setIcon(new ImageIcon(getClass().getResource("user.png")));
		btnNuevo.setBackground(Color.BLACK);
		btnNuevo.setForeground(Color.WHITE);
		btnNuevo.setFont(new Font("Arial", Font.BOLD, 12));
		btnNuevo.setBounds(128, 65, 133, 39);
		panelBotones.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar\r\n");
		btnGuardar.setIcon(new ImageIcon(getClass().getResource("iconoGuardar.png")));
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setBackground(Color.BLACK);
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
		btnGuardar.setBounds(128, 128, 133, 39);
		panelBotones.add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setIcon(new ImageIcon(getClass().getResource("iconoSalir.png")));
		btnSalir.setBackground(Color.BLACK);
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setFont(new Font("Arial", Font.BOLD, 12));
		btnSalir.setBounds(128, 193, 133, 39);
		panelBotones.add(btnSalir);
		
		frmRegistroDeUsuarios.setBounds(100, 100, 808, 663);
		frmRegistroDeUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
