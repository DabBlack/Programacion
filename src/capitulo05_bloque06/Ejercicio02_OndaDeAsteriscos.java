package capitulo05_bloque06;

public class Ejercicio02_OndaDeAsteriscos {

	public static void main(String[] args) {
		
		char matriz[][] = new char [10][30];
		
		generarAsteriscosAlAzar(matriz);
	}
	
	/**
	 * Este metodo genera asteriscos al azar hasta cierta posicion de la columna, despues genera espacios
	 * Explicado abajo
	 * @param matriz
	 */
	public static void generarAsteriscosAlAzar (char matriz[][]) {
		int numAsteriscos = 0;
		
		//Se recorre la i, es decir, las filas
		for (int i = 0; i < matriz.length; i++) {
			//Se le asigna un numero aleatorio entre 1 y 30 a la variable numAsteriscos
			numAsteriscos = (int) Math.round(Math.random()* (30 - 1) + 1);
			//Se recorre la j, es decir, las columnas
			for (int j = 0; j < matriz[i].length; j++) {
				//Si el numAsteriscos es mayor de la j, se pinta un asterisco
				if (numAsteriscos > j) {
					System.out.print("*");
				}
				//Si no se pinta un espacio
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	
	}

}
