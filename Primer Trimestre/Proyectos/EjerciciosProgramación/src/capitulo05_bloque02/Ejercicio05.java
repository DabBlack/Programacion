package capitulo05_bloque02;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
	
		//Declaracion del array y de las variables necesarias
		Scanner sc = new Scanner(System.in);
		int ultimo = 0, repeticiones, posiciones;
		int numeros[] = new int[5]; 

		
		//Se le pide al usuario un valor usado para repetir x veces el bucle
		System.out.println("Introduzca cuantas veces desea desplazar el array a la derecha:");
		repeticiones = sc.nextInt();
		
		//Se le pide al usuario un valor usado para repetir x veces el bucle
		System.out.println("Introduzca cuantas posiciones desea desplazar el array a la derecha:");
		posiciones = sc.nextInt();
		
		System.out.println("\n");
		
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
		for (int x = 0; x < repeticiones; x++) {
		
			System.out.println("\n" + "\n" + "Array desplazado a la derecha: " + "\n");
			
			//Se le asigna a la variable ultimo el valor del ultimo valor del array
			ultimo = numeros[numeros.length - 1];
			
			//Se hace un bucle con una disminucion simple para sustituir el valor de la derecha
			for (int i = numeros.length - 1; i > 0; i--) {
				numeros[i] = numeros[i - 1];
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
