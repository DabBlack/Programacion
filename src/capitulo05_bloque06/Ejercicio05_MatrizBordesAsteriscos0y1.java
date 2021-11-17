package capitulo05_bloque06;

import tutorialJava.Utils;

public class Ejercicio05_MatrizBordesAsteriscos0y1 {

	public static void main(String[] args) {
		//Se declara la matriz de 20 filas y 10 columnas
		char matriz[][] = new char[20][10];
		
		//Se dibuja la interfaz de asteriscos en los bordes y el interior de espacios en blanco, 
		//formada por una matriz
		bordesConAsteriscos(matriz);
		
		//Se genera un 0 en una posicion aleatoria dentro de la matriz
		ceroEnUnaPosicionAlAzar(matriz);
		
	}
	
	/**
	 * Este metodo rellena de asteriscos los bordes de la matriz y de espacios en blanco el interior
	 * @param matriz
	 */
	public static void bordesConAsteriscos(char matriz[][]) {
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
	 * Este metodo señala a una fila y a una columna al azar y se le asigna a esa posicion de la matriz el valor 0
	 * @param matriz
	 */
	public static void ceroEnUnaPosicionAlAzar (char matriz[][]) {
		//Se declaran las variables necesarias
		int fila = 0, columna = 0;
		
		//Se generan numeros al azar entre 1 y la longitud de la matriz -2 para no ocupar el sitio
		//de los asteriscos y se le asignan a las variables fila y columna
		for (int i = 0; i < 1; i++) {
			fila = Utils.obtenerNumeroAzar(matriz.length -2, 1);
			columna = Utils.obtenerNumeroAzar(matriz[i].length -2, 1);
		}
		
		//Se recorre el array y en la posicion de la fila y la columna indicada se le asigna el valor 0
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == fila && j == columna) {
					matriz[i][j] = '0';
				}
			}
			//Se muestran los valores de la matriz
			System.out.println(matriz[i]);
		}
		//Se muestran que fila y que columna son las indicadas
		System.out.println("\n" + "Fila: " + fila + "\nColumna: " + columna);
	}
	
		
}
