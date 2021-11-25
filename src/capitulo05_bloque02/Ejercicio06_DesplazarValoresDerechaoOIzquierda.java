package capitulo05_bloque02;

import java.util.Scanner;

public class Ejercicio06_DesplazarValoresDerechaoOIzquierda {

	public static void main(String[] args) {
	
		//Declaracion del array y de las variables necesarias
		int ultimo = 0, repeticiones, direccion;
		Boolean esDerecha = true;
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[5]; 
		
		//Se pide al usuario el valor de la variable repeticiones
		System.out.println("Cuantas posiciones desea desplazar el array:");
		repeticiones = sc.nextInt();
		
		//Se pide al usuario el valor de la variable direccion
		System.out.println("A que direccion desea desplazar el array (Izquierda = 0, Derecha = 1):");
		direccion = sc.nextInt();
		
		//Aqui se dictan las normas de la variable booleana esDerecha
		if (direccion == 0) {
			esDerecha = false;
		}
		
		if (direccion == 1) {
			esDerecha = true;
		}
		
		//Inicializacion de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (100 - 0)) + 0;
		}
		
		System.out.println("Array sin desplazar: " + "\n");
		
		//Recorrido del array para imprimir sus valores en pantalla 
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		//Este bucle hace que se repita las veces que se el usuario ha indicado anteriormente
		while(repeticiones > 0) {
			
			if (esDerecha == false) {
					System.out.println("\n" + "\n" + "Array desplazado a la izquieda: " + "\n");
			
					//Se le asigna a la variable ultimo el valor del primer valor del array			
					ultimo = numeros[0];
				
					//Se hace un bucle con un incremento simple para sustituir el valor de la izquierda
					for (int i = 0; i < (numeros.length-1); i++) {
						numeros[i] = numeros[i+1];
					}
			
					//Se le asigna a la ultima posicion del array el valor de la variable ultimo
					numeros[numeros.length - 1] = ultimo;
				
				
					//Se muestra en pantalla el array una vez desplazado a la izquierda
					for (int i = 0; i < numeros.length; i++) {
						System.out.print(numeros[i] + " ");
					}
				
			}
			
			if (esDerecha == true) {
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
			repeticiones--;
		} 
		
	}

}
