package capitulo03_bloque04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int i = (int) Math.pow(2, 30);
		
		System.out.println("Introduzca un numero:");
		num = sc.nextInt();
		
		while (i > 0) {
			
			if ((num & i) != 0) {
				System.out.print(1);
			}
			
			else {
				System.out.print(0);
			}
			
			i = i >> 1;
		}

	}

}