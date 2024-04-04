package org.eclipse.wb.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.Timer;
import javax.swing.SwingConstants;

public class Rompecabezas_numerico extends JFrame {
	
	
	private JFrame frmRompecabezasNumerico;
	private Timer tiempo;
	private JButton[][] matrizBotones;
	private JLabel labelTiempo;
    private int horas=0;
    private int minutos=0;
    private int segundos=0;
    private int milisegundos=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rompecabezas_numerico window = new Rompecabezas_numerico();
					window.frmRompecabezasNumerico.setVisible(true);
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
		tiempo = new Timer(10,(ActionEvent e)->{
			 inciar();
		});
		
		mover();

	}

	private void inciar() {
		// TODO Auto-generated method stub
		Tiempo();
		correrTiempo();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRompecabezasNumerico = new JFrame();
		frmRompecabezasNumerico.setTitle("Rompecabezas numerico");
		frmRompecabezasNumerico.setBounds(100, 100, 690, 657);
		frmRompecabezasNumerico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRompecabezasNumerico.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		frmRompecabezasNumerico.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(45, 149, 150));
		panel.add(panel_1, BorderLayout.NORTH);
		
		JLabel labelTitulo = new JLabel("ROMPECABEZAS NUMÉRICO");
		labelTitulo.setForeground(new Color(255, 255, 255));
		labelTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(labelTitulo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(45, 149, 150));
		panel.add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(45, 149, 150));
		panel.add(panel_3, BorderLayout.WEST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(45, 149, 150));
		panel.add(panel_4, BorderLayout.EAST);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_1_1 = new JLabel("\r\n");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_4.add(lblNewLabel_1_1);
		
		JLabel labelNombreTiempo = new JLabel(" Tiempo: ");
		labelNombreTiempo.setForeground(new Color(255, 255, 255));
		labelNombreTiempo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4.add(labelNombreTiempo);
		
		labelTiempo = new JLabel("0:0:0:0\r\n");
		labelTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTiempo.setForeground(new Color(255, 255, 255));
		
		labelTiempo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4.add(labelTiempo);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_4.add(lblNewLabel_1);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBackground(new Color(204, 153, 255));
		btnIniciar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	tiempo.start();
            	btnIniciar.setEnabled(false);
            }
        });
		panel_4.add(btnIniciar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(0, 153, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4.add(lblNewLabel);
		
		JButton btnPausar = new JButton("Pausar");
		btnPausar.setBackground(new Color(204, 153, 255));
		btnPausar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPausar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	tiempo.stop();
            	btnIniciar.setEnabled(true);
            }
        });
		panel_4.add(btnPausar);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(45, 149, 150));
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(4, 4, 10, 10));
		
		generarBotones(panel_5);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setBackground(new Color(204, 153, 255));
		btnReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reiniciar(panel_5);
                
                if(tiempo.isRunning()) {
                	tiempo.stop();
                	btnIniciar.setEnabled(true);
                }
                
                milisegundos=0;
                segundos=0;
                minutos=0;
                horas=0;
                correrTiempo();
                
            }
        });
		panel_2.add(btnReiniciar);
		
		mover();
	}
	
	public void generarBotones(JPanel panel_5) {
		matrizBotones = new JButton[4][4];
        String[] btn = {"1", "2", "3", "4", 
        				"5", "6", "7", "8", 
        				"9", "10", "11", "12", 
        				"13", "14", "15", ""};
        
        int[] indice = revolver();

        for (int fila = 0; fila < 4; fila++) 
        {
            for (int columna = 0; columna < 4; columna++) 
            {
            	matrizBotones[fila][columna] = new JButton(btn[indice[fila * 4 + columna]]);
            	matrizBotones[fila][columna].setFont(new Font("Tahoma", Font.PLAIN, 30));
                matrizBotones[fila][columna].setBackground(Color.WHITE);
                panel_5.add(matrizBotones[fila][columna]);
            }
        }
    }

	public int[] revolver() {
	    int tamano = 16;
	    int[] indices = new int[tamano];
	    Random random = new Random();

	    for (int i = 0; i < tamano; i++) {
	        indices[i] = i;
	    }

	    for (int i = tamano - 1; i > 0; i--) {
	        int recorrer = random.nextInt(i + 1);
	        int auxiliar = indices[recorrer];

	        indices[recorrer] = indices[i];
	        indices[i] = auxiliar;
	    }

	    return indices;
	}
	
	public void reiniciar(JPanel panel_5){
		panel_5.removeAll();
	    generarBotones(panel_5);
	    panel_5.revalidate(); 
	    panel_5.repaint(); 
	    mover();
	    
	}
	
	public void mover(){

		
		for (int fila = 0; fila < 4; fila++) 
		{
	        for (int columna = 0; columna < 4; columna++) 
	        {
	            matrizBotones[fila][columna].addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) 
	                {
	                	if (tiempo.isRunning()) {
		                    JButton botonClicado = (JButton) e.getSource();
		                    int filaClicada = -1;
		                    int columnaClicada = -1;

		                    for (int fila = 0; fila < 4; fila++) {
		                        for (int columna = 0; columna < 4; columna++) {
		                            if (matrizBotones[fila][columna] == botonClicado) {
		                                filaClicada = fila;
		                                columnaClicada = columna;
		                                break;
		                            }
		                        }
		                    }

		                    int filaVacia = -1;
		                    int columnaVacia = -1;
		                    for (int fila = 0; fila < 4; fila++) {
		                        for (int columna = 0; columna < 4; columna++) {
		                            if (matrizBotones[fila][columna].getText().isEmpty()) {
		                                filaVacia = fila;
		                                columnaVacia = columna;
		                                break;
		                            }
		                        }
		                    }

		                    if ((filaClicada == filaVacia && Math.abs(columnaClicada - columnaVacia) == 1) ||
		                            (columnaClicada == columnaVacia && Math.abs(filaClicada - filaVacia) == 1)) {
		                        String temp = botonClicado.getText();
		                        botonClicado.setText("");
		                        matrizBotones[filaVacia][columnaVacia].setText(temp);

		                        ganar();
		                    }
		                }
	                }
	            });
	        }
	      }
    }
	
	public void ganar() {
		String[] orden = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", ""};
	    int index = 0;
	    boolean ganado = true;

	    for (int fila = 0; fila < 4; fila++) 
	    {
	        for (int columna = 0; columna < 4; columna++) 
	        {
	            if (!matrizBotones[fila][columna].getText().equals(orden[index])) 
	            {
	                ganado = false;
	                break;
	            }
	            index++;
	        }
	    }

	    if (ganado) 
	    {
	    	tiempo.stop();
	        JOptionPane.showMessageDialog(null, "Felicidades! ganaste","Inane warning", JOptionPane.WARNING_MESSAGE);
	    }
	}
	
	public void Tiempo() {
		milisegundos++;
		
		if(milisegundos==100) {
			milisegundos=0;
			segundos++;
		}
		if(segundos==60) {
			segundos=0;
			minutos++;
		}
		if(minutos==60) {
			minutos=0;
			horas++;
		}
		correrTiempo();
	}
	
	public void correrTiempo() {
		labelTiempo.setText(horas + ":" + minutos + ":" + segundos + ":" + milisegundos);
	}
	
}
