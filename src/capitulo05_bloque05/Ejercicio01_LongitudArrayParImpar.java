package capitulo05_bloque05;

import tutorialJava.Utils;

public class Ejercicio01_LongitudArrayParImpar {

	public static void main(String[] args) {
		
		//Se declara un array de longitud al azar
		int array[] = new int[Utils.obtenerNumeroAzar(0, 50)];
				
		System.out.println("Array: " + "\n");
		
		//Inicializamos el array
		inicializarArrayAlAzar(array);
		
		//Mostramos el array
		mostrarArray(array);
		
		//Longitud del array
		System.out.println("\n" + "\n" + "La longitud del array es: " + array.length);
		
		//Posicion media del array
		System.out.println("\n" + "La posicion media del array es: " + (array.length / 2));
		
		//Comprobamos si la longitud es par o impar
		longitudParOImpar(array);
		
		//Longitud impar
		if (array.length % 2 == 1) {
			System.out.println("\n" + "El valor de la posicion media del array es: ");
			System.out.println(longitudParOImpar(array));
		}
		
		//Longitud par
		else {
			System.out.println("\n" + "Al ser par se devuelve:");
			System.out.println(longitudParOImpar(array));
		}
	}

	/**
	 * Este metodo inicializa el array con valores al azar entre 0 y 100
	 * @param array
	 */
	public static void inicializarArrayAlAzar (int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(0, 100);
		}
		
	}
	
	/**
	 * Este metodo muestra el array
	 * @param array
	 */
	public static void mostrarArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	/**
	 * Este metodo comprueba que la longitud del array es par o impar, devolviendo un valor en cada caso
	 * @param array
	 * @return
	 */
	public static int longitudParOImpar (int array[]) {
		if (array.length % 2 == 1) {
			return array[array.length / 2];
		}
		
		else {
			return -1;
		}
			
	}
	
}
