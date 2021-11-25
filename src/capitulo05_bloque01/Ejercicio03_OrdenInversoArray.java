package capitulo05_bloque01;

public class Ejercicio03_OrdenInversoArray {

	public static void main(String[] args) {
		
		//Declaracion del array
		int numeros[] = new int[150]; 
		
		// Inicializacion de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (100 - 0)) + 0;
		}
		
		System.out.print("Orden inverso del array: " + "\n"); 
		
		//Recorrido del array para imprimir sus valores en pantalla de manera inversa
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
			
		}
	 
	}

}
