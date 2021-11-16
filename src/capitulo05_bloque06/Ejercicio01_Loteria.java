package capitulo05_bloque06;

public class Ejercicio01_Loteria {

	public static void main(String[] args) {
		
		int array[] = new int[7];

		//Se inicializa el array con valores al azar entre 1 y 49
		inicializarArrayAlAzar(array);
		System.out.println("Loteria: " + "\n");
		
		//Se verifica que no se repite ningun valor, y si fuera el caso se genera otro numero al azar
		//en su lugar
		valoresDelArraySinRepeticion(array);
		
		//Se muestra el array en pantalla
		mostrarArray(array);
	}

	/**
	 * Este metodo inicializa el array con valores al azar entre 1 y 49
	 * @param array
	 */
	public static void inicializarArrayAlAzar (int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()* (49 - 1) + 1);
		}
	}
	
	/**
	 * Este metodo muestra el array en pantalla
	 * @param array
	 */
	public static void mostrarArray (int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	/**
	 * Este metodo hace que no se repitan los valores dentro del array
	 * Si se repite alguno simplemente se genera otro en su lugar
	 * @param array
	 */
	public static void valoresDelArraySinRepeticion (int array[]) {
		boolean esIgual = false;
		
		for (int i = 0; i < array.length; i++) {
			
			do {
				array[i] = (int) Math.round(Math.random()* (49 - 1) + 1);
				esIgual = false;
				//La j de recorre hacia atras
				for (int j = i - 1; j > -1; j--) {
					if (array[j] == array[i]) {
						esIgual = true;
					}
				}
				
			}while(esIgual == true);
			
		} 
		
	}
	
}
