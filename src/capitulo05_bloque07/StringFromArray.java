package capitulo05_bloque07;

import tutorialJava.Utils;

public class StringFromArray {

	public static void main(String[] args) {
		
		int array[] = new int[10];
		
		arrayConNumerosAleatoriosEntre0y100(array);
		
		mostrarArray(array);
		
//		stringFromArray(array);
		
		System.out.println("\n");
		mostrarArray(array);
	}

	
	public static void arrayConNumerosAleatoriosEntre0y100 (int array[]) {
		for (int i = 0; i < array.length; i++) {
				array[i] = Utils.obtenerNumeroAzar();
		}
	}
	
	public static void mostrarArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
//	public static String stringFromArray (String array) {
//		char caracter = ' ';
//		for (int i = 0; i < array.length(); i++) {
//				array[i] = caracter;
//		}
//		return array[i];
//	}
//	
}
