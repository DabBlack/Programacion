package capitulo07_Acceso_A_Datos.Ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		menuPrincipal();
	}

	public static void menuPrincipal () {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;  
				
		do {
			System.out.println("\nMenú Principal" + 
					"\n\t1.- Menú Fabricantes" +
					"\n\t2.- Menú Concesionarios" +
					"\n\t3.- Menú Clientes" + 
					"\n\t4.- Menú Coches" +
					"\n\t5.- Menú Ventas" +
					"\nIntroduzca su opción: ");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1: // Menú de fabricante
				menuFabricante();
				break;
			case 2: // Menú de concesionario
				menuConcesionario();
				break;
			case 3: // Menú de cliente
				menuCliente();
				break;
			case 4: // Menú de coche
				menuCoche();
				break;
			case 5: // Menú de venta
				menuVenta();
				break;
			}

		}while(opcion!=0);

	}
	
	/**
	 * 
	 */
	public static void menuFabricante () {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
				
		do {
			System.out.println("\n\nMenú Fabricante" + 
					"\n\t1.- Listar Fabricantes" +
					"\n\t2.- Nuevo Fabricante" +
					"\n\t3.- Modificar Fabricante" + 
					"\n\t4.- Eliminar Fabricante" +
					"\n\t5.- Volver al menú principal" +
					"\nIntroduzca su opción: ");
			
			opcion = sc.nextInt();
		
			switch(opcion) {
			case 1: // Listado de fabricantes
				GestionFabricante.listarFabricantes();
				break;
			case 2: // Nuevo fabricante
				GestionFabricante.nuevoFabricante();
				break;
			case 3: // Modificar fabricante
				GestionFabricante.modificarFabricante();
				break;
			case 4: // Eliminar fabricante
				GestionFabricante.eliminarFabricante();
				break;
			case 5: // Volver al menú principal
				menuPrincipal();
			break;
			}

		} while (opcion != 0);
	}

	/**
	 * 
	 */
	public static void menuConcesionario() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
				
		do {
			System.out.println("\n\nMenú Concesionarios" + 
					"\n\t1.- Listar Concesionarios" +
					"\n\t2.- Nuevo Concesionario" +
					"\n\t3.- Modificar Concesionario" + 
					"\n\t4.- Eliminar Concesionario" +
					"\n\t5.- Volver al menú principal" +
					"\nIntroduzca su opción: ");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1: // Listado de concesionarios
				GestionFabricante.listarFabricantes();
				break;
			case 2: // Nuevo concesionario
				GestionFabricante.nuevoFabricante();
				break;
			case 3: // Modificar concesionarios
				GestionFabricante.modificarFabricante();
				break;
			case 4: // Eliminar concesionarios
				GestionFabricante.eliminarFabricante();
				break;
			case 5: // Volver al menú principal
				menuPrincipal();
			break;
			}

		} while (opcion != 0);
	}
	
	/**
	 * 
	 */
	public static void menuCliente() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("\n\nMenú Clientes" + 
					"\n\t1.- Listar Clientes" +
					"\n\t2.- Nuevo Cliente" +
					"\n\t3.- Modificar Cliente" + 
					"\n\t4.- Eliminar Cliente" +
					"\n\t5.- Volver al menú principal" +
					"\nIntroduzca su opción: ");
			
			opcion = sc.nextInt();
						
			switch(opcion) {
			case 1: // Listado de clientes
				GestionFabricante.listarFabricantes();
				break;
			case 2: // Nuevo cliente
				GestionFabricante.nuevoFabricante();
				break;
			case 3: // Modificar cliente
				GestionFabricante.modificarFabricante();
				break;
			case 4: // Eliminar cliente
				GestionFabricante.eliminarFabricante();
				break;
			case 5: // Volver al menú principal
				menuPrincipal();
			break;
			}

		} while (opcion != 0);
	}
	
	/**
	 * 
	 */
	public static void menuCoche() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
				
		do {
			System.out.println("\n\nMenú Coches" + 
					"\n\t1.- Listar Coches" +
					"\n\t2.- Nuevo Coche" +
					"\n\t3.- Modificar Coche" + 
					"\n\t4.- Eliminar Coche" +
					"\n\t5.- Volver al menú principal" +
					"\nIntroduzca su opción: ");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1: // Listado de coches
				GestionFabricante.listarFabricantes();
				break;
			case 2: // Nuevo coche
				GestionFabricante.nuevoFabricante();
				break;
			case 3: // Modificar coche
				GestionFabricante.modificarFabricante();
				break;
			case 4: // Eliminar coche
				GestionFabricante.eliminarFabricante();
				break;
			case 5: // Volver al menú principal
				menuPrincipal();
			break;
			}

		} while (opcion != 0);
	}

	/**
	 * 
	 */
	public static void menuVenta() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
				
		do {
			System.out.println("\n\nMenú Ventas" + 
					"\n\t1.- Listar Ventas" +
					"\n\t2.- Nueva Venta" +
					"\n\t3.- Modificar Venta" + 
					"\n\t4.- Eliminar Venta" +
					"\n\t5.- Volver al menú principal" +
					"\nIntroduzca su opción: ");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1: // Listado de ventas
				GestionFabricante.listarFabricantes();
				break;
			case 2: // Nuevo venta
				GestionFabricante.nuevoFabricante();
				break;
			case 3: // Modificar venta
				GestionFabricante.modificarFabricante();
				break;
			case 4: // Eliminar venta
				GestionFabricante.eliminarFabricante();
				break;
			case 5: // Volver al menú principal
				menuPrincipal();
			break;
			}

		} while (opcion != 0);
	}
	
}
