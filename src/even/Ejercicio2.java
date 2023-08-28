/*Crea un evento de ventana, al pulsar el botón de Cerrar muestre una ventana de 
 * JOptionPane que indique: “Ventana cerrada”
 */
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Eventos
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
package even;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		VentanaEventoCierre ventana = new VentanaEventoCierre();
        ventana.setVisible(true);

	}

}
class VentanaEventoCierre extends JFrame {
    public VentanaEventoCierre() {
        setTitle("Evento de Cierre de Ventana");
        setSize(300, 200);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Ventana cerrada");
                System.exit(0);
            }
        });
    }
}