package capitulo05_bloque08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio02_listaString {

	public static void main(String[] args) {
		String opcion;

		List<String> texto = new ArrayList<String>();
		List<String> portapapeles = new ArrayList<String>();

		do {
			System.out.println("\nMENU:\n" + "a) Abandonar el programa.\n" + "b) Agregar una linea al texto.\n" + "c) Insertar una linea en cualquier posicion del texto.\n" + 
					"d) Editar una linea.\n" + "e) Borrar una linea.\n" + "f) Cortar un conjunto de lineas.\n" + "g) Pegar un conjunto de lineas cortadas en una determinada posicion.\n" + 
					"h) Imprimir el fichero.");

			Scanner sc = new Scanner(System.in);
			opcion = sc.next();

			switch (opcion) {
			case "a":
				break;

			case "b":
				nuevaLinea(texto);
				break;

			case "c":
				nuevaLineaEnPosicion(texto);
				break;

			case "d":
				editarLinea(texto);
				break;

			case "e":
				borrarLinea(texto);
				break;

			case "f":
				cortarLineas(texto, portapapeles);
				break;

			case "g":
				pegarLineas(texto, portapapeles);
				break;

			case "h":
				mostrarTexto(texto);
				break;
			}

		} while (!(opcion.equals("a")));
	}

	public static void nuevaLinea(List<String> l) {
		System.out.println("Introduce el texto que quieras añadir a la línea: ");
		Scanner sc = new Scanner(System.in);
		String linea = sc.nextLine();

		l.add(linea);
	}

	public static void mostrarTexto(List<String> l) {
		for (int i = 0; i < l.size(); i++) {
			System.out.println(i + ".\t" + l.get(i) + " ");
		}
	}

	public static void nuevaLineaEnPosicion(List<String> l) {
		System.out.println("Introduce el texto que quieras añadir a la línea: ");
		Scanner sc = new Scanner(System.in);
		String linea = sc.nextLine();

		System.out.println("¿En qué posición quieres añadir la línea?");
		sc = new Scanner(System.in);
		int indice = sc.nextInt();

		l.add(indice, linea);
	}

	public static void editarLinea(List<String> l) {
		System.out.println("¿Qué línea quieres reescribir?");
		Scanner sc = new Scanner(System.in);
		int indice = sc.nextInt();

		l.remove(indice);

		System.out.println("Introduce el texto que quieras añadir a la línea: ");
		sc = new Scanner(System.in);
		String linea = sc.nextLine();

		l.add(indice, linea);

	}

	public static void borrarLinea(List<String> l) {
		System.out.println("¿Qué línea quieres borrar?");
		Scanner sc = new Scanner(System.in);
		int indice = sc.nextInt();

		l.remove(indice);

	}

	public static void cortarLineas(List<String> l, List<String> cortar) {
		System.out.println("¿Desde qué línea quieres cortar?");
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();

		System.out.println("¿Hasta qué línea quieres cortar?");
		sc = new Scanner(System.in);
		int max = sc.nextInt();

		for (int i = max; i >= min; i--) {
			cortar.add(0, l.get(i));
			l.remove(i);
		}
	}

	public static void pegarLineas(List<String> l, List<String> pegar) {
		System.out.println("Las líneas que hay en el portapapeles son las siguientes:");

		for (int i = 0; i < pegar.size(); i++) {
			System.out.println(pegar.get(i));
		}

		System.out.println("¿En qué posición quieres pegarlas?:");
		Scanner sc = new Scanner(System.in);
		int indice = sc.nextInt();

		l.addAll(indice, pegar);

		pegar.clear();

	}

}
