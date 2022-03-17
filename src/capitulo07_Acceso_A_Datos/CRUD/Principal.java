package capitulo07_Acceso_A_Datos.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		System.out.println("*********************************\n" + "\tCRUD David Algar\n" + "*********************************");
		
		do {
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
				break;
			}

			case 2: {
				System.out.println("\nVa a crear un nuevo fabricante.\n");
				break;
			}

			case 3: {
			System.out.println("\nVa a modificar un fabricante.\n");
				break;
			}

			case 4: {
				System.out.println("\nVa a eliminar un fabricante.\n");
				break;
			}
			
			default:
				System.out.println("Valor erroneo introducido.");
			}

		} while (opcion != 0);
	
	}

	/**
	 * 
	 */
	private static void pruebaConsultaBasica () {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "Abcdefgh.1");
		
			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from coche");
		   
			while (rs.next()) { 
				System.out.println (rs.getInt("id") + " " + rs.getString (2)+ 
						" " + rs.getString(3) + " " + rs.getString(4) + 
						" " + rs.getString(5)); 
			}
			
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 */
	private static void pruebaConsultaPorFicheroDePropiedades () {
		
		String driver = JDBCPropiedades.getProperty("JDBC_DRIVER_CLASS");
		String user = JDBCPropiedades.getProperty("JDBC_USER");
		String password = JDBCPropiedades.getProperty("JDBC_PASSWORD");
		String host = JDBCPropiedades.getProperty("JDBC_HOST");
		String schema = JDBCPropiedades.getProperty("JDBC_SCHEMA_NAME");
		String properties = JDBCPropiedades.getProperty("JDBC_PROPERTIES");
		
		try {
			Class.forName(driver);
		   
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://" + host + "/" + schema + properties, user, password);
		   
			Statement s = (Statement) conexion.createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from coche");
		   
			while (rs.next()) { 
				System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getString(3)); 
			}
			
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql.");
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
		}
	}
	
}
