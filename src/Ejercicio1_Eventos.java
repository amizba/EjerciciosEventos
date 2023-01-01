/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* Ejercicios Eventos
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio1_Eventos {

	public static void main(String[] args) {
		
		MarcoBtn mimarco=new MarcoBtn();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBtn extends JFrame{
	
	public MarcoBtn() {
		
		setTitle("Botones y Eventos");
		
		setBounds(700, 300, 500, 300);
		
		LaminaBtn milamina =new LaminaBtn();
		
		add(milamina);
	}
}

class LaminaBtn extends JPanel implements ActionListener{
	
JButton BtnRojo = new JButton("Rojo");
	
	public LaminaBtn() {
		
		add(BtnRojo);
		
		BtnRojo.addActionListener(this);
	}		
public void actionPerformed (ActionEvent e) {
		
	setBackground(Color.red);
	}

}

