package examen_05_09_2022.entidades;

public class Pais {
	private int id;
	private String descripcion;
	
	/**
	 * 
	 */
	public Pais() {
		super();
	}
	
	/**
	 * @param id
	 * @param descripcion
	 */
	public Pais(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return descripcion;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
