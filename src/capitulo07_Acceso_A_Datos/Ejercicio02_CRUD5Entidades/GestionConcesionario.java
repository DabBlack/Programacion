package capitulo07_Acceso_A_Datos.Ejercicio02_CRUD5Entidades;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GestionConcesionario extends SupertipoGestion {

	/**
	 * 
	 */
	public static void eliminarConcesionario() {
		Scanner sc = new Scanner(System.in);
		int id = 0;

		System.out.println("Introduce id del concesionario para su eliminación: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			int registrosAfectados = s.executeUpdate("delete from concesionario where id=" + id);
			System.out.println(registrosAfectados + " registros eliminados");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	public static void modificarConcesionario() {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		String cif = "", nombre = "", localidad = "";
		String nuevoCif = "", nuevoNombre = "", nuevaLocalidad = "";

		System.out.println("Introduce id del concesionario: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select * from concesionario where id=" + id);
			if (rs.next()) {
				cif = rs.getString("cif");
				nombre = rs.getString("nombre");
				localidad = rs.getString("localidad");
			}

			nuevoCif = JOptionPane.showInputDialog("Cif (" + cif + ") (Intro para mantener): ");
			if (!nuevoCif.trim().equals("")) {
				cif = nuevoCif;
			}

			nuevoNombre = JOptionPane.showInputDialog("Nombre (" + nombre + ") (Intro para mantener): ");
			;
			if (!nuevoNombre.trim().equals("")) {
				nombre = nuevoNombre;
			}
			
			nuevaLocalidad= JOptionPane.showInputDialog("Localidad (" + localidad + ") (Intro para mantener): ");
			;
			if (!nuevaLocalidad.trim().equals("")) {
				localidad = nuevaLocalidad;
			}

			int registrosAfectados = s.executeUpdate(
					"update fabricante set cif='" + cif + "', nombre='" + nombre + "' " + localidad + "' " + "where id=" + id);
			System.out.println(registrosAfectados + " registros afectados");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	public static void nuevoConcesionario() {
		Scanner sc = new Scanner(System.in);
		String cif, nombre, localidad;
		int nuevoIdDisponible;

		System.out.println("Creación de un nuevo concesionario:");
		System.out.println("Dame el cif:");
		cif = sc.next();
		sc.nextLine();
		System.out.println("Dame el nombre:");
		nombre = sc.nextLine();
		System.out.println("Dame la localidad:");
		localidad = sc.nextLine();
	
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			nuevoIdDisponible = maxIdEnTabla("concesionario");
			if (nuevoIdDisponible != -1) {
				int registrosAfectados = s.executeUpdate(
						"insert into concesionario values (" + nuevoIdDisponible + ",'" + cif + "', '" + nombre + "', '" + localidad + "')");
				System.out.println(registrosAfectados + " registros insertados ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public static void listarConcesionarios() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from concesionario");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) { 
				for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

}
