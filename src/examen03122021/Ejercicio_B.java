package examen03122021;

public class Ejercicio_B {

	public static void main(String[] args) {
		int posicionAlAzar = 0;
		int array1[] = new int [5];
		int array2[] = new int [5];
		
		inicialiarArray1(array1);
		
		System.out.println("Array Original: " + "\n");
		
		mostrarArray1(array1);
				
		System.out.println("\n" + "\n" + "Array Desordenado: " + "\n");
		
		arrayDesordenado(array1, array2, posicionAlAzar);
		
		mostrarArray2(array2);
	}

	public static void inicialiarArray1(int array1[]) {
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) Math.round(Math.random() * 100);
		}
	}
	
	public static void mostrarArray1(int array1[]) {
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}
	
	public static void mostrarArray2(int array2[]) {
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}
	
	public static int posicionAlAzar(int posicionAlAzar) {
		for (int i = 0; i < 1; i++) {
			posicionAlAzar = (int) Math.round(Math.random() * 4);
		}
		return posicionAlAzar;
	} 
	
	public static void arrayDesordenado(int array1[], int array2[], int posicionAlAzar) {
		int k;
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array1[posicionAlAzar(posicionAlAzar)];
		}
	}
	
}
