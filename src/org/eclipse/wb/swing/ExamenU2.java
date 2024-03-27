package org.eclipse.wb.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class ExamenU2 {

	private JFrame frame;
	private JTextField cuadro_Docs;
	private JTextField cuadro_Nombre;
	private JTextField cuadro_Calle;
	private JTextField cuadro_Tel;
	private JTable tablaProductos;
	private JTextField cuadroDescuento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamenU2 window = new ExamenU2();
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
	public ExamenU2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 798, 663);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorte = new JPanel();
		panelNorte.setForeground(new Color(51, 102, 153));
		panelNorte.setBackground(new Color(51, 102, 153));
		frame.getContentPane().add(panelNorte, BorderLayout.NORTH);
		panelNorte.setLayout(new BoxLayout(panelNorte, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(new Color(51, 102, 153));
		lblNewLabel_2.setBackground(new Color(51, 102, 153));
		panelNorte.add(lblNewLabel_2);
		
		JLabel etiquetaTitulo = new JLabel("    Factura en java - NetBeans - ArrayList y POO");
		etiquetaTitulo.setFont(new Font("Arial", Font.BOLD, 20));
		etiquetaTitulo.setForeground(Color.WHITE);
		panelNorte.add(etiquetaTitulo);
		
		JLabel etiquetaSubtitulo = new JLabel("      [Sin base de datos]");
		etiquetaSubtitulo.setFont(new Font("Arial", Font.BOLD, 15));
		etiquetaSubtitulo.setForeground(Color.WHITE);
		panelNorte.add(etiquetaSubtitulo);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBackground(new Color(51, 102, 153));
		lblNewLabel_4.setForeground(new Color(51, 102, 153));
		panelNorte.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		panelNorte.add(lblNewLabel_3);
		
		JPanel panelSur = new JPanel();
		panelSur.setBackground(new Color(51, 102, 153));
		panelSur.setForeground(new Color(51, 102, 153));
		frame.getContentPane().add(panelSur, BorderLayout.SOUTH);
		
		JPanel panelIzq = new JPanel();
		frame.getContentPane().add(panelIzq, BorderLayout.WEST);
		
		JPanel panelDer = new JPanel();
		frame.getContentPane().add(panelDer, BorderLayout.EAST);
		
		JPanel panelCentral = new JPanel();
		frame.getContentPane().add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel panelDatosClientes = new JPanel();
		panelCentral.add(panelDatosClientes);
		panelDatosClientes.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelDatosClientes.add(panel, BorderLayout.NORTH);
		
		JLabel etiquetaDatosCliente = new JLabel("Datos del cliente");
		etiquetaDatosCliente.setFont(new Font("Arial", Font.PLAIN, 12));
		panel.add(etiquetaDatosCliente);
		
		JPanel panel_4 = new JPanel();
		panelDatosClientes.add(panel_4, BorderLayout.WEST);
		
		JPanel panel_5 = new JPanel();
		panelDatosClientes.add(panel_5, BorderLayout.EAST);
		
		JPanel panel_6 = new JPanel();
		panelDatosClientes.add(panel_6, BorderLayout.SOUTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelDatosClientes.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new GridLayout(2, 4, 10, 10));
		
		JLabel etiqueta_Documento = new JLabel("Documento: ");
		etiqueta_Documento.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_7.add(etiqueta_Documento);
		
		cuadro_Docs = new JTextField();
		cuadro_Docs.setFont(new Font("Arial", Font.PLAIN, 12));
		cuadro_Docs.setText("123456");
		panel_7.add(cuadro_Docs);
		cuadro_Docs.setColumns(10);
		
		JLabel etiqueta_Nombres = new JLabel("Nombres:");
		etiqueta_Nombres.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_7.add(etiqueta_Nombres);
		
		cuadro_Nombre = new JTextField();
		cuadro_Nombre.setFont(new Font("Arial", Font.PLAIN, 12));
		cuadro_Nombre.setText("Jhon Doe");
		panel_7.add(cuadro_Nombre);
		cuadro_Nombre.setColumns(10);
		
		JLabel etiqueta_Direccion = new JLabel("Dirección: ");
		etiqueta_Direccion.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_7.add(etiqueta_Direccion);
		
		cuadro_Calle = new JTextField();
		cuadro_Calle.setFont(new Font("Arial", Font.PLAIN, 12));
		cuadro_Calle.setText("Calle 1 # 123");
		panel_7.add(cuadro_Calle);
		cuadro_Calle.setColumns(10);
		
		JLabel etiqueta_Telefono = new JLabel("Teléfono:");
		etiqueta_Telefono.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_7.add(etiqueta_Telefono);
		
		cuadro_Tel = new JTextField();
		cuadro_Tel.setFont(new Font("Arial", Font.PLAIN, 12));
		cuadro_Tel.setText("5554433");
		panel_7.add(cuadro_Tel);
		cuadro_Tel.setColumns(10);
		
		JPanel panelDatosFactura = new JPanel();
		panelCentral.add(panelDatosFactura);
		panelDatosFactura.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelDatosFactura.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_10 = new JLabel("Datos de factura");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_1.add(lblNewLabel_10);
		
		JPanel panel_8 = new JPanel();
		panelDatosFactura.add(panel_8, BorderLayout.SOUTH);
		
		JPanel panel_9 = new JPanel();
		panelDatosFactura.add(panel_9, BorderLayout.WEST);
		
		JPanel panel_10 = new JPanel();
		panelDatosFactura.add(panel_10, BorderLayout.EAST);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelDatosFactura.add(panel_11, BorderLayout.CENTER);
		panel_11.setLayout(new GridLayout(0, 4, 10, 10));
		
		JLabel etiqueta_factura = new JLabel("N° Factura: ");
		etiqueta_factura.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_11.add(etiqueta_factura);
		
		JLabel labelFactura = new JLabel("1");
		labelFactura.setFont(new Font("Arial", Font.BOLD, 12));
		panel_11.add(labelFactura);
		
		JLabel etiqueta_fecha = new JLabel("Fecha: ");
		etiqueta_fecha.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_11.add(etiqueta_fecha);
		
		JLabel labelFecha = new JLabel("2021/50/21");
		labelFecha.setFont(new Font("Arial", Font.BOLD, 12));
		panel_11.add(labelFecha);
		
		JPanel panelTabla = new JPanel();
		panelCentral.add(panelTabla);
		panelTabla.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panelIconos = new JPanel();
		panelTabla.add(panelIconos);
		panelIconos.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_izqLabels = new JPanel();
		panelIconos.add(panel_izqLabels, BorderLayout.WEST);
		panel_izqLabels.setLayout(new BoxLayout(panel_izqLabels, BoxLayout.X_AXIS));
		
		JLabel iconoLista = new JLabel("");
//		iconoLista.setIcon(new ImageIcon("src\\menu30px.png"));
		iconoLista.setIcon(new ImageIcon(getClass().getResource("menu30px.png")));
		panel_izqLabels.add(iconoLista);
		
		JLabel labelListado = new JLabel("   Ver listado de facturas");
		panel_izqLabels.add(labelListado);
		
		JPanel panel_derLabels = new JPanel();
		panelIconos.add(panel_derLabels, BorderLayout.EAST);
		panel_derLabels.setLayout(new BoxLayout(panel_derLabels, BoxLayout.X_AXIS));
		
		JLabel iconoMas = new JLabel("");
//     	iconoMas.setIcon(new ImageIcon("src\\mas30.png"));
		iconoMas.setIcon(new ImageIcon(getClass().getResource("mas30.png")));
		panel_derLabels.add(iconoMas);
		
		JLabel labelAñadir = new JLabel("   Añadir     ");
		panel_derLabels.add(labelAñadir);
		
		JLabel iconoEliminar = new JLabel("");
//		iconoEliminar.setIcon(new ImageIcon("src\\eliminar30px.png"));
		iconoEliminar.setIcon(new ImageIcon(getClass().getResource("eliminar30px.png")));
		panel_derLabels.add(iconoEliminar);
		
		JLabel labelEliminar = new JLabel("   Eliminar     ");
		panel_derLabels.add(labelEliminar);
		
		tablaProductos = new JTable();
		tablaProductos.setFont(new Font("Arial", Font.PLAIN, 12));
		tablaProductos.setModel(new DefaultTableModel(
			new Object[][] {
				{"Producto", "Cantidad", "Valor", "Subtotal"},
				{"Agua", "2", "500", "1000.0"},
				{"Cereal", "5", "1000", "5000.0"},
				{"Leche", "2", "300", "600.0"},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Producto", "Cantidad", "Valor", "Subtotal"
			}
		));
		
		panelTabla.add(tablaProductos);
		
		JPanel panelTotal = new JPanel();
		panelCentral.add(panelTotal);
		panelTotal.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panelTotal.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotones = new JPanel();
		FlowLayout fl_panelBotones = (FlowLayout) panelBotones.getLayout();
		fl_panelBotones.setAlignment(FlowLayout.RIGHT);
		panel_2.add(panelBotones, BorderLayout.SOUTH);
		
		JButton btnFinalizar = new JButton("Finalizar factura");
		btnFinalizar.setFont(new Font("Arial", Font.PLAIN, 12));
		panelBotones.add(btnFinalizar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Arial", Font.PLAIN, 12));
		panelBotones.add(btnLimpiar);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel panel_12 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_12.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_3.add(panel_12);
		
		JLabel etiqueta_subtotal = new JLabel("Subtotal: ");
		etiqueta_subtotal.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_12.add(etiqueta_subtotal);
		
		JLabel labelNumSubtotal = new JLabel("6600.0");
		labelNumSubtotal.setFont(new Font("Arial", Font.BOLD, 12));
		panel_12.add(labelNumSubtotal);
		
		JPanel panel_14 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_14.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_3.add(panel_14);
		
		JLabel etiqueta_descuento = new JLabel("% Descuento: ");
		etiqueta_descuento.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_14.add(etiqueta_descuento);
		
		cuadroDescuento = new JTextField();
		cuadroDescuento.setText("5");
		cuadroDescuento.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_14.add(cuadroDescuento);
		cuadroDescuento.setColumns(10);
		
		JCheckBox chckbxDescuento = new JCheckBox("Valor descontado: ");
		chckbxDescuento.setSelected(true);
		chckbxDescuento.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_14.add(chckbxDescuento);
		
		JLabel labelNumDescuento = new JLabel("330.0");
		labelNumDescuento.setFont(new Font("Arial", Font.BOLD, 12));
		panel_14.add(labelNumDescuento);
		
		JPanel panel_15 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_15.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_3.add(panel_15);
		
		JLabel etiqueta_IVA = new JLabel("IVA 19%: ");
		etiqueta_IVA.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_15.add(etiqueta_IVA);
		
		JLabel lblNumIVA = new JLabel("1254.0");
		lblNumIVA.setFont(new Font("Arial", Font.BOLD, 12));
		panel_15.add(lblNumIVA);
		
		JPanel panel_13 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_13.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_3.add(panel_13);
		
		JLabel etiqueta_total = new JLabel("Total factura: ");
		etiqueta_total.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_13.add(etiqueta_total);
		
		JLabel lblNumTotal = new JLabel("7524.0");
		lblNumTotal.setFont(new Font("Arial", Font.BOLD, 12));
		panel_13.add(lblNumTotal);
	}

}
