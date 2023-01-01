/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Eventos
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import javax.swing.*;

import java.awt.event.*;

public class Ejercicio2_Eventos {

	public static void main(String[] args) {
		
		MarcoVtn mimarco= new MarcoVtn();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVtn mimarco2= new MarcoVtn();
		//Al cerrar la Ventana2 se va a seguir ejecutando el programa
		//La Ventana 1 sigue abierta
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		
		mimarco.setTitle("Ventana 1");
		
		mimarco.setBounds(300, 300, 500, 150);
				
		mimarco2.setTitle("Ventana 2");
				
		mimarco2.setBounds(375, 300, 525, 150);



	}

}
class MarcoVtn extends JFrame{
	
	public MarcoVtn() {
		
		setVisible(true);
		
		Mc_Ventana oyente_ventana = new Mc_Ventana();//Se crea el objeto que va a recibir el evento
		
		addWindowListener(oyente_ventana);
		
	}
	
}
//Al implementar la interfaz WindowListener es obligado declarar los 7 métodos que lleva
class Mc_Ventana implements WindowListener{ 
	
    public void windowActivated(WindowEvent e) {
    	
    	System.out.println("Ventana activa");
    }
	
	public void windowClosed(WindowEvent e) {
		
		System.out.println("La ventana ha sido cerrada");
	}
	
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrando ventana");
	}
	
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Ventana desactivada");
	}
	
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana restaurada");
	}
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
	}
	
	public void windowOpened(WindowEvent e) {
		
		System.out.println("Abriendo ventana");
	}
}
