package capitulo03_bloque02;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int num, suma = 0, reps;
		
		reps = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cuantos numeros quiere introducir:"));
		
		System.out.println("Cantidad de numeros que se van a introducir: " + reps);
		
		for (int i = 0;  i < reps ; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
			System.out.println("Numero introducido: " + num);
					
			suma += num;
		}
		
		System.out.println("Media de los numeros introducidos: " + suma / reps);
		
	}
	
}	