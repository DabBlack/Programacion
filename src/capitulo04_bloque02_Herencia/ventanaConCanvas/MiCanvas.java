package capitulo04_bloque02_Herencia.ventanaConCanvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MiCanvas extends Canvas {

	/**
	 * Implementamos el metodo paint
	 */
	@Override
	public void paint(Graphics g) {

		// Para el triangulo necesitamos 2 vertices
		int[] vertice1 = { 500, 550, 450 };
		int[] vertice2 = { 270, 320, 320 };

		// Asignamos el color a la variable g y creamos el ovalo
		g.setColor(Color.GREEN);
		g.fillOval(100, 100, 100, 200);

		// Asignamos el color a la variable g y creamos el rectangulo
		g.setColor(Color.RED);
		g.fillRect(300, 200, 100, 50);

		// Asignamos el color a la variable g y creamos el triangulo
		g.setColor(Color.BLUE);
		g.fillPolygon(vertice1, vertice2, 3);
	}

}