package Window;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	public Ventana() {
		
	
		this.setSize(1000,500);
		
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocation(200,100);
				
		this.setResizable(true);
		
		this.setTitle("Mi ventana");
		
		this.setMinimumSize(new Dimension(250,250));
		
		this.setMaximumSize(new Dimension(1000,750));
		
		this.setLocationRelativeTo(null);
		
		this.iniciarComponentes();
		
		this.setLayout(null);//Conserva los tamaños asignados
	}
	
	//Metodo para crear el panel
	public void iniciarComponentes() {
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.BLUE);
		login.setLayout(null);
		this.add(login);
		
		//Componente para agregar string
		JLabel login_tag = new JLabel("Acceder",0);
		login_tag.setSize(300, 80);
		login_tag.setFont(new Font ("Arial",Font.BOLD,24));
		login_tag.setForeground(Color.white);
		login_tag.setLocation(100, 20);
		login_tag.setOpaque(true);//Fondo a la etiqueta
		login_tag.setBackground(Color.red);
		login.add(login_tag);
		
		
		
		//Reglas generales de cada componente
		
		//Size
		//location
		//background
		//string constructor
		
		/*JPanel register = new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		register.setLocation(500, 0);
		login.setBackground(Color.GREEN);
		
		this.add(register);/*/
	}
	
	
	
}
