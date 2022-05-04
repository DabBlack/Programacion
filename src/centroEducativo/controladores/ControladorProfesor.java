package centroEducativo.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import centroEducativo.ConnectionManager;
import centroEducativo.entidades.Profesor;

/**
 * @author diurno
 *
 */
public class ControladorProfesor extends SuperControlador {
	
	/**
	 * 
	 * @return
	 */
	public static Profesor findPrimerProfesor() {
		return findProfesor("select * from profesor order by id limit 1");
	}

	/**
	 * 
	 * @return
	 */
	public static Profesor findUltimoProfesor() {
		return findProfesor("select * from profesor order by id desc limit 1");
	}

	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public static Profesor findAnteriorProfesor(int idActual) {
		return findProfesor("select * from profesor where id < " + idActual + " order by id desc limit 1");
	}

	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public static Profesor findSiguienteProfesor(int idActual) {
		return findProfesor("select * from profesor where id > " + idActual + " order by id limit 1");
	}

	/**
	 * 
	 * @param sql
	 * @return
	 */
	public static Profesor findProfesor(String sql) {
		Profesor p = null;
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
				p = new Profesor(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido1"),
						rs.getString("apellido2"), rs.getInt("tipologiaSexo_id"), rs.getString("dni"), rs.getString("direccion"), 
						rs.getString("email"), rs.getString("telefono"));
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		} 
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return p;
	}
	
	/**
	 * 
	 * @return
	 */
	public static List<Profesor> findAll () {
		List<Profesor> lista = new ArrayList<Profesor>();
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("Select * from profesor");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) {
				Profesor p = new Profesor (rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido1") ,
						rs.getString("apellido2"), rs.getInt("tipologiaSexo_id"), rs.getString("dni"), rs.getString("direccion"), 
						rs.getString("email"), rs.getString("telefono"));
				lista.add(p);
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
	 * @param p
	 * @return
	 */
	public static int guardarProfesor(Profesor p) {
		if (p.getId() == 0) {
			return nuevoProfesor(p);
		} else {
			return modificarProfesor(p);
		}
	}

	/**
	 * 
	 * @param p
	 * @return
	 */
	public static int modificarProfesor(Profesor p) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();

			registrosAfectados = s.executeUpdate("update profesor set nombre='" + p.getNombre() + "', apellido1='" + 
					p.getApellido1() + "', apellido2='" +  p.getApellido2() + "', tipologiasexo='" + p.getTipologiaSexo_id() + "', dni='" + p.getDni() + 
					"', direccion='" + p.getDireccion() + "', email='" + p.getEmail() +
					"', telefono=" + p.getTelefono() + " where id=" + p.getId());
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
	public static int eliminarProfesor(int idEliminacion) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();

			registrosAfectados = s.executeUpdate("delete from profesor where id=" + idEliminacion);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return registrosAfectados;
	}

	
	/**
	 * 
	 * @param p
	 * @return
	 */
	public static int nuevoProfesor(Profesor p) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			p.setId(siguienteIdEnTabla("profesor"));
			registrosAfectados = s.executeUpdate(
					"insert into profesor values (" + p.getId() + ",'" + p.getNombre() + "','" + p.getApellido1() + "','" +
							p.getApellido2() + "','" + p.getTipologiaSexo_id() + "','" + p.getDni() + "','" + p.getDireccion() + "','" + p.getEmail() + 
							"'," + p.getTelefono() + ")");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return registrosAfectados;
	}

}
