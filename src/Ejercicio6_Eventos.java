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

public class Ejercicio6_Eventos {

	public static void main(String[] args) {
		
		MouseRaton3 mimarco=new MouseRaton3();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MouseRaton3 extends JFrame{
	
	public MouseRaton3() {
		
		setVisible(true);
		
		setBounds(700, 300, 600, 450);
		
		EvMouse2 raton = new EvMouse2();
		
		addMouseListener(raton);

	}
}
class EvMouse2 extends MouseAdapter {

	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Coordenada X: "+e.getX()+" Coordenada Y: "+e.getY());
		
	}

		
}
