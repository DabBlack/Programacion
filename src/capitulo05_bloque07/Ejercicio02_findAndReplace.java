package capitulo05_bloque07;

public class Ejercicio02_findAndReplace {

	public static void main(String[] args) {
		int array[] = new int[20];

		//Se inicializa el array con numeros aleatorios entre 0 y 10
		arrayConNumerosAleatoriosEntre0y10(array);

        System.out.println("Array sin cambios: ");
        // Imprimo el Array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n" + "\n" + "Valor buscado : 0" + "\n" + "Valor intercambiado: 10" + "\n");

        // Vuelvo a imprimir el Array pero llamando al método para que haga los cambios necesarios
        System.out.println("Array con los cambios del metodo creado: ");

        for (int i = 0; i < array.length; i++) {
            findAndReplace(array, 0, 10);
            System.out.print(array[i] + " ");
        }
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
     * Este metodo intercambia un valor concreto del array (valorBuscado) por otro (valorReemplazado)
     * 
     * @param array
     * @param objetivo
     * @param reemplazo
     * @return
     */
    public static int[] findAndReplace(int array[], int valorBuscado, int valorReemplazado) {

    	//Recorremos el array
        for (int i = 0; i < array.length; i++) {
        	//Si el valor de la posicion equivale al valor buscado se intercambia
            if (array[i] == valorBuscado) {
            	valorBuscado = valorReemplazado;
                array[i] = valorReemplazado;
            }
        }
        return array;
    }

}
