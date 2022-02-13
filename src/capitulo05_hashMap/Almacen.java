package capitulo05_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Almacen {

	public static HashMap<String, Articulo> hashMap = new HashMap<String, Articulo>();
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcion;
		
		// Menu
		
		do {
			System.out.println("\nMENU:\n" + "\na) Abandonar el programa.\n" + "b) Añadir un nuevo artículo al almacén.\n" + 
					"c) Borrar un artículo del almacén.\n" + "d) Actualizar el estante y el número de unidades en stock de un artículo.\n" +
					"e) Mostrar los artículos del almacén.\n");

			System.out.println("¿Qué desea hacer?");
			opcion = sc.next();

			switch (opcion) {
			case "a":
				System.out.println("El programa ha terminado.");
				break;

			case "b":
				System.out.println("Va a añadir un nuevo artículo en el almacén, introduzca los datos necesarios.\n");
				introducirNuevoArticulo();
				break;

			case "c":
				System.out.println("Va a elminar un artículo del almacen.\n");
				eliminarArticulo()
;				break;
				
			case "d":
				System.out.println("Va a modificar un árticulo del almacen.\n");
				actualizarArticulo();
				break;
			
			case "e":
				mostrarArticulos();
				break;
				
			default: 
				System.out.println("\nValor incorrecto, por favor, introduzca una opción incluida en el menú.");
			}

		} while (!(opcion.equals("a")));

	}
		
	/**
	 * 
	 */
	private static void introducirNuevoArticulo() {
		int numeroDeEstante, cantidadUnidadesStock;
		String codigoDeBarras;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el código de barras del artículo: ");
		codigoDeBarras = sc.nextLine();
		
		System.out.println("Introduce el número de estante del artículo: ");
		numeroDeEstante = sc.nextInt();
		
		System.out.println("Introduce la cantidad de unidades en stock del artículo: ");
		cantidadUnidadesStock = sc.nextInt();
		
		// Creamos el objeto de tipo Articulo
		Articulo articulo = new Articulo(numeroDeEstante, cantidadUnidadesStock, codigoDeBarras);

		// Metemos ese objeto dentro del HashMap
		hashMap.put(codigoDeBarras, articulo);
	}
	
	
	/**
	 * Metodo para eliminar un articulo que está dentro del HashMap
	 * 
	 */
	public static void eliminarArticulo() {
		Scanner sc = new Scanner(System.in);
		String codigoDeBarras;

		System.out.println("Introduzca el código del artículo que desea eliminar: ");
		codigoDeBarras = sc.nextLine();

		// Eliminamos el objeto que está dentro del HashMap  
		hashMap.remove(codigoDeBarras);
	}
	
	
	/**
	 * Metodo para actualizar los objetos de tipo Articulo que hay dentro del HashMap
	 * 
	 */
	public static void actualizarArticulo() {
		Scanner sc = new Scanner(System.in);
		int setNumeroDeEstante, cantidadUnidadesStock;
		String codigoDeBarras;

		System.out.println("Introduzca el código del artículo que desea modificiar: ");
		codigoDeBarras = sc.nextLine();

		System.out.println("Introduzca un nuevo número de estante: ");
		setNumeroDeEstante = sc.nextInt();

		System.out.println("Introduzca la nueva cantidad: ");
		cantidadUnidadesStock = sc.nextInt();

		// Creamos otro objeto de tipo Articulo y lo inicializamos con el valor que tiene esa key dentro del HashMap
		Articulo articulo = hashMap.get(codigoDeBarras);

		// Le asignamos los nuevos datos dados por el usuario
		articulo.setNumeroDeEstante(setNumeroDeEstante);
		articulo.setCantidadUnidadesStock(cantidadUnidadesStock);
	}
	
	
	/**
	 * Metodo para mostrar los elementos que hay dentro del HashMap
	 * 
	 */
	public static void mostrarArticulos() {
		Iterator it = hashMap.values().iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
