package centroEducativo.controladores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
						rs.getString("email"), rs.getString("telefono"), rs.getBytes("imagen"));
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
						rs.getString("email"), rs.getString("telefono"), rs.getBytes("imagen"));
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
			try {
				return nuevoEstudiante(a);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			return modificarEstudiante(a);
		}
		return 0;
	}

	/**
	 * 
	 * @param a
	 */
	public static int modificarEstudiante(Estudiante a) {
		int registrosAfectados = 0;
		
		try {
			PreparedStatement ps = (PreparedStatement) ConnectionManager.getConexion().
					prepareStatement("update estudiante set nombre = ?, apellido1 = ?, apellido 2 = ?,"
							+ " dni= ?, tipolgiasexo_id = ?, dni = ?, direccion = ?, email = ?, "
							+ "telefono = ?, imagen = ?)");
			
			ps.setString(1, a.getNombre());
			ps.setString(2, a.getApellido1());
			ps.setString(3, a.getApellido2());
			ps.setString(4, a.getDni());
			ps.setInt(5, a.getTipologiaSexo_id());
			ps.setString(6, a.getDireccion());
			ps.setString(7, a.getEmail());
			ps.setString(8, a.getTelefono());
			ps.setInt(9, a.getTipologiaSexo_id());
			ps.setBytes(10, a.getImagen());
			registrosAfectados = ps.executeUpdate();
			
			if (registrosAfectados > 0) {
				JOptionPane.showMessageDialog(null, "Inserción correcta en la tabla");
			}	
		}

		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
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
	 * @throws SQLException
	 */
	public static int nuevoEstudiante(Estudiante a) throws SQLException {
		int registrosAfectados = 0;
		
		
			try {
				PreparedStatement ps = (PreparedStatement) ConnectionManager.getConexion().
						prepareStatement("insert into estudiante nombre = ?, apellido1 = ?, apellido 2 = ?,"
								+ " dni= ?, tipolgiasexo_id = ?, dni = ?, direccion = ?, email = ?, "
								+ "telefono = ?, imagen = ?)");
				
				ps.setString(1, a.getNombre());
				ps.setString(2, a.getApellido1());
				ps.setString(3, a.getApellido2());
				ps.setString(4, a.getDni());
				ps.setInt(5, a.getTipologiaSexo_id());
				ps.setString(6, a.getDireccion());
				ps.setString(7, a.getEmail());
				ps.setString(8, a.getTelefono());
				ps.setInt(9, a.getTipologiaSexo_id());
				ps.setBytes(10, a.getImagen());
				registrosAfectados = ps.executeUpdate();
				
				if (registrosAfectados > 0) {
					JOptionPane.showMessageDialog(null, "Inserción correcta en la tabla");
				}	
		}
	
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return registrosAfectados;
	}

}
