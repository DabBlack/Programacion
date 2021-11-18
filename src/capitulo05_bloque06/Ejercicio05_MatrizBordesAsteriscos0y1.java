package capitulo05_bloque06;

import tutorialJava.Utils;

public class Ejercicio05_MatrizBordesAsteriscos0y1 {

	public static void main(String[] args) {
		//Se declara la matriz de 20 filas y 10 columnas
		char matriz[][] = new char[20][10];
		
		//Se dibuja la interfaz de asteriscos en los bordes y el interior de espacios en blanco, 
		//formada por una matriz
		bordesConAsteriscos(matriz);
		
		//Se genera en cada posicion de la matriz aleatoriamente un 0 y un 1 dentro de la interfaz de asteriscos
		generar0y1AlAzar(matriz);
		
	}
	
	/**
	 * Este metodo rellena de asteriscos los bordes de la matriz y de espacios en blanco el interior
	 * @param matriz
	 */
	public static void bordesConAsteriscos (char matriz[][]) {
		//Se recorre la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//Si es la primera o la ultima fila se le asigna a la posicion un valor de un asterisco
				if(i == 0 || i == matriz.length - 1) {
					matriz[i][j] = '*';
				}
				//Si no se le asigna un espacio
				else {
					matriz[i][j] = ' ';
				}			
			}	
		}	
		
		//Se vuelve a recorrer la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				//Si es la primera o la ultima columna se le asigna a la posicion un valor de asterisco
				if(j == 0 || j == matriz[i].length - 1) {
					matriz[i][j] = '*';
				}
			}
		}
	}
	
	/**
	 * Este metodo genera aleatoriamente dentro de la matriz ceros y unos
	 * @param matriz
	 */
	public static void generar0y1AlAzar (char matriz[][]) {
		int numAzarEntre0y1 = 0;
		
		//Se recorre la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				numAzarEntre0y1 = Utils.obtenerNumeroAzar(0, 1);
				//Si el valor de la posicion es igual a espacio y el numero aleatorio es 0 se le asigna el valor 0, si nom
				//se le asigna el valor 1
				if (matriz[i][j] == ' ') {
					if (numAzarEntre0y1 == 0) {
						matriz[i][j] =  '0';
					}
					else {
						matriz[i][j] =  '1';
					}
				}
					
			}
			//Se muestran los valores de la matriz
			System.out.println(matriz[i]);
		}
	}
		
}
