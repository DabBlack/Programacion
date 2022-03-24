package capitulo07_Acceso_A_Datos.Ejercicio02_CRUD5Entidades;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GestionCliente extends SupertipoGestion {

	/**
	 * 
	 */
	public static void eliminarCliente() {
		Scanner sc = new Scanner(System.in);
		int id = 0;

		System.out.println("Introduce id del cliente para su eliminación: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			int registrosAfectados = s.executeUpdate("delete from cliente where id=" + id);
			System.out.println(registrosAfectados + " registros eliminados");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	public static void modificarCliente() {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		String nombre = "", apellidos = "", localidad = "", dniNie = "", fechaNac = "";
		boolean activo = true, nuevoActivo;
		String nuevoNombre = "", nuevosApellidos= "", nuevaLocalidad = "", nuevoDniNie = "", nuevaFechaNac = "";
		SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
        
		System.out.println("Introduce id del cliente: ");
		id = sc.nextInt();

		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select * from cliente where id=" + id);
			if (rs.next()) {
				nombre = rs.getString("nombre");
				apellidos = rs.getString("apellidos");
				localidad = rs.getString("localidad");
				dniNie = rs.getString("dniNie");
				fechaNac = rs.getString("fechaNac");
				activo = rs.getBoolean("activo");
			}

			nuevoNombre = JOptionPane.showInputDialog("Nombre (" + nombre + ") (Intro para mantener): ");
			;
			if (!nuevoNombre.trim().equals("")) {
				nombre = nuevoNombre;
			}
			
			nuevosApellidos = JOptionPane.showInputDialog("Apellidos (" + apellidos + ") (Intro para mantener): ");
			;
			if (!nuevosApellidos.trim().equals("")) {
				apellidos = nuevosApellidos;
			}
			
			nuevaLocalidad = JOptionPane.showInputDialog("Localidad (" + localidad + ") (Intro para mantener): ");
			;
			if (!nuevaLocalidad.trim().equals("")) {
				localidad = nuevaLocalidad;
			}
			
			nuevoDniNie = JOptionPane.showInputDialog("DNI/NIE (" + dniNie + ") (Intro para mantener): ");
			;
			if (!nuevoDniNie.trim().equals("")) {
				dniNie = nuevoDniNie;
			}
			
			fechaNac = JOptionPane.showInputDialog("Fecha de nacimiento (" + fechaNac + ")");
			;
						
			try {
                date = sdfEntrada.parse(fechaNac);
			} catch (ParseException e) {
                e.printStackTrace();
			}
			
			nuevoActivo = Boolean.parseBoolean(JOptionPane.showInputDialog("Activo (" + activo + ") (Intro para mantener): "));
			;
			if (nuevoActivo != activo) {
				activo = nuevoActivo;
			}
			

			int registrosAfectados = s.executeUpdate(
					"update cliente set nombre='" + nombre + "', apellidos='" + apellidos + "', localidad='" + localidad + "', dniNie='" + dniNie + "', fechaNac='" + sdfSalida.format(date) + "', activo=" + activo + " where id=" + id);
			System.out.println(registrosAfectados + " registros afectados");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	public static void nuevoCliente() {
		Scanner sc = new Scanner(System.in);
		String nombre, apellidos, localidad, dniNie, fechaNac;
		boolean activo;
		int nuevoIdDisponible;
		SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfSalida = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();

		System.out.println("Creación de un nuevo cliente:");
		System.out.println("Dame el nombre:");
		nombre = sc.next();
		System.out.println("Dame los apellidos:");
		apellidos = sc.next();
		System.out.println("Dame la localidad:");
		localidad = sc.next();
		System.out.println("Dame el DNI/NIE:");
		dniNie = sc.next();
		System.out.println("Dame la fecha de nacimiento:");
		fechaNac = sc.next();
		System.out.println("¿Activo (true) o no activo (false)?");
		activo = sc.nextBoolean();
		        
         try {
                 date = sdfEntrada.parse(fechaNac);
         } catch (ParseException e) {
                 e.printStackTrace();
         }
		         
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			nuevoIdDisponible = maxIdEnTabla("cliente");
			if (nuevoIdDisponible != -1) {
				int registrosAfectados = s.executeUpdate(
						"insert into cliente values (" + nuevoIdDisponible + ",'" + nombre + "','" + apellidos + "','" + localidad + "','" + dniNie + "','" + sdfSalida.format(date) + "'," + activo + ")");
				System.out.println(registrosAfectados + " registros insertados ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public static void listarCliente() {
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from cliente");
		   
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
