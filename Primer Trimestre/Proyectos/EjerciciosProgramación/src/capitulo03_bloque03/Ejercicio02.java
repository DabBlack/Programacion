package capitulo03_bloque03;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		 

		Scanner sc = new Scanner(System.in);
		int num = 1, mayor = 0, menor = 0;

		for (int i = 0; num != 0; i++) {
			System.out.println("Introduzca un numero (Pulse 0 para terminar el programa)");
			num = sc.nextInt();
		
			if (i != 0) {
				
				if (mayor < num) {
					mayor = num;
				}
				
				if (menor > num) {
					menor = num;
				}
				
			}
		
		}
		
		System.out.println("El mayor es: " + mayor + "\nEl menor es: " + menor);
		
	}

}
