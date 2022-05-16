package examen_16_05_2022.entidades;

public class Provincia {

	private int id;
	private String provincia;
	
	/**
	 * 
	 */
	public Provincia() {
		super();
	}

	/**
	 * @param id
	 * @param provincia
	 */
	public Provincia(int id, String provincia) {
		super();
		this.id = id;
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return provincia;
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
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
}
