package capitulo03_bloque01;

import javax.swing.JOptionPane;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int num, reps, numPositivos = 0, numNegativos = 0;
		
		reps = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cuantos numeros quiere introducir:"));
		
		System.out.println("Cantidad de numeros que se van a introducir: " + reps);
		
		for (int i = 0;  i < reps ; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
			
			System.out.println("Numero introducido: " + num);
			
			if ( num > 0) {
				numNegativos = numNegativos + 1;
			}
			else  {
				numPositivos = numPositivos + 1;
			}
			
		}
		
		System.out.println("Los cantidad de numeros positivos introducidos son: " + numPositivos + "\nLa cantidad de numeros negativos introducidos son: "
				+ numNegativos);
		
	}
	
}	
