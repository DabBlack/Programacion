package capitulo03_bloque03;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 1, suma = 0, media = 0;

		for (; num != 0;) {
			System.out.println("Introduzca un numero (Pulse 0 para terminar el programa)");
			num = sc.nextInt();
		
			if (num != 0) {
				suma += num;
				media = suma / num;
			}
		
		
		}
		
		System.out.println("La suma de los numeros es: " + suma + "\nLa media de los numeros es: " + media);
		
	}

}
