package Bloque01;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un numero entero: ");
		int var1 = Integer.parseInt(str); //Pido un numero entero al usuario
			
		str = JOptionPane.showInputDialog("Introduzca un numero flotante: ");
		float var2 = Float.parseFloat(str); //Pido un numerp flotante al usuario
			
		str = JOptionPane.showInputDialog("Introduzca un numero doble: ");
		double var3 = Double.parseDouble(str); //Pido un numero doble al usuario
			
		System.out.println("Numero entero: " + var1 + " Numero flotante: " + var2 + " Numero doble: " + var3);
		//Muestro consecutivamente los numero introducidos por el usuario
	}
}
