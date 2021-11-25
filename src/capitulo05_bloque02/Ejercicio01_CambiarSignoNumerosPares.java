package capitulo05_bloque02;

public class Ejercicio01_CambiarSignoNumerosPares {

	public static void main(String[] args) {
		
		//Declaracion del array
		int numeros[] = new int[150]; 
	
		//Inicializacion de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (100 - -100)) + -100;
		}
		
		System.out.print("Numeros pares cambiados se signo: " + "\n" + "\n"); 
		
		//Recorrido del array para imprimir sus valores en pantalla 
		for (int i = 0; i < numeros.length; i++) {
			
		//Cambio de signo de los numeros pares
			if (numeros[i] % 2 == 0) {
				numeros[i] *= -1;
				System.out.print(numeros[i] + " ");
			}
		//Aqui se imprimen intactos los numeros impares
			else {
				System.out.print(numeros[i] + " ");
			}
			
		}
	
	}

}
