package capitulo05_bloque02;

import java.util.Scanner;

public class Ejercicio03_MultiplicarPorNumeroIndicado {

	public static void main(String[] args) {
		
		//Declaramos el array y las variables necesarias
		Scanner sc = new Scanner(System.in);
		int multiplicador;
		int numeros[] = new int[150];
		
		System.out.println("Introduzca un numero por el cual desee multiplicar el array:");
		multiplicador = sc.nextInt();
		
		//Inicializamos los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (100 - 0)) + 0;
		}
		
		System.out.println("\nArray a multiplicar:" + "\n");
				
		//Recorremos el array para imprimir los valores en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println("\n" + "\nArray multiplicado por " + multiplicador + ":" + "\n");
		
		//Recorremos el array para imprimir los valores en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] * multiplicador + " ");
		}
	
	}

}
