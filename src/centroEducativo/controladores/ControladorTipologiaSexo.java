package centroEducativo.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import centroEducativo.ConnectionManager;
import centroEducativo.entidades.TipologiaSexo;


public class ControladorTipologiaSexo {

	/**
	 * 
	 * @return
	 */
	public static TipologiaSexo findPrimerTipologiaSexo() {
		return findTipologiaSexo("select * from tipologiaSexo order by id limit 1");
	}
	
	/**
	 * 
	 * @param sql
	 * @return
	 */
	public static TipologiaSexo findTipologiaSexo(String sql) {
		TipologiaSexo t = null;
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
				t = new TipologiaSexo(rs.getInt("id"), rs.getString("descripcion"));
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		} 
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return t;
	}
	
	/**
	 * 
	 * @return
	 */
	public static List<TipologiaSexo> findAll () {
		List<TipologiaSexo> lista = new ArrayList<TipologiaSexo>();
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("Select * from tipologiaSexo");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) {
				TipologiaSexo t = new TipologiaSexo(rs.getInt("id"), rs.getString("descripcion"));
				lista.add(t);
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
