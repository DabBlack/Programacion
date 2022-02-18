package capitulo06_wrappers;

public class Ejercicio01_ImprimirTablaConLimitesMaxYMin {

	public static void main(String[] args) {

		// Para mostrar los valores mínimos utilizamos la variable estática MIN_VALUE
		System.out.println("\t - Valores mínimos: \n");
		System.out.println("Valor mínimo para byte: " + Byte.MIN_VALUE);
		System.out.println("Valor mínimo para int: " + Integer.MIN_VALUE);
		System.out.println("Valor mínimo para short: " + Short.MIN_VALUE);
		System.out.println("Valor mínimo para long: " + Long.MIN_VALUE);
		System.out.println("Valor mínimo para float: " + Float.MIN_VALUE);
		System.out.println("Valor mínimo para double: " + Double.MIN_VALUE);

		System.out.println();

		// Para mostrar los valores máximos utilizamos la variable estática MAX_VALUE
		System.out.println("\t - Valores máximos: \n");
		System.out.println("Valor máximo para byte: " + Byte.MAX_VALUE);
		System.out.println("Valor máximo para int: " + Integer.MAX_VALUE);
		System.out.println("Valor máximo para short: " + Short.MAX_VALUE);
		System.out.println("Valor máximo para long: " + Long.MAX_VALUE);
		System.out.println("Valor máximo para float: " + Float.MAX_VALUE);
		System.out.println("Valor máximo para double: " + Double.MAX_VALUE);

		System.out.println();

		// Para mostrar el tamaño en bytes utilizamos la variable estática SIZE
		System.out.println("\t - Número de bytes de cada tipo: \n");
		System.out.println("Para byte: " + Byte.SIZE);
		System.out.println("Para int: " + Integer.SIZE);
		System.out.println("Para short: " + Short.SIZE);
		System.out.println("Para long: " + Long.SIZE);
		System.out.println("Para float: " + Float.SIZE);
		System.out.println("Para double: " + Double.SIZE);
	}

}