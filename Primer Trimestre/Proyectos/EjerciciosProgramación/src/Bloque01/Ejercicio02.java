package Bloque01;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un numero entero: ");
		//Declaro una variable string y le pido al usuario que introduzca un valor
		int var1 = Integer.parseInt(str); //Declaro la variable var1 de tipo int
		System.out.println("Numero entero: " + var1); //Muestro la variable var1
		
		str = JOptionPane.showInputDialog("Introduzca un numero flotante: ");
		//Le pido al usuario que introduzca un valor
			
		float var2 = Float.parseFloat(str); //Declaro la variable var1 de tipo float
		System.out.println("Numero flotante: " + var2); //Muestro la variable var2
			
		str = JOptionPane.showInputDialog("Introduzca un Numero doble: ");
		//Le pido al usuario que introduzca un valor
		double var3 = Double.parseDouble(str); //Declaro la variable var3 de tipo double
		System.out.println("Numero doble: " + var3); //Muestro la variable var3
				
	}
}


