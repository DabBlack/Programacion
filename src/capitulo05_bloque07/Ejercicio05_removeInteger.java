package capitulo05_bloque07;

public class Ejercicio05_removeInteger {

	public static void main(String[] args) {
		int array1[] = new int[20];
		
		//Se inicializa el primer array con valores entre 0 y 10
		arrayConNumerosAleatoriosEntre0y100(array1);
		
		System.out.println("Array original: ");
		
		//Imprimo el array1
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        
        int num = 1;

        System.out.println("\n" + "\n" + "Numero a eliminar: " + num + "\n");
        
        int array2[] = removeInteger(array1, num);
        
        System.out.println("Array sin el numero eliminado: ");
        
        //Imprimo el array2
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

    }
	
	/**
	 * Este metodo inicializa el array con numeros aleatorios entre 0 y 100
	 * @param array
	 */
	public static void arrayConNumerosAleatoriosEntre0y100 (int array1[]) {
		for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.round(Math.random() * 10);
        }
	}
	
	/**
	 * 
	 * @param array1
	 * @param num
	 * @return
	 */
    public static int[] removeInteger(int array1[], int num) {

    	//Se declara un segundo array con la longitud del primero menos la cantidad de veces que se repite el numero a eliminar
        int array2[] = new int[array1.length - Ejercicio04_countOccurrences.countOccurences(array1, num)];
        int posicionSegundoArray = 0;
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != num) {
                array2[posicionSegundoArray] = array1[i];
                posicionSegundoArray++;
            }
        }
        return array2;
    }
}