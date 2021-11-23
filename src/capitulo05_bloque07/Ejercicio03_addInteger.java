package capitulo05_bloque07;

public class Ejercicio03_addInteger {

	public static void main(String[] args) {
		int array1[] = new int[10];
		
		//Se inicializa el array con numeros aleatorios entre 0 y 100
		arrayConNumerosAleatoriosEntre0y100(array1);
		
		System.out.println("Array original: ");
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
		System.out.println("\n" + "\n" + "Valor a añadir: 500");
		
		//Se declara el array2 asignandole el valor del metodo addInteger
		int array2[] = addInteger(array1, 500);
		
		System.out.println("\n" + "Array con un valor añadido");
		
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
            array1[i] = (int) Math.round(Math.random() * 100);
        }
	}
	
    /**
     * Este metodo añade un valor al final del array
     * @param array
     * @param num
     * @return
     */
    public static int[] addInteger(int array1[], int num) {
    	//Declaramos las variables necesarias
        int array2[] = new int[array1.length + 1];
        int ultimaPosicion = array2.length;
               
        //Se recorre el array1 y se le asignan sus valores al array2
        for (int i = 0; i < array1.length; i++) {
        	array2[i] = array1[i];
        }
       
        //Se recorre el segundo array y se le añade el numero al final
        for (int i = 0; i < array2.length; i++) {
        	if(i == array1.length) {
        		array2[i] = num;
        		break;
        	}
		}
        return array2;
    }

}
	
