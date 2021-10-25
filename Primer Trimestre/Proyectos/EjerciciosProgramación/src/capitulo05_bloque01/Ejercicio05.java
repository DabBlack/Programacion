package capitulo05_bloque01;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		int numPar = 0;
		
		//Declaracion del array
		int numeros[] = new int[150]; 
		
		//Inicializacion de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (100 - 0)) + 0;
		}
		
		
		//Recorrido del array para imprimir sus valores en pantalla, ademas de verificar si el numero ocupa una posicion par,
		//para guardarlo en una variable, asi sumandolo posteriormente
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
			
			if (i % 2 == 0) {
				numPar += numeros[i];
			}
			
		}
		
		//Se muestra en pantalla la suma de los valores que tengan un indice par, es decir, que ocupen una posicion par en el array
		System.out.println("\n " + "\nLa suma de los valores que ocupan una posicion par en el array equivale a: " + numPar);
		
	}

}
