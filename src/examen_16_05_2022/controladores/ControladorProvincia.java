package examen_16_05_2022.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import examen_16_05_2022.ConnectionManager;
import examen_16_05_2022.entidades.Provincia;

public class ControladorProvincia extends SuperControlador {
	
	/**
	 * 
	 */
	public static List<Provincia> findAll () {
		List<Provincia> lista = new ArrayList<Provincia>();
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from provincia");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) {
				Provincia p = new Provincia(rs.getInt("id"), rs.getString("provincia"));
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
