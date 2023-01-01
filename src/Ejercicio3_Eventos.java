/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Eventos
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import javax.swing.JPanel;

public class Ejercicio3_Eventos {

	public static void main(String[] args) {
		
		MarcoTeclado mimarco=new MarcoTeclado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoTeclado extends JFrame{
	
	public MarcoTeclado() {
		
		setVisible(true);
		
		setBounds(700, 300, 600, 450);
		
		EvTeclado tecla = new EvTeclado();
		
		addKeyListener(tecla);

	}
}
class EvTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//Al pulsar la letra se va a guardar en una variable de tipo entero.
		//Está variable contiene getKeyCode que convierte la letra en un código numérico
		int codigo=e.getKeyCode();  
		
		System.out.println(codigo);

		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
