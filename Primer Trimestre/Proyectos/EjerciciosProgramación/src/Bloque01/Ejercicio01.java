package Bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un número entero: ");
		int var1 = Integer.parseInt(str); //Pido un número entero al usuario
			
		str = JOptionPane.showInputDialog("Introduzca un número flotante: ");
		float var2 = Float.parseFloat(str); //Pido un número flotante al usuario
			
		str = JOptionPane.showInputDialog("Introduzca un número doble: ");
		double var3 = Double.parseDouble(str); //Pido un número doble al usuario
			
		System.out.println("Número entero: " + var1 + " Número flotante: " + var2 + " Número doble: " + var3);
		//Muestro consecutivamente los números introducidos por el usuario
	}
}
