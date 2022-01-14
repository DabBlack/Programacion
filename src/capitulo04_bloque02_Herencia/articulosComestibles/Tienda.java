package capitulo04_bloque02_Herencia.articulosComestibles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {

		List<Articulos> listaArticulos = new ArrayList<Articulos>();
//		Articulos arrayArticulos[] = new Articulos[4];
		float precio;
		String nombre, fecha_Caducidad;
		int opcion, codigo, contador = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("********************\n" + " Tienda David Algar\n" + "********************");
			System.out.println("\nMENU:" + "\n0.- Salir del Programa"
					+ "\n1.- Introducir un producto perecedero (Maximo 4 productos en total)"
					+ "\n2.- Introducir un producto no perecedero (Maximo 4 productos en total)"
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
				if (contador < 4) {
					crearPerecedero(null);
					contador++;
				}

				else {
					System.out.println("\nNo puede introducir mas datos, elija otra opcion.\n");
				}

				break;
			}

			case 2: {
				if (contador < 4) {
					crearNoPerecedero(null);
					contador++;
				}

				else {
					System.out.println("\nNo puede introducir mas datos, elija otra opcion.\n");
				}

				break;
			}

			case 3: {
				System.out.println("\nLos productos son los siguientes: ");

				System.out.println("\n");
				break;
			}

			default:
				System.out.println("Valor erroneo introducido.");
			}

		} while (opcion != 0);

	}

	public static void crearPerecedero(List<Articulos>lista) {
		float precio;
		String nombre, fecha_Caducidad;
		int opcion, codigo, contador = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el nombre del producto:");
		nombre = sc.next();
		System.out.println("Introduzca el codigo del producto:");
		codigo = sc.nextInt();
		System.out.println("Introduzca el precio del producto:");
		precio = sc.nextFloat();
		System.out.println("Introduzca la fecha de caducidad del producto:");
		fecha_Caducidad = sc.next();
		System.out.println("Nombre: " + nombre + "  Codigo: " + codigo + "  Precio: " + precio + "€"
				+ "  Fecha de caducidad: " + fecha_Caducidad);
	}

	public static void crearNoPerecedero(List<Articulos>lista) {
		float precio;
		String nombre, fecha_Caducidad;
		int opcion, codigo, contador = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el nombre del producto:");
		nombre = sc.next();
		System.out.println("Introduzca el codigo del producto:");
		codigo = sc.nextInt();
		System.out.println("Introduzca el precio del producto:");
		precio = sc.nextFloat();
		System.out.println("Nombre: " + nombre + "  Codigo: " + codigo + "  Precio: " + precio + "€");
	}

}
