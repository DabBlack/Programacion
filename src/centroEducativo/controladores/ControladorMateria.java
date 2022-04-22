package centroEducativo.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import centroEducativo.ConnectionManager;
import centroEducativo.entidades.Materia;

/**
 * @author diurno
 *
 */
public class ControladorMateria extends SuperControlador {
	/**
	 * 
	 * @return
	 */
	public static Materia findPrimeraMateria() {
		return findMateria("select * from materia order by id limit 1");
	}

	/**
	 * 
	 * @return
	 */
	public static Materia findUltimaMateria() {
		return findMateria("select * from materia order by id desc limit 1");
	}

	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public static Materia findAnteriorMateria(int idActual) {
		return findMateria("select * from materia where id < " + idActual + " order by id desc limit 1");
	}

	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public static Materia findSiguienteMateria(int idActual) {
		return findMateria("select * from materia where id > " + idActual + " order by id limit 1");
	}

	/**
	 * 
	 * @param sql
	 * @return
	 */
	public static Materia findMateria(String sql) {
		Materia m = null;
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
				m = new Materia(rs.getInt("id"), rs.getString("nombre"), rs.getString("acronimo"), rs.getInt("curso_id"));
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		} 
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return m;
	}
	
	/**
	 * 
	 * @return
	 */
	public static List<Materia> findAll () {
		List<Materia> lista = new ArrayList<Materia>();
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("Select * from fabricante");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) {
				Materia m = new Materia(rs.getInt("id"), rs.getString("nombre"), rs.getString("acronimo"), rs.getInt("curso_id"));
				lista.add(m);
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
	 * @param m
	 * @return
	 */
	public static int guardarMateria(Materia m) {
		if (m.getId() == 0) {
			return nuevaMateria(m);
		} else {
			return modificarMateria(m);
		}
	}

	/**
	 * 
	 * @param m
	 * @return
	 */
	public static int modificarMateria(Materia m) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();

			registrosAfectados = s.executeUpdate("update materia set nombre='" + m.getNombre() + "', acronimo='" + 
					m.getAcronimo() + "', curso_id='" + m.getCurso_id() + "' where id=" + m.getId());
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
	public static int eliminarMateria(int idEliminacion) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();

			registrosAfectados = s.executeUpdate("delete from materia where id=" + idEliminacion);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return registrosAfectados;
	}

	
	/**
	 * 
	 * @param m
	 * @return
	 */
	public static int nuevaMateria(Materia m) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			m.setId(siguienteIdEnTabla("materia"));
			registrosAfectados = s.executeUpdate(
					"insert into curso values (" + m.getId() + ",'" + m.getNombre()  + "','" + m.getAcronimo() + "',"
							+ m.getId() + ")");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return registrosAfectados;
	}

}


