package examen_05_09_2022.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import examen_05_09_2022.ConnectionManager;
import examen_05_09_2022.entidades.Pais;


public class ControladorPais extends SuperControlador {

	/**
	 * 
	 * @param sql
	 * @return
	 */
	public static Pais findIdioma(String sql) {
		Pais p = null;
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
				p = new Pais(rs.getInt("id"), rs.getString("descripcion"));
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
	public static List<Pais> findAll () {
		List<Pais> lista = new ArrayList<Pais>();
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("Select * from pais");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) {
				Pais p = new Pais (rs.getInt("id"), rs.getString("descripcion"));
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
	
}
