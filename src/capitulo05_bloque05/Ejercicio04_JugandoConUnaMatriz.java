package capitulo05_bloque05;

import tutorialJava.Utils;

public class Ejercicio04_JugandoConUnaMatriz {

	public static void main(String[] args) {
		int matriz[][] = new int[][] {  {1,		9, 		3, 		4, 		5},
										{2, 	1, 		2, 		3, 		4},
										{3, 	2, 		1, 		2, 		3},
										{4, 	3, 		2, 		9,	 	2},
										{5, 	4,	 	3, 		2, 		1}};
	
			//Inicializamos la matriz con valores aleatorios
//			inicializaMatriz(matriz);
			
			//Mostramos en pantalla la matriz
			mostrarMatriz(matriz);

			//Comprobacion de si la matriz es positiva
			System.out.println("\n" + "Matriz positiva: " + esMatrizPositiva(matriz));
			
			//Comprobacion de si la matriz es diagonal
			System.out.println("\n" + "Matriz diagonal: " + esMatrizDiagonal(matriz));
			
			//Comprobacion de si la matriz es triangular superior
			System.out.println("\n" + "Matriz triangular superior: " + esTriangularSuperior(matriz));
			
			//Comprobacion de si la matriz es dispersa
//			System.out.println("\n" + "Matriz dispersa: " + esDispersa(matriz));
			
			//Array unidimensional con los valores de la matriz
			System.out.println("\n" + "Array unidimensional con los valores de la matriz: ");
			
			matrizUnidimensional(matriz);
			
			//Comprobacion de si la matriz es simetrica
			System.out.println("\n" + "\n" + "Matriz simetrica: " + esMatrizSimetrica(matriz));
		
			//Matriz traspuesta
			System.out.println("\n" + "Matriz traspuesta");
			
			matrizTraspuesta(matriz);
			
		}

	
	/**
	 * Este metodo inicializa la matriz con valores al azar
	 * @param matriz
	 */
	public static void inicializaMatriz (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar();
			}
		}
	}


	/**
	 * Este metodo muestra en pantalla la matriz
	 * @param matriz
	 */
	public static void mostrarMatriz (int matriz[][]) {
		System.out.println("Contenido de la matriz" + "\n");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	
	/**
	 * Este metodo comprueba si la matriz es negativa o es positiva
	 * @param matriz
	 * @return
	 */
	public static boolean esMatrizPositiva (int matriz[][]) {
		//Los dos for sirven para recorrer las filas y las columnas
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//Si el valor de j de i es menor que cero devuelve false, es decir, es negativa
				if (matriz[i][j] < 0) {
					return false;
				}
			}
		}
		//Si no cumple la condicion de arriba, es decir, si todos los valores son positivos, devuelve true
		return true;
	}
	
	/**
	 * Este metodo comprueba si la matriz es diagonal o no
	 * Mientras que la j sea distinta a i y si la posicion sean 0
	 * la matriz es diagonal
	 * @param matriz
	 */
	public static boolean esMatrizDiagonal (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j != i; j++) {
				//Este if intenta negarlo
				if(matriz[i][j] != 0) {
					return false;
				}

			}
			
		}
		return true;
	}
	
	/**
	 * Este metodo comprueba si la matriz es triangular superior
	 * Mientras que la j sea menor que i para comprobar solo los valores de la izquierda
	 * sean ceros la matriz es triangular superior
	 * @param matriz
	 * @return
	 */
	public static boolean esTriangularSuperior (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < i; j++) {
				//Este if intenta negarlo
				if(matriz[i][j] != 0) {
					return false;
				}
				
			}
			
		}
		return true;
	}
	
	/**
	 * Este metodo comprueba si la matriz es dispersa
	 * @param matriz
	 * @return
	 */
//	public static boolean esDispersa (int matriz[][]) {
//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz.length; j++) {
//				
//			}
//			
//		}
//		
//	}
	
	/**
	 * Este metodo almacena en un array unidimensional el contenido de la matriz
	 * @param matriz
	 * @return
	 */
	public static void matrizUnidimensional (int matriz[][]) {
		int k = 0;
		//Se multiplican las filas por las columnas
		int array[] = new int[matriz.length * matriz[0].length];
		
		//En estos bucles se recorre la matriz y se le asigna el valor de cada posicion de la matriz
		//a la posicion correspondiente del array, cada vez que se asigna un valor se incremente la
		//posicion del array, es este caso la k
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[k] = matriz[i][j];
				k++;
			}
		}	
		
		//Se recorre y se muestra el array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	/**
	 * Este metodo compara dos posiciones opuestas, si no son iguales la matriz no seria simetrica,
	 * mientras que si se da el caso que todas las posiciones opuestas son iguales significaria que
	 * la matriz es simetrica
	 * @param matriz
	 * @return
	 */
	public static boolean esMatrizSimetrica (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					return false;
				}
				
			}
		
		}
		return true;
		
	}
	
	/**
	 * 
	 * @param matriz
	 */
	public static void matrizTraspuesta (int matriz [][]) {
		int aux = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				aux = matriz[i][j];
				matriz[i][j] = matriz[j][i];
				matriz[j][i] = aux;
			}
				
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}
	

}
