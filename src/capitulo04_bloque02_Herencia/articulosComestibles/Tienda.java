package capitulo04_bloque02_Herencia.articulosComestibles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {

		List<Articulo> listaArticulos = new ArrayList<Articulo> ();
		int opcion, contadorPerecedero = 0, contadorNoPerecedero = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("********************\n" + " Tienda David Algar\n" + "********************");
			System.out.println("\nMENU:" + "\n0.- Salir del Programa"
					+ "\n1.- Introducir un articulo perecedero (Maximo 2 articulos perecederos)"
					+ "\n2.- Introducir un articulo no perecedero (Maximo 2 articulos no perecederos)"
					+ "\n3.- Mostrar los productos introducidos");

			System.out.println("\n¿Que desea hacer?");
			sc = new Scanner(System.in);
			opcion = sc.nextInt();

			switch (opcion) {

			case 0: {
				System.out.println("El programa ha terminado.");
				break;
			}

			case 1: {
				if (contadorPerecedero < 2) {
					crearPerecedero(listaArticulos);
					contadorPerecedero++;
				}
				else {
					System.out.println("\nNo puede introducir mas articulos perecederos, elija otra opcion.\n");
				}
				break;
			}

			case 2: {
				if (contadorNoPerecedero < 2) {
					crearNoPerecedero(listaArticulos);
					contadorNoPerecedero++;
				}
				else {
					System.out.println("\nNo puede introducir mas articulos no perecederos, elija otra opcion.\n");
				}
				break;
			}

			case 3: {
				System.out.println("\nLos articulos introducidos son los siguientes: ");
				for (int i = 0; i < listaArticulos.size(); i++) {
					System.out.println(i + ".\t" + listaArticulos.get(i) + " ");
				}

				break;
			}

			default:
				System.out.println("Valor erroneo introducido.");
			}

		} while (opcion != 0);

	}

	
	/**
	 * 
	 * @param listaArticulos
	 */
	public static void crearPerecedero(List<Articulo> listaArticulos) {
		float precio;
		String nombre, fecha_Caducidad;
		int codigo;
		Scanner sc = new Scanner(System.in);
		Articulo_Perecedero perecedero = new Articulo_Perecedero();

		System.out.println("Introduzca el nombre del articulo:");
		nombre = sc.next();
		perecedero.setNombre(nombre);
		
		System.out.println("Introduzca el codigo del articulo:");
		codigo = sc.nextInt();
		perecedero.setCodigo(codigo);
		
		System.out.println("Introduzca el precio del producto:");
		precio = sc.nextFloat();
		perecedero.setPrecio(precio);
		
		System.out.println("Introduzca la fecha de caducidad del articulo:");
		fecha_Caducidad = sc.next();
		perecedero.setFecha_Caducidad(fecha_Caducidad);
		
		listaArticulos.add(perecedero);
		
		System.out.println("\nNombre: " + nombre + "  Codigo: " + codigo + "  Precio: " + precio + "€"
				+ "  Fecha de caducidad: " + fecha_Caducidad);
	}

	
	/**
	 * 
	 * @param listaArticulos
	 */
	public static void crearNoPerecedero(List<Articulo> listaArticulos) {
		float precio;
		String nombre;
		int codigo;
		Scanner sc = new Scanner(System.in);
		Articulo_No_Perecedero noPerecedero = new Articulo_No_Perecedero();
		
		System.out.println("Introduzca el nombre del articulo:");
		nombre = sc.next();
		noPerecedero.setNombre(nombre);
		
		System.out.println("Introduzca el codigo del articulo:");
		codigo = sc.nextInt();
		noPerecedero.setCodigo(codigo);
		
		System.out.println("Introduzca el precio del articulo:");
		precio = sc.nextFloat();
		noPerecedero.setPrecio(precio);
		
		listaArticulos.add(noPerecedero);
		
		System.out.println("\nNombre: " + nombre + "  Codigo: " + codigo + "  Precio: " + precio + "€\n");
	}

}
