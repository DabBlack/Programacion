package capitulo03_bloque04;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
	
		//Se declaran las variables necesarias para el programa
		
		int i = 2, limiteInferior, limiteSuperior;
		Scanner sc = new Scanner(System.in);
		boolean numEsPrimo = true;
		
		System.out.println("Introduzca un limite inferior:");
		limiteInferior = sc.nextInt();

		System.out.println("Introduzca un limite superior:");
		limiteSuperior = sc.nextInt();

		
		while (limiteInferior <= limiteSuperior) {
			
				if ( limiteInferior % i == 0) {
					numEsPrimo = true;
					System.out.println("El numero " + limiteInferior + " es primo");
				}
				else {
					numEsPrimo = false;
					System.out.println("El numero " + limiteInferior + " es compuesto");
				}
			limiteInferior++;
		}	
				
		
			
	}	

}

