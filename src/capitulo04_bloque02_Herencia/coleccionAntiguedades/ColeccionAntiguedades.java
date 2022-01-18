package capitulo04_bloque02_Herencia.coleccionAntiguedades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		
		List<Antiguedad> listaAntiguedades = new ArrayList<Antiguedad> ();
		int opcion, contadorJoyas = 0, contadorLibros= 0, contadorEsculturas = 0, contadorCuadros = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("**************************\n" + " Antiguedades David Algar\n" + "**************************");
			System.out.println("\nMENU:" + "\n0.- Salir del Programa"
					+ "\n1.- Introducir una joya (Maximo 2 joyas)"
					+ "\n2.- Introducir un libro (Maximo 2 libros)"
					+ "\n3.- Introducir una escultura (Maximo 2 esculturas)"
					+ "\n4.- Introducir un cuadro (Maximo 2 cuadros)" 
					+ "\n5.- Mostrar las antiguedades introducidas");

			System.out.println("\n¿Que desea hacer?");
			sc = new Scanner(System.in);
			opcion = sc.nextInt();

			switch (opcion) {

			case 0: {
				System.out.println("El programa ha terminado.");
				break;
			}

			case 1: {
				if (contadorJoyas < 2) {
					crearJoya(listaAntiguedades);
					contadorJoyas++;
				}
				else {
					System.out.println("\nNo puede introducir mas joyas, elija otra opcion.\n");
				}
				break;
			}

			case 2: {
				if (contadorLibros < 2) {
					crearLibro(listaAntiguedades);
					contadorLibros++;
				}
				else {
					System.out.println("\nNo puede introducir mas libros, elija otra opcion.\n");
				}
				break;
			}

			case 3: {
				if (contadorEsculturas < 2) {
					crearEscultura(listaAntiguedades);
					contadorEsculturas++;
				}
				else {
					System.out.println("\nNo puede introducir mas esculturas, elija otra opcion.\n");
				}
				break;
			}

			case 4: {
				if (contadorCuadros < 2) {
					crearCuadro(listaAntiguedades);
					contadorCuadros++;
				}
				else {
					System.out.println("\nNo puede introducir mas cuadros, elija otra opcion.\n");
				}
				break;
			}

			case 5: {
				System.out.println("\nLas antiguedades introducidas son las siguientes: ");
				for (int i = 0; i < listaAntiguedades.size(); i++) {
					System.out.println(i + ".\t" + listaAntiguedades.get(i) + " ");
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
	 * @param listaAntiguedades
	 */
	public static void crearJoya(List<Antiguedad> listaAntiguedades) {
		
		int añoFabricacion;
		String origen, material, tipo;
		float precio, peso_gramos;
		Scanner sc = new Scanner(System.in);
		AntiguedadJoya joya= new AntiguedadJoya();

		System.out.println("Introduzca el año de fabricacion de la joya:");
		añoFabricacion = sc.nextInt();
		joya.setAñoFabricacion(añoFabricacion);
		
		System.out.println("Introduzca el origen de la joya:");
		origen = sc.next();
		joya.setOrigen(origen);
		
		System.out.println("Introduzca el precio de la joya:");
		precio = sc.nextFloat();
		joya.setPrecio(precio);
		
		System.out.println("Introduzca el material del que se compone la joya:");
		material = sc.next();
		joya.setMaterial(material);
		
		System.out.println("Introduzca el tipo de joya que es:");
		tipo = sc.next();
		joya.setTipo(tipo);
		
		System.out.println("Introduzca el peso de la joya en gramos:");
		peso_gramos = sc.nextFloat();
		joya.setPeso_gramos(peso_gramos);
		
		listaAntiguedades.add(joya);
		
		System.out.println("\nJoya:   Año de fabricacion: " + añoFabricacion+ "  Origen: " + origen + "  Precio: " 
		+ precio + "€" + "  Material: " + material + "  Tipo de Joya: " + tipo + "  Peso en Gramos: " + peso_gramos + " gramos");
	}

	
	/**
	 * 
	 * @param listaAntiguedades
	 */
	public static void crearLibro(List<Antiguedad> listaAntiguedades) {
		
		int añoFabricacion;
		String origen, autor, nombreLibro;
		float precio;
		int numeroPaginas;
		Scanner sc = new Scanner(System.in);
		AntiguedadLibro libro= new AntiguedadLibro();

		System.out.println("Introduzca el año en el que se escribio el libro:");
		añoFabricacion = sc.nextInt();
		libro.setAñoFabricacion(añoFabricacion);
		
		System.out.println("Introduzca el origen del libro:");
		origen = sc.next();
		libro.setOrigen(origen);
		
		System.out.println("Introduzca el precio del libro:");
		precio = sc.nextFloat();
		libro.setPrecio(precio);
		
		System.out.println("Introduzca el autor del libro:");
		autor = sc.next();
		libro.setAutor(autor);
		
		System.out.println("Introduzca el nombre del libro:");
		nombreLibro = sc.next();
		libro.setNombreLibro(nombreLibro);
		
		System.out.println("Introduzca el numero de paginas del libro:");
		numeroPaginas = sc.nextInt();
		libro.setNumeroPaginas(numeroPaginas);
		
		listaAntiguedades.add(libro);
		
		System.out.println("\nLibro:   Año en el que se escribio: " + añoFabricacion+ "  Origen: " + origen + "  Precio: " 
		+ precio + "€" + "  Autor: " + autor + "  Nombre del Libro: " + nombreLibro + "  Numero de paginas: " + numeroPaginas);
	}
	

	/**
	 * 
	 * @param listaAntiguedades
	 */
	public static void crearEscultura(List<Antiguedad> listaAntiguedades) {
		
		int añoFabricacion;
		String origen, nombre, escultor, material;
		float precio;
		Scanner sc = new Scanner(System.in);
		AntiguedadEscultura escultura= new AntiguedadEscultura();

		System.out.println("Introduzca el año en el que se esculpio la escultura:");
		añoFabricacion = sc.nextInt();
		escultura.setAñoFabricacion(añoFabricacion);
		
		System.out.println("Introduzca el origen de la escultura:");
		origen = sc.next();
		escultura.setOrigen(origen);
		
		System.out.println("Introduzca el precio de la escultura:");
		precio = sc.nextFloat();
		escultura.setPrecio(precio);
		
		System.out.println("Introduzca el nombre de la escultura:");
		nombre= sc.next();
		escultura.setNombre(nombre);
		
		System.out.println("Introduzca el escultor de la escultura:");
		escultor = sc.next();
		escultura.setEscultor(escultor);
		
		System.out.println("Introduzca el material de la escultura:");
		material = sc.next();
		escultura.setMaterial(material);
		
		listaAntiguedades.add(escultura);
		
		System.out.println("\nEscultura:   Año en el que se esculpio: " + añoFabricacion+ "  Origen: " + origen + "  Precio: " 
		+ precio + "€" + "  Nombre de la escultura: " + nombre + "  Escultor de la escultura: " + nombre 
		+ "  Material: " + material);
	}

	
	/**
	 * 
	 * @param listaAntiguedades
	 */
	public static void crearCuadro(List<Antiguedad> listaAntiguedades) {
		
		int añoFabricacion;
		String origen, epoca, tecnica, pintor;
		float precio;
		Scanner sc = new Scanner(System.in);
		AntiguedadCuadro cuadro= new AntiguedadCuadro();

		System.out.println("Introduzca el año en el que se pinto le cuadro:");
		añoFabricacion = sc.nextInt();
		cuadro.setAñoFabricacion(añoFabricacion);
		
		System.out.println("Introduzca el origen del cuadro:");
		origen = sc.next();
		cuadro.setOrigen(origen);
		
		System.out.println("Introduzca el precio del cuadro:");
		precio = sc.nextFloat();
		cuadro.setPrecio(precio);
		
		System.out.println("Introduzca la epoca del cuadro:");
		epoca= sc.next();
		cuadro.setEpoca(epoca);
		
		System.out.println("Introduzca el escultor de la escultura:");
		tecnica = sc.next();
		cuadro.setTecnica(tecnica);
		
		System.out.println("Introduzca el material de la escultura:");
		pintor = sc.next();
		cuadro.setPintor(pintor);
		
		listaAntiguedades.add(cuadro);
		
		System.out.println("\nCuadro:   Año en el que se pinto: " + añoFabricacion+ "  Origen: " + origen + "  Precio: " 
		+ precio + "€" + "  Epoca del cuadro: " + epoca+ "  Tecnica usada: " + tecnica + "  Pintor: " + pintor);
	}

}
