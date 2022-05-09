package examen_05_09_2022.controladores;

import java.sql.SQLException;
import java.sql.Statement;

import examen_05_09_2022.ConnectionManager;
import examen_05_09_2022.entidades.Usuario;


public class ControladorUsuario extends SuperControlador{

	public static int nuevoUsuario(Usuario u) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			u.setId(siguienteIdEnTabla("curso"));
			registrosAfectados = s.executeUpdate(
					"insert into usuario values (" + u.getId() + ",'" + u.getEmail() + "','" + u.getUsuario() 
					 + "','" + u.getPassword() + "'," + u.getIdIdioma() + ")");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return registrosAfectados;
	}
	
}
