package capitulo04_bloque02_Herencia.coleccionAntiguedades;

public class Antiguedad {
	
	public int añoFabricacion;
	public String origen;
	public float precio;
	
	
	/**
	 * 
	 */
	public Antiguedad() {
		super();
	}

	
	/**
	 * @param añoFabricacion
	 * @param origen
	 * @param precio
	 */
	public Antiguedad(int añoFabricacion, String origen, float precio) {
		super();
		this.añoFabricacion = añoFabricacion;
		this.origen = origen;
		this.precio = precio;
	}

	
	// To String
	
	@Override
	public String toString() {
		return "Antiguedad [origen=" + origen + ", añoFabricacion=" + añoFabricacion + ", precio=" + precio + "]";
	}

	
	// Getters y Setters

	/**
	 * @return the añoFabricacion
	 */
	public int getAñoFabricacion() {
		return añoFabricacion;
	}


	/**
	 * @param añoFabricacion the añoFabricacion to set
	 *//**
	 */
	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}


	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}


	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}


	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
}

