import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame ventana = new JFrame("ventana");
		
		ventana.setVisible(true);//hace visible la ventana
		ventana.setSize(500, 500);//tamaño de la ventana (ancho, alto)
		ventana.setResizable(false);//el usuario no puede modificar el tamaño
		ventana.setLocationRelativeTo(null);//hace que la ventana aparezca en el centro de la pantalla
		ventana.setLayout(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//al cerrar la ventana, el programa deja de copilar
	}

}
