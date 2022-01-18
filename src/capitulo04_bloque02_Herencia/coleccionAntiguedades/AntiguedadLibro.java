package capitulo04_bloque02_Herencia.coleccionAntiguedades;

public class AntiguedadLibro extends Antiguedad {

	protected String autor, nombreLibro;
	int numeroPaginas;
	
	/**
	 * 
	 */
	public AntiguedadLibro() {
	}

	
	/**
	 * @param añoFabricacion
	 * @param origen
	 * @param precio
	 */
	public AntiguedadLibro(int añoFabricacion, String origen, float precio) {
		super(añoFabricacion, origen, precio);
	}

	
	// To String

	@Override
	public String toString() {
		return "Libro [añoFabricacion=" + añoFabricacion + ", origen=" + origen + ", precio=" + precio + ", autor="
				+ autor + ", nombreLibro=" + nombreLibro + ", numeroPaginas=" + numeroPaginas + "]";
	}

	
	// Getters y Setters

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


	/**
	 * @return the nombreLibro
	 */
	public String getNombreLibro() {
		return nombreLibro;
	}


	/**
	 * @param libro the nombreLibro to set
	 */
	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}


	/**
	 * @return the numeroPaginas
	 */
	public int getNumeroPaginas() {
		return numeroPaginas;
	}


	/**
	 * @param numeroPaginas the numeroPaginas to set
	 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	
}
