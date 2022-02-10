package capitulo05_hashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Almacen {

	public static HashMap<String, Articulo> hashMap = new HashMap<String, Articulo>();
	
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
				System.out.println("Va a añadir un nuevo artículo en el almacén, introduzca los datos necesarios.");
				break;

			case "c":
				break;
				
			case "d":
				break;
			
			case "e":
				break;
				
			default: 
				System.out.println("\nValor incorrecto, por favor, introduzca una opción incluida en el menú.");
			}

		} while (!(opcion.equals("a")));

	}
		
	private static void introducirNuevoArticulo (List<Articulo> listaArticulos) {
		int codigoDeBarras, numeroDeEstante, cantidadUnidadesStock;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el código de barras del artículo: ");
		codigoDeBarras = sc.nextInt();
		
		
		System.out.println("Introduce el número de estante del artículo: ");
		numeroDeEstante = sc.nextInt();
		
		System.out.println("Introduce la cantidad de unidades en stock del artículo: ");
		cantidadUnidadesStock = sc.nextInt();
	}
	
}
