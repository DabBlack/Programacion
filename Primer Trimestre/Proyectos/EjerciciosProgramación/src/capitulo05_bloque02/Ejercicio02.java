package capitulo05_bloque02;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		//Declaracion de los array
		int array1[] = new int[150]; 
		int array2[] = new int[150];
		int array3[] = new int[150];
		
		//Inicializacion de los valores del array1
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) Math.round(Math.random() * (100 - 0)) + 0;
		}
		
		System.out.print("Array 1: " + "\n" + "\n"); 
		
		//Recorrido del array1 para imprimir sus valores en pantalla 
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}			
		
		
		//Inicializacion de los valores del array2
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int) Math.round(Math.random() * (100 - 0)) + 0;
		}
		
		System.out.print("\n" + "\nArray 2: " + "\n" + "\n"); 
		
		//Recorrido del array2 para imprimir sus valores en pantalla 
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}			
	
		//Inicializacion de los valores del array3
		for (int i = 0; i < array3.length; i++) {
			
			if (i % 2 == 1) {
				array3[i] = array1[i];
			}
			
			else {
				array3[i] = array2[i];
			}
		}
		
		System.out.print("\n" + "\nArray 3: " + "\n" + "\n"); 
		
		//Recorrido del array2 para imprimir sus valores en pantalla 
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
				
	}

}
