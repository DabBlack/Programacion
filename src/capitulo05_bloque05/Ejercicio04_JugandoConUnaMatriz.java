package capitulo05_bloque05;

import java.util.Scanner;

import tutorialJava.Utils;

public class Ejercicio04_JugandoConUnaMatriz {

	public static void main(String[] args) {
		int matrizAlAzar[][] = new int[5][5];
		
		int matriz[][] = new int[][] {  {1,		2, 		3, 		4, 		5},
										{6, 	7, 		8, 		9, 		10},
										{11, 	12, 	13, 	14, 	15},
										{16, 	17, 	18, 	19,	 	20},
										{21, 	22,	 	23,		24, 	25}};
	
			//Inicializamos la matriz con valores aleatorios
			inicializaMatrizAlAzar(matrizAlAzar);
			
			//Mostramos en pantalla la matriz al azar
			mostrarMatrizAlAzar(matrizAlAzar);
							
			//Mostramos en pantalla la matriz
			System.out.println(" ");
			mostrarMatriz(matriz);

			//Comprobacion de si la matriz es positiva
			System.out.println("\n" + "Matriz positiva: " + esMatrizPositiva(matriz));
			
			//Comprobacion de si la matriz es diagonal
			System.out.println("\n" + "Matriz diagonal: " + esMatrizDiagonal(matriz));
			
			//Comprobacion de si la matriz es triangular superior
			System.out.println("\n" + "Matriz triangular superior: " + esTriangularSuperior(matriz));
			
			//Comprobacion de si la matriz es dispersa
			System.out.println("\n" + "Matriz dispersa: " + esDispersa(matriz));
			
			//Array unidimensional con los valores de la matriz
			System.out.println("\n" + "Array unidimensional con los valores de la matriz: ");
			
			matrizUnidimensional(matriz);
			
			//Comprobacion de si la matriz es simetrica
			System.out.println("\n" + "\n" + "Matriz simetrica: " + esMatrizSimetrica(matriz));
		
			//Matriz traspuesta
			System.out.println("\n" + "\tMatriz traspuesta: " + "\n");
			
			matrizTraspuesta(matriz);
			
			//Matriz opuesta
			System.out.println("\n" + "\tMatriz opuesta: " + "\n");
			
			matrizOpuesta(matriz);
			
			//Eliminar una fila de la matriz pedida por el usuario
			System.out.println(" ");
			matrizEliminarFilas(matriz);
		}

	
	/**
	 * Este metodo inicializa la matriz con valores al azar
	 * @param matriz
	 */
	public static void inicializaMatrizAlAzar (int matrizAlAzar[][]) {
		for (int i = 0; i < matrizAlAzar.length; i++) {
			for (int j = 0; j < matrizAlAzar[i].length; j++) {
				matrizAlAzar[i][j] = Utils.obtenerNumeroAzar();
			}
		}
	}
	
	/**
	 * Este metodo muestra en pantalla la matriz al azar
	 * @param matriz
	 */
	public static void mostrarMatrizAlAzar (int matrizAlAzar[][]) {
		System.out.println("Contenido de la matriz al azar: " + "\n");
		for (int i = 0; i < matrizAlAzar.length; i++) {
			for (int j = 0; j < matrizAlAzar[i].length; j++) {
				System.out.print(matrizAlAzar[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

	/**
	 * Este metodo muestra en pantalla la matriz
	 * @param matriz
	 */
	public static void mostrarMatriz (int matriz[][]) {
		System.out.println("Contenido de la matriz: " + "\n");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println(" ");
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
	 * Este metodo comprueba si en la matriz algun valor es 0, si es dispersa significa que hay un 0 en la 
	 * matriz (true), mientras que si no hay ningun cero no sera dispersa (false)
	 * @param matriz
	 * @return
	 */
	public static boolean esDispersa (int matriz[][]) {
		boolean esDispersa = false;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == 0) {
					esDispersa = true;
				}
			}
			
		}
		return esDispersa;
	}
	
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
	 * Este metodo cambia las columnas de la matriz por las filas, haciendo que los valores de las filas sean
	 * los valores de las columnas, y los valores de las columnas sean los de las filas.
	 * Utilizamos una segunda matriz que asigna a los valores de las columnas (i), las valores filas de la matriz 
	 * original (i), una vez asignados esos valores se muestra en panalla la segunda matriz
	 * y con un return le devolvemos al main la segunda matriz
	 * @param matriz
	 */
	public static int[][] matrizTraspuesta (int matriz[][]) {
		int[][] matrizTraspuesta = new int[matriz[0].length][matriz.length];
		
		for (int i = 0; i < matrizTraspuesta.length; i++) {
				for (int j = 0; j < matrizTraspuesta[i].length; j++) {
					matrizTraspuesta[j][i] = matriz[i][j];
				}
		}
		
		for (int i = 0; i < matrizTraspuesta.length; i++) {
			for (int j = 0; j < matrizTraspuesta[i].length; j++) {
				System.out.print(matrizTraspuesta[i][j] + "\t");
			}
			System.out.println(" ");
		}		
		return matrizTraspuesta;
	}
		
	/**
	 * Este metodo cambia de signo los valores de la matriz, solamente hay que multiplicar * -1 al mostrarla
	 * @param matriz
	 */
	public static void matrizOpuesta (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] * -1 + "\t");
			}
			System.out.println(" ");
		}
		
	}
	
	public static void matrizEliminarFilas (int matriz[][]) {
		int numFila;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero de fila entre 0 y 4 para eliminarla: ");
		numFila = sc.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[i] != numFila) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + "\t");	
				}
				System.out.println(" ");
			}	
			
		}
		
	}
	
	
	
	
}
