package capitulo05_bloque01;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int numPar = 0, numImpar = 0;
		
		//Declaracion del array
		int numeros[] = new int[150]; 
		
		//Inicializacion de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (100 - 0)) + 0;
		}
		
		
		//Recorrido del array para imprimir sus valores en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
			
			if (numeros[i] % 2 == 0) {
				numPar += numeros[i];
			}
			
			if (numeros[i] % 2 == 1){
				numImpar += numeros[i];
			}
			
		}
	
		System.out.println("\n " + "\nLa suma de los valores pares equivale a: " + numPar);
		System.out.println("\nLa suma de los valores impares equivale a: " + numImpar);
		
	}

}
