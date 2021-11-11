package capitulo05_bloque05;

import tutorialJava.Utils;

public class Ejercicio02_Notas {

	public static void main(String[] args) {
		
		//Se declara el array
		int array[] = new int[20];

		System.out.println("Notas: " + "\n");
	
		//Inicializamos el array al azar entre 0 y 10
		inicializarArrayAlAzar(array);
		//Mostramos el array
		mostrarArray(array);
		//Calculamos el porcentaje de los suspensos y los aprobados
		porcentajeAprobadosYSuspensos(array);
		
	}

	/**
	 * Este metodo inicializa un array con valores al azar entre 0 y 10
	 * @param array
	 */
	public static void inicializarArrayAlAzar (int array[]) {
		//Inicializamos el array asisgandole valores al azar entre 0 y 10
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(0, 10);
		}
		
	}
	
	/**
	 * Este metodo muestra el array
	 * @param array
	 */
	public static void mostrarArray (int array[]) {
		//Mostramos el array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	/**
	 * Este metodo cuenta los aprobados y los suspensos y hace las operaciones necesarias para
	 * calcular el porcentaje de cada uno
	 * @param array
	 */
	public static void porcentajeAprobadosYSuspensos (int array[]) {
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
