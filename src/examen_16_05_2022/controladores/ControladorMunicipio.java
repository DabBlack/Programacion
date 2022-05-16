package examen_16_05_2022.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import examen_16_05_2022.ConnectionManager;
import examen_16_05_2022.entidades.Municipio;


public class ControladorMunicipio extends SuperControlador {

	/**
	 * 
	 */
	public static List<Municipio> findAll () {
		List<Municipio> lista = new ArrayList<Municipio>();
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from municipio");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) {
				Municipio m = new Municipio(rs.getInt("id"), rs.getInt("idProvincia"), rs.getString("nombre"));
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
	 */
	public static List<Municipio> findByIdProvincia(int idProvincia) {
		List<Municipio> lista = new ArrayList<Municipio>();
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from municipio where idProvincia= " + idProvincia);
		   
			// Navegación del objeto ResultSet
			while (rs.next()) {
				Municipio m = new Municipio(rs.getInt("id"), rs.getInt("idProvincia"), rs.getString("nombre"));
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

	
}
