package capitulo05_bloque06;

public class Ejercicio02_OndaDeAsteriscos {

	public static void main(String[] args) {
		
		char matriz[][] = new char [10][30];
		
		generarAsteriscosAlAzar(matriz);
	}
	
	public static void generarAsteriscosAlAzar (char matriz[][]) {
		int numAsteriscos = 0;
		
		
		for (int i = 0; i < matriz.length; i++) {
			numAsteriscos = (int) Math.round(Math.random()* (30 - 1) + 1);
			for (int j = 0; j < matriz[i].length; j++) {
				if (numAsteriscos > j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}

}
