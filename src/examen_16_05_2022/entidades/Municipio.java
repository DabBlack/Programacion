package examen_16_05_2022.entidades;

public class Municipio {

	private int id;
	private int idProvincia;
	private String nombre;
	
	/**
	 * 
	 */
	public Municipio() {
		super();
	}

	/**
	 * @param id
	 * @param idProvincia
	 * @param nombre
	 */
	public Municipio(int id, int idProvincia, String nombre) {
		super();
		this.id = id;
		this.idProvincia = idProvincia;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
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
	 * @return the idProvincia
	 */
	public int getIdProvincia() {
		return idProvincia;
	}

	/**
	 * @param idProvincia the idProvincia to set
	 */
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
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
	
}
