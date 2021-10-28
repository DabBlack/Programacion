package capitulo05_bloque02;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
	
		//Declaracion del array y de las variables necesarias
		int ultimo = 0;
		int numeros[] = new int[5]; 

		//Inicializacion de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (100 - 0)) + 0;
		}
		
		System.out.println("Array sin desplazar: " + "\n");
		
		//Recorrido del array para imprimir sus valores en pantalla 
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
			
		}
		
		//Este bucle dicta las veces que se repite el desplazamiento a la derecha
		for (int x = 0; x < 5; x++) {
		
			System.out.println("\n" + "\n" + "Array desplazado a la derecha: " + "\n");
			
			//Se le asigna a la variable ultimo el valor del ultimo valor del array
			ultimo = numeros[numeros.length - 1];
			
			//Se hace un bucle con una disminucion simple para sustituir el valor de la derecha
			for (int i = numeros.length - 1; i > 0; i--) {
				numeros[i] = numeros[i-1];
			}
		
			//Se le asigna a la ultima posicion del array el valor de la variable ultimo
			numeros[0] = ultimo;
			
			
			//Se muestra en pantalla el array una vez desplazado a la derecha
			for (int i = 0; i < numeros.length; i++) {
				System.out.print(numeros[i] + " ");
			}
			
		}
		
		
	}

}
