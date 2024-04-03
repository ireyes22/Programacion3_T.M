package org.eclipse.wb.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Component;

public class Rompecabezas_numerico extends JFrame implements MouseListener{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rompecabezas_numerico window = new Rompecabezas_numerico();
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
	public Rompecabezas_numerico() {
		initialize();
		
		this.addMouseListener(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 690, 657);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(45, 149, 150));
		panel.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("ROMPECABEZAS NUMÉRICO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(45, 149, 150));
		panel.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Component[] elementos = panel.getComponents();
				
				for (int i =0;i<elementos.length;i++)
				{
					if(elementos[i].getClass().toString().equals("class javax.swing.JButton")) 
					{
						JButton btn=((JButton)elementos[i]);
						btn.setEnabled(true);
					}
					
				}
			}
		});
		panel_2.add(btnReiniciar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(45, 149, 150));
		panel.add(panel_3, BorderLayout.WEST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(45, 149, 150));
		panel.add(panel_4, BorderLayout.EAST);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(45, 149, 150));
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(4, 4, 10, 10));
		
		String botones[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",""};
		
		for(int i=0;i<16;i++) {
			JButton boton = new JButton(botones[i]);
			panel_5.add(boton);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

//		Component[] elementos = (Component[]) e.getSource();
//		for (int i =0;i<elementos.length;i++)
//		{
//			if(elementos[i].getClass().toString().equals("class javax.swing.JButton")) 
//			{
//				JButton btn=((JButton)elementos[i]);
//				btn.setLocation(btn.getX()+10,btn.getY());
//				getContentPane().repaint();
//				getContentPane().revalidate();
//			}	
//		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
