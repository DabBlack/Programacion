package bloque03_cap02;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca un número");
		num = sc.nextInt();

			for(int i = 0; (i * num) < 100; i++) {

			System.out.println("Los múltiplos son los siguientes: " + (i * num));
			
			if((i * num > 100)) {
				return;
			}
			
		}
		
		System.out.println("El programa ha acabado");
		
	}
}
