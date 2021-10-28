package capitulo03_bloque03;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		 

		Scanner sc = new Scanner(System.in);
		int num = 1, positivos = 0, negativos = 0;

		for (int i = 1; num != 0; i++) {
			System.out.println("Introduzca un numero (Pulse 0 para terminar el programa)");
			num = sc.nextInt();
		
			if (i != 0) {
				
				if (num > 0) {
					positivos = positivos + 1;
				}
				
				else if (num < 0) {
					negativos = negativos + 1;
				}
				
			}
		
		}
		
		System.out.println("Los numeros positivos son: " + positivos + "\nLos numeros negativos son: " + negativos);
		
	}

}
