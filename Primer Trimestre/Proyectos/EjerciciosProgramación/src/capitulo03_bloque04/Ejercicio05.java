package capitulo03_bloque04;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		//Se declaran las variables
		Scanner sc = new Scanner(System.in);
		int num, i = 2, factorial = 1;
		
		//Se pide un numero al usuario
		System.out.println("Introduzca un numero");
		num = sc.nextInt();
		
		while (i > 1 && i < num + 1) {
		
			factorial = factorial * i;
			i++;
		} 
		
		System.out.println("El valor del factorial equivale a " + factorial);
	
	}

}
