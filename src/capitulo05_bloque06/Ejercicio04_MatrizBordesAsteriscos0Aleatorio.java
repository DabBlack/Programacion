package capitulo05_bloque06;

import tutorialJava.Utils;

public class Ejercicio04_MatrizBordesAsteriscos0Aleatorio {

	public static void main(String[] args) {
		//Se declara la matriz de 20 filas y 10 columnas
		char matriz[][] = new char[20][10];
		
		//Se dibuja la interfaz de asteriscos, formada por una matriz
		bordesConAsteriscos(matriz);
		
		ceroEnUnaPosicionAlAzar(matriz);
		
		mostrarMatriz(matriz);
	}

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
			System.out.println(matriz[i]);
		}
	}
	
	public static void ceroEnUnaPosicionAlAzar (char matriz[][]) {
		//Se declaran las variables necesarias
		int fila = 0, columna = 0;
		
		for (int i = 0; i < 1; i++) {
			fila = (int) Math.round(Math.random() * (matriz.length - 2) + 2);
			for (int j = 0; j < 1; j++) {
				columna = (int) Math.round(Math.random() * (matriz[i].length - 2) + 2);
				if (i == fila && j == columna) {
					matriz[i][j] = '0';
				}
		
			}
		
		}
		System.out.println(fila + " " + columna);
	}
	
	public static void mostrarMatriz (char matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i]);
			}
		}
	}
		
}
