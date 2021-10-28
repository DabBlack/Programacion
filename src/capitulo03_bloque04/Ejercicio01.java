package capitulo03_bloque04;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
	
		//Se declaran las variables necesarias para el programa
		
		int num, i = 2;
		Scanner sc = new Scanner(System.in);
		boolean numEsPrimo = true;
		
		//Se pide un numero al usuario y se almacena en la variable num
		
		System.out.println("Introduzca un numero:");
		num = sc.nextInt();
		
		//El bucle while 
		
		while (i < (num / 2 + 1)) {
		
			//Si el resto de la division es 0 el numero sera primo, si no, sera compuesto
			if (num % i == 0) {
				numEsPrimo = false;
			}
			i++; //El incremento simple sirve para no volver a entrar en el bucle
		}
		
		if (numEsPrimo == true) {
			System.out.println("El numero " + num + " es primo");
		}
		
		else {
			System.out.println("El numero " + num + " es compuesto");
		}	
		
	}

}
