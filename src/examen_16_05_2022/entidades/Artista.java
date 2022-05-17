package examen_16_05_2022.entidades;

public class Artista {

	private int id;
	private int idDisciplina;
	private int idMunicipio;
	private String nombre;
	private byte[] imagen;
	
	/**
	 * 
	 */
	public Artista() {
		super();
	}

	/**
	 * @param id
	 * @param idDisciplina
	 * @param idMunicipio
	 * @param nombre
	 */
	public Artista(int id, int idDisciplina, int idMunicipio, String nombre) {
		super();
		this.id = id;
		this.idDisciplina = idDisciplina;
		this.idMunicipio = idMunicipio;
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
	 * @return the idDisciplina
	 */
	public int getIdDisciplina() {
		return idDisciplina;
	}

	/**
	 * @param idDisciplina the idDisciplina to set
	 */
	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	/**
	 * @return the idMunicipio
	 */
	public int getIdMunicipio() {
		return idMunicipio;
	}

	/**
	 * @param idMunicipio the idMunicipio to set
	 */
	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
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
	
	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
	
}
