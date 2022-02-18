package capitulo06_wrappers;

import java.util.Scanner;

public class Ejercicio02_Contraseña {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password;
		boolean hayMayuscula = false;
		boolean hayMinuscula = false;
		boolean hayDigito = false;
		boolean haySimbolo = false;
		boolean passwordCorrecta = false;

		// Creamos un bucle do while para seguir pidiendo al usuario la contraseña hasta que se cumplan todos los requisitos
		do {
			System.out.println("Introduzca su contraseña: ");
			password = sc.nextLine();

			// Creamos un array de tipo char para comprobar cada caracter que tiene el valor
			char arrayCaracteres[] = new char[password.length()];
			
			arrayCaracteres = password.toCharArray();

			for (int i = 0; i < arrayCaracteres.length; i++) {
				// Utilizamos el método isUpperCase que tiene la clase Character para comprobar si existe un caracter en mayúscula
				if (Character.isUpperCase(arrayCaracteres[i])) {
					hayMayuscula = true;
				}

				// Utilizamos el metodo isLowerCase que tiene la clase de tipo Character para, comprobar si existe un caracter en minúscula
				if (Character.isLowerCase(arrayCaracteres[i])) {
					hayMinuscula = true;
				}

				// Utilizamos el metodo isDigit que tiene la clase Character para comprobar si existe un dígito
				if (Character.isDigit(arrayCaracteres[i])) {
					hayDigito = true;
				}

				// Si el valor del array es diferente a un dígito y a una letra, es un símbolo no alfanumérico
				if (!Character.isDigit(arrayCaracteres[i]) && !Character.isLetter(arrayCaracteres[i])) {
					haySimbolo = true;
				}

				// Para comprobar si la contraseña es válida o no, usabos banderas booleanas, si están en true, entonces es válida
				if (hayMayuscula && hayMinuscula && hayDigito && haySimbolo) {
					passwordCorrecta = true;
				}
			}

			// Mostramos en pantalla si la contraseña es válida o no
			System.out.println("La contraseña es correcta: " + passwordCorrecta);

			// Volvemos a poner las banderas en false
			hayMayuscula = false;
			hayMinuscula = false;
			hayDigito = false;
			haySimbolo = false;

		} while (!passwordCorrecta);

	}


}
