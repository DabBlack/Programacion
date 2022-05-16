package examen_16_05_2022.entidades;

public class Disciplina {

	private int id;
	private String descripion;
	
	/**
	 * 
	 */
	public Disciplina() {
		super();
	}

	/**
	 * @param id
	 * @param descripion
	 */
	public Disciplina(int id, String descripion) {
		super();
		this.id = id;
		this.descripion = descripion;
	}

	@Override
	public String toString() {
		return "disciplina [id=" + id + ", descripion=" + descripion + "]";
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
	 * @return the descripion
	 */
	public String getDescripion() {
		return descripion;
	}

	/**
	 * @param descripion the descripion to set
	 */
	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}
		
}
