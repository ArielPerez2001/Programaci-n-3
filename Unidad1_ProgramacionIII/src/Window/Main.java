package Window;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("Example");
		
		//Permite modificar la visibilidad de la ventana
		window.setVisible(true);
		//Modifica el tamaño
		window.setSize(600,600);
		//Modifica la ubicacion de la ventana
		window.setLocation(100,100);
		//Permite cerrar co
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//No permite modificar el tamaño
		window.setResizable(false);
		
		//Dimensiones
		window.setMinimumSize(new Dimension(250,250));
		
		window.setMaximumSize(new Dimension(750,750));
		
		//Centrar(Siempre y cuando sea null)
		window.setLocationRelativeTo(window);
		
		
	}

}

