package Bloque01;

import javax.swing.JOptionPane;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = JOptionPane.showInputDialog("Introduzca un numero: ");
		int var1 = Integer.parseInt(str); //Pido el primer numero entero al usuario
			
		str = JOptionPane.showInputDialog("Introduzca un segundo numero: ");		
		int var2 = Integer.parseInt(str); //Pido el segundo numero entero al usuario
				
		System.out.println("Variable 1: " + var1); //Muestro en pantalla la variable 1
		System.out.println("Variable 2: " + var2); //Muestro en pantalla la variable 1
		
		
		
	}
}
