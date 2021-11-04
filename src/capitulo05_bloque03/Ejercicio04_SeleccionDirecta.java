package capitulo05_bloque03;

public class Ejercicio04_SeleccionDirecta {

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
		
		System.out.println("\n");
		
		//Se inicia un bucle para recorrer el array
		for (int i = 0; i < numeros.length; i++) {
			//Se le asigna a la variable posicionMenor el valor de i
			posicionMenor = i;
			//Este bucle recorre el segundo array sin salirse de los parametros del mismo
			for (int j = i + 1; j < numeros.length; j++) {
				//Si el valor de la posicion de j es menor que el valor de la variable posicionMenor
				//se le asigna el valor de j
				if (numeros[j] < numeros[posicionMenor]) {
					posicionMenor = j;	
				}
			}
			
			//La variable posicionMenor tiene el valor del numero menor a partir de la i
			//Se hacen los intercambios
			auxiliar = numeros[i];
			numeros[i] = numeros[posicionMenor];
			numeros[posicionMenor] = auxiliar;
		}
		
		System.out.println("Array ordenado:" + "\n");
		
		//Recorrido del array para imprimir sus valores en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
	}

}
