package Bloque02;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("Introduzca un numero: "); //Se declara la variable str de tipo
		//String y se pide al usuario que introduzca un valor
		int var1 = Integer.parseInt(str);
		System.out.println("Primer numero introducido: " + var1); //Se muesra en pantalla el primer valor introducido
		
		str = JOptionPane.showInputDialog("Introduzca un segundo numero: "); //Se pide al usuario que introduzca un valor
		int var2 = Integer.parseInt(str);
		System.out.println("Segundo numero introducido: " + var2); //Se muesra en pantalla el segundo valor introducido
		
		if (var1 > var2) {
			System.out.println("Numero mayor: " + var1);
		}
		
		
		else {
			if (var2 > var1) {
				System.out.println("Numero mayor: " + var2);
			}
			
		}
		
	}

}
