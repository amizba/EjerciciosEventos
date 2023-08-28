/*Crea un evento de click de bot�n, que aparezca una ventana de JOptionPane en la 
 * cual indique que has pulsado el bot�n. 
 */
/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Eventos
*
* @author Amparo Izquierdo Ba�ez
* @mail amizba@gmail.com
*/
package even;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 {

	public static void main(String[] args) {
        VentanaEventoBoton ventana = new VentanaEventoBoton();
        ventana.setVisible(true);

	}

}
class VentanaEventoBoton extends JFrame {
    private JButton button;

    public VentanaEventoBoton() {
        setTitle("Evento de Bot�n");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        button = new JButton("Haz clic");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "�Bot�n clickeado!");
            }
        });

        add(button);
    }
}