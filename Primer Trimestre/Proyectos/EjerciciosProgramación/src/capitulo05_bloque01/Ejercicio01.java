package capitulo05_bloque01;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int suma = 0, media = 0, mayor = 0, menor = 0;
		
		//Declaracion del array
		int numeros[] = new int[150]; 
		
		// Inicialización de los valores del array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * (100 - 0)) + 0;
		}
		
		//Recorrido del array para imprimir sus valores en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
			
			//Suma de todos los valores del array
			suma += numeros[i];
			
			//Media de todos los valores del array
			media = suma / numeros.length;
			
			if (i = 0) {
				i = mayor;
			}
			
			//Media de todos los valores del array
			if (mayor < numeros) {
				mayor = numeros;
			}
			
			//Media de todos los valores del array
			if (menor > numeros) {
				menor = numeros;
			}
		}
		
		System.out.println("\n" + "\nLa suma de todos los valores es: " + suma + "\n" +  "\nLa media de todos los valores es: " + media + "\n" + 
		);
		

	}

}
