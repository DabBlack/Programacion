package capitulo05_bloque01;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		int numBuscado, posicion = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//In
		System.out.println("Introduzca el valor que desee buscar dentro del array: ");
		numBuscado = sc.nextInt();
		
		//Declaracion del array
		int numeros[] = new int[150]; 
		
		//Inicializacion de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (100 - 0)) + 0;
		}
		
		
		//Recorrido del array para imprimir sus valores en pantalla, anadiendo un if/else para buscar un valor en concreto,
		//ademas de su posicion concreta
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
			
			if (numBuscado == numeros[i]) {
				posicion = i;
				System.out.println(", el valor introducido ha sido encontrado con exito.");
			}
	
			else {
				System.out.println(", el valor introducido no ha sido encontrado.");
			}
		} 
		
		//Se muestra en pantalla la posicion del valor buscado
		System.out.println("\nLa posicion del valor buscado es la siguiente: " + posicion);
		
	}

}
