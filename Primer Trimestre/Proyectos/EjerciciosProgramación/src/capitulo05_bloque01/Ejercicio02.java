package capitulo05_bloque01;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int limiteInferior, limiteSuperior;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un limite inferior:");
		limiteInferior = sc.nextInt();

		System.out.println("Introduzca un limite superior:");
		limiteSuperior = sc.nextInt();

		
		//Declaracion del array
		int numeros[] = new int[150]; 
		
		// Inicializacion de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (limiteSuperior - limiteInferior)) + limiteInferior;
		}
		
		//Recorrido del array para imprimir sus valores en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
			
		}
		
	}

}
