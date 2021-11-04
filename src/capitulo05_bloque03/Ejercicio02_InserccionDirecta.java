package capitulo05_bloque03;

public class Ejercicio02_InserccionDirecta {

	public static void main(String[] args) {
		
		//Declaracion del array
		int auxiliar = 0, posicionMenor;
		int numeros[] = new int[150];
		
		//Inicializacion de los valores de array aleatoriamente
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 1000);
		}
		
		System.out.println("Array sin ordenar:" + "\n");
		
		//Recorrido del array para imprimir sus valores en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println("\n" + "\n" + "Array ordenado:" + "\n");
		
		//Se inicia un bucle para recorrer el array
		for (int i = 0; i < numeros.length; i++) {
			//Se le asigna a la variable posicionMenor el valor de la posicion que corresponde en ese momento a la i
			posicionMenor = i;
			
			//Este bucle parte de la siguiente posicion de i
			for (int j = i + 1; j < numeros.length; j++) {
				//Si el valor de la posicion j es menor que la posicion de posicionMenor, como posicionMenor = i
				//equivale a la posicion de la izquierda de la j, lo que hace es comparar el de la izquierda con
				//el de la derecha y cambia el valor si es menor
				if (numeros[j] < numeros[posicionMenor]) {
					posicionMenor = j;
				}
			}
			
			//Se le asigna a la variable auxiliar el valor de la posicion menor
			auxiliar = numeros[posicionMenor];
			 
			for (int j = posicionMenor; j > i; j--) {
				numeros[j] = numeros[j - 1];
			}
			
			numeros[i] = auxiliar;
			
		}
		
		//Recorrido del array para imprimir sus valores en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
	}

}
