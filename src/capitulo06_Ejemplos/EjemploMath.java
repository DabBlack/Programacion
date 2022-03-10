package capitulo06_Ejemplos;

public class EjemploMath {

	public static void main(String[] args) {
		
		System.out.println("Valor de PI: " + Math.PI);
		System.out.println("\nValor de E: " + Math.E);
		
		// Métodos de interés
		System.out.println("\n\nMétodos básicos:");
		
		System.out.println("Máximo de dos números: " + Math.max(3, 4.5));
		System.out.println("\nMínimo de dos números: " + Math.min(3, 4.5));
		System.out.println("\nValor absoluto de -3: " + Math.abs(-3));
		System.out.println("\nRedondeo del número 3.5: " + Math.round(3.5));
		System.out.println("\nNúmero al azar entre 0 y 1: " + Math.random());
		
		System.out.println("\n\nPotenciación:");
		System.out.println("Potencia de base 25 y exponente 0.5 (raiz cuadrada de 25): " + Math.pow(25, 0.5));
		System.out.println("\nRaíz cuadrada de 9: " + Math.sqrt(9));
		System.out.println("\nRaíz cúbica de 27: " + Math.cbrt(27));
		System.out.println("\nPotencia del número E con exponente 10: " + Math.exp(10));
		System.out.println("\nHipotenusa de un triángulo rectánculo, dados dos de los catetos del mismo: " + Math.hypot(3, 4));
		
		System.out.println("\n\nLogaritmos: ");
		System.out.println("Logaritmo en base 10 del número 100: " + Math.log10(100));
		System.out.println("\nLogaritmo en base E de la potencia de base E y exponente 2: " + Math.log(Math.pow(Math.E,	2)));
		
		System.out.println("\n\nTrigonomatría: ");
		System.out.println("Paso de 90 grados a radianes: " + Math.toRadians(90));
		System.out.println("\nPaso de 1 radián a grados: " + Math.toDegrees(1));
		System.out.println("\nSeno del ángulo de 1 radián: " + Math.sin(1));
		System.out.println("\nCoseno del ángulo de 2 radianes: " + Math.cos(2));
		System.out.println("\nTangente del ángulo de 45 grados: " + Math.tan(Math.toRadians(45)));
		System.out.println("\nArcoseno del ángulo de 0.85 radianes: " + Math.asin(0.85));
		System.out.println("\nArcocoseno del ángulo de 0.15 radianes: " + Math.acos(0.15));
		System.out.println("\nArcotangente del ángulo de 45 grados: " + Math.atan(Math.toRadians(45)));
	}

}
