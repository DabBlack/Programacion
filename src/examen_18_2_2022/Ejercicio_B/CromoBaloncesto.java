package examen_18_2_2022.Ejercicio_B;

public class CromoBaloncesto {
	
	String nombre;
	public int idCromo, puntosJugador, rebotes;
	
	/**
	 * 
	 */
	public CromoBaloncesto() {
		super();
	}

	/**
	 * @param idCromo
	 * @param puntosJugador
	 * @param rebotes
	 * @param nombre
	 */
	public CromoBaloncesto(int idCromo, int puntosJugador, int rebotes, String nombre) {
		super();
		this.idCromo = idCromo;
		this.puntosJugador = puntosJugador;
		this.rebotes = rebotes;
		this.nombre = nombre;
	}

	// To String
	
	@Override
	public String toString() {
		return "CromoBaloncesto [idCromo=" + idCromo + ", puntosJugador=" + puntosJugador + ", rebotes=" + rebotes
				+ ", nombre=" + nombre + "]";
	}

	// Getters y Setters
	
	/**
	 * @return the idCromo
	 */
	public int getIdCromo() {
		return idCromo;
	}

	/**
	 * @param idCromo the idCromo to set
	 */
	public void setIdCromo(int idCromo) {
		this.idCromo = idCromo;
	}

	/**
	 * @return the puntosJugador
	 */
	public int getPuntosJugador() {
		return puntosJugador;
	}

	/**
	 * @param puntosJugador the puntosJugador to set
	 */
	public void setPuntosJugador(int puntosJugador) {
		this.puntosJugador = puntosJugador;
	}

	/**
	 * @return the rebotes
	 */
	public int getRebotes() {
		return rebotes;
	}

	/**
	 * @param rebotes the rebotes to set
	 */
	public void setRebotes(int rebotes) {
		this.rebotes = rebotes;
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
