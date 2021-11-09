package capitulo05_bloque05;

import tutorialJava.Utils;

public class Ejercicio01_LongitudArrayParImpar {

	public static void main(String[] args) {
		
		int array[] = new int[Utils.obtenerNumeroAzar(0, 50)];
				
		System.out.println("Array: " + "\n");
		
		inicializarArray(array);
		mostrarArray(array);
		
		System.out.println("\n" + "\n" + "La longitud del array es: " + array.length);
		System.out.println("\n" + "La posicion media del array es: " + (array.length / 2));
		
		analizarArray(array);
		
		if (array.length % 2 == 1) {
			System.out.println("\n" + "El valor de la posicion media del array es: ");
			System.out.println(analizarArray(array));
		}
		
		else {
			System.out.println("\n" + "Al ser par se devuelve:");
			System.out.println(analizarArray(array));
		}
	}

	
	public static void inicializarArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(0, 100);
		}
		
	}
	
	
	public static void mostrarArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	
	public static int analizarArray (int array[]) {
		
		if (array.length % 2 == 1) {
			return array[array.length / 2];
		}
		
		else {
			return -1;
		}
			
	}
	
}
