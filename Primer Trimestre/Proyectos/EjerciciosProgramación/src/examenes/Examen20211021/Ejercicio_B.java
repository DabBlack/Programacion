package examenes.Examen20211021;

import java.util.Scanner;

public class Ejercicio_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int limiteSuperior, limiteInferior;
		
		System.out.println("Introduzca un limite inferior:");
		limiteInferior = sc.nextInt();
		
		while (limiteInferior > 0) {
			System.out.println("Valor no valido, vuelva a introducir un limite inferior:");
			limiteInferior = sc.nextInt();
		}
			
		System.out.println("Introduzca un limite superior:");
		limiteSuperior= sc.nextInt();
			
		while (limiteSuperior < 0) {
			System.out.println("Valor no valido, vuelva a introducir un limite superior:");
			limiteSuperior = sc.nextInt();
		}
				
		
		for (int i = 0; i <10 ; i++) {
			
			System.out.println(Math.round(Math.random() * (limiteSuperior - limiteInferior)) + limiteInferior);
			
			}
				
		}

	}


