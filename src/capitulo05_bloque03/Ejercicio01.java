package capitulo05_bloque03;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//Declaracion del array
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
		

	}

}
