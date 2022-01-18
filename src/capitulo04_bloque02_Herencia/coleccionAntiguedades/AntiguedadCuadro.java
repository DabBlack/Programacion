package capitulo04_bloque02_Herencia.coleccionAntiguedades;

public class AntiguedadCuadro extends Antiguedad {

	protected String epoca, tecnica, autor;
	
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
	
	@Override
	public String toString() {
		return "Cuadro [añoFabricacion=" + añoFabricacion + ", origen=" + origen + ", precio=" + precio + ", epoca="
				+ epoca + ", tecnica=" + tecnica + ", autor=" + autor + "]";
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
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}


	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	
}
