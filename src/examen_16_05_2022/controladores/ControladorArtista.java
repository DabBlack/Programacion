package examen_16_05_2022.controladores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import examen_16_05_2022.ConnectionManager;
import examen_16_05_2022.entidades.Artista;


public class ControladorArtista extends SuperControlador {

	/**
	 * 
	 */
	public static List<Artista> findAll () {
		List<Artista> lista = new ArrayList<Artista>();
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from artista");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) {
				Artista a = new Artista(rs.getInt("id"), rs.getInt("idDisciplina"), rs.getInt("idMunicipio"), 
						rs.getString("nombre"));
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
	 */
	public static Artista findByNombreArtista (String nombreArtista) {
		Artista a = null;
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from artista where nombre = '" + nombreArtista + "'");
		   
			// Navegación del objeto ResultSet
			if (rs.next()) {
				a = new Artista(rs.getInt("id"), rs.getInt("idDisciplina"), rs.getInt("idMunicipio"),
						rs.getString("nombre"));
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
	 * @param nombreTabla
	 * @return
	 */
	protected static int siguienteIdEnTabla() {
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select max(id) from artista");
			
			if (rs.next()) {
				return rs.getInt(1) + 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return -1; 		
	}

	
	/**
	 * 
	 */
	public static int guardarArtista (Artista a) {		
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			
			registrosAfectados = s.executeUpdate(
					"update artista set idDisciplina=" + a.getIdDisciplina() + ", idMunicipio=" + a.getIdMunicipio() +
					", nombre='" + a.getNombre()  + "' where id=" + a.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return registrosAfectados;		
	}
	
}
