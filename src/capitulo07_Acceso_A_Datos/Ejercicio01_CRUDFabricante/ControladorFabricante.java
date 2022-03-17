package capitulo07_Acceso_A_Datos.Ejercicio01_CRUDFabricante;

import java.sql.Connection;
import java.sql.PreparedStatement;  
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ControladorFabricante extends ControladorBBDD {



	public static List<Fabricante> getAll () throws ErrorBBDDException {
		
		List<Fabricante> fabricantes = new ArrayList<Fabricante> ();

		// Creamos la conexion como nula
		Connection conn = null;

		try {
			
			// Creamos la conexion
			conn = ConnectionManagerV1.getConexion();

			// Creamos la consulta que nos muestra todos los registros de la base de datos
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from fabricante");

			// Si existe un siguiente registro lo mostramos
			while (rs.next()) {
				Fabricante fab = new Fabricante();
				fab.setId(rs.getInt("id"));
				fab.setCif(rs.getString("cif"));
				fab.setNombre(rs.getString("nombre"));
				fabricantes.add(fab);
			}

			// Cerramos el statement
			s.close();

		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		} 
		return fabricantes;
	}




	/**
	 * 
	 * @param actors
	 * @throws ErrorBBDDException
	 */
	public static void almacenar (Fabricante fabricante) throws ErrorBBDDException {
		if (get(fabricante.getId()) != null) { // Solo modificar
			almacenarModificado(fabricante);
		}
		else { // Crear nuevo objeto en la BBDD
			almacenarNuevo(fabricante);
		}
	}



	/**
	 * 
	 * @param fabricante
	 * @return
	 * @throws ErrorBBDDException
	 */
	
	public static Fabricante get (int id) throws ErrorBBDDException {
		Connection conn = null;
		Fabricante fab = null;

		try {
			conn = ConnectionManagerV1.getConexion();

			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from fabricante where id = " + id);

			if (rs.next()) {
				fab = new Fabricante();
				fab.setId(id);
				fab.setCif(rs.getString("cif"));
				fab.setNombre(rs.getString("nombre"));
			}
			s.close();

		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		} 
		return fab;
	}




	/*
	 *  Metodo que almacena el nuevo registro introducido
	 */
	private static void almacenarNuevo (Fabricante fab) throws ErrorBBDDException {

		Connection conn = null;

		try {
			
			// Hacemos la conexion con la DB
			conn = ConnectionManagerV1.getConexion();

			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement(
							"INSERT INTO fabricante (id, cif, nombre) VALUES  (?, ?, ?)");
			
			int registrosInsertados;

			// Actualizamos el registro con los valores insertados por el usuario
			ps.setInt(1, nextIdEnTabla(conn, "fabricante")); 
			ps.setString(2, fab.getCif());
			ps.setString(3, fab.getNombre());

			// Actualizamos el registro
			registrosInsertados = ps.executeUpdate();
			
			if (registrosInsertados != 1) {
				throw new ErrorBBDDException ("No ha sido posible la insercion del nuevo registro");
			}
			
			// Cerramos el statement
			ps.close();

		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		}

	}


	/*
	 *  Metodo que almacena el valor modificado
	 */
	private static void almacenarModificado (Fabricante fab) throws ErrorBBDDException {

		Connection conn = null;

		try {
			conn = ConnectionManagerV1.getConexion(); // Conectamos con la DB

			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement(
							"update fabricante set cif = ?, nombre = ? where id = ?");
			int registrosInsertados;

			// Actualizamos el registro con los datos insertados por el usuario
			ps.setString(1, fab.getCif());
			ps.setString(2, fab.getNombre());
			ps.setInt(3, fab.getId()); 

			// Ejecutamos la actualizacion del registro
			registrosInsertados = ps.executeUpdate();
			
			if (registrosInsertados != 1) {
				throw new ErrorBBDDException ("No ha sido posible la modificacion del registro");
			}
			
			// Cerramos el statement
			ps.close();

		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		}

	}



	/**
	 * 
	 * @param actors
	 * @throws ErrorBBDDException
	 */
	public static void eliminar (Fabricante fab) throws ErrorBBDDException {

		Connection conn = null;

		try {
			conn = ConnectionManagerV1.getConexion(); // Intenta conectar a la base

			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement(
							"delete from fabricante where id = ?"); // Nos pide el id del registro a eliminar
			int registrosInsertados;

			ps.setInt(1, fab.getId()); 

			registrosInsertados = ps.executeUpdate();  // Hace un update del registro
			
			if (registrosInsertados != 1) {
				throw new ErrorBBDDException ("No ha sido posible la eliminacion del registro");
			}
			ps.close();

		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		}

	}


}
