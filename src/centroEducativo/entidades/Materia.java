package centroEducativo.entidades;

public class Materia {
	private int id;
	private String nombre;
	private String acronimo;
	private int curso_id;
	
	/**
	 * 
	 */
	public Materia() {
		super();
	}

	/**
	 * @param id
	 * @param nombre
	 * @param acronimo
	 * @param curso_id
	 */
	public Materia(int id, String nombre, String acronimo, int curso_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.acronimo = acronimo;
		this.curso_id = curso_id;
	}

	@Override
	public String toString() {
		return nombre + " - " + acronimo;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the acronimo
	 */
	public String getAcronimo() {
		return acronimo;
	}

	/**
	 * @param acronimo the acronimo to set
	 */
	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}

	/**
	 * @return the curso_id
	 */
	public int getCurso_id() {
		return curso_id;
	}

	/**
	 * @param curso_id the curso_id to set
	 */
	public void setCurso_id(int curso_id) {
		this.curso_id = curso_id;
	}
	
	
}
