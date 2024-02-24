import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	public Ventana() {
	
		//hace visible la pantalla
				this.setVisible(true);
				
				//tamaño de la ventana
				this.setSize(200,200);
				
				//cerrar ventana por defecto
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//titulo
				this.setTitle("Mi ventana");
				
				//tamaños de la ventana
				this.setMinimumSize(new Dimension(250,250));//tamaño maximo
				this.setMaximumSize(new Dimension(750,750));//tamaño minimo
				this.setResizable(true);
				
				//ubicacion en la pantalla
				this.setLocation(200,200);
				
				//centrar
				this.setLocationRelativeTo(null);
				
				//agrega los componentes
				this.iniciarComponentes();
				
				//hace visible la pantalla
				this.setVisible(true);
	}
	
	public void iniciarComponentes()
	{

		//crea un JPanel
		JPanel login = new JPanel();

		login.setSize(this.getWidth(), this.getHeight());//indica el tamaño del panel
		login.setBackground(Color.ORANGE);//agrega color al panel
		this.add(login);//añade el panel

	}
}
