package examen_03_12_2021;

public class Ejercicio_A {

	public static void main(String[] args) {
		int matriz[][] = new int[][] {{1, 	2,	3, 	4},
									  {5, 	6,	7, 	8}, 
									  {9, 	10,	11, 12}, 
									  {13, 	14, 15, 16}};
	
		mostrarMatriz(matriz);
		
		System.out.println("\n" + "La matriz está ordenada: " + matrizOrdenada(matriz));
	}

	public static void mostrarMatriz (int matriz[][]) {
		System.out.println("Contenido de la matriz: " + "\n");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}
	
	public static boolean matrizOrdenada(int matriz[][]) {
		boolean estaOrdenada = false;
		int k = 0;
		int array[] = new int[matriz.length * matriz[0].length];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[k] = matriz[i][j];
				k++;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				if (array[i] < array[i + 1]) {
					estaOrdenada = true;
				}
				else {
					estaOrdenada = false;
					break;
				}
			}
		}
		return estaOrdenada;
	}
	
}
