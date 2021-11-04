package capitulo05_bloque03;

public class Ejercicio01_Burbuja {

	public static void main(String[] args) {
		
		//Declaracion del array
		int auxiliar = 0;
		boolean hayIntercambios = true;
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
		
		do {
			//Para saber si hay un intercambio de primeras ponemos nuestra banderita abajo, es decir el booleano en false
			hayIntercambios = false;
			for (int i = 0; i < numeros.length - 1; i++) {
				//La condicion para el intercambio es que el valor de num sea mayor que el valor del num posterior, si lo es alzamos banderita,
				//es decir, se pone la variable booleana en true
				if (numeros[i] > numeros[i + 1]) {
					hayIntercambios = true;
					//A la variable auxiliar se le asigna el valor del num posterior, mientras que al num posterior le asignamos el valor de num
					auxiliar = numeros[i + 1];
					numeros[i + 1] = numeros[i];
					//A num le asignamos el valor de la variable auxiliar para guardar su valor
					numeros[i] = auxiliar;
				}
				
			}
			//Una vez que ha leido la linea del Array y no habia ningun intercambio, nuestra banderita se bajaria, es decir la variable booleana
			//se pondria en false, por lo tanto no cumpliria la condicion del do while y pasariamos a imprimir el Array ordenado
			
		} while(hayIntercambios == true);

		//Para imprimir el Array ordenado utilizamos otro for fuera del bucle while, para asi recorrer el Array ya ordenado
		for(int i = 0; i < numeros.length; i++ ) {
			System.out.print(numeros[i] + " ");
		}
		
	}

}
