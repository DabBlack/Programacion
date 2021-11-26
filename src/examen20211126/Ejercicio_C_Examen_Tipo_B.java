package examen20211126;

import tutorialJava.Utils;

public class Ejercicio_C_Examen_Tipo_B {

	public static void main(String[] args) {
		
		int array[] = new int[100];
		
		inicializarArrayConNumerosAleatoriosEntre100yMenos100(array);
		
		System.out.println("Array: ");
		mostrarArray(array);
		
		mediaValoresArray(array);
	}

	public static void inicializarArrayConNumerosAleatoriosEntre100yMenos100(int array[]) {
		for (int i = 0; i < array.length; i++) {
            array[i] = Utils.obtenerNumeroAzar(-100, 100);
        }
	}
	
	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void mediaValoresArray(int array[]) {
		int suma = 0;
		float contador = 0, media = 0;
		
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
			
			media = suma / array.length;
			
			if(array[i] > media) {
				contador++;
			}
		}
		
		System.out.println("\n" + "\n" + "Valor medio de los valores del array: " + media + "\n"
				+ "Porcentaje de los valores por debajo del valor medio es: " + contador + "%");
	}
}
