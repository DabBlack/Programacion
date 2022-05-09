package examen_05_09_2022.entidades;

public class Acuerdo {
	private int id;
	private int idIdioma;
	private String descripcion;
	
	/**
	 * 
	 */
	public Acuerdo() {
		super();
	}

	/**
	 * @param id
	 * @param idIdioma
	 * @param descripcion
	 */
	public Acuerdo(int id, String descripcion, int idIdioma) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.idIdioma = idIdioma;
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
	 * @return the idIdioma
	 */
	public int getIdIdioma() {
		return idIdioma;
	}

	/**
	 * @param idIdioma the idIdioma to set
	 */
	public void setIdIdioma(int idIdioma) {
		this.idIdioma = idIdioma;
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
