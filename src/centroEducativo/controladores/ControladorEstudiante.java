package centroEducativo.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import centroEducativo.ConnectionManager;
import centroEducativo.entidades.Estudiante;

/**
 * @author diurno
 *
 */
public class ControladorEstudiante extends SuperControlador {
	
	/**
	 * 
	 * @return
	 */
	public static Estudiante findPrimerEstudiante() {
		return findEstudiante("select * from estudiante order by id limit 1");
	}

	/**
	 * 
	 * @return
	 */
	public static Estudiante findUltimoEstudiante() {
		return findEstudiante("select * from estudiante order by id desc limit 1");
	}

	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public static Estudiante findAnteriorEstudiante(int idActual) {
		return findEstudiante("select * from estudiante where id < " + idActual + " order by id desc limit 1");
	}

	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public static Estudiante findSiguienteEstudiante(int idActual) {
		return findEstudiante("select * from estudiante where id > " + idActual + " order by id limit 1");
	}

	/**
	 * 
	 * @param sql
	 * @return
	 */
	public static Estudiante findEstudiante(String sql) {
		Estudiante a = null;
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement();

			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros
			// obtenidos por la consulta
			ResultSet rs = s.executeQuery(sql);

			// Navegación del objeto ResultSet
			if (rs.next()) {
				a = new Estudiante(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido1"),
						rs.getString("apellido2"), rs.getInt("tipologiaSexo_id"), rs.getString("dni"), rs.getString("direccion"), 
						rs.getString("email"), rs.getString("telefono"), rs.getBytes(10));
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		} 
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return a;
	}
	
	/**
	 * 
	 * @return
	 */
	public static List<Estudiante> findAll () {
		List<Estudiante> lista = new ArrayList<Estudiante>();
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("Select * from estudiante");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) {
				Estudiante a = new Estudiante (rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido1"),
						rs.getString("apellido2"), rs.getInt("tipologiaSexo_id"), rs.getString("dni"), rs.getString("direccion"), 
						rs.getString("email"), rs.getString("telefono"), rs.getBytes(10));
				lista.add(a);
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return lista;
	}

	
	/**
	 * 
	 * @param a
	 * @return
	 */
	public static int guardarEstudiante(Estudiante a) {
		if (a.getId() == 0) {
			return nuevoEstudiante(a);
		} else {
			return modificarEstudiante(a);
		}
	}

	/**
	 * 
	 * @param a
	 * @return
	 */
	public static int modificarEstudiante(Estudiante a) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();

			registrosAfectados = s.executeUpdate("update estudiante set nombre='" + a.getNombre() + "', apellido1='" + 
					a.getApellido1() + "', apellido2='" +  a.getApellido2() + "', tipologiaSexo_id='" + a.getTipologiaSexo_id() + "', dni='" + a.getDni() + 
					"', direccion='" + a.getDireccion() + "', email='" + a.getEmail() +
					"', telefono='" + a.getTelefono() + "'," + a.getImagen() + " where id=" + a.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return registrosAfectados;
	}

	
	/**
	 * 
	 * @param idEliminacion
	 * @return
	 */
	public static int eliminarEstudiante(int idEliminacion) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();

			registrosAfectados = s.executeUpdate("delete from estudiante where id=" + idEliminacion);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return registrosAfectados;
	}

	
	/**
	 * 
	 * @param a
	 * @return
	 */
	public static int nuevoEstudiante(Estudiante a) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			a.setId(siguienteIdEnTabla("estudiante"));
			registrosAfectados = s.executeUpdate(
					"insert into estudiante values (" + a.getId() + ",'" + a.getNombre() + "','" + a.getApellido1() + "','" +
							a.getApellido2() + "'," + a.getTipologiaSexo_id() + ",'" + a.getDni() + "','" + a.getDireccion() + "','" + a.getEmail() + 
							"','" + a.getTelefono() + "'," + a.getImagen() + ")");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return registrosAfectados;
	}

}
