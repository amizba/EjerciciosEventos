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

public class Ejercicio5_Eventos {

	public static void main(String[] args) {
		
		MouseRaton2 mimarco=new MouseRaton2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MouseRaton2 extends JFrame{
	
	public MouseRaton2() {
		
		setVisible(true);
		
		setBounds(700, 300, 600, 450);
		
		EveMouse raton = new EveMouse();
		
		addMouseListener(raton);

	}
}
class EveMouse extends MouseAdapter {

	public void mouseClicked(MouseEvent e) {
		
		//System.out.println("Coordenada X: "+e.getX()+" Coordenada Y: "+e.getY());
		System.out.println(e.getClickCount()+" clics"); //El método cuenta los clics
	}

		
}

