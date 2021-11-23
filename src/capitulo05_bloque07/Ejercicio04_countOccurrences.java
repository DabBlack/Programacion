package capitulo05_bloque07;

public class Ejercicio04_countOccurrences {

	public static void main(String[] args) {
		int array[] = new int[50];

		//Inicializamos el array con valores aleatorios entre 0 y 100
		arrayConNumerosAleatoriosEntre0y10(array);
		
		System.out.println("Array: ");
		//Mostramos el array en pantalla
		mostrarArray(array);
		
		System.out.println("\n" + "\n" + "Numero buscado: 1");
		
        //Imprimimos el metodo
        System.out.println("\n" + "Numero de veces que ha aparecido el número: " + countOccurences(array, 1));
    }

	/**
	 * Este metodo inicializa el array con numeros aleatorios entre 0 y 100
	 * @param array
	 */
	public static void arrayConNumerosAleatoriosEntre0y10 (int array1[]) {
		for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.round(Math.random() * 10);
        }
	}
	
    /**
     * Este metodo busca un valor dentro del array y cuenta cuantas veces aparece
     * 
     * @param array
     * @param num
     * @return
     */
    public static int countOccurences (int array[], int num) {
    	int contador = 0;
    	
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
            	contador++;
            }

        }
        return contador;
    
	}
    
    /**
     * Este metodo muestra el array
     * @param array
     */
    public static void mostrarArray (int array[]) {
    	for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
    }
    
}
