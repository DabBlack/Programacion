package examen20211126;

import tutorialJava.Utils;

public class Ejercicio_B_Examen_Tipo_B {

	public static void main(String[] args) {
		int array[] = new int[25];
		int matriz[][] = new int[5][5];

		inicializarArrayConNumerosAleatoriosEntre0y100(array);
		
		System.out.println("Array: ");
		mostrarArray(array);
		
		System.out.println("\n" + "\n" + "Matriz");
		convertirArrayEnMatriz(array, matriz);
		
		mostrarMatriz(matriz);
	}

	public static void inicializarArrayConNumerosAleatoriosEntre0y100(int array[]) {
		for (int i = 0; i < array.length; i++) {
            array[i] = Utils.obtenerNumeroAzar(-100, 100);
        }
	}
	
	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");
		}
	}
	
	public static void convertirArrayEnMatriz(int array[], int matriz[][]) {
		int k = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = array[k];
				k++;
			}
		}
	}
		
	public static void mostrarMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println(" ");
		}		
	}
		
	
}
