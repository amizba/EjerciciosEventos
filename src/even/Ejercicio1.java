/*Crea un evento de click de botón, que aparezca una ventana de JOptionPane en la 
 * cual indique que has pulsado el botón. 
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
        setTitle("Evento de Botón");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        button = new JButton("Haz clic");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¡Botón clickeado!");
            }
        });

        add(button);
    }
}