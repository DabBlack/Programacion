package centroEducativo;

public class Curso {
	private int id;
	private String descripcion;	
	
	/**
	 * 
	 */
	public Curso() {
	}

	/**
	 * 
	 * @param id
	 * @param cif
	 * @param nombre
	 */
	public Curso(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
		}

	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * 
	 * @param cif
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
