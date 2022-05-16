package examen_16_05_2022.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import examen_16_05_2022.ConnectionManager;


public class SuperControlador {
	public static int maxIdEnTabla(String nombreTabla) {
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select max(id) from " + nombreTabla);

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
	 * @param nombreTabla
	 * @return
	 */
	protected static int siguienteIdEnTabla(String nombreTabla) {
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select max(id) from " + nombreTabla);
			
			if (rs.next()) {
				return rs.getInt(1) + 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return -1; 		
	}

}
