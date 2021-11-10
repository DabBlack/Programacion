package capitulo05_bloque05;

import tutorialJava.Utils;

public class Ejercicio01_LongitudArrayParImpar {

	public static void main(String[] args) {
		
		//Se declara un array de longitud al azar
		int array[] = new int[Utils.obtenerNumeroAzar(0, 50)];
				
		System.out.println("Array: " + "\n");
		
		//Se llaman a los siguientes metodos, que inicializan el array con valores al azar y lo muestra
		inicializarArrayAlAzar(array);
		mostrarArray(array);
		
		System.out.println("\n" + "\n" + "La longitud del array es: " + array.length);
		System.out.println("\n" + "La posicion media del array es: " + (array.length / 2));
		
		//Este metodo hace que se analice el array, viendo si la longitud es par o impar
		analizarArray(array);
		
		//Longitud impar
		if (array.length % 2 == 1) {
			System.out.println("\n" + "El valor de la posicion media del array es: ");
			System.out.println(analizarArray(array));
		}
		
		//Longitud par
		else {
			System.out.println("\n" + "Al ser par se devuelve:");
			System.out.println(analizarArray(array));
		}
	}

	//Metodo para inicializar el array asisgandole valores al azar entre 0 y 10
	public static void inicializarArrayAlAzar (int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(0, 100);
		}
		
	}
	
	//Metodo para mostrar el array
	public static void mostrarArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	//Metodo para analizar el array, comprobando es la longitud es par o impar, devolviendo un valor en cada caso
	//Valor que se usara mas tarde
	public static int analizarArray (int array[]) {
		if (array.length % 2 == 1) {
			return array[array.length / 2];
		}
		
		else {
			return -1;
		}
			
	}
	
}
