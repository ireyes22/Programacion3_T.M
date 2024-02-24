import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	/*Constructor que define los atributos base
	 * de mi ventana */
	public Ventana() {
		
			this.setTitle("ASd");

			this.setVisible(true);

			//tamaño de la ventana
			this.setSize(1000, 500);

			//cerrar ventana por defecto
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			//titulo
			this.setTitle("Mi ventana");

			//tamaños de la ventana
			this.setMinimumSize(new Dimension(250,250));
			this.setMaximumSize(new Dimension(1000,270));
			this.setResizable(true);

			//ubicacion en la pantalla
			this.setLocation(200,200);

			this.setLayout(null);

			//centrar
			this.setLocationRelativeTo(null);

			//agrega los componentes
			this.iniciarComponentes();
		}

		public void iniciarComponentes() {

			JPanel login = new JPanel();
			login.setSize(this.getWidth()/2, this.getHeight());//el panel aparece a la mitad del frame
			login.setBackground(Color.pink);
			login.setLayout(null);//quitar el molde

			JLabel login_title = new JLabel("ACCEDER",0);
			login_title.setSize(300, 80);//tamaño del texto
			login_title.setFont(new Font("Arial",Font.BOLD,24));//establece fuente del texto
			login_title.setForeground(Color.orange);//cambiar color al texto
			login_title.setLocation(100,20);
			login_title.setOpaque(true);//agrega fondo al texto
			login_title.setBackground(Color.green);//color al fondo del texto
			add(login_title);

			//size
			//location
			//background-opaque
			//string cosntructor

			JPanel registro = new JPanel();
			registro.setSize(this.getWidth()/2, this.getHeight());
			registro.setBackground(Color.BLUE);
			registro.setLocation(500,0);//el panel aparece en la otra mitad del frame

			this.add(login);
			//this.add(registro);

		}
}
