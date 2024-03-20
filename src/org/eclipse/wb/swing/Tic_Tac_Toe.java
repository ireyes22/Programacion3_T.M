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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

public class Tic_Tac_Toe {

	private JFrame frmTicTacToe;
	public static boolean turno;

	public static JButton btnNewButton; 
	public static JButton btnNewButton_1; 
	public static JButton btnNewButton_2;
	public static JButton btnNewButton_3;
	public static JButton btnNewButton_4;
	public static JButton btnNewButton_5;
	public static JButton btnNewButton_6;
	public static JButton btnNewButton_7;
	public static JButton btnNewButton_8;
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
		frmTicTacToe.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmTicTacToe.getContentPane().add(panel, "name_19973696011700");
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
	}
	
	public void click(JButton btn) 
	{
	

				if(btn.getText().equals("")) {
					
					//2.- el turno
					if(turno) 
					{
						btn.setText("O");
						btn.setBackground(Color.WHITE);
						btn.setFont(new Font("Comic Sans MS",Font.BOLD,58));
						turno=false;
						
					}else 
					{
						btn.setText("X" );
						btn.setBackground(Color.BLACK);
						btn.setFont(new Font("Comic Sans MS",Font.BOLD,58));
						turno=true;
					}
					
				}
				
				btn.setEnabled(false);
				
				if(btnNewButton.getText().equals(btnNewButton_1.getText()) 
						&& btnNewButton.getText().equals(btnNewButton_2.getText()) 
						&& !btnNewButton.getText().equals(""))  {

						JOptionPane.showMessageDialog(null, "Felicidades! ganaste","Inane warning", JOptionPane.WARNING_MESSAGE);
					
						
				}
				
				if(btnNewButton_3.getText().equals(btnNewButton_4.getText()) 
						&& btnNewButton_3.getText().equals(btnNewButton_5.getText()) 
						&& !btnNewButton_3.getText().equals(""))  {

						JOptionPane.showMessageDialog(null, "Felicidades! ganaste","Inane warning", JOptionPane.WARNING_MESSAGE);
						
				}
				
				if(btnNewButton_6.getText().equals(btnNewButton_7.getText()) 
						&& btnNewButton_6.getText().equals(btnNewButton_8.getText()) 
						&& !btnNewButton_6.getText().equals(""))  {

						JOptionPane.showMessageDialog(null, "Felicidades! ganaste", "Inane warning", JOptionPane.WARNING_MESSAGE);
						
				}
				
				if(btnNewButton.getText().equals(btnNewButton_3.getText()) 
						&& btnNewButton.getText().equals(btnNewButton_6.getText()) 
						&& !btnNewButton.getText().equals(""))  {

						JOptionPane.showMessageDialog(null, "Felicidades! ganaste", "Inane warning", JOptionPane.WARNING_MESSAGE);
						
				}
				
				if(btnNewButton_1.getText().equals(btnNewButton_4.getText()) 
						&& btnNewButton_1.getText().equals(btnNewButton_7.getText()) 
						&& !btnNewButton_1.getText().equals(""))  {

						JOptionPane.showMessageDialog(null, "Felicidades! ganaste", "Inane warning", JOptionPane.WARNING_MESSAGE);
						
				}
				
				if(btnNewButton_2.getText().equals(btnNewButton_5.getText()) 
						&& btnNewButton_2.getText().equals(btnNewButton_8.getText()) 
						&& !btnNewButton_2.getText().equals(""))  {

						JOptionPane.showMessageDialog(null, "Felicidades! ganaste", "Inane warning", JOptionPane.WARNING_MESSAGE);
						
				
				}
				
				if(btnNewButton.getText().equals(btnNewButton_4.getText()) 
						&& btnNewButton.getText().equals(btnNewButton_8.getText()) 
						&& !btnNewButton.getText().equals(""))  {

						JOptionPane.showMessageDialog(null, "Felicidades! ganaste", "Inane warning", JOptionPane.WARNING_MESSAGE);
						
				}
				
				if(btnNewButton_6.getText().equals(btnNewButton_4.getText()) 
						&& btnNewButton_6.getText().equals(btnNewButton_2.getText()) 
						&& !btnNewButton_6.getText().equals(""))  {

						JOptionPane.showMessageDialog(null, "Felicidades! ganaste", "Inane warning", JOptionPane.WARNING_MESSAGE);
						
				}
			
	}
}
