package bloque03_cap01;

import javax.swing.JOptionPane;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int num, suma = 0, reps;
		
		reps = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cuantos numeros quiere sumar:"));
		
		System.out.println("Cantidad de numeros que se quiere sumar: " + reps);
		
		for (int i = 0;  i < reps ; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
					System.out.println("Numero introducido: " + num);
			if (num > 10 ) {
				suma += num;
			}
		}
		
		System.out.println("Suma de numeros mayores de 10: " + suma);
		
	}
	
}	
