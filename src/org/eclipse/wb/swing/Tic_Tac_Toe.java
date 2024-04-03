package org.eclipse.wb.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Tic_Tac_Toe {

	private JFrame frmTicTacToe;
	public static boolean turno;
	public static int contador_X=0;
	public static int contador_O=0;

	public static JButton btnNewButton; 
	public static JButton btnNewButton_1; 
	public static JButton btnNewButton_2;
	public static JButton btnNewButton_3;
	public static JButton btnNewButton_4;
	public static JButton btnNewButton_5;
	public static JButton btnNewButton_6;
	public static JButton btnNewButton_7;
	public static JButton btnNewButton_8;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel labelX;
	private JLabel labelO;
	private JButton btnReiniciar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		turno=false;
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tic_Tac_Toe window = new Tic_Tac_Toe();
					window.frmTicTacToe.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tic_Tac_Toe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("Tic Tac Toe");
		frmTicTacToe.setBounds(100, 100, 805, 655);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmTicTacToe.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		btnNewButton = new JButton("");
		btnNewButton_1 = new JButton("");
		btnNewButton_2 = new JButton("");
		btnNewButton_3 = new JButton("");
		btnNewButton_4 = new JButton("");
		btnNewButton_5 = new JButton("");
		btnNewButton_6 = new JButton("");
		btnNewButton_7 = new JButton("");
		btnNewButton_8 = new JButton("");
		
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn =((JButton)e.getSource());
				click(btn);
			}
			
		});
		panel.add(btnNewButton);
		
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn =((JButton)e.getSource());
				click(btn);
			}
			
		});
		panel.add(btnNewButton_1);
		
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn =((JButton)e.getSource());
				click(btn);
			}
			
		});
		panel.add(btnNewButton_2);
		
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn =((JButton)e.getSource());
				click(btn);
			}
			
		});
		panel.add(btnNewButton_3);
		
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn =((JButton)e.getSource());
				click(btn);
			}
			
		});
		panel.add(btnNewButton_4);
		
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn =((JButton)e.getSource());
				click(btn);
			}
			
		});
		panel.add(btnNewButton_5);
		
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn =((JButton)e.getSource());
				click(btn);
			}
			
		});
		panel.add(btnNewButton_6);
		
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn =((JButton)e.getSource());
				click(btn);
			}
			
		});
		panel.add(btnNewButton_7);
		
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JButton btn =((JButton)e.getSource());
				click(btn);
			}
			
		});
		panel.add(btnNewButton_8);
		
		panel_1 = new JPanel();
		frmTicTacToe.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		labelX = new JLabel("X: 0");
		labelX.setHorizontalAlignment(SwingConstants.CENTER);
		labelX.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(labelX);
		
		labelO = new JLabel("O: 0");
		labelO.setHorizontalAlignment(SwingConstants.CENTER);
		labelO.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(labelO);
		
		panel_2 = new JPanel();
		frmTicTacToe.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 30));
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
						btn.setText("");
						btn.setBackground(null);
						btn.setEnabled(true);
					}
					
				}
			}
		});
		panel_2.add(btnReiniciar);
	}
	
	public void click(JButton btn) 
	{
		if(btn.getText().equals("")) 
		{
			//2.- el turno
			if(turno) 
			{
//				btn.setIcon(new ImageIcon(getClass().getResource("mas30.png")));
				btn.setText("O");
				btn.setFont(new Font("Comic Sans MS",Font.BOLD,58));
				btn.setBackground(Color.WHITE);
				turno=false;
				
			}else 
			{
//				btn.setIcon(new ImageIcon(getClass().getResource("cancelar.png")));
				btn.setText("X" );
				btn.setFont(new Font("Comic Sans MS",Font.BOLD,58));
				btn.setBackground(Color.BLACK);
				turno=true;
			}
			
		}
		
		btn.setEnabled(false);
		
		if(btnNewButton.getText().equals(btnNewButton_1.getText()) 
				&& btnNewButton.getText().equals(btnNewButton_2.getText()) 
				&& !btnNewButton.getText().equals(""))  {
				
//						if(btnNewButton.getText().equals("X")&&!btnNewButton.getText().equals("")) {
//							contador_X++;
//							labelX.setText("X:" + contador_X);
//						}else
//						{
//							contador_O++;
//							labelO.setText("O:" + contador_O);
//						}
			ganar();
			JOptionPane.showMessageDialog(null, "Felicidades! ganaste","Inane warning", JOptionPane.WARNING_MESSAGE);	
		}
		
		if(btnNewButton_3.getText().equals(btnNewButton_4.getText()) 
				&& btnNewButton_3.getText().equals(btnNewButton_5.getText()) 
				&& !btnNewButton_3.getText().equals(""))  {

//					if(btnNewButton_3.getText().equals("X")&&!btnNewButton_3.getText().equals("")) {
//						contador_X++;
//						labelX.setText("X:" + contador_X);
//					}else
//					{
//						contador_O++;
//						labelO.setText("O:" + contador_O);
//					}
			ganar();
			JOptionPane.showMessageDialog(null, "Felicidades! ganaste","Inane warning", JOptionPane.WARNING_MESSAGE);
				
		}
		
		if(btnNewButton_6.getText().equals(btnNewButton_7.getText()) 
				&& btnNewButton_6.getText().equals(btnNewButton_8.getText()) 
				&& !btnNewButton_6.getText().equals(""))  {

//					if(btnNewButton_6.getText().equals("X")&&!btnNewButton_6.getText().equals("")) {
//						contador_X++;
//						labelX.setText("X:" + contador_X);
//					}else
//					{
//						contador_O++;
//						labelO.setText("O:" + contador_O);
//					}
			ganar();
			JOptionPane.showMessageDialog(null, "Felicidades! ganaste", "Inane warning", JOptionPane.WARNING_MESSAGE);
				
		}
		
		if(btnNewButton.getText().equals(btnNewButton_3.getText()) 
				&& btnNewButton.getText().equals(btnNewButton_6.getText()) 
				&& !btnNewButton.getText().equals(""))  {

//					if(btnNewButton.getText().equals("X")&&!btnNewButton.getText().equals("")) {
//						contador_X++;
//						labelX.setText("X:" + contador_X);
//					}else
//					{
//						contador_O++;
//						labelO.setText("O:" + contador_O);
//					}
			ganar();
			JOptionPane.showMessageDialog(null, "Felicidades! ganaste", "Inane warning", JOptionPane.WARNING_MESSAGE);
				
		}
		
		if(btnNewButton_1.getText().equals(btnNewButton_4.getText()) 
				&& btnNewButton_1.getText().equals(btnNewButton_7.getText()) 
				&& !btnNewButton_1.getText().equals(""))  {

//			if(btnNewButton_1.getText().equals("X")&&!btnNewButton_1.getText().equals("")) {
//			contador_X++;
//			labelX.setText("X:" + contador_X);
//		}else
//		{
//			contador_O++;
//			labelO.setText("O:" + contador_O);
//		}
			ganar();
			JOptionPane.showMessageDialog(null, "Felicidades! ganaste", "Inane warning", JOptionPane.WARNING_MESSAGE);
				
		}
		
		if(btnNewButton_2.getText().equals(btnNewButton_5.getText()) 
				&& btnNewButton_2.getText().equals(btnNewButton_8.getText()) 
				&& !btnNewButton_2.getText().equals(""))  {

//					if(btnNewButton_2.getText().equals("X")&&!btnNewButton_2.getText().equals("")) {
//						contador_X++;
//						labelX.setText("X:" + contador_X);
//					}else
//					{
//						contador_O++;
//						labelO.setText("O:" + contador_O);
//					}
			ganar();
			JOptionPane.showMessageDialog(null, "Felicidades! ganaste", "Inane warning", JOptionPane.WARNING_MESSAGE);
				
		
		}
		
		if(btnNewButton.getText().equals(btnNewButton_4.getText()) 
				&& btnNewButton.getText().equals(btnNewButton_8.getText()) 
				&& !btnNewButton.getText().equals(""))  {

//					if(btnNewButton.getText().equals("X")&&!btnNewButton.getText().equals("")) {
//						contador_X++;
//						labelX.setText("X:" + contador_X);
//					}else
//					{
//						contador_O++;
//						labelO.setText("O:" + contador_O);
//					}
			ganar();
			JOptionPane.showMessageDialog(null, "Felicidades! ganaste", "Inane warning", JOptionPane.WARNING_MESSAGE);
				
		}
		
		if(btnNewButton_6.getText().equals(btnNewButton_4.getText()) 
				&& btnNewButton_6.getText().equals(btnNewButton_2.getText()) 
				&& !btnNewButton_6.getText().equals(""))  {

//					if(btnNewButton_6.getText().equals("X")&&!btnNewButton_6.getText().equals("")) {
//						contador_X++;
//						labelX.setText("X:" + contador_X);
//					}else
//					{
//						contador_O++;
//						labelO.setText("O:" + contador_O);
//					}
			ganar();
			JOptionPane.showMessageDialog(null, "Felicidades! ganaste", "Inane warning", JOptionPane.WARNING_MESSAGE);
				
		}
	
	}
	
	public void ganar() 	
	{
		if(turno) {
			contador_X++;
			labelX.setText("X: " + contador_X);
					
		}else {
			contador_O++;
			labelO.setText("O: " + contador_O);
		}
	}
}
