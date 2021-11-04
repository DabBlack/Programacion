package capitulo05_bloque03;

public class Ejercicio03_Shell {

	public static void main(String[] args) {
		
		//Declaracion del array
		int auxiliar = 0;
		int numeros[] = new int[10];
		int saltos[] = {6, 4, 3, 2, 1};
		
		//Inicializacion de los valores de array aleatoriamente
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 1000);
		}
		
		System.out.println("Array sin ordenar:" + "\n");
		
		//Recorrido del array para imprimir sus valores en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println("\n");
		
		//Se inicia un bucle para recorrer el array
		for (int i = 0; i < saltos.length; i++) {
			System.out.println("Salto de: " + saltos[i]);
			for (int j = 0; j < numeros.length; j++) {
				//Si la pocicion de j mas el salto es menor que la longitud se inicia lo demas
				if (j + saltos[i] < numeros.length) {
					//Si el valor de j es menor que el valor del valor de la posicion de j mas el salto
					//se hacen los intercambios
					if (numeros[j] > numeros[j + saltos[i]]) {
						auxiliar = numeros[j];
						numeros[j] = numeros[j + saltos[i]];
						numeros[j + saltos[i]] = auxiliar;
					}
				
				}
				
			}
			
		}
		
		System.out.println("\n" + "Array ordenado:" + "\n");
		
		//Recorrido del array para imprimir sus valores en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
	}

}
