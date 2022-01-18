package capitulo04_bloque02_Herencia.ventanaConCanvas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

public class VentanaConCanvas {

	public static void main(String[] args) {
		
		// Este metodo crea la ventana con la que vamos a mostrar las 3 figuras
		crearVentana();
	}

	/**
	 * Metodo para crear la ventana
	 */
	public static void crearVentana() {
		
		// Creamos un objeto JFrame, la ventana en si
		JFrame ventana = new JFrame("Ejercicio 3 - Ventana con Canvas");
		
		// Le asignamos las medidas de la ventana
		ventana.setBounds(0, 0, 800, 600);

		// Le asignamos el BorderLayour que sirve como plantilla
		ventana.getContentPane().setLayout(new BorderLayout());

		// Creamos un objeto llamado relleno de tipo MiCanvas que nos permitira dibujar en el
		MiCanvas relleno = new MiCanvas();

		// Le asignamos un color de fondo
		relleno.setBackground(Color.BLACK);

		// Le añadimos a nuestro panel el relleno y lo centramos
		ventana.getContentPane().add(relleno, BorderLayout.CENTER);

		// Le decimos que sea la ventana sea visible
		ventana.setVisible(true);
	}

}
