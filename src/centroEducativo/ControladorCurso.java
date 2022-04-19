package centroEducativo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ControladorCurso extends SuperControlador {

	
	/**
	 * 
	 * @return
	 */
	public static Curso findPrimerCurso() {
		return findCurso("select * from curso order by id limit 1");
	}

	/**
	 * 
	 * @return
	 */
	public static Curso findUltimoCurso() {
		return findCurso("select * from curso order by id desc limit 1");
	}

	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public static Curso findAnteriorCurso(int idActual) {
		return findCurso("select * from curso where id < " + idActual + " order by id desc limit 1");
	}

	/**
	 * 
	 * @param idActual
	 * @return
	 */
	public static Curso findSiguienteCurso(int idActual) {
		return findCurso("select * from curso where id > " + idActual + " order by id limit 1");
	}



	/**
	 * 
	 * @param sql
	 * @return
	 */
	public static Curso findCurso (String sql) {
		Curso c = null;
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery (sql);
		   
			// Navegación del objeto ResultSet
			if (rs.next()) {
				c = new Curso(rs.getInt("id"), rs.getString("descripcion"));
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return c;
	}


	/**
	 * 
	 * @param f
	 * @return
	 */
	public static int guardarFabricante(Curso f) {
		if (f.getId() == 0) {
			return nuevoCurso(f);
		}
		else {
			return modificarCurso(f);
		}
	}
	
	
	/**
	 * 
	 * @param c
	 * @return
	 */
	public static int modificarCurso(Curso c) {		
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			
			registrosAfectados = s.executeUpdate("update fabricante set cif='" + c.getDescripcion() +
					"'" + " where id=" + c.getId());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return registrosAfectados;		
	}
	

	/**
	 * 
	 * @param c
	 * @return
	 */
	public static int nuevoCurso(Curso c) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			c.setId(siguienteIdEnTabla("curso"));
			registrosAfectados = s.executeUpdate( "insert into curso values (" + c.getId() + ",'" + 
			c.getDescripcion() + "')");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return registrosAfectados;
	}
	
	/**
	 * 
	 * @param c
	 */
	public static void eliminarCurso(Curso c) {
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		final JPanel panel = new JPanel();
		JOptionPane.showMessageDialog(panel, "No se pudo eliminar el registro", "Error", JOptionPane.ERROR_MESSAGE);

	}

	/**
     * Este método es para eliminar un fabricante
     * @throws SQLException
     */
    public static void eliminarFabricante(Curso c) throws SQLException {

            Actua("delete from centroeducativo.curso where id = " + c.getId());

    }
	
    /**
     * Con este método recibimos el sql y lo ejecutamos
     *
     * @param sql
     */
    public static void Actua(String sql) {

            try {

                    Statement s = (Statement) ConnectionManager.getConexion().createStatement();
                    s.execute(sql);
                    s.close();
            } catch (SQLException e) {
                    e.printStackTrace();

            }

    } 
    
}
