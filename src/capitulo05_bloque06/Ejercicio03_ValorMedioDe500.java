package capitulo05_bloque06;

public class Ejercicio03_ValorMedioDe500 {

	public static void main(String[] args) {
		
		//Declaramos las variables necesarias
		int num = 0, suma = 0, contador = 0;
		float media = 0;
		
		do {
			//Al numero se le asigna el valor al azar generado
			num = generarNumerosAlAzarEntre1y1000();
			//Se suma el numero junto a la variable suma
			suma += num;
			//Se incrementa el contador
			contador++;
			//Se calcula la media
			media = (float) suma / contador;
			
		} while(media < 499.5 || media > 500.5);

		mostrarMediaYNumerosNecesarios(contador, media);		
	}

	/**
	 * Este metodo genera numeros al azar entre 1 y 1000
	 * @param num
	 * @return
	 */
	public static int generarNumerosAlAzarEntre1y1000() {
		int num = (int) Math.round(Math.random()* (1000 - 1) + 1);
		return num;
	}
	
	/**
	 * Este metodo muestra la cantidad de numeros generados, además de mostrar
	 * la media
	 * @param contador
	 * @param media
	 */
	public static void mostrarMediaYNumerosNecesarios(int contador, float media) {
		System.out.println("Cantidad de numeros generados: " + contador + "\n" + "\n" + "Media"
							+ " de numeros generados: " + media);
	}
	
}
