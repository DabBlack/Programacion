package capitulo07_Acceso_A_Datos.Ejercicio02_CRUD5Entidades;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GestionVenta extends SupertipoGestion {

	/**
	 * 
	 */
	public static void eliminarVenta() {
		Scanner sc = new Scanner(System.in);
		int id = 0;

		System.out.println("Introduce id de la venta para su eliminación: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			int registrosAfectados = s.executeUpdate("delete from venta where id=" + id);
			System.out.println(registrosAfectados + " registros eliminados");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	public static void modificarVenta() {
		Scanner sc = new Scanner(System.in);
		String fecha = "", nuevaFecha;
		int nuevoIdDisponible, idCliente = 0, idConcesionario = 0, idCoche = 0, id = 0;
		int nuevoIdCliente, nuevoIdConcesionario, nuevoIdCoche;
		float precioVenta = 0, nuevoPrecioVenta;
		SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();

		
		System.out.println("Introduce id de la venta: ");
		id = sc.nextInt();

		
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select * from venta where id=" + id);
			if (rs.next()) {
				idCliente = rs.getInt("idCliente");
				idConcesionario = rs.getInt("idConcesionario");
				idCoche = rs.getInt("idCoche");
				fecha = rs.getString("fecha");
				precioVenta = rs.getFloat("precioVenta");
}

			nuevoIdCliente = Integer.parseInt(JOptionPane.showInputDialog("Id Cliente (" + idCliente + ") (Intro para mantener): "));
			if (nuevoIdCliente != idCliente) {
				idCliente = nuevoIdCliente;
			}

			nuevoIdConcesionario = Integer.parseInt(JOptionPane.showInputDialog("Id Concesionario (" + idConcesionario + ") (Intro para mantener): "));
			;
			if (nuevoIdConcesionario != idConcesionario) {
				idConcesionario = nuevoIdConcesionario;
			}
			
			nuevoIdCoche= Integer.parseInt(JOptionPane.showInputDialog("Id Coche (" + idCoche + ") (Intro para mantener): "));
			;
			if (nuevoIdCoche != idCoche) {
				idCoche = nuevoIdCoche;
			}
			
			fecha = JOptionPane.showInputDialog("Fecha de la venta (" + fecha + ")");
			;
			
			nuevoPrecioVenta= Integer.parseInt(JOptionPane.showInputDialog("Precio de la venta (" + precioVenta + ") (Intro para mantener): "));
			;
			if (nuevoPrecioVenta != precioVenta) {
				precioVenta = nuevoPrecioVenta;
			}
						
			try {
                date = sdfEntrada.parse(fecha);
			} catch (ParseException e) {
                e.printStackTrace();
			}

			int registrosAfectados = s.executeUpdate(
					"update venta set idCliente='" + idCliente + "', idConcesionario=" + idConcesionario + ", idCoche=" + idCoche + ", fecha='" + sdfSalida.format(date) + "', precioVenta=" + precioVenta + " where id=" + id);
			System.out.println(registrosAfectados + " registros afectados");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	public static void nuevaVenta() {
		Scanner sc = new Scanner(System.in);
		String fecha;
		int nuevoIdDisponible, idCliente, idConcesionario, idCoche;
		float precioVenta;
		SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();

		System.out.println("Creación de una nueva venta:");
		System.out.println("Dame el id del cliente:");
		idCliente = sc.nextInt();
		System.out.println("Dame el id del concesionario:");
		idConcesionario = sc.nextInt();
		System.out.println("Dame el id del coche:");
		idCoche = sc.nextInt();
		System.out.println("Dame fecha:");
		fecha = sc.next();
		System.out.println("Dame el precio de la venta:");
		precioVenta = sc.nextFloat();
		
		try {
            date = sdfEntrada.parse(fecha);
		} catch (ParseException e) {
            e.printStackTrace();
		}
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			nuevoIdDisponible = maxIdEnTabla("venta");
			if (nuevoIdDisponible != -1) {
				int registrosAfectados = s.executeUpdate(
						"insert into venta values (" + nuevoIdDisponible + "," + idCliente + ", " + idConcesionario + ", " + idCoche + ", '" + sdfSalida.format(date) + "', " + precioVenta + ")");				System.out.println(registrosAfectados + " registros insertados ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public static void listarVenta() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from venta");
		   
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
