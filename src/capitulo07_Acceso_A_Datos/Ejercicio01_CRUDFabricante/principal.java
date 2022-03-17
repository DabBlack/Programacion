package capitulo07_Acceso_A_Datos.Ejercicio01_CRUDFabricante;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;



public class principal {
	
	/*
	 * Metodo menu de gestión
	 */
	public static void menuGestion() {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		
		System.out.println("*********************************\n" + "\tCRUD David Algar\n" + "*********************************");
		
		do {
			try {
				System.out.println("\nMENÚ:" + "\n0.- Salir del Programa."
						+ "\n1.- Listar todos los registros de la tabla."
						+ "\n2.- Crear un nuevo fabricante."
						+ "\n3.- Modificar un fabricante."
						+ "\n4.- Eliminar un fabricante.");

				System.out.println("\n¿Que desea hacer?");
				sc = new Scanner(System.in);
				opcion = sc.nextInt();

				switch (opcion) {
				case 0: {
					System.out.println("El programa ha terminado.");
					break;
				}

				case 1: {
					System.out.println("\nVa a listar a todos los registros de la tabla.\n");
					listadoTabla(true);
					break;
				}

				case 2: {
					creacionFabricante();
					System.out.println("\nVa a crear un nuevo fabricante.\n");
					break;
				}

				case 3: {
					modificacionFabricante();
				System.out.println("\nVa a modificar un fabricante.\n");
					break;
				}

				case 4: {
					eliminacionFabricante();
					System.out.println("\nVa a eliminar un fabricante.\n");
					break;
				}
				
				default:
					System.out.println("Valor erroneo introducido.");
				}
				
			} catch (ErrorBBDDException e) {
				System.out.println("\n\t\t\tError de acceso a datos: " + e.getMessage() + "\n");
				e.printStackTrace();
			}
			
		} while (opcion != 0);
	}

	/*
	 * Main
	 */
	public static void main(String[] args) throws ImposibleConectarException {
		
		try {
			Connection conn = ConnectionManagerV1.getConexion();
		   
			System.out.println("Ejecutado");
			
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
		}
		
		
		menuGestion();
		

	}
	
	public static void listadoTabla (boolean pausafinal) throws ErrorBBDDException {
		
		List<Fabricante> fabricantes = ControladorFabricante.getAll();
		System.out.println("\n\tListado de fabricantes: \n");
		for (Fabricante fab : fabricantes) {
			System.out.println("\t" + fab.toString());
		}
		if (pausafinal) {
			System.out.println("\n\tPulse 'Intro' tecla para continuar");
			Utils.pausa();
		}
					
	}
	
	private static void creacionFabricante () throws ErrorBBDDException {
		System.out.println("\n\tAlta de fabricante\n");
		
		Fabricante fab = new Fabricante();
		System.out.print("\nIntroduzca el CIF del nuevo fabricante: ");
		fab.setCif(Utils.getStringConsola());
		System.out.print("\nIntroduzca el nombre del nuevo fabricante: ");
		fab.setNombre(Utils.getStringConsola());
		
		ControladorFabricante.almacenar(fab);  

		System.out.println("\n\tInsertado correctamente. Pulsa 'Intro' para continuar");
		Utils.pausa();
	}



	/**
	 * 
	 * @throws ErrorBBDDException
	 */
	private static void modificacionFabricante () throws ErrorBBDDException {
		System.out.println("\n\tModificacion de fabricante\n");
		
		Fabricante fab = seleccionPorUsuario();
		
		if (fab != null) {		
			System.out.print("\nIntroduzca el 'CIF' del fabricante ('Intro' para no modificar): ");
			String str = Utils.getStringConsola();
			if (!str.equals("")) 
				fab.setCif(str);
			System.out.print("\nIntroduzca el 'Nombre' del fabricante  ('Intro' para no modificar): ");
			str = Utils.getStringConsola();
			if (!str.equals("")) 
				fab.setNombre(str);
		
			ControladorFabricante.almacenar(fab);  

			System.out.println("\n\tModificado correctamente. Pulse 'Intro' para continuar");
			Utils.pausa();
		}
	}

	
	
	/*
	 *  Metodo eliminacion de fabricante
	 */
	private static void eliminacionFabricante () throws ErrorBBDDException {
		System.out.println("\n\tModificacion de fabricante\n");
		
		Fabricante fab = seleccionPorUsuario();
		
		if (fab != null) {		
			System.out.print("\nRealmente quieres eliminar el registro? (S/N): ");
			String str = Utils.getStringConsola();
			
			if (str.equalsIgnoreCase("S")) { 		 
				ControladorFabricante.eliminar(fab);  
				System.out.println("\n\tEliminado correctamente. Pulsa 'Intro' para continuar");
				Utils.pausa();
			}
			
		}
	}
	
	
	/*
	 * Metodo seleccion por usuario
	 */
	private static Fabricante seleccionPorUsuario () throws ErrorBBDDException {
		Fabricante fab = null;
		int id = -2;
		
		do {
			System.out.println("\n\tIntroduzca ID del fabricante ('-1' - ver listado, '0' - salir): ");
			id = Utils.getIntConsola(-1);
			
			if (id == -1) {
				listadoTabla(false);
			}
			else {
				
				if (id != 0) {
					fab = ControladorFabricante.get(id);
					if (fab == null) {
						System.out.println("\tError. Ha especificado un ID no valido.");
					}
				}
				
			}
			
		} while (fab == null && id != 0);
		return fab;
	}

}
