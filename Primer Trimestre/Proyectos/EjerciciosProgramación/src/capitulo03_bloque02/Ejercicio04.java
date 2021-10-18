package capitulo03_bloque02;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, limite;
		
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		
		System.out.println("Introduzca un limite de multiplos");
		limite = sc.nextInt();

		for(int i = 0; (i * num) < limite; i++) {

			System.out.println("Los múltiplos son los siguientes: " + (i * num));
			
			if((i * num > limite)) {
				return;
			}
			
		}
		
		System.out.println("El programa ha acabado");
		
	}
}
