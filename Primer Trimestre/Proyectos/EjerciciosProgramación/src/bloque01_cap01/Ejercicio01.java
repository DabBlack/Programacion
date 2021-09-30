package bloque01_cap01;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un numero entero: "); 
		//Declaro una variable string y le pido al usuario que introduzca un valor
		int var1 = Integer.parseInt(str); //Declaro la variable var1 de tipo int
			
		str = JOptionPane.showInputDialog("Introduzca un numero flotante: ");
		//Pido un numero flotante al usuario
		float var2 = Float.parseFloat(str); //Declaro la variable var2 de tipo float
			
		str = JOptionPane.showInputDialog("Introduzca un numero doble: ");
		double var3 = Double.parseDouble(str); //Declaro la variable var3 de tipo double
			
		System.out.println("Numero entero: " + var1 + " Numero flotante: " + var2 + " Numero doble: " + var3);
		//Muestro consecutivamente los numero introducidos por el usuario
	}
}
