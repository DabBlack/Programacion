package capitulo02_bloque01;

import javax.swing.JOptionPane;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca un valor: "); //Se declara la variable str de tipo
		//String y se pide al usuario que introduzca un valor
		int var1 = Integer.parseInt(str); // Se declara la variable var1 de tipo int
		System.out.println("Valor: " + var1); //Se muestra en pantalla el valor introducido por el usuario
		
		if (var1 % 2 == 0) {
			System.out.println("Este numero es par");
		}
			else {
				System.out.println("Este numero es impar");
			}
		
	}

}
