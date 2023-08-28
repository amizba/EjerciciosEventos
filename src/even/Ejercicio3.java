/*Crea un evento de teclado, al pulsar una tecla aparezca una ventana de JOptionPane 
 * informando de la tecla que has pulsado. 
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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		VentanaEventoTeclado ventana = new VentanaEventoTeclado();
        ventana.setVisible(true);

	}

}
class VentanaEventoTeclado extends JFrame {
    private JTextField textField;

    public VentanaEventoTeclado() {
        setTitle("Evento de Teclado");
        setSize(300, 200);

        textField = new JTextField();
        textField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
            }
            public void keyPressed(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
                JOptionPane.showMessageDialog(null, "Tecla presionada: " + e.getKeyChar());
            }
        });

        add(textField);
    }
}
