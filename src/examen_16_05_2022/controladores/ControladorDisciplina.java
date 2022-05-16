package examen_16_05_2022.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import examen_16_05_2022.ConnectionManager;
import examen_16_05_2022.entidades.Disciplina;


public class ControladorDisciplina extends SuperControlador {

	/**
	 * 
	 */
	public static List<Disciplina> findAll () {
		List<Disciplina> lista = new ArrayList<Disciplina>();
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from disciplina");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) {
				Disciplina d = new Disciplina(rs.getInt("id"), rs.getString("descripcion"));
				lista.add(d);
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
