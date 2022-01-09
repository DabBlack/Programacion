package capitulo05_bloque08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio02_listaString {

	public static void main(String[] args) {
		
		// Declaracion de variables
		String opcion;

		List<String> texto = new ArrayList<String>();
		List<String> portapapeles = new ArrayList<String>();

		// Este bucle repite el switch hasta que se introduzca el valor "a"
		do {
			System.out.println("\nMENU:\n" + "\na) Abandonar el programa.\n" + "b) Agregar una linea al texto.\n" + "c) Insertar una linea en una determinada posicion de la lista.\n" + 
					"d) Editar una linea.\n" + "e) Borrar una linea.\n" + "f) Cortar un conjunto de lineas.\n" + "g) Pegar un conjunto de lineas cortadas en una determinada posicion.\n" + 
					"h) Mostrar la lista de texto.");

			Scanner sc = new Scanner(System.in);
			opcion = sc.next();

			switch (opcion) {
			case "a":
				System.out.println("El programa ha terminado.");
				break;

			case "b":
				// Añadir una nueva linea de texto introducida por el usuario
				nuevaLineaDeTexto(texto);
				break;

			case "c":
				// Añadir una nueva linea de texto introducida por el usuario en una determinada posicion de la lista
				// introducida por el usuario
				nuevaLineaEnUnaPosicion(texto);
				break;

			case "d":
				// Editar una linea de texto indicada por el usuario
				editarUnaLinea(texto);
				break;

			case "e":
				// Eliminar una linea de texto indicada por el usuario
				borrarLinea(texto);
				break;

			case "f":
				// Cortar (elimina) un conjunto de lineas indicadas por el usuario y las guarda en el portapapeles
				cortarLineas(texto, portapapeles);
				break;

			case "g":
				// Pegar en una determinada posicion de la lista indicada por el usuario las lineas cortadas
				// y guardadas con el metodo "cortarLineas" en el portapapeles
				pegarLineas(texto, portapapeles);
				break;

			case "h":
				// Mostrar la lista con el texto
				mostrarTexto(texto);
				break;
			}

		} while (!(opcion.equals("a")));
	}

	
	/**
	 * Metodo que añade una nueva linea de texto introducida por el usuario
	 * @param l
	 */
	public static void nuevaLineaDeTexto(List<String> l) {
		System.out.println("Introduzca el texto que desea añadir a la linea: ");
		Scanner sc = new Scanner(System.in);
		String linea = sc.nextLine();

		l.add(linea);
	}

	
	/**
	 * Metodo que muestra el texto que hay en la lista
	 * @param l
	 */
	public static void mostrarTexto (List<String> l) {
		for (int i = 0; i < l.size(); i++) {
			System.out.println(i + ".\t" + l.get(i) + " ");
		}
	}

	
	/**
	 * Metodo que añade una nueva linea de texto introducida por el usuario en una determinada posicion de la lista
	 * introducida por el usuario
	 * @param l
	 */
	public static void nuevaLineaEnUnaPosicion (List<String> l) {
		System.out.println("Introduzca el texto que desea añadir a la linea: ");
		Scanner sc = new Scanner(System.in);
		String linea = sc.nextLine();

		System.out.println("¿En que posicion desea añadir la linea que acaba de escribir?");
		sc = new Scanner(System.in);
		int indice = sc.nextInt();

		l.add(indice, linea);
	}

	
	/**
	 * Metodo que edita una linea indicada por el usuario
	 * @param l
	 */
	public static void editarUnaLinea (List<String> l) {
		System.out.println("¿Que linea desea reescribir?");
		Scanner sc = new Scanner(System.in);
		int indice = sc.nextInt();

		l.remove(indice);

		System.out.println("Introduzca el texto que desea añadir a la linea: ");
		sc = new Scanner(System.in);
		String linea = sc.nextLine();

		l.add(indice, linea);

	}

	
	/**
	 * Metodo que elimina una linea indicada por el usuario
	 * @param l
	 */
	public static void borrarLinea (List<String> l) {
		System.out.println("¿Que linea desea borrar?");
		Scanner sc = new Scanner(System.in);
		int indice = sc.nextInt();

		l.remove(indice);

	}

	
	/**
	 * Metodo que corta (elimina) un conjunto de lineas indicadas por el usuario y las guarda en el portapapeles
	 * @param l
	 * @param cortar
	 */
	public static void cortarLineas (List<String> l, List<String> cortar) {
		System.out.println("¿Desde que linea desea cortar?");
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();

		System.out.println("¿Hasta que linea desea cortar?");
		sc = new Scanner(System.in);
		int max = sc.nextInt();

		for (int i = max; i >= min; i--) {
			cortar.add(0, l.get(i));
			l.remove(i);
		}
	}

	
	/**
	 * Este metodo pega en una determinada posicion de la lista indicada por el usuario las lineas cortadas 
	 * y guardadas con el metodo "cortarLineas" en el portapapeles
	 * @param l
	 * @param pegar
	 */
	public static void pegarLineas (List<String> l, List<String> pegar) {
		System.out.println("Las lineas almacenadas en el portapapeles son:");

		for (int i = 0; i < pegar.size(); i++) {
			System.out.println(pegar.get(i));
		}

		System.out.println("¿En que posicion desea pegar las lineas?:");
		Scanner sc = new Scanner(System.in);
		int indice = sc.nextInt();

		l.addAll(indice, pegar);

		pegar.clear();
	}

}
