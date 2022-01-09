package capitulo05_bloque08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio01_listaInteger {

	public static void main(String[] args) {
		// Declaracion de variables
		String opcion;

		// Creacion de la lista de numeros tipo Integer
		List<Integer> numeros = new ArrayList<Integer> ();

		// Con este bucle repetiremos el switch hasta que introduzcamos el valor "a"
		do {
			System.out.println("\nMENU:\n" + "\na) Abandonar el programa.\n" + "b) Crear aleatoriamente la lista de valores.\n" + "c) Calcular la suma, la media, el mayor y el menor.\n" +
					"d) Agregar una cantidad de valores nuevos.\n" + "e) Eliminar elementos cuyo valor este en un intervalo.\n" + "f) Imprimir la lista.\n");

			Scanner sc = new Scanner(System.in);
			opcion = sc.next();

			switch (opcion) {
			case "a":
				System.out.println("El programa ha terminado.");
				break;

			case "b":
				numeros.clear();
				// Este metodo crea la lista con numeros dentro de un intervalo entre un minimo y un maximo indicado por el usuario
				crearLista(numeros);
				break;

			case "c":
				// Este metodo hace la suma, la media, el mayor y el menor de los numeros de la lista
				sumaMediaMayorMenor(numeros);
				break;

			case "d":
				// Este metodo añade nuevos valores
				anadirNuevosValores(numeros);
				break;

			case "e":
				// Este metodo elimina numeros de la lista dentro de un intervalo de posiciones indicado por el usuario
				eliminarIntervalo(numeros);
				break;

			case "f":
				// Este metodo muestra la lista en pantalla
				mostrarLista(numeros);
				break;

			}

		} while (!(opcion.equals("a")));

	}

	
	/**
	 * Metodo para crear la lista
	 * @param l
	 */
	public static void crearLista (List<Integer> l) {

		System.out.println("¿Cuantos numeros desea añadir?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("Introduzca un valor minimo");
		sc = new Scanner(System.in);
		int min = sc.nextInt();

		System.out.println("Introduzca un valor maximo");
		sc = new Scanner(System.in);
		int max = sc.nextInt();

		// Numeros aleatorios entre el maximo y el minimo introducido por el usuario
		for (int i = 0; i < num; i++) {
			l.add(new Integer((int) Math.round(Math.random() * (max - min) + min)));
		}
	}
	
	
	/**
	 * Metodo para mostrar la lista
	 * @param l
	 */
	public static void mostrarLista (List<Integer> l) {
		
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i).intValue() + " ");
		}
	}

	
	/**
	 * Metodo para calcular la suma, la media, el mayor y el menos de los numeros de la lista
	 * @param l
	 */
	public static void sumaMediaMayorMenor (List<Integer> l) {
		// Declaracion de variables
		float suma = 0, media;
		int mayor = l.get(0), menor = l.get(0);
		
		for (int i = 0; i < l.size(); i++) {
			suma += l.get(i);

			if (l.get(i) > mayor) {
				mayor = l.get(i);
			}

			if (l.get(i) < menor) {
				menor = l.get(i);
			}
		}
		
		System.out.println("La suma es " + suma);

		media = suma / l.size();
		System.out.println("La media es " + media);

		System.out.println("El numero mayor es " + mayor + " y el numero menor es " + menor);
	}

	/**
	 * Metodo para añadir nuevos valores a la lista
	 * @param l
	 */
	public static void anadirNuevosValores (List<Integer> l) {
		
		List<Integer> nuevos = new ArrayList<Integer>();
		crearLista(nuevos);
		System.out.println("¿En que posicion desea añadir los nuevos valores?");

		Scanner sc = new Scanner(System.in);
		int posicion = sc.nextInt();
		l.addAll(posicion, nuevos);
	}

	/**
	 * Metodo para eliminar numeros de la lista dentro de un intervalo de posiciones de la lista indicado por el usuario
	 * @param l
	 */
	public static void eliminarIntervalo(List<Integer> l) {
		System.out.println("Introduzca el indice menor del intervalo que desea eliminar: ");
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();

		System.out.println("Introduzca el indice mayor del intervalo que desea eliminar: ");
		sc = new Scanner(System.in);
		int max = sc.nextInt();

		int n = 0;

		for (int i = max; i >= min; i--) {
			l.remove(i);
			n++;
		}

		System.out.println("Ha eliminado " + n + " numeros");
	}

}
