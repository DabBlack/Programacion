package capitulo05_bloque05;

import tutorialJava.Utils;

public class Ejercicio02_Notas {

	public static void main(String[] args) {
		
		int array[] = new int[20];

		System.out.println("Notas: " + "\n");
	
		//Este metodo inicializa el array al azar
		inicializarArrayAlAzar(array);
		//Este metodo muestra el array
		mostrarArray(array);
		//Este metodo analiza el array para contar los valores mayores y menores que 5
		//Una vez tengamos los contadores en el mismo syso haremos las operaciones necesarias
		analizarArray(array);
		
	}

	public static void inicializarArrayAlAzar (int array[]) {
		//Inicializamos el array asisgandole valores al azar entre 0 y 10
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(0, 10);
		}
		
	}
	
	
	public static void mostrarArray (int array[]) {
		//Mostramos el array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	
	public static void analizarArray (int array[]) {
		int aprobados = 0, suspensos = 0;
		
		//Diferenciamos los valores mayores y menores de 5, haciendo un incremento simple a la variable para usarla de contador
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 5){
				aprobados++;
			}
			
			else {
				suspensos++;
			}
			
		}
		
		//Mostramos en pantalla los valores ademas de hacer los calculos necesarios
		System.out.println("\n" + "\n" + "El porcentaje de aprobados es: " + (float) (aprobados * 100) / array.length + "%");
		System.out.println("\n" + "El porcentaje de suspensos es: " + (float) (suspensos * 100) / array.length + "%");
		
		
	}
	
}
