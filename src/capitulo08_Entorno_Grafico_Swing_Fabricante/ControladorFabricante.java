package capitulo08_Entorno_Grafico_Swing_Fabricante;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import capitulo07_Acceso_A_Datos.Ejercicio02_CRUD5Entidades.ConnectionManager;

public class ControladorFabricante extends SuperControlador {

	
	/**
	 * 
	 * @return
	 */
	public static Fabricante findPrimerFabricante () {
		return findFabricante("select * from fabricante order by id limit 1");
	}

	/**
	 * 
	 * @return
	 */
	public static Fabricante findUltimoFabricante () {
		return findFabricante("select * from fabricante order by id desc limit 1");
	}

	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public static Fabricante findAnteriorFabricante (int idActual) {
		return findFabricante("select * from fabricante where id < " + idActual + " order by id desc limit 1");
	}

	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public static Fabricante findSiguienteFabricante (int idActual) {
		return findFabricante("select * from fabricante where id > " + idActual + " order by id limit 1");
	}



	/**
	 * 
	 * @param sql
	 * @return
	 */
	public static Fabricante findFabricante (String sql) {
		Fabricante f = null;
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery (sql);
		   
			// Navegación del objeto ResultSet
			if (rs.next()) {
				f = new Fabricante(rs.getInt("id"), rs.getString("cif"), rs.getString("nombre"));
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return f;
	}


	/**
	 * 
	 * @param f
	 * @return
	 */
	public static int guardarFabricante(Fabricante f) {
		if (f.getId() == 0) {
			return nuevoFabricante(f);
		}
		else {
			return modificarFabricante(f);
		}
	}
	
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	public static int modificarFabricante (Fabricante f) {		
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			
			registrosAfectados = s.executeUpdate(
					"update fabricante set cif='" + f.getCif() + "', nombre='" + f.getNombre() 
					+ "' " + " where id=" + f.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return registrosAfectados;		
	}
	

	/**
	 * 
	 * @param f
	 * @return
	 */
	public static int nuevoFabricante (Fabricante f) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			f.setId(siguienteIdEnTabla("fabricante"));
			registrosAfectados = s.executeUpdate(
						"insert into fabricante values (" + f.getId() + ",'" + f.getCif() +
						"', '" + f.getNombre() + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return registrosAfectados;
	}
	
	/**
	 * 
	 * @param f
	 */
	public static void eliminarFabricante (Fabricante f) {
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		final JPanel panel = new JPanel();
		JOptionPane.showMessageDialog(panel, "No se pudo eliminar el registro", "Error", JOptionPane.ERROR_MESSAGE);

	}

}
