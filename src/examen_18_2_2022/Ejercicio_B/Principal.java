package examen_18_2_2022.Ejercicio_B;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {
public static HashMap<String, CromoBaloncesto> hashMap = new HashMap<String, CromoBaloncesto>();
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcion;
		
		// Menu
		
		do {
			System.out.println("\nMENU:\n" + "\na) Abandonar el programa.\n" + "b) Visualizar los valores de todos los cromos guardados.\n" + 
					 "c) Introducir un nuevo cromo guardado.\n" + "d) Eliminar un cromo, especificando su id numérico.\n" +
					"e) Imprimir en consola los datos del jugador o jugadora con más puntos obtenidos.\n");
			System.out.println("¿Qué desea hacer?");
			opcion = sc.next();

			switch (opcion) {
			case "a":
				System.out.println("El programa ha terminado.");
				break;

			case "b":
				mostrarCromos();
				break;

			case "c":
				System.out.println("Va a crear un nuevo cromo de baloncesto, introduzca los datos necesarios.\n");
				introducirNuevoCromo();
;				break;
				
			case "d":
				System.out.println("Va a elminar un cromo guardado.\n");
				eliminarCromo();
				break;
			
			case "e":
				mostrarElCromoConMasPuntos();
				break;
				
			default: 
				System.out.println("\nValor incorrecto, por favor, introduzca una opción incluida en el menú.");
			}

		} while (!(opcion.equals("a")));

	}
	
	/**
	 * Metodo para mostrar los elementos que hay dentro del HashMap
	 * 
	 */
	public static void mostrarCromos() {
		Iterator it = hashMap.values().iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
		
	
	/**
	 * Metodo para crear e introducir un nuevo cromo en el HashMap
	 */
	private static void introducirNuevoCromo() {
		String nombre;
		int idCromo, puntosJugador, rebotes;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número identificador del cromo de baloncesto: ");
		idCromo = sc.nextInt();
				
		System.out.println("Introduzca el número de puntos del jugador en la temporada pasada: ");
		puntosJugador = sc.nextInt();
		
		System.out.println("Introduzca la cantidad de número de rebores del jugador en la temporada pasada: ");
		rebotes = sc.nextInt();
		
		System.out.println("Introduzca el nombre del cromo de baloncesto: ");
		nombre = sc.next();
		
		// Creamos el objeto de tipo Articulo
		CromoBaloncesto cromoBaloncesto = new CromoBaloncesto(idCromo, puntosJugador, rebotes, nombre);

		// Metemos ese objeto dentro del HashMap
		hashMap.put(nombre, cromoBaloncesto);
	}
	
	
	/**
	 * Metodo para eliminar un articulo que está dentro del HashMap
	 * 
	 */
	public static void eliminarCromo() {
		Scanner sc = new Scanner(System.in);
		String nombre;

		System.out.println("Introduzca el nombre del cromo de baloncesto que desea eliminar: ");
		nombre = sc.nextLine();

		hashMap.remove(nombre);
	}
	

	/**
	 * Metodo para mostrar los elementos que hay dentro del HashMap
	 * 
	 */
	public static void mostrarElCromoConMasPuntos() {
		
		CromoBaloncesto cromoMayor = new CromoBaloncesto();
		CromoBaloncesto cromoBaloncesto = null;
		Iterator it = hashMap.values().iterator();
		
		while (it.hasNext()) {
			if(cromoBaloncesto.puntosJugador > cromoMayor.puntosJugador) {
				cromoMayor = cromoBaloncesto;
			}
		}
		System.out.println(cromoMayor);
	}
	
}
