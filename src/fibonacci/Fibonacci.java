package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		// Declaramos Scanner, variables num1,num2, rep e i

		Scanner sc = new Scanner(System.in);

		int num1 = 1, num2 = 2, rep = 3, next = 4;
		int i;

		// Pedimos al usuario la secuencia de datos que quiere obtener
		System.out.println("introduzca las repeticiones: ");
		rep = sc.nextInt();

		// Iniciamos el bucle donde i le damos valor 0, en cada iteración va a ir
		// sumando los dos dígitos anteriores
		for (i = 0; i < rep - 2; i++) {
			next = num1 + num2;
			num1 = num2;
			num2 = next;

		}
		System.out.println("El numero " + rep + "de la secuencia de fibonacci es: " + next);

	}

}
