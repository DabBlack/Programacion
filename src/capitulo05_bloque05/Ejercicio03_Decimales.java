package capitulo05_bloque05;

import tutorialJava.Utils;

public class Ejercicio03_Decimales {

	public static void main(String[] args) {
		
		//Se declaran los arrays necesarios
		int enteros[] = new int[20];
		int decimales[] = new int[20];

		System.out.println("Array: " + "\n");
		
		//Inicializamos los arrays necesarios
		inicializarParteEnteraAlAzar(enteros);
		inicializarParteDecimalAlAzar(decimales);
		
		//Mostramos los dos arrays unidos con un punto para simular decimales
		for (int i = 0; i < enteros.length; i++) {
			System.out.print(enteros[i] + "." + decimales[i] + "  ");
		}
	
		System.out.println("\n" + "\n" + "Decimales comprendidos entre 0 y 49:" + "\n");
		
		//Se cuentan los valores con decimales comprendidos entre 0 y 49
		contarDecimalesEntre0y49(decimales);
	}
	
	/**
	 * Este metodo inicializa un array con valores al azar entre 0 y 100
	 * @param array
	 */
	public static void inicializarParteEnteraAlAzar (int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(0, 100);
		}
		
	}
		
	/**
	 * Este metodo inicializa un array con valores al azar entre 0 y 99
	 * @param array
	 */
	public static void inicializarParteDecimalAlAzar (int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(0, 99);
		}
		
	}
	
	/**
	 * Este metodo cuenta los decimales comprendidos entre 0 y 49
	 * @param array
	 */
	public static void contarDecimalesEntre0y49 (int array[]) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 50) {
			contador++;
			}
		}
		
		System.out.println(contador);
		
	}
	
}
