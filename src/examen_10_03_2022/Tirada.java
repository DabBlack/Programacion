package examen_10_03_2022;

public class Tirada {

	int id, puntuacion;
	String descripcion;
	float probabilidadAcierto;
	
	/**
	 * 
	 */
	public Tirada() {
		super();
	}
	
	/**
	 * @param id
	 * @param puntuacion
	 * @param descripcion
	 * @param probabilidadAcierto
	 */
	public Tirada(int id, int puntuacion, String descripcion, float probabilidadAcierto) {
		super();
		this.id = id;
		this.puntuacion = puntuacion;
		this.descripcion = descripcion;
		this.probabilidadAcierto = probabilidadAcierto;
	}

	@Override
	public String toString() {
		return "Tirada [id=" + id + ", puntuacion=" + puntuacion + ", descripcion=" + descripcion
				+ ", probabilidadAcierto=" + probabilidadAcierto + "]";
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
	 * @return the puntuacion
	 */
	public int getPuntuacion() {
		return puntuacion;
	}

	/**
	 * @param puntuacion the puntuacion to set
	 */
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
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

	/**
	 * @return the probabilidadAcierto
	 */
	public float getProbabilidadAcierto() {
		return probabilidadAcierto;
	}

	/**
	 * @param probabilidadAcierto the probabilidadAcierto to set
	 */
	public void setProbabilidadAcierto(float probabilidadAcierto) {
		this.probabilidadAcierto = probabilidadAcierto;
	}
	
	
	
}
