package capitulo03_bloque03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		 

		Scanner sc = new Scanner(System.in);
		int num = 1, resultado = 0;

		for (int i = 0; num != 0; i++) {
			System.out.println("Introduzca un numero (Pulse 0 para terminar el programa)");
			num = sc.nextInt();
		
			for (i = 0; i <= 10; i++) {
				if (num != 0) {
					resultado = num * i;
				}
				
				System.out.println(num + "x" + i + "=" + resultado);
			}
		}
		
	}

}
