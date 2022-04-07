package capitulo08_Entorno_Grafico_Swing_Fabricante;

public class Fabricante {
	private int id;
	private String cif;
	private String nombre;
	
	
	/**
	 * 
	 */
	public Fabricante() {
	}

	/**
	 * 
	 * @param id
	 * @param cif
	 * @param nombre
	 */
	public Fabricante(int id, String cif, String nombre) {
		this.id = id;
		this.cif = cif;
		this.nombre = nombre;
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
	public String getCif() {
		return cif;
	}

	/**
	 * 
	 * @param cif
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
