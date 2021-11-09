package capitulo05_bloque05;

import tutorialJava.Utils;

public class Ejercicio02_Notas {

	public static void main(String[] args) {
		
		int array[] = new int[20];

		System.out.println("Notas: " + "\n");
		
		inicializarArray(array);
		mostrarArray(array);
		
		System.out.println("\n" + "\n" + "El porcentaje de suspensos es: ");
		System.out.println("\n" + "El porcentaje de aprobados es: ");
		
		analizarArray(array);
		
	}

	public static void inicializarArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(0, 10);
		}
		
	}
	
	
	public static void mostrarArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	
	public static int analizarArray (int array[]) {
		int aprobado = 0, suspenso = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 5){
				array[i] = aprobado;
			}
			else {
				array[i] = suspenso;
			}
		}
		
		return 0;
		
	}
	
}
