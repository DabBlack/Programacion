package capitulo06_excepciones.Ejercicio01;

import java.util.Scanner;

public class PeticionDeNumeros {

	public static void main(String[] args) {
		
		try {
			pideNumeroPar();
		} 
		
		catch (NumeroNoParException e) {
			System.out.println("");
			System.out.println(e.getMessage());
		}
	}

	/**
	 * 
	 * @throws NumeroNoParException
	 */
	public static void pideNumeroPar() throws NumeroNoParException {
		int num;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduzca un número par: ");
			num = sc.nextInt();

			if (num % 2 != 0) {
				throw new NumeroNoParException("El número introducido es impar" + "\nEl programa ha acabado");
				
			}
			
			System.out.println("\nEl programa ha acabado");
			
		} while (num % 2 != 0);
	}
}