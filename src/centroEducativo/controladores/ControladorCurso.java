package centroEducativo.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import centroEducativo.ConnectionManager;
import centroEducativo.entidades.Curso;

public class ControladorCurso extends SuperControlador {

	/**
	 * 
	 * @return
	 */
	public static Curso findPrimerCurso() {
		return findCurso("select * from curso order by id limit 1");
	}

	/**
	 * 
	 * @return
	 */
	public static Curso findUltimoCurso() {
		return findCurso("select * from curso order by id desc limit 1");
	}

	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public static Curso findAnteriorCurso(int idActual) {
		return findCurso("select * from curso where id < " + idActual + " order by id desc limit 1");
	}

	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public static Curso findSiguienteCurso(int idActual) {
		return findCurso("select * from curso where id > " + idActual + " order by id limit 1");
	}

	/**
	 * 
	 * @param sql
	 * @return
	 */
	public static Curso findCurso(String sql) {
		Curso c = null;
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
				c = new Curso(rs.getInt("id"), rs.getString("descripcion"));
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		} 
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return c;
	}
	
	/**
	 * 
	 * @return
	 */
	public static List<Curso> findAll () {
		List<Curso> lista = new ArrayList<Curso>();
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("Select * from curso");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) {
				Curso c = new Curso(rs.getInt("id"), rs.getString("descripcion"));
				lista.add(c);
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
	 * @param c
	 * @return
	 */
	public static int guardarCurso(Curso c) {
		if (c.getId() == 0) {
			return nuevoCurso(c);
		} else {
			return modificarCurso(c);
		}
	}

	/**
	 * 
	 * @param c
	 * @return
	 */
	public static int modificarCurso(Curso c) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();

			registrosAfectados = s.executeUpdate("update curso set descripcion='" + c.getDescripcion() + "' where id=" + c.getId());
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
	public static int eliminarCurso(int idEliminacion) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();

			registrosAfectados = s.executeUpdate("delete from curso where id=" + idEliminacion);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return registrosAfectados;
	}

	
	/**
	 * 
	 * @param c
	 * @return
	 */
	public static int nuevoCurso(Curso c) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			c.setId(siguienteIdEnTabla("curso"));
			registrosAfectados = s.executeUpdate(
					"insert into curso values (" + c.getId() + ",'" + c.getDescripcion() + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return registrosAfectados;
	}

}
