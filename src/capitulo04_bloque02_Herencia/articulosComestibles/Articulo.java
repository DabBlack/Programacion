package capitulo04_bloque02_Herencia.articulosComestibles;

public class Articulo {
	
	public String nombre;
	public int codigo;
	public float precio;
		
	/**
	 * 
	 */
	public Articulo() {
		super();
	}

	/**
	 * @param nombre
	 * @param codigo
	 * @param precio
	 */
	public Articulo(String nombre, int codigo, float precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	// To String
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "  Codigo: " + codigo + "  Precio: " + precio + "€";
	}

	// Getters y Setters
	
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

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
