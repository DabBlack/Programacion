package examen20211126;

public class Ejercicio_A_Examen_Tipo_B {

	public static void main(String[] args) {
	
		int array1[] = new int[5];
		int array2[] = new int[5];
		int array3[] = new int[5];
		
		
		inicializarArray1ConNumerosAlAzarEntre0y20(array1);
		
		System.out.println("Array 1: ");
		mostrarArray1(array1);
		
		inicializarArray2ConNumerosAlAzarEntre0y20(array2);
		
		System.out.println("\n" + "\n" + "Array 2: ");
		mostrarArray1(array2);
		
		System.out.println("\n" + "\n" + "Array 3: ");
		mediaDeLosValoresDelAnterioresArrays(array1, array2, array3);
		mostrarArray3(array3);
		 
	}

	
	public static void inicializarArray1ConNumerosAlAzarEntre0y20(int array1[]) {
		for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.round(Math.random() * 20);
        }
	}
	
	public static void inicializarArray2ConNumerosAlAzarEntre0y20(int array2[]) {
		for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) Math.round(Math.random() * 20);
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
	
	public static void mostrarArray3(int array3[]) {
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
	}
	
	public static void mediaDeLosValoresDelAnterioresArrays(int array1[], int array2[], int array3[]) {
		int j = 0, k = 0;
		
		for (int i = 0; i < array3.length; i++) {
			array3[i] = ((array1[j] + array2[k]) / 2);
			j++;
			k++;
		}
	}
	
}
