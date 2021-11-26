package examen20211126;

import java.util.Scanner;

public class Ejercicio_D_Examen_Tipo_B {

	public static void main(String[] args) {
		int num;
		int array[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una posicion que desee eliminar del array (0-9): ");
		num = sc.nextInt();
		
		inicializarArrayConNumerosAlAzarEntre0y100(array);
		
		System.out.println("Array: ");
		mostrarArray(array);
		
		valoresALaIzquierda(array ,num);
		
		System.out.println("\n" + "\n" + "Array sin el numero pedido por el usuario: ");
		mostrarArray(array);
	}

	public static void inicializarArrayConNumerosAlAzarEntre0y100(int array[]) {
		for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
	}
	
	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");
		}
	}
	
	public static void valoresALaIzquierda(int array[], int num) {
		
		for (int i = 0; i < array.length; i++) {
			if (i == num) {			
				for (int k = array.length; k > num; k--) {
				array[i] = array[k - 1];
				}	
				array[array.length - 1] = (int) Math.round(Math.random() * 100);
			}
		}	
	}
	
}
