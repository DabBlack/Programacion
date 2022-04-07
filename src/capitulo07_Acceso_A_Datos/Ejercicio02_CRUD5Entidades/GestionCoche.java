package capitulo07_Acceso_A_Datos.Ejercicio02_CRUD5Entidades;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GestionCoche extends SupertipoGestion {

	/**
	 * 
	 */
	public static void eliminarCoche() {
		Scanner sc = new Scanner(System.in);
		int id = 0;

		System.out.println("Introduce id del coche para su eliminación: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			int registrosAfectados = s.executeUpdate("delete from coche where id=" + id);
			System.out.println(registrosAfectados + " registros eliminados");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	public static void modificarCoche() {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		String bastidor = "", modelo = "", color = "";
		String nuevoBastidor = "", nuevoModelo= "", nuevoColor = "";

		System.out.println("Introduce id del coche: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select * from coche where id=" + id);
			if (rs.next()) {
				bastidor = rs.getString("bastidor");
				modelo = rs.getString("modelo");
				color = rs.getString("color");

			}

			nuevoBastidor = JOptionPane.showInputDialog("bastidor (" + bastidor + ") (Intro para mantener): ");
			;
			if (!nuevoBastidor.trim().equals("")) {
				bastidor = nuevoBastidor;
			}
			
			nuevoModelo= JOptionPane.showInputDialog("modelo (" + modelo + ") (Intro para mantener): ");
			;
			if (!nuevoModelo.trim().equals("")) {
				modelo = nuevoModelo;
			}
			
			nuevoColor = JOptionPane.showInputDialog("color (" + color + ") (Intro para mantener): ");
			if (!nuevoColor.trim().equals("")) {
				color = nuevoColor;
			}

			int registrosAfectados = s.executeUpdate(
					"update coche set bastidor='" + bastidor + "', modelo='" + modelo + "', color='" + color + "' where id=" + id);
			System.out.println(registrosAfectados + " registros afectados");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	public static void nuevoCoche() {
		Scanner sc = new Scanner(System.in);
		String bastidor, modelo, color;
		int nuevoIdDisponible, idfabricante;

		System.out.println("Creación de un nuevo coche:");
		System.out.println("Dame el id del fabricante:");
		idfabricante = sc.nextInt();
		System.out.println("Dame el bastidor:");
		bastidor = sc.next();
		System.out.println("Dame el modelo:");
		modelo = sc.next();
		System.out.println("Dame el color:");
		color = sc.next();
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			nuevoIdDisponible = maxIdEnTabla("coche");
			if (nuevoIdDisponible != -1) {
				int registrosAfectados = s.executeUpdate(
						"insert into coche values (" + nuevoIdDisponible + "," + idfabricante + ", '" + bastidor + "' ,'" + modelo + "','"  + color + "')");
				System.out.println(registrosAfectados + " registros insertados ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public static void listarCoche() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from coche");
		   
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
