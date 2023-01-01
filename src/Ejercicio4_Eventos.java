/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Eventos
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import javax.swing.JPanel;

public class Ejercicio4_Eventos {

	public static void main(String[] args) {
		
		MouseRaton mimarco=new MouseRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MouseRaton extends JFrame{
	
	public MouseRaton() {
		
		setVisible(true);
		
		setBounds(700, 300, 600, 450);
		
		EvMouse raton = new EvMouse();
		
		addMouseListener(raton);

	}
}
class EvMouse extends MouseAdapter {


public void mousePressed(MouseEvent e) {
		
		System.out.println(e.getModifiersEx());
	}

		
}
