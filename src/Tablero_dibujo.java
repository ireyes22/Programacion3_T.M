

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

import org.eclipse.wb.swing.Jugador;

import java.awt.event.KeyAdapter;

public class Tablero_dibujo extends JFrame implements KeyListener {

	private JFrame frame;
	private JPanel panel_tablero;

	Jugador j1 = new Jugador(350, 200, 50, 50, "#D20062");
	Jugador obj = new Jugador(100,50,50,220,"#41B06E");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero_dibujo window = new Tablero_dibujo();
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
	
	public Tablero_dibujo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 774, 622);
		frame.addKeyListener(this);
		frame.setFocusable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_245618024835600");

		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBackground(new Color(119, 136, 153));
		panel.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_1.add(btnReiniciar);
		
		panel_tablero = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                g2d.setColor(Color.decode(j1.getColor()));
                g2d.fillRect(j1.getX(), j1.getY(), j1.getAncho(), j1.getAlto());
               
                g2d.setColor(Color.decode(obj.getColor()));
                g2d.fillRect(obj.getX(), obj.getY(), obj.getAncho(), obj.getAlto());
                
                
            }
        };
		panel_tablero.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_tablero.setBackground(new Color(230, 230, 250));
		panel.add(panel_tablero, BorderLayout.CENTER);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar() + " " + e.getKeyCode());
		
		switch(e.getKeyCode()) {
		case 87://w
			//y-=10;
			j1.setY(j1.getY()-10);
			if(j1.colision(obj)) {
				System.out.println("Colision");
				j1.setY(j1.getY()+10);
			}
			
			break;
			
		case 83://s
			//y+=10;
			j1.setY(j1.getY()+10);
			if(j1.colision(obj)) {
				System.out.println("Colision");
				j1.setY(j1.getY()-10);
			}
			break;
			
		case 68://d
			//x+=10;
			j1.setX(j1.getX()+10);
			if(j1.colision(obj)) {
				System.out.println("Colision");
				j1.setX(j1.getX()-10);
			}
			break;
			
		case 65://a
			//x-=10;
			j1.setX(j1.getX()-10);
			if(j1.colision(obj)) {
				System.out.println("Colision");
				j1.setX(j1.getX()+10);
			}
			break;
			
		default:
			break;
				
		}
		
		frame.repaint();
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
