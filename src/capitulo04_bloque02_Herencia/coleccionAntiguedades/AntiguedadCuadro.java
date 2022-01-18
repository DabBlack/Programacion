package capitulo04_bloque02_Herencia.coleccionAntiguedades;

public class AntiguedadCuadro extends Antiguedad {
	
	protected String epoca, tecnica, pintor;
	 
	/**
	 * 
	 */
	public AntiguedadCuadro() {
	}

	
	/**
	 * @param añoFabricacion
	 * @param origen
	 * @param precio
	 */
	public AntiguedadCuadro(int añoFabricacion, String origen, float precio) {
		super(añoFabricacion, origen, precio);
	}

	
	// To String
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Cuadro:   Año en el que se pinto: " + añoFabricacion + "  Origen: " + origen + "  Precio: "
				+ precio + "€" + "  Epoca del cuadro: " + epoca + "  Tecnica usada: " + tecnica + "  Pintor: " + pintor;
	}

	
	// Getters y Setters
	
	/**
	 * @return the epoca
	 */
	public String getEpoca() {
		return epoca;
	}

	/**
	 * @param epoca the epoca to set
	 */
	public void setEpoca(String epoca) {
		this.epoca = epoca;
	}

	/**
	 * @return the tecnica
	 */
	public String getTecnica() {
		return tecnica;
	}

	/**
	 * @param tecnica the tecnica to set
	 */
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	/**
	 * @return the pintor
	 */
	public String getPintor() {
		return pintor;
	}

	/**
	 * @param autor the pintor to set
	 */
	public void setPintor(String pintor) {
		this.pintor = pintor;
	}

	

}
