package capitulo05_bloque07;

public class Ejercicio01_stringFromArray {

	public static void main(String[] args) {
		
		int array[] = new int[10];
		
		//Inicializo el array con numeros aleatorios entre 0 y 100
		arrayConNumerosAleatoriosEntre0y100(array);
		
		System.out.println("Array original: ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\n" + "\n" + "Array de caracteres: ");
		
        //Imprimo el método
        System.out.print(stringFromArray(array));
    }

	
	/**
	 * Este metodo inicializa el array con numeros aleatorios entre 0 y 100
	 * @param array
	 */
	public static void arrayConNumerosAleatoriosEntre0y100 (int array[]) {
		for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
	}
	
	
    /**
     * Este método devuelve una cadena de caracteres mediante un array
     * @param array
     * @return
     */
    public static String stringFromArray(int array[]) {
    	//Declaramos las variables necesarias
        char caracter;
        String cadenaDeCaracteres = "";

        //Recorremos el array
        for (int i = 0; i < array.length; i++) {
        	//Le asignamos a la variable caracter de tipo char el valor de esa posicion del array
        	caracter = (char) array[i];
        	//Se le asigna a la varaible cadenaDeCaracteres de tipo String el valor de la misma variable
        	//mas el valor de la variable caracter
        	cadenaDeCaracteres = cadenaDeCaracteres + caracter;
        }
        return cadenaDeCaracteres;
    }
    
}