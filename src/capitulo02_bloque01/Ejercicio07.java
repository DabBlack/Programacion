package capitulo02_bloque01;

import javax.swing.JOptionPane;

public class Ejercicio07 {

	public static void main(String[] args) {
	
		String str = JOptionPane.showInputDialog("Introduzca un valor: "); //Se declara la variable str de tipo
		//String y se pide al usuario que introduzca un valor
		int x = Integer.parseInt(str); // Se declara la variable x de tipo int
		System.out.println("Valor: " + x); //Se muestra en pantalla el valor introducido por el usuario

		int y = 1; //Se declara la variable y de tipo int asignandole el valor 1
		
		int resultado = (x & y); //Se declara la variable y de tipo int asignandole el valor de la operacion AND
		
		if (resultado % 2 == 0) {
			System.out.println("El numero es par");
		}
		else if (resultado % 2 == 1) {
			System.out.println("El numero es impar");
		}
		
	}

}
